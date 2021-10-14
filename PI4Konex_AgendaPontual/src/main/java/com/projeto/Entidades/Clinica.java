package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "clinica")
public class Clinica {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCli;

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataCriaCli;

    @Column(name = "nome_cli", nullable = true)
    private String nomeCli;

    @Column(name = "nome_med_resp", nullable = true)
    private String nomeMedResp;

    @Column(nullable = true, unique = true)
    private String cnpj;

    @Column(nullable = true, unique = true)
    private String rg;

    @Column(name = "qte_assentos", nullable = true)
    private int qntAssentos;

    @Column(name = "fone", nullable = true)
    private String telefone;

    @JoinColumn(name = "fk_plan_cli", nullable = true)
    private int idPlano;

    @JoinColumn(name = "fk_end_cli", nullable = true)
    private int idEndereco;

    @JoinColumn(name = "fk_usu_cli", nullable = true)
    private int idUsu;

    // Metodo Construtor
    public Clinica() {

    }

    // Metodo Construtor com Atributos
    public Clinica(int idCli, LocalDateTime dataCriaCli, String nomeCli, String nomeMedResp, String cnpj, String rg,
            int qntAssentos, String telefone, int idPlano, int idEndereco, int idUsu) {
        this.idCli = idCli;
        this.dataCriaCli = dataCriaCli;
        this.nomeCli = nomeCli;
        this.nomeMedResp = nomeMedResp;
        this.cnpj = cnpj;
        this.rg = rg;
        this.qntAssentos = qntAssentos;
        this.telefone = telefone;
        this.idPlano = idPlano;
        this.idEndereco = idEndereco;
        this.idUsu = idUsu;
    }

    // Getters e Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public LocalDateTime getDataCriaCli() {
        return dataCriaCli;
    }

    public void setDataCriaCli(LocalDateTime dataCriaCli) {
        this.dataCriaCli = dataCriaCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getNomeMedResp() {
        return nomeMedResp;
    }

    public void setNomeMedResp(String nomeMedResp) {
        this.nomeMedResp = nomeMedResp;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getQntAssentos() {
        return qntAssentos;
    }

    public void setQntAssentos(int qntAssentos) {
        this.qntAssentos = qntAssentos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
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
