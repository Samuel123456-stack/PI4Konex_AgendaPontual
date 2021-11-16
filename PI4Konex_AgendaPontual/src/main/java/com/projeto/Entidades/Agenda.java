package com.projeto.Entidades;


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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_hor_agen", unique = true)
    private Horario idHora;

    @ManyToOne
    @JoinColumn(name = "fk_med_agen", unique = true)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "fk_paci_agen", unique = true)
    private Paciente idPaci;

    @Column(name = "dataagendada", nullable = true, unique = true, columnDefinition = "DATE")
    private String dataAgendada;

    @Column(name = "informacoesadic", nullable = true)
    private String infoAdicAgen;

    // Metodo Construtor
    public Agenda() {

    }

    // Metodo Construtor com Atributos
    public Agenda(int idAgen, DiasSemana idDia, Horario idHora, Medico medico, Paciente idPaci, String dataAgendada,
            String infoAdicAgen) {
        this.idAgen = idAgen;
        this.idDia = idDia;
        this.idHora = idHora;
        this.medico = medico;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(Paciente idPaci) {
        this.idPaci = idPaci;
    }

    public String getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public String getInfoAdicAgen() {
        return infoAdicAgen;
    }

    public void setInfoAdicAgen(String infoAdicAgen) {
        this.infoAdicAgen = infoAdicAgen;
    }

}
