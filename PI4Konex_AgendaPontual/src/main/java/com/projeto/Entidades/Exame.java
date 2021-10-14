package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "exame")
public class Exame {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExame;

    @Column(name = "nome", nullable = true)
    private String nomeExame;

    @Column(name = "cod_amb_92")
    private String codAmbExame;

    @Column(name = "tuss")
    private int tussExame;

    // Metodo Construtor
    public Exame() {

    }

    // Metodo Construtor com Atributos
    public Exame(int idExame, String nomeExame, String codAmbExame, int tussExame) {
        this.idExame = idExame;
        this.nomeExame = nomeExame;
        this.codAmbExame = codAmbExame;
        this.tussExame = tussExame;
    }

    // Getters e Setters
    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getCodAmbExame() {
        return codAmbExame;
    }

    public void setCodAmbExame(String codAmbExame) {
        this.codAmbExame = codAmbExame;
    }

    public int getTussExame() {
        return tussExame;
    }

    public void setTussExame(int tussExame) {
        this.tussExame = tussExame;
    }

}
