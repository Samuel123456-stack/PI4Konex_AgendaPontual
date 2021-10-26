package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "notificacao")
public class Notificacao {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noti")
    private int idNoti;

    @Column(name = "data_notificacao", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dataNoti;

    @Column(nullable = true)
    private String assunto;

    @Column(nullable = true)
    private String mensagem;

    @Column(nullable = true)
    private String resposta;

    // Metodo Construtor
    public Notificacao() {

    }

    // Metodo Construtor com Atributos
    public Notificacao(int idNoti, LocalDateTime dataNoti, String assunto, String mensagem, String resposta) {
        this.idNoti = idNoti;
        this.dataNoti = dataNoti;
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

    public LocalDateTime getDataNoti() {
        return dataNoti;
    }

    public void setDataNoti(LocalDateTime dataNoti) {
        this.dataNoti = dataNoti;
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
