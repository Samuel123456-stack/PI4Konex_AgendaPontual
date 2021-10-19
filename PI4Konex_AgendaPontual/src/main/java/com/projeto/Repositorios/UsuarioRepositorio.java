package com.projeto.Repositorios;

import com.projeto.Entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
    
}
