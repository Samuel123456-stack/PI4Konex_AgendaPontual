package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Repositorios.ClinicaRepositorio;

@Service
public class ClinicasServico {
	
	@Autowired
	private ClinicaRepositorio cliRepo;
	
	@Transactional(readOnly = true)
	public List<Object []> buscaClinicas(Integer id){
		return cliRepo.buscaClinicas(id);	
	}
}
