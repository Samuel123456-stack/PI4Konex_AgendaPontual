package com.projeto.Classes;

public class Usuario {
    // Atributos
    private String email;
    private String senha;
    private String cep;
    private String endereco;

    // Metodo Construtor
    public Usuario() {

    }

    // Metodo Construtor com Atributos
    public Usuario(String email, String senha, String cep, String endereco) {
        this.email = email;
        this.senha = senha;
        this.cep = cep;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
