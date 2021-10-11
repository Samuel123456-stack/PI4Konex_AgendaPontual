package com.projeto.Classes;

public class Usuario {
    // Atributos
    private int idUsu;
    private String email;
    private String confirmaEmail;
    private String senha;
    private String confirmaSenha;
    private String perfil;

    // Metodo Construtor
    public Usuario() {

    }

    // Metodo Construtor com Atributos
    public Usuario(int idUsu, String email, String confirmaEmail, String senha, String confirmaSenha, String perfil) {
        this.idUsu = idUsu;
        this.email = email;
        this.confirmaEmail = confirmaEmail;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
        this.perfil = perfil;
    }

    // Getters e Setters
    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmaEmail() {
        return confirmaEmail;
    }

    public void setConfirmaEmail(String confirmaEmail) {
        this.confirmaEmail = confirmaEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
