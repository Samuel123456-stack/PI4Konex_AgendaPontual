package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Contato;
import com.projeto.Entidades.NewsLetter;
import com.projeto.Entidades.Paciente;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.ContatoServico;

@Controller
public class HomeController {
	
	@Autowired
	private CidadeServico cidServ;
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Cidade> cidades = cidServ.findAll();
		model.addAttribute("cidades", cidades);
		model.addAttribute("news", new NewsLetter());
		model.addAttribute("contato", new Contato());
		return ("/home/home");
	}
	
	@GetMapping("/login")
	public String login() {
		return ("/home/tela_login");
	}
	
	@GetMapping("/teste")
	public String teste(Model model) {
		model.addAttribute("paciente", new Paciente());	
		return ("teste");
	}
	
}