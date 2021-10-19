package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.Entidades.Especialidade;
import com.projeto.Repositorios.EspecialidadeRepositorio;

@Service
public class EspecialidadeServico {
	
	@Autowired
	private EspecialidadeRepositorio repositorio;
	
	public List<Especialidade> findAll(){
		return repositorio.findAll();
	}
}
