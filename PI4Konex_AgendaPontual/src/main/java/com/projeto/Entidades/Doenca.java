package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "doenca")
public class Doenca {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDoenca;

    @Column(name = "nome", nullable = true)
    private String nomeDoenca;

    @JoinColumn(name = "fk_esp_doe")
    private int idEsp;

    // Metodo Construtor
    public Doenca() {
    }

    // Metodo Construtor com Atributos
    public Doenca(int idDoenca, String nomeDoenca, int idEsp) {
        this.idDoenca = idDoenca;
        this.nomeDoenca = nomeDoenca;
        this.idEsp = idEsp;
    }

    // Getters e Setters
    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public String getNomeDoenca() {
        return nomeDoenca;
    }

    public void setNomeDoenca(String nomeDoenca) {
        this.nomeDoenca = nomeDoenca;
    }

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

}
