package com.projeto.Entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewsLatter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idnew;
	
	@Column(name = "email", length = 50)
	private String email;
	
	public NewsLatter() {}

	public NewsLatter(Integer idnew, String email) {
		super();
		this.idnew = idnew;
		this.email = email;
	}

	public Integer getIdnew() {
		return idnew;
	}

	public void setIdnew(Integer idnew) {
		this.idnew = idnew;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idnew);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewsLatter other = (NewsLatter) obj;
		return Objects.equals(idnew, other.idnew);
	}
}
