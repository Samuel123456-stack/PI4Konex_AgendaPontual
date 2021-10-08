package com.projeto.Classes;

public class Planos {

    // Atributos
    private int idPlano;
    private int qntRec;
    private int qntMed;
    private int qntTolerancia;
    private float valorPlano;

    // Metodo Construtor
    public Planos() {

    }

    // Metodo Construtor com Atributos
    public Planos(int idPlano, int qntRec, int qntMed, int qntTolerancia, float valorPlano) {
        this.idPlano = idPlano;
        this.qntRec = qntRec;
        this.qntMed = qntMed;
        this.qntTolerancia = qntTolerancia;
        this.valorPlano = valorPlano;
    }

    // Getters e Setters
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
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

    public int getQntTolerancia() {
        return qntTolerancia;
    }

    public void setQntTolerancia(int qntTolerancia) {
        this.qntTolerancia = qntTolerancia;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(float valorPlano) {
        this.valorPlano = valorPlano;
    }

}
