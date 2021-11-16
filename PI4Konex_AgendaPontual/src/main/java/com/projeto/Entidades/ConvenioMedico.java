package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "convenio_medico")
public class ConvenioMedico {
    // Atributos

    @Id
    @Column(name = "fk_med_conv", nullable = true)
    private Medico idMed;

    @ManyToOne
    @JoinColumn(name = "fk_conv_med", nullable = true)
    private Convenio idConv;

    // Metodo Construtor
    public ConvenioMedico() {
    }

    // Metodo Construtor com Atributos
    public ConvenioMedico(Medico idMed, Convenio idConv) {
        this.idMed = idMed;
        this.idConv = idConv;
    }

    // Getters e Setters
    public Medico getIdMed() {
        return idMed;
    }

    public void setIdMed(Medico idMed) {
        this.idMed = idMed;
    }

    public Convenio getIdConv() {
        return idConv;
    }

    public void setIdConv(Convenio idConv) {
        this.idConv = idConv;
    }

}
