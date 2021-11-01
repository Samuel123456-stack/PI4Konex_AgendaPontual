package com.projeto.Repositorios;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.projeto.Entidades.Medico;
import com.projeto.projecao.ResultadoPesqMedProjecao;

@Repository
public interface MedicoRepositorio{
    
    //@Query(nativeQuery = true, value="select * from medico as m join clinica as c on m.fk_cli_med=c.idcli where c.idcli= ?1")
    List<Medico> listaMedPorCli(Integer id);
    
    List<Medico> findAll();
    
//    @Query(nativeQuery = true, value="select * from medico m where m.nome like concat('%',:termo,'%')")
//    List<Medico> buscaMedCidEsp (String termo);
    
//    @Query(nativeQuery = true, value="select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
//    		+ "from clinica c "
//    		+ "inner join medico m on m.fk_cli_med = c.idcli "
//    		+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
//    		+ "inner join endereco e on c.fk_end_cli = e.idend "
//    		+ "inner join bairro b on e.fk_bai_end = b.idbai "
//    		+ "inner join cidade cid on b.fk_cid_bai = cid.idcid")
    List<ResultadoPesqMedProjecao> buscaMed();
    
//    @Query(nativeQuery = true, value="select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
//    		+ "from clinica c "
//    		+ "inner join medico m on m.fk_cli_med = c.idcli "
//    		+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
//    		+ "inner join endereco e on c.fk_end_cli = e.idend "
//    		+ "inner join bairro b on e.fk_bai_end = b.idbai "
//    		+ "inner join cidade cid on b.fk_cid_bai = cid.idcid "
//    		+ "where cid.idcid = :cidade and esp.nome = :esp")
    List<ResultadoPesqMedProjecao> buscaMedCidEsp (Integer cidade, String esp);
    
//    @Query(nativeQuery = true, value="select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
//    		+ "from clinica c "
//    		+ "inner join medico m on m.fk_cli_med = c.idcli "
//    		+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
//    		+ "inner join endereco e on c.fk_end_cli = e.idend "
//    		+ "inner join bairro b on e.fk_bai_end = b.idbai "
//    		+ "inner join cidade cid on b.fk_cid_bai = cid.idcid "
//    		+ "where cid.idcid = :cidade")
    List<ResultadoPesqMedProjecao> buscaMedCid(Integer cidade);

    
//    @Query(nativeQuery = true, value="select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
//    		+ "from clinica c "
//    		+ "inner join medico m on m.fk_cli_med = c.idcli "
//    		+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
//    		+ "inner join endereco e on c.fk_end_cli = e.idend "
//    		+ "inner join bairro b on e.fk_bai_end = b.idbai "
//    		+ "inner join cidade cid on b.fk_cid_bai = cid.idcid "
//    		+ "where upper(trim(esp.nome)) = :esp")
	List<ResultadoPesqMedProjecao> buscaEsp(String esp);
    
//    @Query(nativeQuery = true, value="select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
//    		+ "from clinica c "
//    		+ "inner join medico m on m.fk_cli_med = c.idcli "
//    		+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
//    		+ "inner join endereco e on c.fk_end_cli = e.idend "
//    		+ "inner join bairro b on e.fk_bai_end = b.idbai "
//    		+ "inner join cidade cid on b.fk_cid_bai = cid.idcid "
//    		+ "where cid.idcid = :cidade and b.bairro = :bairro and esp.nome = :espec and "
//    		+ "m.sexo = :sexMas and m.sexo = :sexFem and m.valor between :valorMin and :valorMax and "
//    		+ "TIMESTAMPDIFF(YEAR, m.dataformatura, CURDATE()) between :minExp and :maxExp")
    List<ResultadoPesqMedProjecao> buscaMedCompleta(Integer cidade,Integer bairro,
    		String espec, String sexMas, String sexFem, Integer valorMin,Integer valorMax,
    		Integer minExp,Integer maxExp);
    
    List<Medico> buscaTeste(Integer cidade, Integer bairro);
}
