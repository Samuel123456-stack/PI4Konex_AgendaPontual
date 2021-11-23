package com.projeto.Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.Consulta;
import com.projeto.Entidades.Feedback;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Pagamento;
import com.projeto.Entidades.Receita;
import com.zaxxer.hikari.HikariDataSource;

@Repository
public class ConsultaRepositorio2Impl implements ConsultaRepositorio2 {
	
	@Autowired
    private HikariDataSource dataSource;
	
	
	@Override
	public List<Consulta> pesquisaConsultaSemFeed(Integer paciente) {
		String sql = "select idcons, dtagendada,hora,fk_med_cons,fk_paci_cons,informacoesadic,confirmada,"
				+ "retorno,horachegada,horasaida,duracao,concluida,naocompareceu,cancelada,fk_rec_cons,fk_pag_cons,fk_feed_cons "
				+ "from consulta "
		   		+ "where concluida = 1 and fk_feed_cons is null and fk_paci_cons = ";
		
		
    	if (paciente != null) {
			sql += paciente;
		}
		
    	List<Consulta> consultas = new ArrayList<>();
    	
    	try (Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
    			
				while (rs.next()) {
					Medico med = new Medico();
					Paciente paci = new Paciente();
					Feedback feed = new Feedback();
					Receita rec = new Receita();
					Pagamento pag = new Pagamento();
					Consulta consulta = new Consulta();

					consulta.setIdConsulta(rs.getInt("idcons"));
					consulta.setDtAgendada(rs.getDate("dtagendada").toLocalDate());
					consulta.setHora(rs.getTime("hora").toLocalTime());
					med.setIdMed(rs.getInt("fk_med_cons"));
					consulta.setMedico(med);
					paci.setIdPaci(rs.getInt("fk_paci_cons"));
					consulta.setPaciente(paci);
					consulta.setInformaAdicio(rs.getString("informacoesadic"));
					consulta.setConfirmada(rs.getBoolean("confirmada"));
					consulta.setRetorno(rs.getBoolean("retorno"));
					consulta.setHoraChegada(rs.getTime("horachegada").toLocalTime());
					consulta.setDuracao(rs.getTime("duracao").toLocalTime());
					consulta.setConcluida(rs.getBoolean("concluida"));
					consulta.setNaoCompareceu(rs.getBoolean("cancelada"));
					rec.setIdRec(rs.getInt("fk_rec_cons"));
					consulta.setReceita(rec);
					pag.setIdPag(rs.getInt("fk_pag_cons"));
					consulta.setPagamento(pag);
					feed.setIdFeed(rs.getInt("fk_feed_cons"));
					consulta.setFeedback(feed);
						
					consultas.add(consulta);
				}
				stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return consultas;
	}
}
