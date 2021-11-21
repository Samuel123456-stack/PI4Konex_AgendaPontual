package com.projeto.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.Medico;

@Repository
public interface MedicojpaRepository extends JpaRepository<Medico,Integer> {

}
