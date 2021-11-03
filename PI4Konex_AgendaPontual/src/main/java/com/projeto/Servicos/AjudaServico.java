package com.projeto.Servicos;

import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.AjudaRec;
import com.projeto.Repositorios.AjudaRecRepositorio;
import com.projeto.Repositorios.AjudaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AjudaServico {

    @Autowired
    private AjudaRepositorio repoAjuda;
    @Autowired
    private AjudaRecRepositorio repoAjudaRec;

    // Metodos Ajuda
    @Transactional(readOnly = false)
    public void criaAjuda(Ajuda ajuda) {
        repoAjuda.save(ajuda);
    }

    @Transactional(readOnly = false)
    public void criaAjudaRec(AjudaRec ajuRec){
        repoAjudaRec.save(ajuRec);
    }


}
