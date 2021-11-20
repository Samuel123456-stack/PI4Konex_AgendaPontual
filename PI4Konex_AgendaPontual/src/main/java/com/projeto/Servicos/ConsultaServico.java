package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Consulta;
import com.projeto.Repositorios.ConsultaRepositorio;

@Service
public class ConsultaServico {
	
	@Autowired
	private ConsultaRepositorio conRepo;
	
	public void cadastro(Consulta obj) {		
		conRepo.save(obj);
	}
	
	@Transactional(readOnly = true)
	public Consulta buscaConsultaPorId(Integer id) {
		return conRepo.findByIdConsulta(id);
	}
}
