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

import com.projeto.Dto.ConsultaSemFeedDTO;
import com.projeto.Dto.UltimoIdDTO;
import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Consulta;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Feedback;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.NewsLetter;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.ConsultaRepositorio2;
import com.projeto.Servicos.AjudaServico;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.ConsultaServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.FeedbackServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.PacienteServico;
import com.projeto.Servicos.UltimoIdDTOServico;

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
	
	@Autowired
	private FeedbackServico feeServ;
	
	@Autowired
	private ConsultaRepositorio2 cr2;
	
	
	@GetMapping("/dashboard")
	public String dashboardPaci(Model model) {
		Integer idUsu = 1;
		//paciServ.pesquisaPacientePorUsuarioId(idUsu)
		model.addAttribute("resumo", consServ.consultasMarcadas(idUsu));
		
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
		return ("redirect:/paciente/confirmacao");
	}
	
    @GetMapping("/confirmacao")
    public String confirmacao(){
        return "/paciente/tela_confirmShop";
    }
    
    @GetMapping("/consultas")
    public String consultas(){
        return "/paciente/consultas";
    }
    
    @GetMapping("/radarPontual")
    public String radarPontual(){
        return "/paciente/tela_radarPontual";
    }
  //Deixei RequestParam para desenrolar o código sem security. Mas o correto é usar o PathVariable.
    @GetMapping("/feedback")
    public String feedback(@RequestParam(required = false) Integer idUsu, Model model){
    	idUsu = 9;
    	Paciente paciente = paciServ.pesquisaPacientePorUsuarioId(idUsu);
    	model.addAttribute("feedback", new Feedback());
    	model.addAttribute("num", new UltimoIdDTO());
    	model.addAttribute("consulta", cr2.pesquisaConsultaSemFeed(paciente.getIdPaci()));    	
        return "/paciente/tela_frame8";
    }
    
    @PostMapping("/feedback/cadastro")
    public String feedbackCadastro(@RequestParam Integer idCons,@ModelAttribute("feedback") Feedback feedback) {
    	Consulta consulta = consServ.buscaConsultaPorId(idCons);
    	consulta.setFeedback(feeServ.feedbackCadastro(feedback));
    	consServ.cadastro(consulta);
    	return ("redirect:/paciente/feedback");
    }
    
    //Deixei RequestParam para desenrolar o código sem security. Mas o correto é usar o PathVariable.
    @GetMapping("/configuracoes")
    public String configurações(@RequestParam(required = false) Integer idUsu,Model model){
    	idUsu = 11;
    	model.addAttribute("paciente", paciServ.pesquisaPacientePorUsuarioId(idUsu));
    	return "/paciente/tela_configuracoes";
    }
    
    @PostMapping("/configuracoes/atualiza")
    public String configuracoesSave(@ModelAttribute("paciente") Paciente paciente) {
    	paciServ.cadastroVoid(paciente);
    	return ("redirect:/paciente/configuracoes");
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
    
    @GetMapping("/saida")
    public String saida(){
        return "/paciente/tela_saida";
    }
}
