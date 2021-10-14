package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnd;

    @Column(nullable = true)
    private String logadouro;

    @Column(nullable = true)
    private int numero;

    @Column(nullable = true)
    private String complemento;

    @Column(nullable = true)
    private String bairro;

    @Column(nullable = true)
    private String cidade;

    @Column(nullable = true)
    private String estado;

    @Column(nullable = true, unique = true)
    private String cep;

    // Metodo Construtor
    public Endereco() {
    }

    // Metodo Construtor com Atributos
    public Endereco(int idEnd, String logadouro, int numero, String complemento, String bairro, String cidade,
            String estado, String cep) {
        this.idEnd = idEnd;
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public int getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
