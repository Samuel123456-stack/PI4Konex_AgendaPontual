package com.projeto.Classes;

public class Paciente {

    // Atributos
    private int idPaci;
    private String nomePaci;
    private String cpf;
    private String telefone;
    private String convenio;
    private String email;
    private String senha;
    private String comorbidade;
    private int idEndereco;

    // Metodo Construtor
    public Paciente() {

    }

    // Metodo Construtor com Atributos
    public Paciente(int idPaci, String nomePaci, String cpf, String telefone, String convenio, String email,
            String senha, String comorbidade, int idEndereco) {
        this.idPaci = idPaci;
        this.nomePaci = nomePaci;
        this.cpf = cpf;
        this.telefone = telefone;
        this.convenio = convenio;
        this.email = email;
        this.senha = senha;
        this.comorbidade = comorbidade;
        this.idEndereco = idEndereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

}
