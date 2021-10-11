package com.projeto.Classes;

public class AjudaPaci {
    //Atributos
    private String dataAjudaPaci;
    private String horaAjudaPaci;
    private int idAjuda;
    private int idPaci;
    private int idAdm;
    private String statusSoli;
    private String descSolucao;

    //Metodo Construtor
    public AjudaPaci(){

    }


    //Metodo Construtor com atributos
    public AjudaPaci(String dataAjudaPaci, String horaAjudaPaci, int idAjuda, int idPaci, int idAdm, String statusSoli,
    String descSolucao) {
this.dataAjudaPaci = dataAjudaPaci;
this.horaAjudaPaci = horaAjudaPaci;
this.idAjuda = idAjuda;
this.idPaci = idPaci;
this.idAdm = idAdm;
this.statusSoli = statusSoli;
this.descSolucao = descSolucao;
}


//Getters e Setters
public String getDataAjudaPaci() {
    return dataAjudaPaci;
}


public void setDataAjudaPaci(String dataAjudaPaci) {
    this.dataAjudaPaci = dataAjudaPaci;
}


public String getHoraAjudaPaci() {
    return horaAjudaPaci;
}


public void setHoraAjudaPaci(String horaAjudaPaci) {
    this.horaAjudaPaci = horaAjudaPaci;
}


public int getIdAjuda() {
    return idAjuda;
}


public void setIdAjuda(int idAjuda) {
    this.idAjuda = idAjuda;
}


public int getIdPaci() {
    return idPaci;
}


public void setIdPaci(int idPaci) {
    this.idPaci = idPaci;
}


public int getIdAdm() {
    return idAdm;
}


public void setIdAdm(int idAdm) {
    this.idAdm = idAdm;
}


public String getStatusSoli() {
    return statusSoli;
}


public void setStatusSoli(String statusSoli) {
    this.statusSoli = statusSoli;
}


public String getDescSolucao() {
    return descSolucao;
}


public void setDescSolucao(String descSolucao) {
    this.descSolucao = descSolucao;
}
}
