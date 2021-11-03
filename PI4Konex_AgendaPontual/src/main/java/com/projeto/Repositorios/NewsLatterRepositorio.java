package com.projeto.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.Entidades.NewsLatter;

@Repository
public interface NewsLatterRepositorio extends JpaRepository<NewsLatter, Integer>{

}
