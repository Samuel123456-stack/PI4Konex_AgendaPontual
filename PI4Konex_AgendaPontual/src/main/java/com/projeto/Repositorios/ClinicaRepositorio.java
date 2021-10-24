package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Clinica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClinicaRepositorio extends JpaRepository<Clinica,Integer> {

    @Query(nativeQuery = true, value="select c.nome_cli from bairro as b join cidade as cid on b.fk_cid_bai=cid.id_cid join endereco as e on b.id_bai=e.fk_bai_end join clinica as c on e.id_end=c.fk_end_cli where cid.id_cid= ?1")
    List<Clinica> buscaCliOpCid(Integer idCid);
}
