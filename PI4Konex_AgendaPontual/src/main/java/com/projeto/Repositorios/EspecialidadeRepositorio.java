package com.projeto.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.Especialidade;

@Repository
public interface EspecialidadeRepositorio extends JpaRepository<Especialidade, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM especialidade e WHERE e.nome = %?1%")
	List<Especialidade> buscaEsp(String nome);
}
