package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Consulta;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.NewsLetter;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Usuario;
import com.projeto.Servicos.AjudaServico;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.ConsultaServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.PacienteServico;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private MedicoServico medServ;
	
	@Autowired
	private EspecialidadeServico espServ;
	
	@Autowired
	private CidadeServico cidServ;
	
	@Autowired
	private PacienteServico paciServ;
	
	@Autowired
	private AjudaServico ajuServ;
	
	@Autowired
	private ConsultaServico consServ;
	
	@GetMapping("/dashboard")
	public String dashboardPaci() {
		return ("/paciente/dashboardPaci");
	}
	
	@GetMapping("/medico/busca")
	public ModelAndView novaConsulta(@RequestParam(required = false) Integer cidade,
			@RequestParam(required = false) String esp, @RequestParam(required = false) Integer bairro,
			@RequestParam(required = false) String espec, @RequestParam(required = false) String sexMas,
			@RequestParam(required = false) String sexFem, @RequestParam(required = false) Float valorMin,
			@RequestParam(required = false) Float valorMax, @RequestParam(required = false) Integer minExp,
			@RequestParam(required = false) Integer maxExp) {
		
		ModelAndView mv = new ModelAndView("/paciente/novaConsulta");

		List<Medico> medicos = medServ.buscaMedCompleta(cidade, bairro, espec, sexMas, sexFem,valorMin,
				valorMax, minExp, maxExp);
		List<Cidade> cidades = cidServ.findAll();
		List<Especialidade> especs = espServ.findAll();
		mv.addObject("cidades", cidades);
		mv.addObject("medicos", medicos);
		mv.addObject("especs", especs);
		mv.addObject("news", new NewsLetter());
		return mv;
	}
	
	@PostMapping("/cadastro/validacao/{id}")
	public String pacienteCadastro(@PathVariable("id") Integer id,@ModelAttribute("paciente") Paciente paciente) {
		Consulta consulta = consServ.buscaConsultaPorId(id);
		Paciente novoPaciente = paciServ.cadastro(paciente);
		consulta.setPaciente(novoPaciente);
		consServ.cadastro(consulta);
		return ("redirect:/login");
	}
	
    @GetMapping("/consultas")
    public String consultas(){
        return "/paciente/consultas";
    }
    
    @GetMapping("/radarPontual")
    public String radarPontual(){
        return "/paciente/tela_radarPontual";
    }
    
    @GetMapping("/consultas")
    public String feedback(){
        return "/paciente/tela_feedback";
    }
    
    @GetMapping("/configuracoes")
    public String configurações(){
        return "/paciente/consultas";
    }
    
    @RequestMapping("/ajuda")
    public String medIndAjuda(Model model){
        model.addAttribute("aju", new Ajuda());
        return "/paciente/tela_ajuda";
    }
	
    @PostMapping("/ajuda/nova")
    public String criaAjudaMedInd(@ModelAttribute("ajuda") Ajuda ajuda) {
    	Usuario usu = new Usuario();
    	usu.setIdUsu(2);
    	ajuda.setUsuario(usu);
    	ajuServ.criaAjuda(ajuda);
    	return ("redirect:/paciente/dashboardPaci");
    } 
    
    @GetMapping("/consultas")
    public String saida(){
        return "/paciente/tela_saida";
    }
}
