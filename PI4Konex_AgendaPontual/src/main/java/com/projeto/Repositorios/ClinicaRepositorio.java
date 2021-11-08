package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Clinica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepositorio extends JpaRepository<Clinica,Integer> {

    @Query(nativeQuery = true, value="select c.nomecli from bairro as b join cidade as cid on b.fk_cid_bai=cid.idcid join endereco as e on b.idbai=e.fk_bai_end join clinica as c on e.idend=c.fk_end_cli where cid.idcid=?1")
    List<Clinica> buscaCliComEspCid(Integer idCid);
}
