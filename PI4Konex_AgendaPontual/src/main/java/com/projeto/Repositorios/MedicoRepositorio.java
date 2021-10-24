package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicoRepositorio extends JpaRepository<Medico,Integer> {
    
    @Query(nativeQuery = true, value="select * from medico as m join clinica as c on m.fk_cli_med=c.id_cli where c.id_cli= ?1")
    List<Medico> listaMedPorCli(Integer id);
    

}
