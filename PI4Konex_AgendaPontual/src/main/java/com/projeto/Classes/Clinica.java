package com.projeto.Classes;

public class Clinica {

    // Atributos
    private int idCli;
    private String dataCriaCli;
    private String horaCriaCli;
    private String nomeCli;
    private String nomeMedResp;
    private String cnpj;
    private String rg;
    private int qntAssentos;
    private String telefone;
    private int idPlano;
    private int idEndereco;
    private int idUsu;

    // Metodo Construtor
    public Clinica() {

    }

    // Metodo Construtor com Atributos
    public Clinica(int idCli, String dataCriaCli, String horaCriaCli, String nomeCli, String nomeMedResp, String cnpj,
            String rg, int qntAssentos, String telefone, int idPlano, int idEndereco, int idUsu) {
        this.idCli = idCli;
        this.dataCriaCli = dataCriaCli;
        this.horaCriaCli = horaCriaCli;
        this.nomeCli = nomeCli;
        this.nomeMedResp = nomeMedResp;
        this.cnpj = cnpj;
        this.rg = rg;
        this.qntAssentos = qntAssentos;
        this.telefone = telefone;
        this.idPlano = idPlano;
        this.idEndereco = idEndereco;
        this.idUsu = idUsu;
    }

    // Getters e Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getDataCriaCli() {
        return dataCriaCli;
    }

    public void setDataCriaCli(String dataCriaCli) {
        this.dataCriaCli = dataCriaCli;
    }

    public String getHoraCriaCli() {
        return horaCriaCli;
    }

    public void setHoraCriaCli(String horaCriaCli) {
        this.horaCriaCli = horaCriaCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getNomeMedResp() {
        return nomeMedResp;
    }

    public void setNomeMedResp(String nomeMedResp) {
        this.nomeMedResp = nomeMedResp;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getQntAssentos() {
        return qntAssentos;
    }

    public void setQntAssentos(int qntAssentos) {
        this.qntAssentos = qntAssentos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
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
