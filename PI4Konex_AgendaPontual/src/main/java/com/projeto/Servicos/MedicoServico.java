package com.projeto.Servicos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Medico;
import com.projeto.Repositorios.MedicoPesquisaDinamica;
import com.projeto.Repositorios.MedicoRepositorio;
import com.projeto.projecao.ResultadoPesqMedProjecao;

@Service
public class MedicoServico {
	
	@Autowired
	private MedicoRepositorio repoMed;
	
	@Autowired
	private MedicoPesquisaDinamica repoMedPesq;
	
	
	@Transactional(readOnly = true)
	public List<Medico> listaMedCli(Integer id){
		return repoMed.listaMedPorCli(id);
	}
	
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaMed(){
		List<ResultadoPesqMedProjecao> result = repoMed.buscaMed();
		return result.stream().map(x -> new MedicoDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaMedCid(Integer cidade){
		List<ResultadoPesqMedProjecao> result = repoMed.buscaMedCid(cidade);
		return result.stream().map(x -> new MedicoDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaMedEsp(Integer cidade, String esp){
		List<ResultadoPesqMedProjecao> result = repoMed.buscaMedCidEsp(cidade, esp);
		return result.stream().map(x -> new MedicoDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaEsp(String esp){
		List<ResultadoPesqMedProjecao> result = repoMed.buscaEsp(esp);
		return result.stream().map(x -> new MedicoDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaMedCompleta(Integer cidade,String esp, String sexMas, String sexFem, 
			Integer bairro,String espec, Integer valorMin,Integer valorMax,Integer minExp,Integer maxExp){
		List<ResultadoPesqMedProjecao> result = repoMed.buscaMedCompleta(cidade, bairro, espec, sexMas, 
				sexFem, valorMin, valorMax, minExp, maxExp);
		return result.stream().map(x -> new MedicoDTO(x)).collect(Collectors.toList());	
	}
	@Transactional(readOnly = true)
	public List<MedicoDTO> buscaTeste(Integer cidade, Integer bairro){
		return repoMedPesq.buscaMedDinamica(cidade, bairro);
			
	}
	
}
