package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Servicos.BairroServico;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;

@Controller
public class HomeController {
	
	@Autowired
	private CidadeServico cidServ;
	
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Cidade> cidades = cidServ.findAll();
		model.addAttribute("cidades", cidades);
		return ("/home");
	}
	
	
	@GetMapping("/sobrenos")
	public String sobreNos() {
		return ("sobre");
	}
	
	@GetMapping("/planos")
	public String planos() {
		return ("planos");
	}
	
	@GetMapping("/login")
	public String login() {
		return ("login");
	}
	
	@GetMapping("/resumo")
	public String resumo() {
		return ("tela_resumo");
	}
}