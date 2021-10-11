package com.projeto.Classes;

public class Medico {

    // Atributos
    private int idMed;
    private String nomeMed;
    private String dataNasc;
    private String sexoMed;
    private String cpfMed;
    private String email;
    private String senha;
    private String crm;
    private String telefone;
    private String valorMed;
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
    public Medico(int idMed, String nomeMed, String dataNasc, String sexoMed, String cpfMed, String email, String senha,
            String crm, String telefone, String valorMed, String dataFormatura, String sobreMed, String bioMed,
            String sala, int idCli, int idEndereco, int idUsu, int idEsp) {
        this.idMed = idMed;
        this.nomeMed = nomeMed;
        this.dataNasc = dataNasc;
        this.sexoMed = sexoMed;
        this.cpfMed = cpfMed;
        this.email = email;
        this.senha = senha;
        this.crm = crm;
        this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getValorMed() {
        return valorMed;
    }

    public void setValorMed(String valorMed) {
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
