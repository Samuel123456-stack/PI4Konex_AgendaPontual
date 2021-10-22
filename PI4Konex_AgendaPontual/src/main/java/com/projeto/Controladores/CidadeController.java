package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.projeto.Entidades.Cidade;
import com.projeto.Servicos.CidadeServico;

@Controller
public class CidadeController {
	
	@Autowired
	private CidadeServico servico;
	
	@GetMapping("/cidades")
	public ResponseEntity<List<Cidade>> findAll(){
		
		List<Cidade> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}
}
