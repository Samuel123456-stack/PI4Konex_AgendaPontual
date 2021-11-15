package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.NewsLatter;
import com.projeto.Repositorios.NewsLatterRepositorio;

@Service
public class NewsLatterServico {
	
	@Autowired
	private NewsLatterRepositorio newsRepo;
	
	@Transactional
	public NewsLatter cadastro(NewsLatter obj) {
		return newsRepo.save(obj);
	}
}
