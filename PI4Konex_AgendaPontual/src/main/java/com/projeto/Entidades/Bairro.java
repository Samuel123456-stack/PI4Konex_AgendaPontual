package com.projeto.Entidades;

import javax.persistence.*;
@Entity
@Table(name="bairro")
public class Bairro {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBai;

    @Column(nullable = true)
    private String nome;

    @JoinColumn
    private int idCid;

    public Bairro() {
    }

    //Getters e Setters
    public int getIdBai() {
        return idBai;
    }

    public void setIdBai(int idBai) {
        this.idBai = idBai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCid() {
        return idCid;
    }

    public void setIdCid(int idCid) {
        this.idCid = idCid;
    }

    
}
