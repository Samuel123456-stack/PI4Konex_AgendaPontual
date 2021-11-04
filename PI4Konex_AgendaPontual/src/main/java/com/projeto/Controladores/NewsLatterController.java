package com.projeto.Controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.Entidades.NewsLatter;
import com.projeto.Servicos.NewsLatterServico;

@Controller
public class NewsLatterController {

	@Autowired
	private NewsLatterServico newsServ;
	
	@PostMapping("/newslatter/cadastro/home")
	public String cadastroEmail(@Valid @ModelAttribute("news") NewsLatter news, BindingResult result) {
	
		if (result.hasErrors()) {
			return "home";
		}
		newsServ.cadastro(news);
		return "redirect:/";
	}
	
	@PostMapping("/newslatter/cadastro/medico/busca")
	public String cadastroEmail2(@Valid @ModelAttribute("news") NewsLatter news, BindingResult result) {
	
		if (result.hasErrors()) {
			return "resulBusca";
		}
		newsServ.cadastro(news);
		return "redirect:/medico/busca";
	}
}
