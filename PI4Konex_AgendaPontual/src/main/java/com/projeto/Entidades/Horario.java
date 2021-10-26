package com.projeto.Entidades;

import java.time.LocalTime;

import javax.persistence.*;

@Entity
@Table(name = "horario")
public class Horario {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idHora;

    @Column(nullable = true)
    private LocalTime horario;

    @JoinColumn(name = "fk_med_hor")
    private Medico idMed;

    // Metodo Construtor
    public Horario() {
    }

    // Metodo Construtor com Atributos
    public Horario(int idHora, LocalTime horario, Medico idMed) {
        this.idHora = idHora;
        this.horario = horario;
        this.idMed = idMed;
    }

    // Getters e Setters
    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Medico getIdMed() {
        return idMed;
    }

    public void setIdMed(Medico idMed) {
        this.idMed = idMed;
    }

}
