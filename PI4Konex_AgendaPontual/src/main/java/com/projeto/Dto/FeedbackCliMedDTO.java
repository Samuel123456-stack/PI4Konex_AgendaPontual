package com.projeto.Dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import org.apache.tomcat.util.codec.binary.Base64;

public class FeedbackCliMedDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String foto;
	private String comentario;
	private String nome;
    private LocalDate dtAgendada;
    private LocalTime hora;
	
	public FeedbackCliMedDTO() {}

	public FeedbackCliMedDTO(byte [] foto, String comentario, String nome,LocalDate dtAgendada, LocalTime hora) {
		this.foto = Base64.encodeBase64String(foto);
		this.comentario = comentario;
		this.nome = nome;
        this.dtAgendada = dtAgendada;
        this.hora = hora;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(byte [] foto) {
		this.foto = Base64.encodeBase64String(foto);
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public LocalDate getDtAgendada() {
        return dtAgendada;
    }

    public void setDtAgendada(LocalDate dtAgendada) {
        this.dtAgendada = dtAgendada;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    
}
