package com.projeto.Classes;

public class Paciente {

    // Atributos
    private int idPaci;
    private String dataCriacao;
    private String horaCriacao;
    private String nomePaci;
    private String cpf;
    private String dataNasc;
    private String rg;
    private String celular;
    private String sexo;
    private String convenio;
    private String email;
    private String senha;
    private boolean primeiraConsulta;
    private boolean sintomasGripe;
    private int idEndereco;
    private int idUsu;

    // Metodo Construtor
    public Paciente() {

    }

    // Metodo Construtor com Atributos
    public Paciente(int idPaci, String dataCriacao, String horaCriacao, String nomePaci, String cpf, String dataNasc,
            String rg, String celular, String sexo, String convenio, String email, String senha,
            boolean primeiraConsulta, boolean sintomasGripe, int idEndereco, int idUsu) {
        this.idPaci = idPaci;
        this.dataCriacao = dataCriacao;
        this.horaCriacao = horaCriacao;
        this.nomePaci = nomePaci;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.celular = celular;
        this.sexo = sexo;
        this.convenio = convenio;
        this.email = email;
        this.senha = senha;
        this.primeiraConsulta = primeiraConsulta;
        this.sintomasGripe = sintomasGripe;
        this.idEndereco = idEndereco;
        this.idUsu = idUsu;
    }

    // Getters e Setters
    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getHoraCriacao() {
        return horaCriacao;
    }

    public void setHoraCriacao(String horaCriacao) {
        this.horaCriacao = horaCriacao;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public boolean isPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public boolean isSintomasGripe() {
        return sintomasGripe;
    }

    public void setSintomasGripe(boolean sintomasGripe) {
        this.sintomasGripe = sintomasGripe;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }
    

}
