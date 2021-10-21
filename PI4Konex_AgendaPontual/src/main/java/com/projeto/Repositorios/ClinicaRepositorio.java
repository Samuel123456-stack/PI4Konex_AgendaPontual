package com.projeto.Repositorios;

import com.projeto.Entidades.Clinica;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicaRepositorio extends JpaRepository<Clinica,Integer> {
    
}
