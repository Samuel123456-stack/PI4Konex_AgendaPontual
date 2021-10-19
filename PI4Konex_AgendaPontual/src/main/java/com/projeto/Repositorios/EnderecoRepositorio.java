package com.projeto.Repositorios;

import com.projeto.Entidades.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepositorio extends JpaRepository<Endereco,Integer> {
    
}
