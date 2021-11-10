package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Controladores.Dto.AvaliacoesNegativasDTO;
import com.projeto.Controladores.Dto.AvaliacoesPositivasDTO;
import com.projeto.Controladores.Dto.MelhoresFeedbacksDTO;


public interface FeedbackRepositorio {
	
	List<MelhoresFeedbacksDTO> buscaFeedbackPorMedico(Integer idMed);
	
	AvaliacoesPositivasDTO buscaAvaPositiva(Integer idMed);
	
	AvaliacoesNegativasDTO buscaAvaNegativa(Integer idMed);
}
