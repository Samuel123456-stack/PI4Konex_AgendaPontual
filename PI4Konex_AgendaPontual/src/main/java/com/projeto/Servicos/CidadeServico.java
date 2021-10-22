package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Cidade;
import com.projeto.Repositorios.CidadeRepositorio;


@Service
public class CidadeServico {
	
	@Autowired
	private CidadeRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public List<Cidade> findAll(){
		return repositorio.findAll();
	}
}
