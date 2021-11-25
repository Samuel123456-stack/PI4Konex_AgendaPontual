package com.projeto.Dto;

import java.time.LocalTime;

public class ProjecaoSalarialDTO {
    
    private Float valorPaci;
    private Float metaPaci;
    private LocalTime horaInicio;
    private LocalTime horaSaida;
    private LocalTime horaIntervalo;
    private boolean tempoSeguranca;
    private String diasSemana;
    private String diasSemanaTrab;


    public ProjecaoSalarialDTO(Float valorPaci, Float metaPaci, LocalTime horaInicio, LocalTime horaSaida,
            LocalTime horaIntervalo, boolean tempoSeguranca, String diasSemana, String diasSemanaTrab) {
        this.valorPaci = valorPaci;
        this.metaPaci = metaPaci;
        this.horaInicio = horaInicio;
        this.horaSaida = horaSaida;
        this.horaIntervalo = horaIntervalo;
        this.tempoSeguranca = tempoSeguranca;
        this.diasSemana = diasSemana;
        this.diasSemanaTrab = diasSemanaTrab;
    }


    public Float getValorPaci() {
        return valorPaci;
    }


    public void setValorPaci(Float valorPaci) {
        this.valorPaci = valorPaci;
    }


    public Float getMetaPaci() {
        return metaPaci;
    }


    public void setMetaPaci(Float metaPaci) {
        this.metaPaci = metaPaci;
    }


    public LocalTime getHoraInicio() {
        return horaInicio;
    }


    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }


    public LocalTime getHoraSaida() {
        return horaSaida;
    }


    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }


    public LocalTime getHoraIntervalo() {
        return horaIntervalo;
    }


    public void setHoraIntervalo(LocalTime horaIntervalo) {
        this.horaIntervalo = horaIntervalo;
    }


    public boolean isTempoSeguranca() {
        return tempoSeguranca;
    }


    public void setTempoSeguranca(boolean tempoSeguranca) {
        this.tempoSeguranca = tempoSeguranca;
    }


    public String getDiasSemana() {
        return diasSemana;
    }


    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }


    public String getDiasSemanaTrab() {
        return diasSemanaTrab;
    }


    public void setDiasSemanaTrab(String diasSemanaTrab) {
        this.diasSemanaTrab = diasSemanaTrab;
    }
    
}
