package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "ajuda_cli")
public class AjudaCli {
    // Atributos

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataAjudaCli;

    @JoinColumn(name = "fk_aju_cli")
    private int idAjuda;

    @JoinColumn(name = "fk_cli_aju")
    private int idCli;

    @JoinColumn(name = "fk_adm_ajud_cli")
    private int idAdm;

    @Column(name = "status_soli", nullable = true, length = 12)
    private String statusSoli;

    @Column(name = "desc_solucao", nullable = true, length = 100)
    private String descSolucao;

    // Metodo Construtor
    public AjudaCli() {

    }

    // Metodo Construtor com Atributos
    public AjudaCli(LocalDateTime dataAjudaCli, int idAjuda, int idCli, int idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaCli = dataAjudaCli;
        this.idAjuda = idAjuda;
        this.idCli = idCli;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public LocalDateTime getDataAjudaCli() {
        return dataAjudaCli;
    }

    public void setDataAjudaCli(LocalDateTime dataAjudaCli) {
        this.dataAjudaCli = dataAjudaCli;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public String getStatusSoli() {
        return statusSoli;
    }

    public void setStatusSoli(String statusSoli) {
        this.statusSoli = statusSoli;
    }

    public String getDescSolucao() {
        return descSolucao;
    }

    public void setDescSolucao(String descSolucao) {
        this.descSolucao = descSolucao;
    }

}
