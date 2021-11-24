package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Dto.ConsultaSemFeedDTO;

public interface ConsultaRepositorio2 {
	
	List<ConsultaSemFeedDTO> pesquisaConsultaSemFeed(Integer paciente);
}
