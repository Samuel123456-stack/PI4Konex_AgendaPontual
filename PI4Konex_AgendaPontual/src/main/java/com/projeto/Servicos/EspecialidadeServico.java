package com.projeto.Servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Especialidade;
import com.projeto.Repositorios.EspecialidadeRepositorio;

@Service
public class EspecialidadeServico {
	
	@Autowired
	private EspecialidadeRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public List<Especialidade> findAll(){
		return repositorio.findAll();
	}
	
	@Transactional(readOnly = true)
	public Especialidade findById(Integer id) {
		Optional<Especialidade> obj = repositorio.findById(id);
		Especialidade entity = obj.get();
		return entity;
	}
}
