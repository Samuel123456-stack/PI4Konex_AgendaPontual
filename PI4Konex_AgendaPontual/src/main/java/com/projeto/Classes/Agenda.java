package com.projeto.Classes;

public class Agenda {
    // Atributos
    private int idAgenda;
    private int idDia;
    private int idHora;
    private int idMed;
    private int idPaci;
    private String dataAgendada;
    private String infoAdicAgen;

    // Metodo Construtor
    public Agenda() {

    }

    // Metodo Construtor com Atributos
    public Agenda(int idAgenda, int idDia, int idHora, int idMed, int idPaci, String dataAgendada,
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

    public String getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public String getInfoAdicAgen() {
        return infoAdicAgen;
    }

    public void setInfoAdicAgen(String infoAdicAgen) {
        this.infoAdicAgen = infoAdicAgen;
    }

}
