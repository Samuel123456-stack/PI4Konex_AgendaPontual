package com.projeto.Classes;

public class AjudaCli {
    // Atributos
    private String dataAjudaCli;
    private String horaAjudaCli;
    private int idAjuda;
    private int idCli;
    private int idAdm;
    private String statusSoli;
    private String descSolucao;

    // Metodo Construtor
    public AjudaCli() {

    }

    // Metodo Construtor com Atributos
    public AjudaCli(String dataAjudaCli, String horaAjudaCli, int idAjuda, int idCli, int idAdm, String statusSoli,
            String descSolucao) {
        this.dataAjudaCli = dataAjudaCli;
        this.horaAjudaCli = horaAjudaCli;
        this.idAjuda = idAjuda;
        this.idCli = idCli;
        this.idAdm = idAdm;
        this.statusSoli = statusSoli;
        this.descSolucao = descSolucao;
    }

    // Getters e Setters
    public String getDataAjudaCli() {
        return dataAjudaCli;
    }

    public void setDataAjudaCli(String dataAjudaCli) {
        this.dataAjudaCli = dataAjudaCli;
    }

    public String getHoraAjudaCli() {
        return horaAjudaCli;
    }

    public void setHoraAjudaCli(String horaAjudaCli) {
        this.horaAjudaCli = horaAjudaCli;
    }

    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
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
