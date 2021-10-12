package com.projeto.Classes;

public class Feedback {
    // Atributos
    private int idFeed;
    private String dataCriaFeed;
    private String horaCriaFeed;
    private int avaliacao;
    private String comentario;
    private boolean paraMed;
    private boolean paraCli;
    private boolean feedAno;

    // Metodo Construtor
    public Feedback() {
    }

    // Metodo Construtor com Atributos
    public Feedback(int idFeed, String dataCriaFeed, String horaCriaFeed, int avaliacao, String comentario,
            boolean paraMed, boolean paraCli, boolean feedAno) {
        this.idFeed = idFeed;
        this.dataCriaFeed = dataCriaFeed;
        this.horaCriaFeed = horaCriaFeed;
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

    public String getDataCriaFeed() {
        return dataCriaFeed;
    }

    public void setDataCriaFeed(String dataCriaFeed) {
        this.dataCriaFeed = dataCriaFeed;
    }

    public String getHoraCriaFeed() {
        return horaCriaFeed;
    }

    public void setHoraCriaFeed(String horaCriaFeed) {
        this.horaCriaFeed = horaCriaFeed;
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