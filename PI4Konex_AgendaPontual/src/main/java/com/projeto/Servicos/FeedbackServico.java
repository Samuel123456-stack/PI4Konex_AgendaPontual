package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Controladores.Dto.MelhoresFeedbacksDTO;
import com.projeto.Entidades.Feedback;
import com.projeto.Repositorios.FeedbackRepositorio;

@Service
public class FeedbackServico {
	
	@Autowired
	private FeedbackRepositorio feeRepo;
	
	@Transactional(readOnly = true)
	public List<MelhoresFeedbacksDTO> buscaFeedbackPorMedico(Integer idMed){
		return feeRepo.buscaFeedbackPorMedico(idMed); 
	}
}
