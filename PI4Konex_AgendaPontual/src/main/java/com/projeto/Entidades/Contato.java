package com.projeto.Entidades;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "duvida")
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idContato;

    @Column(nullable = false)
    @NotNull
    @NotBlank
    private String nome;
    
    
    @Column(nullable = false)
    @NotNull
    @NotBlank
    private String email;
    
    
    @Column(nullable = false)
    @NotNull
    @NotBlank
    private String telefone;
    
    @Column(name = "data_notificacao", nullable = true, columnDefinition = "DATE")
    private LocalDateTime dtsolic;

    
    
    @Column(nullable = true)
    private String assunto;
    

    @Column(nullable = true)
    @NotNull
    @NotBlank
    private String msg;
    
    @Column(nullable = true)
    private String resposta;
    
    @Column(nullable = true)
    private boolean contatoWpp = false;
  
    // Metodo Construtor
    public Contato() {

    }

    // Getters e Setters
	public long getIdContato() {
		return idContato;
	}

	public void setIdContato(long idNoti) {
		this.idContato = idNoti;
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

	public LocalDateTime getDtsolic() {
		return dtsolic;
	}

	public void setDtsolic(LocalDateTime dtsolic) {
		this.dtsolic = dtsolic;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String mensagem) {
		this.msg = mensagem;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public boolean isContatoWpp() {
		return contatoWpp;
	}

	public void setContatoWpp(boolean contatoWpp) {
		this.contatoWpp = contatoWpp;
	}

}

