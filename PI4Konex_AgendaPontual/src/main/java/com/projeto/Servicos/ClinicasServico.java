package com.projeto.Servicos;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.Repositorios.ClinicaRepositorio;

@Service
public class ClinicasServico {
	
	private ClinicaRepositorio cliRepo;
	
	public List<Object []> buscaClinicas(Integer id){
		return cliRepo.buscaClinicas(id);	
	}
}
