package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Consulta;

public interface ConsultaRepositorio2 {
	
	List<Consulta> pesquisaConsultaSemFeed(Integer paciente);
}
