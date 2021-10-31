package com.projeto.Repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.projeto.Dto.MedicoDTO;
import com.projeto.projecao.ResultadoPesqMedProjecao;

@Repository
public class MedicoPesquisaDinamica {
	
	private final EntityManager em;
	
	public MedicoPesquisaDinamica(EntityManager em) {
		this.em = em;
	}
	
	public List<MedicoDTO> buscaMedDinamica(Integer cidade,Integer bairro
    		){
		
		String query = "select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
				+ "from clinica c inner join medico m on m.fk_cli_med = c.idcli "
				+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
				+ "inner join endereco e on c.fk_end_cli = e.idend "
				+ "inner join bairro b on e.fk_bai_end = b.idbai "
				+ "inner join cidade cid on b.fk_cid_bai = cid.idcid ";
		
		String condicao = "where";
		
		if(cidade != null) {
			query += condicao + "cid.idcid";
			condicao = "and";
			
		}
		if (cidade != null && bairro != null) {
			query += condicao + "b.idbai";
		}
		if(cidade == null && bairro != null) {
			query += condicao + "b.idbai";
		}
		
		TypedQuery<MedicoDTO> q = em.createQuery(query, MedicoDTO.class);
		
		if(cidade != null) {
			q.setParameter("cidade", cidade);
			
		}
		if (cidade != null && bairro != null) {
			q.getResultList();
		}
		if(cidade == null && bairro != null) {
			q.setParameter("bairro", bairro);
		}
		
		return q.getResultList();
	}
}
