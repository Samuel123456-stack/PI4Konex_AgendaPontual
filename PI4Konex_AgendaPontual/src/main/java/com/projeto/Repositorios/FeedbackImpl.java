package com.projeto.Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.Controladores.Dto.MelhoresFeedbacksDTO;
import com.zaxxer.hikari.HikariDataSource;

@Repository
public class FeedbackImpl implements FeedbackRepositorio{
	
	@Autowired
    private HikariDataSource dataSource;
	
	@Override
	public List<MelhoresFeedbacksDTO> buscaFeedbackPorMedico(Integer idMed) {
    	String sql = "select p.foto, f.comentario,p.nome from consulta c "
    			+ "inner join agenda_medica a on fk_agen_cons = a.idagen  "
    			+ "inner join medico m on fk_med_agen = m.idmed "
    			+ "inner join paciente p on fk_paci_agen = idpaci "
    			+ "inner join especialidade es on fk_esp_med = es.idesp "
    			+ "inner join endereco en on fk_end_med = en.idend "
    			+ "inner join feedback f on fk_feed_cons = f.idfeed "
    			+ "where m.idmed = ";
    	
    	if(idMed != null) {
    		sql += idMed;
    	}
	
        List<MelhoresFeedbacksDTO> feeds = new ArrayList<>();
		
        try (Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
			
        	
				while (rs.next()) {
					MelhoresFeedbacksDTO feed = new MelhoresFeedbacksDTO(
							rs.getBytes("p.foto"),
							rs.getString("f.comentario"),
							rs.getString("p.nome"));
					feeds.add(feed);
				}
				stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return feeds;
    	
	}
}
