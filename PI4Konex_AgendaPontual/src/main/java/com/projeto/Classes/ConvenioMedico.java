package com.projeto.Classes;

public class ConvenioMedico {
    // Atributos
    private int idMed;
    private int idConv;

    // Metodo Construtor
    public ConvenioMedico() {
    }

    // Metodo Construtor com Atributos
    public ConvenioMedico(int idMed, int idConv) {
        this.idMed = idMed;
        this.idConv = idConv;
    }

    // Getters e Setters
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getIdConv() {
        return idConv;
    }

    public void setIdConv(int idConv) {
        this.idConv = idConv;
    }

}
