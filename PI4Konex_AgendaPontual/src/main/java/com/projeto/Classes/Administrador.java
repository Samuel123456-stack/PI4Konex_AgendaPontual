package com.projeto.Classes;

public class Administrador {

    // Atributos
    private int idADM;
    private String nome;

    // Metodo Construtor
    public Administrador() {

    }

    // Metodo Construtor com Atributos
    public Administrador(int idADM, String nome) {
        this.idADM = idADM;
        this.nome = nome;
    }

    // Getters e Setters
    public int getIdADM() {
        return idADM;
    }

    public void setIdADM(int idADM) {
        this.idADM = idADM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}