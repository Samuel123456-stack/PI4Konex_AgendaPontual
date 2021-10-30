package com.projeto.Servicos;

import com.projeto.Entidades.Pagamento;
import com.projeto.Repositorios.PagamentoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoServico {

    @Autowired
    private PagamentoRepositorio repoPag;

    // Metodos Pagamento
    public void criaPag(Pagamento pag) {
        repoPag.save(pag);
    }
}
