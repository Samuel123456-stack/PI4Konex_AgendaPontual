package com.projeto.Repositorios;

import com.projeto.Entidades.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PacienteRepositorio extends JpaRepository<Paciente,Integer> {

    @Query(nativeQuery = true, value = "select p.idpaci from paciente as p where p.nome=?1")
    Integer buscaIdporNome(String nome);

    @Query(nativeQuery = true, value = "select p.fk_end_paci from paciente as p where")
    Integer buscaIdEndporNome(String nome);
    
//    @Query(nativeQuery = true, value = "select p.idpaci, p.foto, p.nome, p.cpf, p.datanasci, p.rg, p.celular, "
//    		+ "p.sexo, p.primeiraconsulta, p.sintomasgripe, p.termouso, p.fk_end_paci, p.fk_usu_paci "
//    		+ "from paciente as p "
//    		+ "inner join usuario as u on p.fk_usu_paci = u.idusu "
//    		+ "where u.idusu = :idusu")
//    Paciente buscaPacientePorUsuarioId(@Param("idusu") Integer idusu);
    
    
    @Query(nativeQuery = true, value = "select * "
    		+ "from paciente as p "
    		+ "inner join usuario as u on p.fk_usu_paci = u.idusu "
    		+ "where u.idusu = :idusu")
    Paciente buscaPacientePorUsuarioId(@Param("idusu") Integer idusu);
}
