package com.projeto.Classes;

public class Exame {
    //Atributos
    private int idExame;
    private String nomeExame;
    private String codAmbExame;
    private int tussExame;

    //Metodo Construtor
    public Exame(){

    }

    //Metodo Construtor com Atributos
    public Exame(int idExame, String nomeExame, String codAmbExame, int tussExame) {
        this.idExame = idExame;
        this.nomeExame = nomeExame;
        this.codAmbExame = codAmbExame;
        this.tussExame = tussExame;
    }

    //Getters e Setters
    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getCodAmbExame() {
        return codAmbExame;
    }

    public void setCodAmbExame(String codAmbExame) {
        this.codAmbExame = codAmbExame;
    }

    public int getTussExame() {
        return tussExame;
    }

    public void setTussExame(int tussExame) {
        this.tussExame = tussExame;
    }
    
}
