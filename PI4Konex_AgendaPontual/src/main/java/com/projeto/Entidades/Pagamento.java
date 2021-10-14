package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPag;

    @Column(name = "dt_pgto", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dataPag;

    @Column(name = "forma_pagamento", nullable = true)
    private String formaPag;

    @Column(columnDefinition = "DECIMAL(6,2) DEFAULT 0.00")
    private float valor;

    // Metodo Construtor
    public Pagamento() {

    }

    // Metodo Construtor com Atributos
    public Pagamento(int idPag, LocalDateTime dataPag, String formaPag, float valor) {
        this.idPag = idPag;
        this.dataPag = dataPag;
        this.formaPag = formaPag;
        this.valor = valor;
    }

    // Getters e Setters
    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

    public LocalDateTime getDataPag() {
        return dataPag;
    }

    public void setDataPag(LocalDateTime dataPag) {
        this.dataPag = dataPag;
    }

    public String getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
