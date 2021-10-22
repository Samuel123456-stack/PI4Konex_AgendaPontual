package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.projeto.Entidades.Endereco;
import com.projeto.Servicos.EnderecoServico;

@Controller
public class EnderecoController {
	
	@Autowired
	private EnderecoServico servico;
	
	@GetMapping("/enderecos")
	public ResponseEntity<List<Endereco>>findAll(){
		List<Endereco> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}
}
