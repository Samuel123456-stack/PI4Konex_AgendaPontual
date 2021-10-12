package com.projeto.Classes;

public class Planos {

    // Atributos
    private int idPlano;
    private String nomePlano;
    private String comenPlano;
    private float valorPlano;
    private int qntRec;
    private int qntMed;
    private String detalhes;
    private int qntTolerancia;
    private int idPag;

    // Metodo Construtor
    public Planos() {

    }

    // Metodo Construtor com Atributos
    public Planos(int idPlano, String nomePlano, String comenPlano, float valorPlano, int qntRec, int qntMed,
            String detalhes, int qntTolerancia, int idPag) {
        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.comenPlano = comenPlano;
        this.valorPlano = valorPlano;
        this.qntRec = qntRec;
        this.qntMed = qntMed;
        this.detalhes = detalhes;
        this.qntTolerancia = qntTolerancia;
        this.idPag = idPag;
    }

    // Getters e Setters
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getComenPlano() {
        return comenPlano;
    }

    public void setComenPlano(String comenPlano) {
        this.comenPlano = comenPlano;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    public int getQntRec() {
        return qntRec;
    }

    public void setQntRec(int qntRec) {
        this.qntRec = qntRec;
    }

    public int getQntMed() {
        return qntMed;
    }

    public void setQntMed(int qntMed) {
        this.qntMed = qntMed;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getQntTolerancia() {
        return qntTolerancia;
    }

    public void setQntTolerancia(int qntTolerancia) {
        this.qntTolerancia = qntTolerancia;
    }

    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

}
