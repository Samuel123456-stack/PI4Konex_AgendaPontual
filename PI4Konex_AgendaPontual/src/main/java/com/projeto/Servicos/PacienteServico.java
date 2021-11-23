package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Paciente;
import com.projeto.Repositorios.PacienteRepositorio;

@Service
public class PacienteServico {
	
	@Autowired
	private PacienteRepositorio paciRepo;
	
	@Transactional(readOnly = false)
	public Paciente cadastro(Paciente paciente) {
		return paciRepo.save(paciente);
	}
	
	@Transactional(readOnly = false)
	public void cadastroVoid(Paciente paciente) {
		paciRepo.save(paciente);
	}
	
	@Transactional(readOnly = true)
	public Paciente pesquisaPacientePorUsuarioId(Integer idusu) {
		return paciRepo.buscaPacientePorUsuarioId(idusu);
	}
}
