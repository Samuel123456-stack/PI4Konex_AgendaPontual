package com.projeto.Classes;

public class ExameConsulta {
    // Atributos
    private int idExame;
    private int idConsulta;

    // Metodo Construtor
    public ExameConsulta() {

    }

    // Metodo Construtor com Atributos
    public ExameConsulta(int idExame, int idConsulta) {
        this.idExame = idExame;
        this.idConsulta = idConsulta;
    }

    // Getters e Setters
    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

}
