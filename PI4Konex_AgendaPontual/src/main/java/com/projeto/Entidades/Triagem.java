package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "triagem")
public class Triagem {
    // Atributos

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataCriaTriagem;

    @JoinColumn(name = "fk_doe_paci")
    private int idDoenca;

    @JoinColumn(name = "fk_paci_doe")
    private int idPaci;

    // Metodo Construtor
    public Triagem() {

    }

    // Metodo Construtor com Atributos
    public Triagem(LocalDateTime dataCriaTriagem, int idDoenca, int idPaci) {
        this.dataCriaTriagem = dataCriaTriagem;
        this.idDoenca = idDoenca;
        this.idPaci = idPaci;
    }

    // Getters e Setters
    public LocalDateTime getDataCriaTriagem() {
        return dataCriaTriagem;
    }

    public void setDataCriaTriagem(LocalDateTime dataCriaTriagem) {
        this.dataCriaTriagem = dataCriaTriagem;
    }

    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

}
