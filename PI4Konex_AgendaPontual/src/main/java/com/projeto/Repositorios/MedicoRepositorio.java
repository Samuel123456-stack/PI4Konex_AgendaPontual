package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Medico;
import com.projeto.projecao.MedicoProjecao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico,Integer> {
    
    @Query(nativeQuery = true, value="select * from medico as m join clinica as c on m.fk_cli_med=c.id_cli where c.id_cli= ?1")
    List<Medico> listaMedPorCli(Integer id);
    
//    @Query(nativeQuery = true, value="select m.nome, m.sobre_mim from medico m "
//    		+ "inner join clinica cl on m.fk_cli_med = cl.id_cli "
//    		+ "inner join endereco e on cl.fk_end_cli = e.id_end "
//    		+ "inner join bairro b on e.fk_bai_end = b.id_bai "
//    		+ "inner join cidade c on b.fk_cid_bai = c.id_cid "
//    		+ "inner join especialidade es on m.fk_esp_med = es.id_esp "
//    		+ "where c.nome like concat('%',:cidade,'%')")
//    List<MedicoProjecao> buscaMedCidEsp (String cidade);
    
//    @Query(nativeQuery = true, value="select m.nome medico,nome_cli, c.nome cidade from medico m \r\n"
//    		+ "inner join clinica cl on m.fk_cli_med = cl.id_cli\r\n"
//    		+ "inner join endereco e on cl.fk_end_cli = e.id_end\r\n"
//    		+ "inner join bairro b on e.fk_bai_end = b.id_bai \r\n"
//    		+ "inner join cidade c on b.fk_cid_bai = c.id_cid")
//    List<Medico> buscaMedCidEsp (@Param("c") String cidade);
    
//    @Query(nativeQuery = true, value="SELECT m.nome  ASmedico,nome_cli, c.nome from medico m "
//    		+ "INNER JOIN clinica cl ON m.fk_cli_med = cl.id_cli "
//    		+ "INNER JOIN endereco e ON cl.fk_end_cli = e.id_end "
//    		+ "INNER JOIN bairro b ON e.fk_bai_end = b.id_bai "
//    		+ "INNER JOIN cidade c ON b.fk_cid_bai = c.id_cid")
//    List<Medico> buscaMedCidEsp2 ();
   
    @Query(nativeQuery = true, value="select * from medico m where m.nome like concat('%',:termo,'%')")
    List<Medico> buscaMedCidEsp (String termo);
}
