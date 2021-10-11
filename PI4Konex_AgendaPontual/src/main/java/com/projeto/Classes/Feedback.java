package com.projeto.Classes;

public class Feedback {
    // Atributos
    private int idFeed;
    private int avaliacao;
    private String comentario;
    private boolean paraMed;
    private boolean paraCli;
    private boolean feedAno;

    // Metodo Construtor
    public Feedback() {
    }

    // Metodo Construtor com Atributos
    public Feedback(int idFeed, int avaliacao, String comentario, boolean paraMed, boolean paraCli, boolean feedAno) {
        this.idFeed = idFeed;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
        this.paraMed = paraMed;
        this.paraCli = paraCli;
        this.feedAno = feedAno;
    }

    // Getters e Setters
    public int getIdFeed() {
        return idFeed;
    }

    public void setIdFeed(int idFeed) {
        this.idFeed = idFeed;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isParaMed() {
        return paraMed;
    }

    public void setParaMed(boolean paraMed) {
        this.paraMed = paraMed;
    }

    public boolean isParaCli() {
        return paraCli;
    }

    public void setParaCli(boolean paraCli) {
        this.paraCli = paraCli;
    }

    public boolean isFeedAno() {
        return feedAno;
    }

    public void setFeedAno(boolean feedAno) {
        this.feedAno = feedAno;
    }

}