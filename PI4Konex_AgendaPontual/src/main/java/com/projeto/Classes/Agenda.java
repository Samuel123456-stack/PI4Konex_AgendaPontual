package com.projeto.Classes;

public class Agenda {
    // Atributos
    private int idAgenda;
    private int idMedico;
    private int idConsulta;
    private String dataAgenda;
    private String horaAgenda;

    // Metodo Construtor
    public Agenda() {

    }

    // Metodo Construtor com Atributos
    public Agenda(int idAgenda, int idMedico, int idConsulta, String dataAgenda, String horaAgenda) {
        this.idAgenda = idAgenda;
        this.idMedico = idMedico;
        this.idConsulta = idConsulta;
        this.dataAgenda = dataAgenda;
        this.horaAgenda = horaAgenda;
    }

    // Getters e Setters
    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(String dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public String getHoraAgenda() {
        return horaAgenda;
    }

    public void setHoraAgenda(String horaAgenda) {
        this.horaAgenda = horaAgenda;
    }

}
