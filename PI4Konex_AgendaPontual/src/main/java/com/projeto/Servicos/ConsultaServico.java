package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.Entidades.Consulta;
import com.projeto.Repositorios.ConsultaRepositorio;

@Service
public class ConsultaServico {
	
	@Autowired
	private ConsultaRepositorio conRepo;
	
	public Consulta cadastro(Consulta obj) {
		return conRepo.save(obj);
	}
}
