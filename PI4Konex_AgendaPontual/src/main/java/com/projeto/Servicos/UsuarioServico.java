package com.projeto.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.UsuarioRepositorio;

@Service

public class UsuarioServico {
    
    @Autowired
    private UsuarioRepositorio repoUsu;


        //Metodos do CRUD Usuario
        @Transactional(readOnly=true)
        public List<Usuario> listarTodosUsu(){
            return repoUsu.findAll();
        }
        @Transactional(readOnly=false)
        public void criaUsu(Usuario usu){
            repoUsu.save(usu);
        }
        @Transactional(readOnly=true)
        public Usuario pegaUsuPorId(Integer id){
           return repoUsu.getById(id);
        }
        @Transactional(readOnly=true)
        public void deletaUsuPorId(Integer id){
            repoUsu.deleteById(id);
        }

}
