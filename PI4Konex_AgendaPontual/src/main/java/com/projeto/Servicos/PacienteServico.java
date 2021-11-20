package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.Entidades.Paciente;
import com.projeto.Repositorios.PacienteRepositorio;

@Service
public class PacienteServico {
	
	@Autowired
	private PacienteRepositorio paciRepo;
	
	public Paciente cadastro(Paciente paciente) {
		return paciRepo.save(paciente);
	}
}
