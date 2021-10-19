package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.Entidades.Especialidade;
import com.projeto.Servicos.EspecialidadeServico;

@RestController
@RequestMapping(value = "/especialidades")
public class EspecialidadeController {
	
	@Autowired
	private EspecialidadeServico servico;
	
	@GetMapping
	public ResponseEntity<List <Especialidade>> findAll(){
		List<Especialidade> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}	
}
