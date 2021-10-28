package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idusu")
    private int idUsu;

    @Column(nullable = true)
    private String email;

    @Column(name="emailconfirma",nullable = true)
    private String confirmaEmail;

    @Column(nullable = true)
    private String senha;

    @Column(name="senhaconfirma",nullable = true)
    private String confirmaSenha;

    @Column(nullable = true)
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
