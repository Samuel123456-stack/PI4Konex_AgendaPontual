package com.projeto.Classes;

public class Clinica {

    // Atributos
    private int idCli;
    private String nomeCli;
    private String cnpj;
    private String telefone;
    private String assinatura;
    private int qntAssentos;
    private String licenca;

    // Metodo Construtor
    public Clinica() {

    }

    // Metodo Construtor com Atributos
    public Clinica(int idCli, String nomeCli, String cnpj, String telefone, String assinatura, int qntAssentos,
            String licenca) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.assinatura = assinatura;
        this.qntAssentos = qntAssentos;
        this.licenca = licenca;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
}
