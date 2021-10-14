package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "ajuda_paci")
public class AjudaPaci {
    // Atributos

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataAjudaPaci;

    @JoinColumn(name = "fk_aju_paci")
    private int idAjuda;

    @JoinColumn(name = "fk_paci_aju")
    private int idPaci;

    @JoinColumn(name = "fk_adm_aju_paci")
    private int idAdm;

    @Column(name = "status_soli", nullable = true, length = 12)
    private String statusSoli;

    @Column(name = "desc_solucao", nullable = true, length = 100)
    private String descSolucao;

    // Metodo Construtor
    public AjudaPaci() {

    }

    // Metodo Construtor com atributos
    public AjudaPaci(LocalDateTime dataAjudaPaci, int idAjuda, int idPaci, int idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaPaci = dataAjudaPaci;
        this.idAjuda = idAjuda;
        this.idPaci = idPaci;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public LocalDateTime getDataAjudaPaci() {
        return dataAjudaPaci;
    }

    public void setDataAjudaPaci(LocalDateTime dataAjudaPaci) {
        this.dataAjudaPaci = dataAjudaPaci;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
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
