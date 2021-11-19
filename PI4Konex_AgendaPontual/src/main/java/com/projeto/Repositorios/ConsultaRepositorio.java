package com.projeto.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.Consulta;

@Repository
public interface ConsultaRepositorio extends JpaRepository<Consulta,Integer> {
   Consulta findByIdConsulta(Integer idConsulta);
}
