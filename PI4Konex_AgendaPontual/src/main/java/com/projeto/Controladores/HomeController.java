package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Bairro;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Especialidade;
import com.projeto.Servicos.BairroServico;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;

@Controller
public class HomeController {
	
	@Autowired
	private CidadeServico cidServ;
	
	@Autowired
	private EspecialidadeServico espServ;
	
	@Autowired
	private MedicoServico medServ;
	
	@Autowired
	private BairroServico baiServ;
	
	
	private String ftc;
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Cidade> cidades = cidServ.findAll();
		model.addAttribute("cidades", cidades);
		return ("/home");
	}
		
//	@PostMapping("**/pesquisamedico")
//	public ModelAndView buscaMed(@RequestParam("cidade") Integer cidade, @RequestParam("esp") String esp) {
//		List<MedicoDTO> list = medServ.buscaMedEsp(cidade, esp);
//		return new ModelAndView("/resulBusca").addObject("medicos", list);
//	}
	
	@GetMapping("/busca")
	public ModelAndView buscaEsp(
			@RequestParam(required = false) String esp, 
			@RequestParam(required = false) Integer cidade) {
		ModelAndView mv = new ModelAndView("/resulBusca");
		
		if(esp != null && cidade == null) {
			List<MedicoDTO> medicos = medServ.buscaEsp(esp.trim().toUpperCase());
			List<Cidade> cidades = cidServ.findAll();
			List<Bairro> bairros = baiServ.buscaBairro();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("bairros", bairros);
			mv.addObject("especs", especs);
			return mv;
			
		}
		else if (cidade != null && esp == null) {
			List<MedicoDTO> medicos = medServ.buscaMedCid(cidade);
			List<Cidade> cidades = cidServ.findAll();
			List<Bairro> bairros = baiServ.buscaBairro();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("medicos", medicos);
			mv.addObject("cidades", cidades);
			mv.addObject("bairros", bairros);
			mv.addObject("especs", especs);
			return mv;
		}
		else if (esp != null && cidade != null) {
			List<MedicoDTO> medicos = medServ.buscaMedEsp(cidade, esp);
			List<Cidade> cidades = cidServ.findAll();
			List<Bairro> bairros = baiServ.buscaBairro();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("bairros", bairros);
			mv.addObject("especs", especs);
			return mv;
		}
		else {
			List<MedicoDTO> medicos = medServ.buscaMed();
			List<Cidade> cidades = cidServ.findAll();
			List<Bairro> bairros = baiServ.buscaBairro();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("bairros", bairros);
			mv.addObject("especs", especs);
			return mv;
		}
		
		
	}
	
	@GetMapping("/bairro")
	public ResponseEntity<List<Bairro>> buscaBairro(){
		List<Bairro> list = baiServ.buscaBairro();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/medico")
	public ResponseEntity<List<MedicoDTO>> buscaDados(){
		List<MedicoDTO> list = medServ.buscaMed();
		
		return ResponseEntity.ok(list);
	}
	
}