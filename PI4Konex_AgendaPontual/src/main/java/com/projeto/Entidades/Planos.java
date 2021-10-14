package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "plano")
public class Planos {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlano;

    @Column(name = "nome", nullable = true)
    private String nomePlano;

    @Column(name = "comentario", nullable = true)
    private String comenPlano;

    @Column(name = "valor", columnDefinition = "DECIMAL(6,2) DEFAULT 0.00")
    private float valorPlano;

    @Column(name = "qte_recep", nullable = true)
    private int qntRec;

    @Column(name = "qte_medico", nullable = true)
    private int qntMed;

    @Column(nullable = true)
    private String detalhes;

    @Column(name = "tolerancia", nullable = true)
    private int qntTolerancia;

    @JoinColumn(name = "fk_pag_plan")
    private int idPag;

    // Metodo Construtor
    public Planos() {

    }

    // Metodo Construtor com Atributos
    public Planos(int idPlano, String nomePlano, String comenPlano, float valorPlano, int qntRec, int qntMed,
            String detalhes, int qntTolerancia, int idPag) {
        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.comenPlano = comenPlano;
        this.valorPlano = valorPlano;
        this.qntRec = qntRec;
        this.qntMed = qntMed;
        this.detalhes = detalhes;
        this.qntTolerancia = qntTolerancia;
        this.idPag = idPag;
    }

    // Getters e Setters
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getComenPlano() {
        return comenPlano;
    }

    public void setComenPlano(String comenPlano) {
        this.comenPlano = comenPlano;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    public int getQntRec() {
        return qntRec;
    }

    public void setQntRec(int qntRec) {
        this.qntRec = qntRec;
    }

    public int getQntMed() {
        return qntMed;
    }

    public void setQntMed(int qntMed) {
        this.qntMed = qntMed;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getQntTolerancia() {
        return qntTolerancia;
    }

    public void setQntTolerancia(int qntTolerancia) {
        this.qntTolerancia = qntTolerancia;
    }

    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

}
