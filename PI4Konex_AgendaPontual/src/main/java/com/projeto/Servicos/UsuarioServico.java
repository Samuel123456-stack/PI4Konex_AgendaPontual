package com.projeto.Servicos;

import java.util.List;

import javax.transaction.Transactional;

import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioServico {
    
    @Autowired
    private UsuarioRepositorio repoUsu;


        //Metodos do CRUD Usuario
        public List<Usuario> listarTodosUsu(){
            return repoUsu.findAll();
        }
    
        public void criaUsu(Usuario usu){
            repoUsu.save(usu);
        }
    
        public Usuario pegaUsuPorId(Integer id){
           return repoUsu.getById(id);
        }
    
        public void deletaUsuPorId(Integer id){
            repoUsu.deleteById(id);
        }

        //Metodo que atualiza o usuario;
        public Usuario atualizaUsu(Usuario usu){
            String emailAtualizado = usu.getEmail();
            String emailConfirmaAtualizado = emailAtualizado;
            String senhaAtualizado = usu.getSenha();
            String senhaConfirmaAtualizado = senhaAtualizado;
            Integer idUsu = usu.getIdUsu();
    
            usu.setEmail(emailAtualizado);
            usu.setConfirmaEmail(emailConfirmaAtualizado);
            usu.setSenha(senhaAtualizado);
            usu.setConfirmaSenha(senhaConfirmaAtualizado);
    
            repoUsu.atualizaUsuario(emailAtualizado, emailConfirmaAtualizado, senhaAtualizado, senhaConfirmaAtualizado,idUsu);
            return usu;
        }
}
