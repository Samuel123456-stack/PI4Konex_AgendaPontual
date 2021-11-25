package com.projeto.Entidades;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projsalarial")
public class ProjecaoSalarial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproj")
	private Integer idProj;

	@Column(name = "valorpaci", nullable = true, columnDefinition = "DECIMAL(5,2) DEFAULT 0.00")
	private Float valorPaci;

	@Column(name = "metapaci", nullable = true, columnDefinition = "DECIMAL(5,2) DEFAULT 0.00")
	private Float metaPaci;

	@Column(name = "horainicio", nullable = true)
	private LocalTime horaInicio;

	@Column(name = "horasaida", nullable = true)
	private LocalTime horaSaida;

	@Column(name = "horaintervalo", nullable = true)
	private LocalTime horaIntervalo;

	@Column(name = "temposegu", nullable = true)
	private boolean tempoSeguranca;

	@ManyToOne
	@JoinColumn(name = "fk_agen_proj")
	private Agenda agenda;

	@ManyToOne
	@JoinColumn(name = "fk_med_proj")
	private Medico medico;

	public ProjecaoSalarial() {

	}

	public ProjecaoSalarial(Float valorPaci, Float metaPaci, LocalTime horaInicio, LocalTime horaSaida,
			LocalTime horaIntervalo, boolean tempoSeguranca, Agenda agen, Medico med) {
		this.valorPaci = valorPaci;
		this.metaPaci = metaPaci;
		this.horaInicio = horaInicio;
		this.horaSaida = horaSaida;
		this.horaIntervalo = horaIntervalo;
		this.tempoSeguranca = tempoSeguranca;
		this.agenda = agenda;
		this.medico = medico;

	}

	public Integer getIdProj() {
		return idProj;
	}

	public void setIdProj(Integer idProj) {
		this.idProj = idProj;
	}

	public Float getValorPaci() {
		return valorPaci;
	}

	public void setValorPaci(Float valorPaci) {
		this.valorPaci = valorPaci;
	}

	public Float getMetaPaci() {
		return metaPaci;
	}

	public void setMetaPaci(Float metaPaci) {
		this.metaPaci = metaPaci;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public LocalTime getHoraIntervalo() {
		return horaIntervalo;
	}

	public void setHoraIntervalo(LocalTime horaIntervalo) {
		this.horaIntervalo = horaIntervalo;
	}

	public boolean isTempoSeguranca() {
		return tempoSeguranca;
	}

	public void setTempoSeguranca(boolean tempoSeguranca) {
		this.tempoSeguranca = tempoSeguranca;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
