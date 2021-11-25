package com.projeto.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.ProjecaoSalarial;

@Repository
public interface ProjecaoRepositorio extends JpaRepository<ProjecaoSalarial, Integer> {

}
