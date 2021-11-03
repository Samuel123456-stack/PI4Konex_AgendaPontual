package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.Entidades.NewsLatter;
import com.projeto.Repositorios.NewsLatterRepositorio;

@Service
public class NewsLatterServico {
	
	@Autowired
	private NewsLatterRepositorio newsRepo;
	
	public NewsLatter cadastro(NewsLatter obj) {
		return newsRepo.save(obj);
	}
}
