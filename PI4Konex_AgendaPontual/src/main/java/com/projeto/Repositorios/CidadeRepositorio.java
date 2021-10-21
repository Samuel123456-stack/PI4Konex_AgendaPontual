package com.projeto.Repositorios;

import com.projeto.Entidades.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepositorio extends JpaRepository<Cidade,Integer> {
    
}
