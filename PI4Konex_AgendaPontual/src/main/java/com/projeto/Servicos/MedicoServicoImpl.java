package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Medico;
import com.projeto.Repositorios.MedicoRepositorio;

@Service
public class MedicoServicoImpl implements MedicoServico {

	@Autowired
	private MedicoRepositorio medRepo;

	@Transactional(readOnly = true)
	@Override
	public List<Medico> listaMedPorCli(Integer id) {
		return medRepo.listaMedPorCli(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Medico> findAll() {
		return medRepo.findAll(); 
	}
	@Transactional(readOnly = true)
	@Override
	public List<Medico> buscaMedCompleta(Integer cidade, Integer bairro, String espec,
			String sexMas, String sexFem,Float valorMin , Float valorMax, 
			Integer minExp, Integer maxExp) {
		return medRepo.buscaMedCompleta(cidade, bairro, espec, sexMas, sexFem, valorMin,
				valorMax, minExp, maxExp);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Medico> filtraMedCli(Integer idEsp, Integer idCid, Integer idCli,
	       String sexMas, String sexFem,Float valorMin, Float valorMax){
		return medRepo.filtraMedCli(idEsp, idCid, idCli, sexMas, sexFem, valorMin, valorMax);
	}
	
}
