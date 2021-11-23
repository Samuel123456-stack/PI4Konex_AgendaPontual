package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Dto.PagamentoDTO;


public interface PagamentoRepositorio {

    List<PagamentoDTO> listaPagPorMed(Integer idMed);
    
}
