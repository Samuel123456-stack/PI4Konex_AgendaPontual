package com.projeto.Classes;

public class Pagamento {

    // Atributos
    private float valor;
    private String data;

    // Metodo Construtor
    public Pagamento() {

    }

    // Metodo Construtor com Atributos
    public Pagamento(float valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
