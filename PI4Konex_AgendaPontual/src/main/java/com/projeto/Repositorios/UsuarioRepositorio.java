package com.projeto.Repositorios;

import com.projeto.Entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {

    @Query(nativeQuery = true, value = "update usuario set email=?1, email_confirma=?2, senha=?3, senha_confirma=?4 where id_usu=?5")
    Usuario atualizaUsuario(String email, String emailConfirma, String senha, String senhaConfirma, Integer idUsu);
    
}
