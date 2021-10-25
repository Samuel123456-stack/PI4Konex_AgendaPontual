package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Medico;
import com.projeto.Repositorios.MedicoRepositorio;

@Service
public class MedicoServico {
	
	@Autowired
	private MedicoRepositorio repoMed;
	
	@Transactional(readOnly = true)
	public List<Medico> buscaMedCidEsp(String cidade, String esp){
		return repoMed.buscaMedCidEsp(cidade, esp);
	}
	
	@Transactional(readOnly = true)
	public List<Medico> listaMedCli(Integer id){
		return repoMed.listaMedPorCli(id);
	}
}
