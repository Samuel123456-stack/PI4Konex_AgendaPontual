package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.projeto.Entidades.Bairro;
import com.projeto.Servicos.BairroServico;

@Controller
public class CidadeController {
	
	@Autowired
	private BairroServico servico;
	
	@GetMapping("/bairros")
	public ResponseEntity<List<Bairro>> findAll(){
		
		List<Bairro> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}
}
