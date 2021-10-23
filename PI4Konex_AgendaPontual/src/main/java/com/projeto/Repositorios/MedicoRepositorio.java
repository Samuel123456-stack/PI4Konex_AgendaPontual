package com.projeto.Repositorios;

import com.projeto.Entidades.Medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepositorio extends JpaRepository<Medico,Integer> {
    
}
