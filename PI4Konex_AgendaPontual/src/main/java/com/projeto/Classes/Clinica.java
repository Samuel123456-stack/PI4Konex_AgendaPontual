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
    private String email;
    private String senha;
    private int idPlano;
    private int idEndereco;

    // Metodo Construtor
    public Clinica() {

    }

    // Metodo Construtor com Atributos
    public Clinica(int idCli, String nomeCli, String cnpj, String telefone, String assinatura, int qntAssentos,
            String licenca, String email, String senha, int idPlano, int idEndereco) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.assinatura = assinatura;
        this.qntAssentos = qntAssentos;
        this.licenca = licenca;
        this.email = email;
        this.senha = senha;
        this.idPlano = idPlano;
        this.idEndereco= idEndereco;
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

    
}
