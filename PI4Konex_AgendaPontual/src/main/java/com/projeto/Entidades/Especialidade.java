package com.projeto.Entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "especialidade")
public class Especialidade implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idesp")
    private int idEsp;

    @Column(name = "nome", nullable = true)
    private String nomeEsp;
    
    // Metodo Construtor
    public Especialidade() {

    }

    // Metodo Construtor com atributos
    public Especialidade(int idEsp, String nomeEsp) {
        this.idEsp = idEsp;
        this.nomeEsp = nomeEsp;
    }

 // Getters e Setters
	public int getIdEsp() {
		return idEsp;
	}

	public void setIdEsp(int idEsp) {
		this.idEsp = idEsp;
	}

	public String getNomeEsp() {
		return nomeEsp;
	}

	public void setNomeEsp(String nomeEsp) {
		this.nomeEsp = nomeEsp;
	}
}
