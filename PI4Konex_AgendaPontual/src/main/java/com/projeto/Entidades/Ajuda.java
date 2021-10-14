package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "ajuda")
public class Ajuda {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAjuda;

    @Column(name = "dt_solic", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dataSolic;

    @Column(nullable = true, length = 20)
    private String assunto;

    @Column(nullable = true)
    private String mensagem;

    // Metodo Construtor
    public Ajuda() {

    }

    // Metodo Construtor com Atributos
    public Ajuda(int idAjuda, LocalDateTime dataSolic, String assunto, String mensagem) {
        this.idAjuda = idAjuda;
        this.dataSolic = dataSolic;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public LocalDateTime getDataSolic() {
        return dataSolic;
    }

    public void setDataSolic(LocalDateTime dataSolic) {
        this.dataSolic = dataSolic;
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
