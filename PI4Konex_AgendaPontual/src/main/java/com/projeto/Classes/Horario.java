package com.projeto.Classes;

public class Horario {
    // Atributos
    private int idHora;
    private String horario;
    private int idMed;

    // Metodo Construtor
    public Horario() {
    }

    // Metodo Construtor com Atributos
    public Horario(int idHora, String horario, int idMed) {
        this.idHora = idHora;
        this.horario = horario;
        this.idMed = idMed;
    }

    // Getters e Setters
    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

}
