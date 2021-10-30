package com.projeto.Servicos;

import com.projeto.Entidades.Ajuda;
import com.projeto.Repositorios.AjudaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AjudaServico {

    @Autowired
    private AjudaRepositorio repoAjuda;

    // Metodos Ajuda
    public void criaAjuda(Ajuda ajuda) {
        repoAjuda.save(ajuda);
    }

}
