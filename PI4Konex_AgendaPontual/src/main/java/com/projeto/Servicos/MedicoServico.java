package com.projeto.Servicos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Medico;
import com.projeto.Repositorios.MedicoPesquisaDinamica;
import com.projeto.Repositorios.MedicoRepositorio;
import com.projeto.projecao.ResultadoPesqMedProjecao;


public interface MedicoServico {

	
	List<Medico> listaMedPorCli(Integer id);

	
	List<Medico> findAll();


	List<Medico> buscaMedCompleta(Integer cidade, Integer bairro, String espec,
			String sexMas, String sexFem,Float valorMin , Float valorMax, 
			Integer minExp, Integer maxExp);
		
}
