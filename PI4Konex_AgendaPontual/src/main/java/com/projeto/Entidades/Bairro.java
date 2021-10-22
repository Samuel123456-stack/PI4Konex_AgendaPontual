package com.projeto.Entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="bairro")
public class Bairro implements Serializable {
	private static final long serialVersionUID = 1L;
	//Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bai")
    private int idBai;

    @Column(nullable = true)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "fk_cid_bai")
    private Cidade cidade;
    
    @OneToMany
    private List<Endereco> endereco;

    public Bairro() {
    }

  //Getters e Setters
	public int getIdBai() {
		return idBai;
	}

	public void setIdBai(int idBai) {
		this.idBai = idBai;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}   
}
