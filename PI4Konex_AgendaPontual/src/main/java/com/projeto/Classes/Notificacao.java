package com.projeto.Classes;

public class Notificacao {
    // Atributos
    private int idNoti;
    private String dataNoti;
    private String assunto;
    private String motivo;

    // Metodo Construtor
    public Notificacao() {

    }

    // Metodo Construtor com Atributos
    public Notificacao(int idNoti, String dataNoti, String assunto, String motivo) {
        this.idNoti = idNoti;
        this.dataNoti = dataNoti;
        this.assunto = assunto;
        this.motivo = motivo;
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

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
