package com.projeto.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Home() {
		return "/home";
	}
	
	@GetMapping("/resultado")
	public String resultado() {
		
		
		return "/resulBusca";
	}

}