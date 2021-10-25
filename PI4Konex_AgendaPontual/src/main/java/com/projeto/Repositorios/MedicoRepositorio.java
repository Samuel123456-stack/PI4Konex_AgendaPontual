package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico,Integer> {
    
    @Query(nativeQuery = true, value="select * from medico as m join clinica as c on m.fk_cli_med=c.id_cli where c.id_cli= ?1")
    List<Medico> listaMedPorCli(Integer id);
    
    @Query(nativeQuery = true, value="select m.nome, m.sobre_mim from medico m "
    		+ "inner join clinica cl on cl.fk_cli_med = cl.id_cli "
    		+ "inner join endereco e on e.fk_end_cli = e.id_end "
    		+ "inner join bairro b on b.fk_bai_end = b.id_bai "
    		+ "inner join cidade c on c.fk_cid_bai = c.id_cid "
    		+ "inner join especialidade es on es.fk_esp_med = es.id_esp "
    		+ "where c.nome = :cidade and es.nome = :esp")
    List<Medico> buscaMedCidEsp (String cidade, String esp);

}
