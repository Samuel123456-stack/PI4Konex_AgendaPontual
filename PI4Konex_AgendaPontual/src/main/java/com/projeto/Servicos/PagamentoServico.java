package com.projeto.Servicos;

import java.util.List;

import com.projeto.Dto.PagamentoDTO;
import com.projeto.Entidades.Pagamento;
import com.projeto.Repositorios.PagamentoRepositorio;
import com.projeto.Repositorios.PagamentoRepositorio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoServico {

    @Autowired
    private PagamentoRepositorio repoPag;
    @Autowired
    private PagamentoRepositorio2 repoJpaPag;

    // Metodos Pagamento
    public void criaPag(Pagamento pag) {
        repoJpaPag.save(pag);
    }
    
    public List<PagamentoDTO> listaPagPorMed(Integer idMed){
        return repoPag.listaPagPorMed(idMed);
    }
}
