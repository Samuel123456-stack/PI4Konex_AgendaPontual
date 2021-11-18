package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "ajuda_med")
public class AjudaMed {
    // Atributos

    @Column(name = "dtcriacao", columnDefinition = "DATE")
    private LocalDateTime dataAjudaMed;
    
    @Id
    @JoinColumn(name = "fk_aju_med")
    private int idAjuda;

    @ManyToOne
    @JoinColumn(name = "fk_med_aju")
    private Medico idMed;

    @ManyToOne
    @JoinColumn(name = "fk_adm_ajud_med")
    private Administrador idAdm;

    @Column(name = "statussoli", nullable = true, length = 12)
    private String statusSoli;

    @Column(name = "descsolucao", nullable = true, length = 100)
    private String descSolucao;

    // Metodo Construtor
    public AjudaMed() {

    }

    // Metodo Construtor com Atributos
    public AjudaMed(LocalDateTime dataAjudaMed, int idAjuda, Medico idMed, Administrador idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaMed = dataAjudaMed;
        this.idAjuda = idAjuda;
        this.idMed = idMed;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public LocalDateTime getDataAjudaMed() {
        return dataAjudaMed;
    }

    public void setDataAjudaMed(LocalDateTime dataAjudaMed) {
        this.dataAjudaMed = dataAjudaMed;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public Medico getIdMed() {
        return idMed;
    }

    public void setIdMed(Medico idMed) {
        this.idMed = idMed;
    }

    public Administrador getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(Administrador idAdm) {
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
