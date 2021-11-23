package com.projeto.Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projeto.Dto.PagamentoDTO;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PagamentoImpl implements PagamentoRepositorio {

    @Autowired
    private HikariDataSource dataSource;

    @Override
    public List<PagamentoDTO> listaPagPorMed(Integer idMed) {
        String linhaSql = "select c.idcons, p.nome,pag.valor,pag.formapagamento,pag.dtpgto from  consulta c "+ 
        "inner join medico m on c.fk_med_cons = m.idmed "+
        "inner join paciente p on c.fk_paci_cons = p.idpaci " + 
        "inner join pagamento pag on c.fk_pag_cons = pag.idpag "+
        "where idmed= ";

        List<PagamentoDTO> pagas = new ArrayList<>();

        if(idMed!=null){
            linhaSql+=idMed;

            

            try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(linhaSql);
            ResultSet rs = stmt.executeQuery()) {
        
        
            while (rs.next()) {
                PagamentoDTO pag = new PagamentoDTO(
                        rs.getInt("c.idcons"),
                        rs.getFloat("pag.valor"),
                        rs.getString("p.nome"),
                        rs.getString("pag.formapagamento"),
                        rs.getString("pag.dtpgto"));
                        pagas.add(pag);
                    }
                    stmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                

            }
            return pagas;
        }
    }
