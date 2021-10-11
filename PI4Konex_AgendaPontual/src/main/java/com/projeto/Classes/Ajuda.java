package com.projeto.Classes;

public class Ajuda {
    //Atributos
    private int idAjuda;
    private String dataSolic;
    private String horaSolic;
    private String assunto;
    private String mensagem;

    //Metodo Construtor
    public Ajuda(){

    }


    //Metodo Construtor com Atributos
    public Ajuda(int idAjuda, String dataSolic, String horaSolic, String assunto, String mensagem) {
        this.idAjuda = idAjuda;
        this.dataSolic = dataSolic;
        this.horaSolic = horaSolic;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    //Getters e Setters
    public int getIdAjuda() {
        return idAjuda;
    }


    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }


    public String getDataSolic() {
        return dataSolic;
    }


    public void setDataSolic(String dataSolic) {
        this.dataSolic = dataSolic;
    }


    public String getHoraSolic() {
        return horaSolic;
    }


    public void setHoraSolic(String horaSolic) {
        this.horaSolic = horaSolic;
    }


    public String getAssunto() {
        return assunto;
    }


    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }


    public String getMensagem() {
        return mensagem;
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
