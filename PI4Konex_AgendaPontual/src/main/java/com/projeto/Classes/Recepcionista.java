package com.projeto.Classes;

public class Recepcionista {
    // Atributos
    private int idRec;
    private String nomeRec;
    private String cpfRec;
    private String dataNasc;

    // Metodo Construtor
    public Recepcionista() {

    }

    // Metodo Construtor com Atributos
    public Recepcionista(int idRec, String nomeRec, String cpfRec, String dataNasc) {
        this.idRec = idRec;
        this.nomeRec = nomeRec;
        this.cpfRec = cpfRec;
        this.dataNasc = dataNasc;
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

    public String getCpfRec() {
        return cpfRec;
    }

    public void setCpfRec(String cpfRec) {
        this.cpfRec = cpfRec;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
