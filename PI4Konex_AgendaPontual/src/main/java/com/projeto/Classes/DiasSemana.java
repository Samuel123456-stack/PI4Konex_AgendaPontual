package com.projeto.Classes;

public class DiasSemana {
    // Atributos
    private int idDia;
    private String dia;

    // Metodo Construtor
    public DiasSemana() {
    }

    // Metodo Construtor com Atributos
    public DiasSemana(int idDia, String dia) {
        this.idDia = idDia;
        this.dia = dia;
    }

    // Getters e Setters
    public int getIdDia() {
        return idDia;
    }

    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

}
