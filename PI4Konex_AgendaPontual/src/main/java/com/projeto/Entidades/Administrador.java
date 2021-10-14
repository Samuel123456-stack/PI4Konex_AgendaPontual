package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "adm")
public class Administrador {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idADM;

    @Column(nullable = true, unique = true)
    private String nome;

    @JoinColumn(name = "fk_usu_adm")
    private int idUsu;

    // Metodo Construtor
    public Administrador() {

    }

    // Metodo Construtor com Atributos
    public Administrador(int idADM, String nome, int idUsu) {
        this.idADM = idADM;
        this.nome = nome;
        this.idUsu = idUsu;
    }

    // Getters e Setters
    public int getIdADM() {
        return idADM;
    }

    public void setIdADM(int idADM) {
        this.idADM = idADM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

}