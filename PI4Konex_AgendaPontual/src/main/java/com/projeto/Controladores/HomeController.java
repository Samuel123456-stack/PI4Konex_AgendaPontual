package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Medico;
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
	
	
	private String ftc;
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Cidade> cidades = cidServ.findAll();
		model.addAttribute("cidades", cidades);
		return ("/home");
	}
	
//	@PostMapping("/resulBusca")
//	public ModelAndView buscaMed(@RequestParam("cidade") String cidade, @RequestParam("esp") String esp) {
//		ModelAndView modelAndView = new ModelAndView("/resulBusca");
//		modelAndView.addObject("esp", espServ.)
//	}
	
	@GetMapping("/resulBusca")
	public String buscaMed(Model model) {

		return ("/resulBusca");
	}
		
	@GetMapping("/resultado")
	public ResponseEntity<List<MedicoDTO>> buscaMed(String cidade, String esp){
		List<MedicoDTO> list = medServ.buscaMedEsp("São Paulo", "Clinico(a) Geral");
		return ResponseEntity.ok().body(list);
	}
}