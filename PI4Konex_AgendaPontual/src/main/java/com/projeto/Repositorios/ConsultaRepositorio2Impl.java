package com.projeto.Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.Dto.ConsultaSemFeedDTO;
import com.zaxxer.hikari.HikariDataSource;

@Repository
public class ConsultaRepositorio2Impl implements ConsultaRepositorio2 {
	
	@Autowired
    private HikariDataSource dataSource;
	
	@Override
	public List<ConsultaSemFeedDTO> pesquisaConsultaSemFeed(Integer paciente) {
		String sql = "select c.idcons, m.nome "
				+ "from consulta as c "
				+ "inner join medico m on c.fk_med_cons = m.idmed "
				+ "where fk_feed_cons is null and concluida = 1 and c.fk_paci_cons = ";
	
    	if (paciente != null) {
			sql += paciente;
		}
		
    	List<ConsultaSemFeedDTO> consultas = new ArrayList<>();
    	
    	try (Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
    			
				while (rs.next()) {
					ConsultaSemFeedDTO consulta = new ConsultaSemFeedDTO(
							rs.getInt("c.idcons"),
							rs.getString("m.nome"));	
					consultas.add(consulta);
				}
				stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return consultas;
	}
}
