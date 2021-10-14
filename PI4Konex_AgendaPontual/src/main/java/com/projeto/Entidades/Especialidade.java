package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "especialidade")
public class Especialidade {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEsp;

    @Column(name = "nome", nullable = true)
    private String nomeEsp;

    // Metodo Construtor
    public Especialidade() {

    }

    // Metodo Construtor com atributos
    public Especialidade(int idEsp, String nomeEsp) {
        this.idEsp = idEsp;
        this.nomeEsp = nomeEsp;
    }

    // Getters e Setters
    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

    public String getNomeEsp() {
        return nomeEsp;
    }

    public void setNomeEsp(String nomeEsp) {
        this.nomeEsp = nomeEsp;
    }

}
