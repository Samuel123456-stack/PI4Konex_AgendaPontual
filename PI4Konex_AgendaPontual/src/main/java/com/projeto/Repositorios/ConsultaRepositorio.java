package com.projeto.Repositorios;

import com.projeto.Entidades.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepositorio extends JpaRepository<Consulta,Integer> {
    
}
