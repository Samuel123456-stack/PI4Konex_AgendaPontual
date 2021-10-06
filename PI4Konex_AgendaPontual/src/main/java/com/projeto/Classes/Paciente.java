package com.projeto.Classes;

public class Paciente {

    // Atributos
    private int idPaci;
    private String nomePaci;
    private String cpf;
    private String telefone;
    private String convenio;
    private String comorbidade;

    // Metodo Construtor
    public Paciente() {

    }

    // Metodo Construtor com Atributos
    public Paciente(int idPaci, String nomePaci, String cpf, String telefone, String convenio, String comorbidade) {
        this.idPaci = idPaci;
        this.nomePaci = nomePaci;
        this.cpf = cpf;
        this.telefone = telefone;
        this.convenio = convenio;
        this.comorbidade = comorbidade;
    }

    // Getters e Setters
    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public String getNomePaci() {
        return nomePaci;
    }

    public void setNomePaci(String nomePaci) {
        this.nomePaci = nomePaci;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }
}
