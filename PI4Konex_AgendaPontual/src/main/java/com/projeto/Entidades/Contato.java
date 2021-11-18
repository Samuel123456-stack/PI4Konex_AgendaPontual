package com.projeto.Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "duvida")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idduv")
	private long idContato;
	
    @Column(name = "data_notificacao", nullable = true, columnDefinition = "DATETIME")
    private LocalDateTime dtsolic;

    @Column(nullable = false, length = 50)
    @NotNull
    @NotBlank
    private String nome;
    
    
    @Column(nullable = false, length = 50)
    @NotNull
    @NotBlank
    private String email;
    
    
    @Column(nullable = false, length = 15)
    @NotNull
    @NotBlank
    private String telefone;
    
    @Column(nullable = true)
    private boolean contatoWpp = false;

    
    @Column(nullable = true, columnDefinition = "Text")
    @NotNull
    @NotBlank
    private String mensagem;
    
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "duvida_adm",
    joinColumns = @JoinColumn(name = "fk_duv_adm"),
    inverseJoinColumns = @JoinColumn(name = "fk_adm_duv"))
    private List<Administrador> admin = new ArrayList<>();
    
  
    // Metodo Construtor
    public Contato() {

    }
    
    public Contato(long idContato, LocalDateTime dtsolic, @NotNull @NotBlank String nome,
			@NotNull @NotBlank String email, @NotNull @NotBlank String telefone, boolean contatoWpp,
			@NotNull @NotBlank String mensagem, List<Administrador> admin) {
		super();
		this.idContato = idContato;
		this.dtsolic = dtsolic;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.contatoWpp = contatoWpp;
		this.mensagem = mensagem;
		this.admin = admin;
	}


	// Getters e Setters
	public long getIdContato() {
		return idContato;
	}


	public void setIdContato(long idContato) {
		this.idContato = idContato;
	}


	public LocalDateTime getDtsolic() {
		return dtsolic;
	}


	public void setDtsolic(LocalDateTime dtsolic) {
		this.dtsolic = dtsolic;
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


	public boolean isContatoWpp() {
		return contatoWpp;
	}


	public void setContatoWpp(boolean contatoWpp) {
		this.contatoWpp = contatoWpp;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public List<Administrador> getAdmin() {
		return admin;
	}


	public void setAdmin(List<Administrador> admin) {
		this.admin = admin;
	}
}

