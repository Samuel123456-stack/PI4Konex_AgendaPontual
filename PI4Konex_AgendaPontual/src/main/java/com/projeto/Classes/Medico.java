package com.projeto.Classes;

public class Medico {

    // Atributos
    private int idMed;
    private String dataCriaMed;
    private String horaCriaMed;
    private String nomeMed;
    private String dataNasc;
    private String sexoMed;
    private String cpfMed;
    private String rgMed;
    private String crm;
    private String celular;
    private float valorMed;
    private String dataFormatura;
    private String sobreMed;
    private String bioMed;
    private String sala;
    private int idCli;
    private int idEndereco;
    private int idUsu;
    private int idEsp;

    // Metodo Construtor
    public Medico() {

    }

    // Metodo Construtor com Atributos
    public Medico(int idMed, String dataCriaMed, String horaCriaMed, String nomeMed, String dataNasc, String sexoMed,
            String cpfMed, String rgMed, String crm, String celular, float valorMed, String dataFormatura,
            String sobreMed, String bioMed, String sala, int idCli, int idEndereco, int idUsu, int idEsp) {
        this.idMed = idMed;
        this.dataCriaMed = dataCriaMed;
        this.horaCriaMed = horaCriaMed;
        this.nomeMed = nomeMed;
        this.dataNasc = dataNasc;
        this.sexoMed = sexoMed;
        this.cpfMed = cpfMed;
        this.rgMed = rgMed;
        this.crm = crm;
        this.celular = celular;
        this.valorMed = valorMed;
        this.dataFormatura = dataFormatura;
        this.sobreMed = sobreMed;
        this.bioMed = bioMed;
        this.sala = sala;
        this.idCli = idCli;
        this.idEndereco = idEndereco;
        this.idUsu = idUsu;
        this.idEsp = idEsp;
    }

    // Getters e Setters
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getDataCriaMed() {
        return dataCriaMed;
    }

    public void setDataCriaMed(String dataCriaMed) {
        this.dataCriaMed = dataCriaMed;
    }

    public String getHoraCriaMed() {
        return horaCriaMed;
    }

    public void setHoraCriaMed(String horaCriaMed) {
        this.horaCriaMed = horaCriaMed;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexoMed() {
        return sexoMed;
    }

    public void setSexoMed(String sexoMed) {
        this.sexoMed = sexoMed;
    }

    public String getCpfMed() {
        return cpfMed;
    }

    public void setCpfMed(String cpfMed) {
        this.cpfMed = cpfMed;
    }

    public String getRgMed() {
        return rgMed;
    }

    public void setRgMed(String rgMed) {
        this.rgMed = rgMed;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public float getValorMed() {
        return valorMed;
    }

    public void setValorMed(float valorMed) {
        this.valorMed = valorMed;
    }

    public String getDataFormatura() {
        return dataFormatura;
    }

    public void setDataFormatura(String dataFormatura) {
        this.dataFormatura = dataFormatura;
    }

    public String getSobreMed() {
        return sobreMed;
    }

    public void setSobreMed(String sobreMed) {
        this.sobreMed = sobreMed;
    }

    public String getBioMed() {
        return bioMed;
    }

    public void setBioMed(String bioMed) {
        this.bioMed = bioMed;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

}
