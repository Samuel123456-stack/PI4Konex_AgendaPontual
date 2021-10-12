package com.projeto.Classes;

public class Convenio {
    // Atributos
    private int idConv;
    private String nomeConv;
    private float valorConv;

    // Metodo Construtor
    public Convenio() {

    }

    // Metodo Construtor com Atributos
    public Convenio(int idConv, String nomeConv, float valorConv) {
        this.idConv = idConv;
        this.nomeConv = nomeConv;
        this.valorConv = valorConv;
    }

    // Getters e Setters
    public int getIdConv() {
        return idConv;
    }

    public void setIdConv(int idConv) {
        this.idConv = idConv;
    }

    public String getNomeConv() {
        return nomeConv;
    }

    public void setNomeConv(String nomeConv) {
        this.nomeConv = nomeConv;
    }

    public float getValorConv() {
        return valorConv;
    }

    public void setValorConv(float valorConv) {
        this.valorConv = valorConv;
    }

}
