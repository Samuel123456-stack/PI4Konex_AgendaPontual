package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "historico")
public class Historico {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHis;

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataHisCria;

    @Column(nullable = true)
    private String historico;

    @JoinColumn(name = "fk_cons_his")
    private int idConsulta;

    // Metodo Construtor
    public Historico() {

    }

    // Metodo Construtor com Atributos
    public Historico(int idHis, LocalDateTime dataHisCria, String historico, int idConsulta) {
        this.idHis = idHis;
        this.dataHisCria = dataHisCria;
        this.historico = historico;
        this.idConsulta = idConsulta;
    }

    // Getters e Setters
    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public LocalDateTime getDataHisCria() {
        return dataHisCria;
    }

    public void setDataHisCria(LocalDateTime dataHisCria) {
        this.dataHisCria = dataHisCria;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

}
