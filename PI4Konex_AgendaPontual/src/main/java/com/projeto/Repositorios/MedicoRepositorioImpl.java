package com.projeto.Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.projecao.ResultadoPesqMedProjecao;


public class MedicoRepositorioImpl implements MedicoRepositorio{
	
    @Autowired
    private DataSource dataSource;

    @Override
    public List<Medico> buscaTeste(Integer cidade, Integer bairro) {
    	String condicao = "where";
    	int i = 0;
    	
    	String sql = "select m.idmed, m.pontos,m.foto, m.nome, m.sobremim "
				+ "from clinica c inner join medico m on m.fk_cli_med = c.idcli "
				+ "inner join especialidade esp on m.fk_esp_med = esp.idesp "
				+ "inner join endereco e on c.fk_end_cli = e.idend "
				+ "inner join bairro b on e.fk_bai_end = b.idbai "
				+ "inner join cidade cid on b.fk_cid_bai = cid.idcid ";
		      
        List<Medico> medicos = new ArrayList<>();
		try {
			Connection conn = dataSource.getConnection();

			PreparedStatement st = conn.prepareStatement(sql);
			
			if (cidade != null) {
				i++;
				sql += condicao + " cid.idcid = ? ";
				condicao = "and";
				st.setInt(i, cidade);

			}
			if (bairro != null) {
				i++;
				sql += condicao + " b.idbai = ? ";
			}
			st.setInt(i, bairro);

			ResultSet rs = st.executeQuery();
			

				while (rs.next()) {
					Medico med = new Medico();
					med.setIdMed(rs.getInt("m.idmed"));
					med.setFoto(rs.getString("m.foto"));
					med.setPontos(rs.getInt("m.pontos"));
					med.setNomeMed(rs.getString("m.nome"));
					med.setNomeMed(rs.getString("m.nome"));
					medicos.add(med);
				}
				rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicos;
    }

	@Override
	public List<Medico> listaMedPorCli(Integer id) {

		String sql = "select * from medico as m join clinica as c" + " on m.fk_cli_med=c.idcli where c.idcli= ?";

		List<Medico> medicos = new ArrayList<>();

		try {
			Connection conn = dataSource.getConnection();

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
	public List<ResultadoPesqMedProjecao> buscaMed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResultadoPesqMedProjecao> buscaMedCidEsp(Integer cidade, String esp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResultadoPesqMedProjecao> buscaMedCid(Integer cidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResultadoPesqMedProjecao> buscaEsp(String esp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResultadoPesqMedProjecao> buscaMedCompleta(Integer cidade, Integer bairro, String espec, String sexMas,
			String sexFem, Integer valorMin, Integer valorMax, Integer minExp, Integer maxExp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
