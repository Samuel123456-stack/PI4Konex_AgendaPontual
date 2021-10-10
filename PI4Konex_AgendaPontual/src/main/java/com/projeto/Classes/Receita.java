package com.projeto.Classes;

public class Receita {

    // Atributos
    private int idRec;
    private String dataRec;
    private String horaRec;
    private String infoRec;

    // Metodo Construtor
    public Receita() {
    }

    // Metodo Construtor com Atributos
    public Receita(int idRec, String dataRec, String horaRec, String infoRec) {
        this.idRec = idRec;
        this.dataRec = dataRec;
        this.horaRec = horaRec;
        this.infoRec = infoRec;
    }

    // Getters e Setters
    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    public String getDataRec() {
        return dataRec;
    }

    public void setDataRec(String dataRec) {
        this.dataRec = dataRec;
    }

    public String getHoraRec() {
        return horaRec;
    }

    public void setHoraRec(String horaRec) {
        this.horaRec = horaRec;
    }

    public String getInfoRec() {
        return infoRec;
    }

    public void setInfoRec(String infoRec) {
        this.infoRec = infoRec;
    }

}
