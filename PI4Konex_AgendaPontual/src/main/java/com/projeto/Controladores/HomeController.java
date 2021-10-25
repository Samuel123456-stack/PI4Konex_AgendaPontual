package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	private MedicoServico medSer;
	
	
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
	
//	@GetMapping("/resultado")
//	public ResponseEntity<List<Medico>> buscaMed(){
//		List<Medico> list = medSer.buscaMedCidEsp("São Paulo", "Clinico(a) geral");
//		return ResponseEntity.ok().body(list);
//	}
	
	@GetMapping("/resultado")
	public ResponseEntity<List<Medico>> buscaMed(){
		List<Medico> list = medSer.listaMedCli(1);
		return ResponseEntity.ok().body(list);
	}
	
}