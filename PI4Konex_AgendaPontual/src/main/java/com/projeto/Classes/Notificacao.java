package com.projeto.Classes;

public class Notificacao {
    // Atributos
    private int idNoti;
    private String dataNoti;
    private String horaNoti;
    private String assunto;
    private String mensagem;
    private String resposta;

    // Metodo Construtor
    public Notificacao() {

    }

    // Metodo Construtor com Atributos
    public Notificacao(int idNoti, String dataNoti, String horaNoti, String assunto, String mensagem, String resposta) {
        this.idNoti = idNoti;
        this.dataNoti = dataNoti;
        this.horaNoti = horaNoti;
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.resposta = resposta;
    }

    // Getters e Setters
    public int getIdNoti() {
        return idNoti;
    }

    public void setIdNoti(int idNoti) {
        this.idNoti = idNoti;
    }

    public String getDataNoti() {
        return dataNoti;
    }

    public void setDataNoti(String dataNoti) {
        this.dataNoti = dataNoti;
    }

    public String getHoraNoti() {
        return horaNoti;
    }

    public void setHoraNoti(String horaNoti) {
        this.horaNoti = horaNoti;
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

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
