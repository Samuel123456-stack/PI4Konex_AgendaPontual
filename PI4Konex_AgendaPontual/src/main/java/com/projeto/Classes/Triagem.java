package com.projeto.Classes;

public class Triagem {
    //Atributos
    private String dataCriaTriagem;
    private String horaCriaTriagem;
    private int idDoenca;
    private int idPaci;

    //Metodo Construtor
    public Triagem(){

    }

    //Metodo Construtor com Atributos
    public Triagem(String dataCriaTriagem, String horaCriaTriagem, int idDoenca, int idPaci) {
        this.dataCriaTriagem = dataCriaTriagem;
        this.horaCriaTriagem = horaCriaTriagem;
        this.idDoenca = idDoenca;
        this.idPaci = idPaci;
    }

    //Getters e Setters
    public String getDataCriaTriagem() {
        return dataCriaTriagem;
    }

    public void setDataCriaTriagem(String dataCriaTriagem) {
        this.dataCriaTriagem = dataCriaTriagem;
    }

    public String getHoraCriaTriagem() {
        return horaCriaTriagem;
    }

    public void setHoraCriaTriagem(String horaCriaTriagem) {
        this.horaCriaTriagem = horaCriaTriagem;
    }

    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    
    

    

}
