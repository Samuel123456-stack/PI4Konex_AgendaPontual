package com.projeto.Classes;

public class Paciente {

    // Atributos
    private int idPaci;
    private String dataCriaPaci;
    private String horaCriaPaci;
    private String nomePaci;
    private String cpf;
    private String dataNasc;
    private String rg;
    private String celular;
    private String sexo;
    private boolean primeiraConsulta;
    private boolean sintomasGripe;
    private int idConv;
    private int idEndereco;
    private int idUsu;

    // Metodo Construtor
    public Paciente() {

    }

    // Metodo Construtor com Atributos
    public Paciente(int idPaci, String dataCriaPaci, String horaCriaPaci, String nomePaci, String cpf, String dataNasc,
            String rg, String celular, String sexo, boolean primeiraConsulta, boolean sintomasGripe, int idConv,
            int idEndereco, int idUsu) {
        this.idPaci = idPaci;
        this.dataCriaPaci = dataCriaPaci;
        this.horaCriaPaci = horaCriaPaci;
        this.nomePaci = nomePaci;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.celular = celular;
        this.sexo = sexo;
        this.primeiraConsulta = primeiraConsulta;
        this.sintomasGripe = sintomasGripe;
        this.idConv = idConv;
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

    public String getDataCriaPaci() {
        return dataCriaPaci;
    }

    public void setDataCriaPaci(String dataCriaPaci) {
        this.dataCriaPaci = dataCriaPaci;
    }

    public String getHoraCriaPaci() {
        return horaCriaPaci;
    }

    public void setHoraCriaPaci(String horaCriaPaci) {
        this.horaCriaPaci = horaCriaPaci;
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

    public int getIdConv() {
        return idConv;
    }

    public void setIdConv(int idConv) {
        this.idConv = idConv;
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
