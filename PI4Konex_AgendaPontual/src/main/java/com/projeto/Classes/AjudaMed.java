package com.projeto.Classes;

public class AjudaMed {
    // Atributos
    private String dataAjudaMed;
    private String horaAjudaMed;
    private int idAjuda;
    private int idMed;
    private int idAdm;
    private String statusSoli;
    private String descSolucao;

    // Metodo Construtor
    public AjudaMed() {

    }

    // Metodo Construtor com Atributos
    public AjudaMed(String dataAjudaMed, String horaAjudaMed, int idAjuda, int idMed, int idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaMed = dataAjudaMed;
        this.horaAjudaMed = horaAjudaMed;
        this.idAjuda = idAjuda;
        this.idMed = idMed;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public String getDataAjudaMed() {
        return dataAjudaMed;
    }

    public void setDataAjudaMed(String dataAjudaMed) {
        this.dataAjudaMed = dataAjudaMed;
    }

    public String getHoraAjudaMed() {
        return horaAjudaMed;
    }

    public void setHoraAjudaMed(String horaAjudaMed) {
        this.horaAjudaMed = horaAjudaMed;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
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
