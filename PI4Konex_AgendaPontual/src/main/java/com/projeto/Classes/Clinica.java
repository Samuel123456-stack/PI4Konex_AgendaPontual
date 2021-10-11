package com.projeto.Classes;

public class Clinica {

    // Atributos
    private int idCli;
    private String nomeCli;
    private String nomeMedRes;
    private String cnpj;
    private String rg;
    private String assinatura;
    private int qntAssentos;
    private String licenca;
    private String email;
    private String senha;
    private int idPlano;
    private int idEndereco;
    private int idUsu;

    // Metodo Construtor
    public Clinica() {

    }

    // Metodo Construtor com Atributos
    public Clinica(int idCli, String nomeCli, String nomeMedRes, String cnpj, String rg, String assinatura,
            int qntAssentos, String licenca, String email, String senha, int idPlano, int idEndereco, int idUsu) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.nomeMedRes = nomeMedRes;
        this.cnpj = cnpj;
        this.rg = rg;
        this.assinatura = assinatura;
        this.qntAssentos = qntAssentos;
        this.licenca = licenca;
        this.email = email;
        this.senha = senha;
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

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getNomeMedRes() {
        return nomeMedRes;
    }

    public void setNomeMedRes(String nomeMedRes) {
        this.nomeMedRes = nomeMedRes;
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

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public int getQntAssentos() {
        return qntAssentos;
    }

    public void setQntAssentos(int qntAssentos) {
        this.qntAssentos = qntAssentos;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
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
