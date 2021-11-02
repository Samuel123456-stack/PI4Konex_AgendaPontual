package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Medico;


public interface MedicoRepositorio{
    
	List<Medico> listaMedPorCli(Integer id);
    
    List<Medico> findAll();
     
    List<Medico> buscaMedCompleta(Integer cidade, Integer bairro, String espec,
			String sexMas, String sexFem,Float valorMin , Float valorMax, 
			Integer minExp, Integer maxExp);
}
