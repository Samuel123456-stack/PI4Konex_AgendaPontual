package com.projeto.Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaci;

    @Column(name = "dt_criacao", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dataCriaPaci;

    @Column(name = "nome", nullable = true)
    private String nomePaci;

    @Column(nullable = true, unique = true)
    private String cpf;

    @Column(name = "data_nasci", nullable = true, columnDefinition = "DATE")
    private LocalDate dataNasc;

    @Column(nullable = true, unique = true)
    private String rg;

    @Column(nullable = true, unique = true)
    private String celular;

    @Column(nullable = true, unique = true)
    private String sexo;

    @Column(nullable = true, unique = true)
    private boolean primeiraConsulta;

    @Column(nullable = true, unique = true)
    private boolean sintomasGripe;

    @JoinColumn(name = "fk_conv_paci")
    private int idConv;

    @JoinColumn(name = "fk_end_paci")
    private int idEndereco;

    @JoinColumn(name = "fk_usu_paci")
    private int idUsu;

    // Metodo Construtor
    public Paciente() {

    }

    // Metodo Construtor com Atributos
    public Paciente(int idPaci, LocalDateTime dataCriaPaci, String horaCriaPaci, String nomePaci, String cpf,
            LocalDate dataNasc, String rg, String celular, String sexo, boolean primeiraConsulta, boolean sintomasGripe,
            int idConv, int idEndereco, int idUsu) {
        this.idPaci = idPaci;
        this.dataCriaPaci = dataCriaPaci;
        this.nomePaci = nomePaci;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.celular = celular;
        this.sexo = sexo;
        this.primeiraConsulta = primeiraConsulta;
        this.sintomasGripe = sintomasGripe;
        this.idConv = idConv;
        this.idEndereco = idEndereco;
        this.idUsu = idUsu;
    }

    // Getters e Setters
    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public LocalDateTime getDataCriaPaci() {
        return dataCriaPaci;
    }

    public void setDataCriaPaci(LocalDateTime dataCriaPaci) {
        this.dataCriaPaci = dataCriaPaci;
    }

    public String getNomePaci() {
        return nomePaci;
    }

    public void setNomePaci(String nomePaci) {
        this.nomePaci = nomePaci;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public boolean isSintomasGripe() {
        return sintomasGripe;
    }

    public void setSintomasGripe(boolean sintomasGripe) {
        this.sintomasGripe = sintomasGripe;
    }

    public int getIdConv() {
        return idConv;
    }

    public void setIdConv(int idConv) {
        this.idConv = idConv;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

}
