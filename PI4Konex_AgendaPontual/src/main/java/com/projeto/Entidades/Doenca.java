package com.projeto.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "doenca")
public class Doenca {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doe")
    private int idDoenca;

    @Column(name = "nome", nullable = true)
    private String nomeDoenca;
    
    @ManyToOne
    @JoinColumn(name = "fk_esp_doe")
    private Especialidade especialiade;

    // Metodo Construtor
    public Doenca() {
    }

    // Metodo Construtor com Atributos
    public Doenca(int idDoenca, String nomeDoenca, Especialidade especialiade) {
		this.idDoenca = idDoenca;
		this.nomeDoenca = nomeDoenca;
		this.especialiade = especialiade;
	}

 // Getters e Setters
	public int getIdDoenca() {
		return idDoenca;
	}

	public void setIdDoenca(int idDoenca) {
		this.idDoenca = idDoenca;
	}

	public String getNomeDoenca() {
		return nomeDoenca;
	}

	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}

	public Especialidade getEspecialiade() {
		return especialiade;
	}

	public void setEspecialiade(Especialidade especialiade) {
		this.especialiade = especialiade;
	} 
}
