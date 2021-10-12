package com.projeto.Classes;

public class Pagamento {

    // Atributos
    private int idPag;
    private String dataPag;
    private String horaPag;
    private String formaPag;
    private float valor;

    // Metodo Construtor
    public Pagamento() {

    }

    // Metodo Construtor com Atributos
    public Pagamento(int idPag, String dataPag, String horaPag, String formaPag, float valor) {
        this.idPag = idPag;
        this.dataPag = dataPag;
        this.horaPag = horaPag;
        this.formaPag = formaPag;
        this.valor = valor;
    }

    // Getters e Setters
    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

    public String getDataPag() {
        return dataPag;
    }

    public void setDataPag(String dataPag) {
        this.dataPag = dataPag;
    }

    public String getHoraPag() {
        return horaPag;
    }

    public void setHoraPag(String horaPag) {
        this.horaPag = horaPag;
    }

    public String getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
