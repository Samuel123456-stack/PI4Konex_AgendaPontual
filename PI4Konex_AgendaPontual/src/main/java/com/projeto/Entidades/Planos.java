package com.projeto.Entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "plano")
public class Planos {
	//coment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplan")
    private int idPlano;

    @Column(name = "nome", nullable = true)
    private String nomePlano;

    @Column(name = "valor", columnDefinition = "DECIMAL(6,2) DEFAULT 0.00")
    private float valorPlano;

    @Column(name = "qterecep", nullable = true)
    @Min(1)
    private int qntRec;

    @Column(name = "qtemedico", nullable = true)
    @Min(1)
    private int qntMed;

    @Column(name = "tolerancia", nullable = true)
    @Min(1)
    private int qntTolerancia;

    // Metodo Construtor
    public Planos() {

    }
   
    public Planos(String nomePlano, float valorPlano, @Min(1) int qntRec, @Min(1) int qntMed, @Min(1) int qntTolerancia) {
		this.nomePlano = nomePlano;
		this.valorPlano = valorPlano;
		this.qntRec = qntRec;
		this.qntMed = qntMed;
		this.qntTolerancia = qntTolerancia;
	}



	// Getters e Setters
	public int getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}

	public String getNomePlano() {
		return nomePlano;
	}

	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}

	public float getValorPlano() {
		return valorPlano;
	}

	public void setValorPlano(float valorPlano) {
		this.valorPlano = valorPlano;
	}

	public int getQntRec() {
		return qntRec;
	}

	public void setQntRec(int qntRec) {
		this.qntRec = qntRec;
	}

	public int getQntMed() {
		return qntMed;
	}

	public void setQntMed(int qntMed) {
		this.qntMed = qntMed;
	}

	public int getQntTolerancia() {
		return qntTolerancia;
	}

	public void setQntTolerancia(int qntTolerancia) {
		this.qntTolerancia = qntTolerancia;
	}

}
