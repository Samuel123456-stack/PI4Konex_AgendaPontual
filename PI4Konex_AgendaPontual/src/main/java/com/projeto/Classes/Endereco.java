package com.projeto.Classes;

public class Endereco {
    // Atributos
    private int idEnde;
    private String logadouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String estado;
    private String cep;

    // Metodo Construtor
    public Endereco() {
    }

    // Metodo Construtor com Atributos
    public Endereco(int idEnde, String logadouro, int numero, String complemento, String bairro, String estado,
            String cep) {
        this.idEnde = idEnde;
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
    }
    // Getters e Setters

    public int getIdEnde() {
        return idEnde;
    }

    public void setIdEnde(int idEnde) {
        this.idEnde = idEnde;
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
