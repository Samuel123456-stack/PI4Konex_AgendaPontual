package com.projeto.Repositorios;

import com.projeto.Entidades.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepositorio extends JpaRepository<Paciente,Integer> {
    
}
