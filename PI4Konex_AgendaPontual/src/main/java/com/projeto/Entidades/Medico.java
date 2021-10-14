package com.projeto.Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMed;

    @Column(name = "dt_criacao", columnDefinition = "DATE")
    private LocalDateTime dataCriaMed;

    @Column(name = "nome", nullable = true)
    private String nomeMed;

    @Column(name = "data_nasci", nullable = true)
    private LocalDate dataNasc;

    @Column(name = "sexo", nullable = true)
    private String sexoMed;

    @Column(name = "cpf", nullable = true, unique = true)
    private String cpfMed;

    @Column(name = "rg", nullable = true, unique = true)
    private String rgMed;

    @Column(nullable = true)
    private String crm;

    @Column(nullable = true, unique = true)
    private String celular;

    @Column(name = "valor", nullable = true, columnDefinition = "DECIMAL(5,2) DEFAULT 0.00")
    private float valorMed;

    @Column(name = "data_formatura", nullable = true, columnDefinition = "DATE")
    private LocalDate dataFormatura;

    @Column(name = "sobre_mim", nullable = true)
    private String sobreMed;

    @Column(name = "biografia", nullable = true)
    private String bioMed;

    @Column(nullable = true, length = 4)
    private String sala;

    @JoinColumn(name = "fk_cli_med")
    private int idCli;

    @JoinColumn(name = "fk_end_med")
    private int idEndereco;

    @JoinColumn(name = "fk_usu_med")
    private int idUsu;

    @JoinColumn(name = "fk_esp_med")
    private int idEsp;

    // Metodo Construtor
    public Medico() {

    }

    // Metodo Construtor com Atributos
    public Medico(int idMed, LocalDateTime dataCriaMed, String nomeMed, LocalDate dataNasc, String sexoMed,
            String cpfMed, String rgMed, String crm, String celular, float valorMed, LocalDate dataFormatura,
            String sobreMed, String bioMed, String sala, int idCli, int idEndereco, int idUsu, int idEsp) {
        this.idMed = idMed;
        this.dataCriaMed = dataCriaMed;
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

    public LocalDateTime getDataCriaMed() {
        return dataCriaMed;
    }

    public void setDataCriaMed(LocalDateTime dataCriaMed) {
        this.dataCriaMed = dataCriaMed;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
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

    public LocalDate getDataFormatura() {
        return dataFormatura;
    }

    public void setDataFormatura(LocalDate dataFormatura) {
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
