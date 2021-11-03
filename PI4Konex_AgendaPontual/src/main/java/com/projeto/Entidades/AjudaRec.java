package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "ajuda_recep")
public class AjudaRec {
    // Atributos

    @Column(name = "dtcriacao", columnDefinition = "DATE")
    private String dataAjudaRec;

    @Id
    @Column(name = "fk_aju_recep")
    private int idAjuda;

    @ManyToOne
    @JoinColumn(name = "fk_recep_aju")
    private Recepcionista idRec;

    @ManyToOne
    @JoinColumn(name = "fk_adm_aju_recep")
    private Administrador idAdm;

    @Column(name = "statussoli", nullable = true, length = 12)
    private String statusSoli;

    @Column(name = "descsolucao", nullable = true, length = 100)
    private String descSolucao;

    // Metodo Construtor
    public AjudaRec() {
    }

    // Metodo Construtor com Atributos
    public AjudaRec(String dataAjudaRec, int idAjuda, Recepcionista idRec, Administrador idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaRec = dataAjudaRec;
        this.idAjuda = idAjuda;
        this.idRec = idRec;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public String getDataAjudaRec() {
        return dataAjudaRec;
    }

    public void setDataAjudaRec(String dataAjudaRec) {
        this.dataAjudaRec = dataAjudaRec;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public Recepcionista getIdRec() {
        return idRec;
    }

    public void setIdRec(Recepcionista idRec) {
        this.idRec = idRec;
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
