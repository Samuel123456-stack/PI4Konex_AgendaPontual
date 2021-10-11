package com.projeto.Classes;

public class Especialidade {
    //Atributos
    private int idEsp;
    private String nomeEsp;

    //Metodo Construtor
    public Especialidade(){

    }

    //Metodo Construtor com atributos
    public Especialidade(int idEsp, String nomeEsp) {
        this.idEsp = idEsp;
        this.nomeEsp = nomeEsp;
    }

    //Getters e Setters
    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

    public String getNomeEsp() {
        return nomeEsp;
    }

    public void setNomeEsp(String nomeEsp) {
        this.nomeEsp = nomeEsp;
    }
    
 
    
}
