package com.projeto.Classes;

public class AjudaRec {
    //Atributos
    private String dataAjudaRec;
    private String horaAjudaRec;
    private int idAjuda;
    private int idRec;
    private int idAdm;
    private String statusSoli;
    private String descSolucao;

    //Metodo Construtor
    public AjudaRec() {
    }



    //Metodo Construtor com Atributos
    public AjudaRec(String dataAjudaRec, String horaAjudaRec, int idAjuda, int idRec, int idAdm, String statusSoli,
    String descSolucao) {
this.dataAjudaRec = dataAjudaRec;
this.horaAjudaRec = horaAjudaRec;
this.idAjuda = idAjuda;
this.idRec = idRec;
this.idAdm = idAdm;
this.statusSoli = statusSoli;
this.descSolucao = descSolucao;
}


//Getters e Setters
public String getDataAjudaRec() {
    return dataAjudaRec;
}



public void setDataAjudaRec(String dataAjudaRec) {
    this.dataAjudaRec = dataAjudaRec;
}



public String getHoraAjudaRec() {
    return horaAjudaRec;
}



public void setHoraAjudaRec(String horaAjudaRec) {
    this.horaAjudaRec = horaAjudaRec;
}



public int getIdAjuda() {
    return idAjuda;
}



public void setIdAjuda(int idAjuda) {
    this.idAjuda = idAjuda;
}



public int getIdRec() {
    return idRec;
}



public void setIdRec(int idRec) {
    this.idRec = idRec;
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
