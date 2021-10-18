package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "ajuda_recep")
public class AjudaRec {
    // Atributos

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataAjudaRec;

    @Id
    @JoinColumn(name = "fk_aju_recep")
    private int idAjuda;

    @JoinColumn(name = "fk_recep_aju")
    private int idRec;

    @JoinColumn(name = "fk_adm_aju_recep")
    private int idAdm;

    @Column(name = "status_soli", nullable = true, length = 12)
    private String statusSoli;

    @Column(name = "desc_solucao", nullable = true, length = 100)
    private String descSolucao;

    // Metodo Construtor
    public AjudaRec() {
    }

    // Metodo Construtor com Atributos
    public AjudaRec(LocalDateTime dataAjudaRec, int idAjuda, int idRec, int idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaRec = dataAjudaRec;
        this.idAjuda = idAjuda;
        this.idRec = idRec;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public LocalDateTime getDataAjudaRec() {
        return dataAjudaRec;
    }

    public void setDataAjudaRec(LocalDateTime dataAjudaRec) {
        this.dataAjudaRec = dataAjudaRec;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
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
