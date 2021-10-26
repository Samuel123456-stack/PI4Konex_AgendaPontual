package com.projeto.Servicos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Medico;
import com.projeto.Repositorios.MedicoRepositorio;
import com.projeto.projecao.ResultadoPesqMedProjecao;

@Service
public class MedicoServico {
	
	@Autowired
	private MedicoRepositorio repoMed;
	
	
	@Transactional(readOnly = true)
	public List<Medico> listaMedCli(Integer id){
		return repoMed.listaMedPorCli(id);
	}
	
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaMedEsp(String cidade, String esp){
		List<ResultadoPesqMedProjecao> result = repoMed.buscaMedCidEsp(cidade, esp);
		return result.stream().map(x -> new MedicoDTO(x)).collect(Collectors.toList());	
	}
}
