package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name="cidade")
public class Cidade {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCid;

    @Column(nullable = true)
    private String nome;

    //Metodo Construtor
    public Cidade() {
    }

    //Getters e Setters
    public int getIdCid() {
        return idCid;
    }

    public void setIdCid(int idCid) {
        this.idCid = idCid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
