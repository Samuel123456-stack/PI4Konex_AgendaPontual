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

@Entity
public class Duvida implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idduv")
	private Integer idduv;
	
	@Column(length = 50)
	private String nome;
	
	@Column(length = 50)
	private String email;
	
	@Column(length = 15)
	private String telefone;
	
	private Boolean autorizado;
	
	private String mensagem;
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "duvida_adm",
    joinColumns = @JoinColumn(name = "fk_duv_adm"),
    inverseJoinColumns = @JoinColumn(name = "fk_adm_duv"))
    private List<Administrador> admin = new ArrayList<>();
	
	public Duvida() {}

	public Duvida(Integer idduv, String nome, String email, String telefone, Boolean autorizado, String mensagem) {
		this.idduv = idduv;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.autorizado = autorizado;
		this.mensagem = mensagem;
	}

	public Integer getIdduv() {
		return idduv;
	}

	public void setIdduv(Integer idduv) {
		this.idduv = idduv;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Boolean autorizado) {
		this.autorizado = autorizado;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idduv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Duvida other = (Duvida) obj;
		return Objects.equals(idduv, other.idduv);
	}
}
