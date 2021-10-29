package com.projeto.Entidades;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "agenda_medica")
public class Agenda {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idagen")
    private int idAgen;

    @ManyToOne
    @JoinColumn(name = "fk_dia_agen", unique = true)
    private DiasSemana idDia;

    @ManyToOne
    @JoinColumn(name = "fk_hor_agen", unique = true)
    private Horario idHora;

    @ManyToOne
    @JoinColumn(name = "fk_med_agen", unique = true)
    private Medico idMed;

    @ManyToOne
    @JoinColumn(name = "fk_paci_agen", unique = true)
    private Paciente idPaci;

    @Column(name = "dataagendada", nullable = true, unique = true, columnDefinition = "DATE")
    private LocalDate dataAgendada;

    @Column(name = "informacoesadic", nullable = true)
    private String infoAdicAgen;

    // Metodo Construtor
    public Agenda() {

    }

    // Metodo Construtor com Atributos
    public Agenda(int idAgen, DiasSemana idDia, Horario idHora, Medico idMed, Paciente idPaci, LocalDate dataAgendada,
            String infoAdicAgen) {
        this.idAgen = idAgen;
        this.idDia = idDia;
        this.idHora = idHora;
        this.idMed = idMed;
        this.idPaci = idPaci;
        this.dataAgendada = dataAgendada;
        this.infoAdicAgen = infoAdicAgen;
    }

    // Getters e Setters
    public int getIdAgen() {
        return idAgen;
    }

    public void setIdAgen(int idAgen) {
        this.idAgen = idAgen;
    }

    public DiasSemana getIdDia() {
        return idDia;
    }

    public void setIdDia(DiasSemana idDia) {
        this.idDia = idDia;
    }

    public Horario getIdHora() {
        return idHora;
    }

    public void setIdHora(Horario idHora) {
        this.idHora = idHora;
    }

    public Medico getIdMed() {
        return idMed;
    }

    public void setIdMed(Medico idMed) {
        this.idMed = idMed;
    }

    public Paciente getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(Paciente idPaci) {
        this.idPaci = idPaci;
    }

    public LocalDate getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDate dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public String getInfoAdicAgen() {
        return infoAdicAgen;
    }

    public void setInfoAdicAgen(String infoAdicAgen) {
        this.infoAdicAgen = infoAdicAgen;
    }

}
