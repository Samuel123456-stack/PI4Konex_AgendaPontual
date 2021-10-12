package com.projeto.Classes;

public class Recepcionista {
    // Atributos
    private int idRec;
    private String dataCriaRec;
    private String horaCriaRec;
    private String nomeRec;
    private String cpfRec;
    private String sexoRec;
    private String dataNasc;
    private String celular;
    private int idCli;
    private int idUsu;

    // Metodo Construtor
    public Recepcionista() {

    }

    // Metodo Construtor com Atributos

    public Recepcionista(int idRec, String dataCriaRec, String horaCriaRec, String nomeRec, String cpfRec,
            String sexoRec, String dataNasc, String celular, int idCli, int idUsu) {
        this.idRec = idRec;
        this.dataCriaRec = dataCriaRec;
        this.horaCriaRec = horaCriaRec;
        this.nomeRec = nomeRec;
        this.cpfRec = cpfRec;
        this.sexoRec = sexoRec;
        this.dataNasc = dataNasc;
        this.celular = celular;
        this.idCli = idCli;
        this.idUsu = idUsu;
    }

    // Getters e Setters
    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    public String getDataCriaRec() {
        return dataCriaRec;
    }

    public void setDataCriaRec(String dataCriaRec) {
        this.dataCriaRec = dataCriaRec;
    }

    public String getHoraCriaRec() {
        return horaCriaRec;
    }

    public void setHoraCriaRec(String horaCriaRec) {
        this.horaCriaRec = horaCriaRec;
    }

    public String getNomeRec() {
        return nomeRec;
    }

    public void setNomeRec(String nomeRec) {
        this.nomeRec = nomeRec;
    }

    public String getCpfRec() {
        return cpfRec;
    }

    public void setCpfRec(String cpfRec) {
        this.cpfRec = cpfRec;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

}
