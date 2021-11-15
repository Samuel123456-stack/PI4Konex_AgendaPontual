package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "convenio")
public class Convenio {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idconv")
    private Integer idConv;

    @Column(name = "nome", nullable = true)
    private String nomeConv;

    @Column(name = "valor", nullable = true, columnDefinition = "DECIMAL(5,2) DEFAULT 0.00")
    private float valorConv;

    // Metodo Construtor
    public Convenio() {

    }

    // Metodo Construtor com Atributos
    public Convenio(Integer idConv, String nomeConv, float valorConv) {
        this.idConv = idConv;
        this.nomeConv = nomeConv;
        this.valorConv = valorConv;
    }

    // Getters e Setters
    public int getIdConv() {
        return idConv;
    }

    public void setIdConv(Integer idConv) {
        this.idConv = idConv;
    }

    public String getNomeConv() {
        return nomeConv;
    }

    public void setNomeConv(String nomeConv) {
        this.nomeConv = nomeConv;
    }

    public float getValorConv() {
        return valorConv;
    }

    public void setValorConv(float valorConv) {
        this.valorConv = valorConv;
    }

}
