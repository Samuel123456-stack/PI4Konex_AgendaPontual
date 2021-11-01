package com.projeto.Entidades;

import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.*;

import org.apache.tomcat.util.codec.binary.Base64;

import com.projeto.projecao.ResultadoPesqMedProjecao;

@Entity
@Table(name = "medico")
public class Medico implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmed")
	private Integer idMed;

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private String foto;

	@Column(name = "dtcriacao", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataCriaMed;

	@Column(name = "nome", nullable = true)
	private String nomeMed;

	@Column(name = "datanasci", nullable = true)
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

	@Column(name = "dataformatura", nullable = true, columnDefinition = "DATE")
	private LocalDate dataFormatura;

	@Column(name = "sobremim", nullable = true)
	private String sobreMed;

	@Column(name = "biografia", nullable = true)
	private String bioMed;

	@Column(nullable = true, length = 4)
	private String sala;

	@Column(nullable = true)
	private Integer pontos;

	@ManyToOne
	@JoinColumn(name = "fk_cli_med")
	private Clinica clinica;

	@OneToOne
	@JoinColumn(name = "fk_end_med")
	private Endereco endereco;

	@ManyToOne
	@JoinColumn(name = "fk_usu_med")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "fk_esp_med")
	private Especialidade especialidade;

	// Metodo Construtor
	public Medico() {

	}
	// Metodo Construtor com Atributos

	public Medico(Integer idMed, byte [] foto, LocalDateTime dataCriaMed, String nomeMed, LocalDate dataNasc,
			String sexoMed, String cpfMed, String rgMed, String crm, String celular, float valorMed,
			LocalDate dataFormatura, String sobreMed, String bioMed, String sala, Integer pontos, Clinica clinica,
			Endereco endereco, Usuario usuario, Especialidade especialidade) {
		super();
		this.idMed = idMed;
		this.foto = Base64.encodeBase64String(foto);
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
		this.pontos = pontos;
		this.clinica = clinica;
		this.endereco = endereco;
		this.usuario = usuario;
		this.especialidade = especialidade;
	}
//	public Medico(ResultadoPesqMedProjecao entity) {
//		idMed = entity.getIdMed();
//		foto = Base64.encodeBase64String(entity.getFoto());
//		pontos = entity.getPontos();
//		nomeMed = entity.getNome();
//		sobreMed = entity.getSobreMim();
//	}

	public Integer getIdMed() {
		return idMed;
	}

	public void setIdMed(Integer idMed) {
		this.idMed = idMed;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
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

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
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

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMed);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return idMed == other.idMed;
	}
}
