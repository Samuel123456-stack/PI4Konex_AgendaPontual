package com.projeto.Classes;

public class Administrador {

    // Atributos
    private int idADM;
    private String nome;
    private int idUsu;

    // Metodo Construtor
    public Administrador() {

    }

    // Metodo Construtor com Atributos
    public Administrador(int idADM, String nome, int idUsu) {
        this.idADM = idADM;
        this.nome = nome;
        this.idUsu = idUsu;
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

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

}