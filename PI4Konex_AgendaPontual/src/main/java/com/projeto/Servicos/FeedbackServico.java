package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Dto.AvaliacoesNegativasDTO;
import com.projeto.Dto.AvaliacoesPositivasDTO;
import com.projeto.Dto.MelhoresFeedbacksDTO;
import com.projeto.Repositorios.FeedbackRepositorio;

@Service
public class FeedbackServico {

	@Autowired
	private FeedbackRepositorio feeRepo;

	@Transactional(readOnly = true)
	public List<MelhoresFeedbacksDTO> buscaFeedbackPorMedico(Integer idMed) {
		return feeRepo.buscaFeedbackPorMedico(idMed);
	}

	@Transactional(readOnly = true)
	public AvaliacoesPositivasDTO buscaPositiva(Integer idMed) {
		return feeRepo.buscaAvaPositiva(idMed);
	}

	@Transactional(readOnly = true)
	public AvaliacoesNegativasDTO buscaNegativa(Integer idMed) {
		return feeRepo.buscaAvaNegativa(idMed);
	}
}
