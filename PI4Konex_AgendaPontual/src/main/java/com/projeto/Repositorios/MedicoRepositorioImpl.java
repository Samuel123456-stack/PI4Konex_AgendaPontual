package com.projeto.Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.Clinica;
import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.zaxxer.hikari.HikariDataSource;

@Repository
public class MedicoRepositorioImpl implements MedicoRepositorio{
	
    @Autowired
    //private DataSource dataSource;
    
    private HikariDataSource dataSource;

//    @Autowired
//    private JdbcTemplate jdbc;
    
    
    @Override
    public List<Medico> buscaMedCompleta(Integer cidade, Integer bairro, String espec, String sexMas, String sexFem,
			Float valorMin, Float valorMax, Integer minExp, Integer maxExp) {
    	String condicao = "where ";
    	String orderDesc = " order by m.pontos desc";
    	
    	String sql = "select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
				+ "from clinica c inner join medico m on m.fk_cli_med = c.idcli "
				+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
				+ "inner join endereco e on c.fk_end_cli = e.idend "
				+ "inner join bairro b on e.fk_bai_end = b.idbai "
				+ "inner join cidade cid on b.fk_cid_bai = cid.idcid ";
		      
        List<Medico> medicos = new ArrayList<>();
		try {
			//Connection conn = dataSource.getConnection();
			
			Connection conn = dataSource.getConnection();
			
			if (cidade != null) {
				sql += condicao + "cid.idcid = "+ cidade;
				condicao = " and ";
			}
			if (bairro != null) {
				sql += condicao + "b.idbai = "+ bairro;
			}
			if (espec != null && !(espec.isEmpty())) {
				sql += condicao + "esp.nome = "+ "\""+espec+"\"";
				condicao = " and ";
			}
			if (sexFem != null && sexMas != null) {
				sql += condicao + "m.sexo = "+ "\""+sexFem+"\"";
				condicao = " or ";
			}
			if (sexFem != null && condicao != " or ") {
				sql += condicao + "m.sexo = "+ "\""+sexFem+"\"";
				condicao = " and ";
			}
			if (sexMas != null) {
				sql += condicao + "m.sexo = "+ "\""+sexMas+"\"";
				condicao = " and ";
			}
			if (valorMin != null) {
				sql += condicao+ "m.valor "+"between " + valorMin;
				condicao = " and ";
			}
			if (valorMax != null) {
				sql += condicao+ valorMax;
			}
			if (minExp != null) {
				sql += condicao+ "TIMESTAMPDIFF(YEAR, dataformatura, CURDATE()) between " + minExp;
				condicao = " and ";
			}
			if (maxExp != null) {
				sql += condicao + maxExp;
			}
			
			sql += orderDesc;
			
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			

				while (rs.next()) {
					Medico med = new Medico(
							rs.getInt("m.idmed"),
							rs.getBytes("m.foto"),
							rs.getInt("m.pontos"),
							rs.getString("m.nome"),
							rs.getString("m.sobremim"));
					medicos.add(med);
				}
				st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicos;
    }

	@Override
	public List<Medico> listaMedPorCli(Integer id) {

		String sql = "select * from medico as m join clinica as c "
				+ "on m.fk_cli_med=c.idcli where c.idcli= ?";

		List<Medico> medicos = new ArrayList<>();

		try {
			//Connection conn = dataSource.getConnection();
			
			Connection conn = dataSource.getConnection();
			


			//PreparedStatement st = conn.prepareStatement(sql);
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);

			ResultSet rs = st.executeQuery();
			

				while (rs.next()) {
					Medico med = new Medico();
					med.setIdMed(rs.getInt("idmed"));
					med.setFoto(rs.getString("foto"));
					med.setPontos(rs.getInt("pontos"));
					med.setNomeMed(rs.getString("nome"));
					med.setDataNasc(rs.getDate("datanasci").toLocalDate());
					med.setSexoMed(rs.getNString("sexo"));
					med.setCpfMed(rs.getString("cpf"));
					med.setRgMed(rs.getString("rg"));
					med.setCrm(rs.getString("rg"));
					med.setCelular(rs.getString("celular"));
					med.setValorMed(rs.getFloat("valor"));
					med.setCelular(rs.getString("celular"));
					med.setDataFormatura(rs.getDate("dataformatura").toLocalDate());
					med.setSobreMed(rs.getString("sobremim"));
					med.setBioMed(rs.getString("biografia"));
					med.setSala(rs.getString("sala"));
					Endereco end = new Endereco();
					end.setIdEnd(rs.getInt("fk_end_med"));
					med.setEndereco(end);
					Clinica cli = new Clinica();
					cli.setIdCli(rs.getInt("fk_cli_med"));
					med.setClinica(cli);
					Especialidade esp = new Especialidade();
					esp.setIdEsp(rs.getInt("fk_esp_med"));
					med.setEspecialidade(esp);
					medicos.add(med);
				}
				rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicos;
	}


	@Override
	public List<Medico> findAll() {
		String sql = "select * from medico";
		return null;
	}
	
//	RowMapper<Medico> rowMapper = (rs, rowNum) ->{
//		Medico med = new Medico();
//		med.setIdMed(rs.getInt("idmed"));
//		med.setFoto(rs.getString("foto"));
//		med.setPontos(rs.getInt("pontos"));
//		med.setNomeMed(rs.getString("nome"));
//		med.setDataNasc(rs.getDate("datanasci").toLocalDate());
//		med.setSexoMed(rs.getNString("sexo"));
//		med.setCpfMed(rs.getString("cpf"));
//		med.setRgMed(rs.getString("rg"));
//		med.setCrm(rs.getString("rg"));
//		med.setCelular(rs.getString("celular"));
//		med.setValorMed(rs.getFloat("valor"));
//		med.setCelular(rs.getString("celular"));
//		med.setDataFormatura(rs.getDate("dataformatura").toLocalDate());
//		med.setSobreMed(rs.getString("sobremim"));
//		med.setBioMed(rs.getString("biografia"));
//		med.setSala(rs.getString("sala"));
//		Endereco end = new Endereco();
//		end.setIdEnd(rs.getInt("fk_end_med"));
//		med.setEndereco(end);
//		Clinica cli = new Clinica();
//		cli.setIdCli(rs.getInt("fk_cli_med"));
//		med.setClinica(cli);
//		Especialidade esp = new Especialidade();
//		esp.setIdEsp(rs.getInt("fk_esp_med"));
//		med.setEspecialidade(esp);
//		return med;
//	};
}

