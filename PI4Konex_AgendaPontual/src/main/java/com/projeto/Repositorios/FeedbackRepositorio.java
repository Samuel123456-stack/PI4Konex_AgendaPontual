package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Controladores.Dto.MelhoresFeedbacksDTO;


public interface FeedbackRepositorio {
	
	List<MelhoresFeedbacksDTO> buscaFeedbackPorMedico(Integer idMed);
}
