package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFeed;

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataCriaFeed;

    @Column(nullable = true)
    private int avaliacao;

    @Column(nullable = true)
    private String comentario;

    @Column(name = "para_medico", nullable = true)
    private boolean paraMed;

    @Column(name = "para_consultorio",nullable = true)
    private boolean paraCli;

    @Column(name = "anonimo",nullable = true)
    private boolean feedAno;

    // Metodo Construtor
    public Feedback() {
    }

    // Metodo Construtor com Atributos
    public Feedback(int idFeed, LocalDateTime dataCriaFeed, int avaliacao, String comentario, boolean paraMed,
            boolean paraCli, boolean feedAno) {
        this.idFeed = idFeed;
        this.dataCriaFeed = dataCriaFeed;
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

    public LocalDateTime getDataCriaFeed() {
        return dataCriaFeed;
    }

    public void setDataCriaFeed(LocalDateTime dataCriaFeed) {
        this.dataCriaFeed = dataCriaFeed;
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