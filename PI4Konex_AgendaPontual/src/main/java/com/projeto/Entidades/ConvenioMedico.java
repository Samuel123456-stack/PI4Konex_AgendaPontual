package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "convenio_medico")
public class ConvenioMedico {
    // Atributos

    @JoinColumn(name = "fk_med_conv", nullable = true)
    private int idMed;

    @JoinColumn(name = "fk_conv_med", nullable = true)
    private int idConv;

    // Metodo Construtor
    public ConvenioMedico() {
    }

    // Metodo Construtor com Atributos
    public ConvenioMedico(int idMed, int idConv) {
        this.idMed = idMed;
        this.idConv = idConv;
    }

    // Getters e Setters
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public int getIdConv() {
        return idConv;
    }

    public void setIdConv(int idConv) {
        this.idConv = idConv;
    }

}
