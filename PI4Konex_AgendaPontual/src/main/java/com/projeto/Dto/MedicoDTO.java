package com.projeto.Dto;

import java.io.Serializable;

import com.projeto.Entidades.Medico;
import com.projeto.projecao.ResultadoPesqMedProjecao;

public class MedicoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idMed;
	private Integer pontos;
	private String nome;
	private String sobreMim;
	
	public MedicoDTO() {
		
	}

	public MedicoDTO(Integer idMed, Integer pontos, String nome, String sobreMim) {
		this.idMed = idMed;
		this.pontos = pontos;
		this.nome = nome;
		this.sobreMim = sobreMim;
	}
	
	public MedicoDTO(Medico entity) {
		this.idMed = entity.getIdMed();
		this.pontos = entity.getPontos();
		this.nome = entity.getNomeMed();
		this.sobreMim = entity.getSobreMed();
	}
	
	public MedicoDTO(ResultadoPesqMedProjecao entity) {
		idMed = entity.getIdMed();
		pontos = entity.getPontos();
		nome = entity.getNome();
		sobreMim = entity.getSobreMim();
	}

	public Integer getIdMed() {
		return idMed;
	}

	public void setIdMed(Integer idMed) {
		this.idMed = idMed;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreMim() {
		return sobreMim;
	}

	public void setSobreMim(String sobreMim) {
		this.sobreMim = sobreMim;
	}	
}
