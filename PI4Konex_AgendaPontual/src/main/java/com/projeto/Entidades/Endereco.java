package com.projeto.Entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnd;

    @Column(nullable = true)
    private String logradouro;

    @Column(nullable = true)
    private int numero;

    @Column(nullable = true)
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "fk_bai_end")
    private Bairro bairro;

    @Column(nullable = true, unique = true)
    private String cep;

    // Metodo Construtor
    public Endereco() {
    }
    
 // Metodo Construtor com Atributos
 public Endereco(int idEnd, String logradouro, int numero, String complemento, Bairro bairro, String cep) {
		this.idEnd = idEnd;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

	// Getters e Setters
	public int getIdEnd() {
		return idEnd;
	}

	public void setIdEnd(int idEnd) {
		this.idEnd = idEnd;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
