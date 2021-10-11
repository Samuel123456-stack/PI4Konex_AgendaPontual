package com.projeto.Classes;

public class Administrador {

    // Atributos
    private int idADM;
    private String nome;
    private String email;
    private String senha;

    // Metodo Construtor
    public Administrador() {

    }

    // Metodo Construtor com Atributos
    public Administrador(int idADM, String nome, String email, String senha) {
        this.idADM = idADM;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

}