package com.projeto.Repositorios;

import com.projeto.Entidades.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepositorio extends JpaRepository<Paciente,Integer> {

    @Query(nativeQuery = true, value = "select p.idpaci from paciente as p where p.nome=?1")
    Integer buscaIdporNome(String nome);
    
}
