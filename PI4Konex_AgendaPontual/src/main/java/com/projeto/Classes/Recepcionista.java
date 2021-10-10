package com.projeto.Classes;

public class Recepcionista {
    // Atributos
    private int idRec;
    private String nomeRec;
    private String sexoRec;
    private String dataNasc;
    private String cpfRec;
    private String email;
    private String senha;
    private int idCli;
    private int idEndereco;

    // Metodo Construtor
    public Recepcionista() {

    }

    // Metodo Construtor com Atributos
    public Recepcionista(int idRec, String nomeRec, String sexoRec, String dataNasc, String cpfRec, String email,
            String senha, int idCli, int idEndereco) {
        this.idRec = idRec;
        this.nomeRec = nomeRec;
        this.sexoRec = sexoRec;
        this.dataNasc = dataNasc;
        this.cpfRec = cpfRec;
        this.email = email;
        this.senha = senha;
        this.idCli = idCli;
        this.idEndereco = idEndereco;
    }

    // Getters e Setters
    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    public String getNomeRec() {
        return nomeRec;
    }

    public void setNomeRec(String nomeRec) {
        this.nomeRec = nomeRec;
    }

    public String getSexoRec() {
        return sexoRec;
    }

    public void setSexoRec(String sexoRec) {
        this.sexoRec = sexoRec;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpfRec() {
        return cpfRec;
    }

    public void setCpfRec(String cpfRec) {
        this.cpfRec = cpfRec;
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

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

}
