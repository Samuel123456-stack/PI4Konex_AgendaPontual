package com.projeto.Classes;

public class Historico {
    //Atributos
    private int idHis;
    private String dataHisCria;
    private String horaHisCria;
    private String historico;
    private int idConsulta;

    //Metodo Construtor
    public Historico(){

    }
    
    //Metodo Construtor com Atributos
    public Historico(int idHis, String dataHisCria, String horaHisCria, String historico, int idConsulta) {
        this.idHis = idHis;
        this.dataHisCria = dataHisCria;
        this.horaHisCria = horaHisCria;
        this.historico = historico;
        this.idConsulta = idConsulta;
    }

    //Getters e Setters
    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getDataHisCria() {
        return dataHisCria;
    }

    public void setDataHisCria(String dataHisCria) {
        this.dataHisCria = dataHisCria;
    }

    public String getHoraHisCria() {
        return horaHisCria;
    }

    public void setHoraHisCria(String horaHisCria) {
        this.horaHisCria = horaHisCria;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }
      
}
