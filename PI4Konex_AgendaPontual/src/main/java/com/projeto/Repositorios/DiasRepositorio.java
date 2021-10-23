package com.projeto.Repositorios;

import com.projeto.Entidades.DiasSemana;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiasRepositorio extends JpaRepository<DiasSemana, Integer> {
    
}
