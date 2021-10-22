package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Especialidade;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.EspecialidadeServico;



@Controller
public class HomeController {
	
	@Autowired
	private CidadeServico cidServ;
	
	@Autowired
	private EspecialidadeServico espServ;
	
	
	private String ftc;
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Cidade> cidades = cidServ.findAll();
		model.addAttribute("cidades", cidades);
		return ("/home");
	}
	
	@GetMapping(value="/especialidades")
	@ResponseBody
	public List <Especialidade> listEsp(@RequestParam(value="term", required = false, defaultValue="") String term ) {
		List<Especialidade> list = espServ.buscaEsp(term);
		return list;
	}
	
}