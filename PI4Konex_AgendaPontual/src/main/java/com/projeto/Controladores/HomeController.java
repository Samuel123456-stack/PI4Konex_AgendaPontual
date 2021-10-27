package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Medico;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.projecao.ResultadoPesqMedProjecao;



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
		
	@PostMapping("**/pesquisamedico")
	public ModelAndView buscaMed(@RequestParam("cidade") Integer cidade, @RequestParam("esp") String esp) {
		List<MedicoDTO> list = medServ.buscaMedEsp(cidade, esp);
		return new ModelAndView("/resulBusca").addObject("medicos", list);
	}
	
}