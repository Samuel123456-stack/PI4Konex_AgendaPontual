package com.projeto.Repositorios;

import com.projeto.Entidades.Convenio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvenioRepositorio extends JpaRepository<Convenio,Integer> {
    
}
