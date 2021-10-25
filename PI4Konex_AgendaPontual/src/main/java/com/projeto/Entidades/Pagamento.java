package com.projeto.Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pag")
    private int idPag;

    @Column(name = "dt_pgto", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dataPag;

    @Column(name = "forma_pagamento", nullable = true)
    private String formaPag;

    @Column(columnDefinition = "DECIMAL(6,2) DEFAULT 0.00")
    private float valor;
    
    @ManyToMany
    @JoinTable(name = "pag_plan",
    joinColumns = @JoinColumn(name = "id_pag"),
    inverseJoinColumns = @JoinColumn(name = "id_plan"))
    private List<Planos> planos = new ArrayList<>();;

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
