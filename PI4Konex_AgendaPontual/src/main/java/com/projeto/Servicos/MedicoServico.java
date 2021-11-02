package com.projeto.Servicos;

import java.util.List;

import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Medico;


public interface MedicoServico {

	
	List<Medico> listaMedPorCli(Integer id);

	
	List<Medico> findAll();


	List<Medico> buscaMedCompleta(Integer cidade, Integer bairro, String espec,
			String sexMas, String sexFem,Float valorMin , Float valorMax, 
			Integer minExp, Integer maxExp);
		
}
