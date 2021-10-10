package com.projeto.Classes;

public class Convenio {
    // Atributos
    private String idConv;
    private String nomeConv;
    private String valorConv;

    // Metodo Construtor
    public Convenio() {

    }

    // Metodo Construtor com Atributos
    public Convenio(String idConv, String nomeConv, String valorConv) {
        this.idConv = idConv;
        this.nomeConv = nomeConv;
        this.valorConv = valorConv;
    }

    // Getters e Setters
    public String getIdConv() {
        return idConv;
    }

    public void setIdConv(String idConv) {
        this.idConv = idConv;
    }

    public String getNomeConv() {
        return nomeConv;
    }

    public void setNomeConv(String nomeConv) {
        this.nomeConv = nomeConv;
    }

    public String getValorConv() {
        return valorConv;
    }

    public void setValorConv(String valorConv) {
        this.valorConv = valorConv;
    }

}
