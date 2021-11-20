package com.projeto.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ajuda")
public class Ajuda implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idaju")
    private Integer idAjuda;

    @Column(name = "dtsolic", nullable = true, columnDefinition = "DATE")
    private String dataSolic;

    @Column(nullable = true, length = 20)
    private String assunto;

    @Column(nullable = true)
    private String mensagem;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ajuda_cli",
    joinColumns = @JoinColumn(name = "fk_aju_cli"),
    inverseJoinColumns = @JoinColumn(name = "fk_cli_aju"))
    private List<Paciente> paciente = new ArrayList<>();

    // Metodo Construtor
    public Ajuda() {}

    // Metodo Construtor com Atributos
	public Ajuda(Integer idAjuda, String dataSolic, String assunto, String mensagem, List<Paciente> paciente) {
		this.idAjuda = idAjuda;
		this.dataSolic = dataSolic;
		this.assunto = assunto;
		this.mensagem = mensagem;
		this.paciente = paciente;
	}
	// Getters e Setters
	public Integer getIdAjuda() {
		return idAjuda;
	}

	public void setIdAjuda(Integer idAjuda) {
		this.idAjuda = idAjuda;
	}

	public String getDataSolic() {
		return dataSolic;
	}

	public void setDataSolic(String dataSolic) {
		this.dataSolic = dataSolic;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<Paciente> getPaciente() {
		return paciente;
	}

	public void setPaciente(List<Paciente> paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAjuda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ajuda other = (Ajuda) obj;
		return Objects.equals(idAjuda, other.idAjuda);
	}
}
