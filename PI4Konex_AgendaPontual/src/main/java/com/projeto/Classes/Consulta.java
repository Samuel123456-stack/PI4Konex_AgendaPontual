package com.projeto.Classes;

public class Consulta {

    // Atributos
    private int idConsulta;
    private int idPaci;
    private String receita;

    // Metodo Construtor
    public Consulta() {

    }

    // Metodo Construtor com Atributos
    public Consulta(int idConsulta, int idPaci, String receita) {
        this.idConsulta = idConsulta;
        this.idPaci = idPaci;
        this.receita = receita;
    }

    // Getters e Setters
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

}
