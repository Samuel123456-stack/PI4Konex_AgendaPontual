package com.projeto.Entidades;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "agenda_medica")
public class Agenda {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgenda;

    @JoinColumn(name = "fk_dia_agen", unique = true)
    private int idDia;

    @JoinColumn(name = "fk_hor_agen", unique = true)
    private int idHora;

    @JoinColumn(name = "fk_med_agen", unique = true)
    private int idMed;

    @JoinColumn(name = "fk_paci_agen", unique = true)
    private int idPaci;

    @Column(name = "data_agendada", nullable = true, unique = true, columnDefinition = "DATE")
    private LocalDate dataAgendada;

    @Column(name = "informacoes_adic", nullable = true)
    private String infoAdicAgen;

    // Metodo Construtor
    public Agenda() {

    }

    // Metodo Construtor com Atributos
    public Agenda(int idAgenda, int idDia, int idHora, int idMed, int idPaci, LocalDate dataAgendada,
            String infoAdicAgen) {
        this.idAgenda = idAgenda;
        this.idDia = idDia;
        this.idHora = idHora;
        this.idMed = idMed;
        this.idPaci = idPaci;
        this.dataAgendada = dataAgendada;
        this.infoAdicAgen = infoAdicAgen;
    }

    // Getters e Setters
    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public int getIdDia() {
        return idDia;
    }

    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }

    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public LocalDate getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDate dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public String getInfoAdicAgen() {
        return infoAdicAgen;
    }

    public void setInfoAdicAgen(String infoAdicAgen) {
        this.infoAdicAgen = infoAdicAgen;
    }

}
