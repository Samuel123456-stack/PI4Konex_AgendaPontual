package com.projeto.Classes;

public class Medico {

    // Atributos
    private int idMed;
    private String nomeMed;
    private String cpfMed;
    private String dadosLi;
    private String telefone;
    private String tipo;
    private String especialidade;
    private String crm;

    // Metodo Construtor
    public Medico() {

    }

    // Metodo Construtor com Atributos
    public Medico(int idMed, String nomeMed, String cpfMed, String dadosLi, String telefone, String tipo,
            String especialidade, String crm) {
        this.idMed = idMed;
        this.nomeMed = nomeMed;
        this.cpfMed = cpfMed;
        this.dadosLi = dadosLi;
        this.telefone = telefone;
        this.tipo = tipo;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    // Getters e Setters
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getCpfMed() {
        return cpfMed;
    }

    public void setCpfMed(String cpfMed) {
        this.cpfMed = cpfMed;
    }

    public String getDadosLi() {
        return dadosLi;
    }

    public void setDadosLi(String dadosLi) {
        this.dadosLi = dadosLi;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
