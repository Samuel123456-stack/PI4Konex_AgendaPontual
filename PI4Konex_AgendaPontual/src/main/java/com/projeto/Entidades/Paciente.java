package com.projeto.Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaci")
    private int idPaci;

    @Column(name = "dtcriacao", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dataCriaPaci;

    @Column(name = "nome", nullable = true)
    private String nomePaci;

    @Column(nullable = true, unique = true)
    private String cpf;

    @Column(name = "datanasci", nullable = true, columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNasc;

    @Column(nullable = true, unique = true)
    private String rg;

    @Column(nullable = true, unique = true)
    private String celular;

    @Column(nullable = true, unique = true)
    private String sexo;

    @Column(name = "primeiraconsulta", nullable = true, unique = true)
    private boolean primeiraConsulta;

    @Column(name = "sintomasgripe",nullable = true, unique = true)
    private boolean sintomasGripe;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "triagem",
    joinColumns = @JoinColumn(name = "fk_paci_doe"),
    inverseJoinColumns = @JoinColumn(name = "fk_doe_paci"))
    private Set<Doenca> doenca = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "fk_end_paci")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "fk_usu_paci")
    private Usuario usuario;

    // Metodo Construtor
    public Paciente() {}
    
    // Metodo Construtor com Atributos
	public Paciente(int idPaci, LocalDateTime dataCriaPaci, String nomePaci, String cpf, LocalDate dataNasc, String rg,
			String celular, String sexo, boolean primeiraConsulta, boolean sintomasGripe, Endereco endereco,
			Usuario usuario) {
		this.idPaci = idPaci;
		this.dataCriaPaci = dataCriaPaci;
		this.nomePaci = nomePaci;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.celular = celular;
		this.sexo = sexo;
		this.primeiraConsulta = primeiraConsulta;
		this.sintomasGripe = sintomasGripe;
		this.endereco = endereco;
		this.usuario = usuario;
	}
	
	// Getters e Setters

	public int getIdPaci() {
		return idPaci;
	}

	public void setIdPaci(int idPaci) {
		this.idPaci = idPaci;
	}

	public LocalDateTime getDataCriaPaci() {
		return dataCriaPaci;
	}

	public void setDataCriaPaci(LocalDateTime dataCriaPaci) {
		this.dataCriaPaci = dataCriaPaci;
	}

	public String getNomePaci() {
		return nomePaci;
	}

	public void setNomePaci(String nomePaci) {
		this.nomePaci = nomePaci;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isPrimeiraConsulta() {
		return primeiraConsulta;
	}

	public void setPrimeiraConsulta(boolean primeiraConsulta) {
		this.primeiraConsulta = primeiraConsulta;
	}

	public boolean isSintomasGripe() {
		return sintomasGripe;
	}

	public void setSintomasGripe(boolean sintomasGripe) {
		this.sintomasGripe = sintomasGripe;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPaci);
	}
	
	public Set<Doenca> getDoenca() {
		return doenca;
	}

	public void setDoenca(Set<Doenca> doenca) {
		this.doenca = doenca;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return idPaci == other.idPaci;
	}
}
