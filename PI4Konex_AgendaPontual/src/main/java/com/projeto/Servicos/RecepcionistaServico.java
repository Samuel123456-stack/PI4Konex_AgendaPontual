package com.projeto.Servicos;

import java.util.List;

import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Recepcionista;
import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.EnderecoRepositorio;
import com.projeto.Repositorios.PacienteRepositorio;
import com.projeto.Repositorios.UsuarioRepositorio;
import com.projeto.Repositorios.RecepcionistaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecepcionistaServico {

    @Autowired
    private RecepcionistaRepositorio repoRecep;
    @Autowired
    private PacienteRepositorio repoPaci;
    @Autowired
    private UsuarioRepositorio repoUsu;
    @Autowired
    private EnderecoRepositorio repoEnd;

    //Metodos do Crud
    public List<Recepcionista> listarTodosRecep(){
        return repoRecep.findAll();
    }

    public void criaEAtualizaRecep(Recepcionista recep){
        repoRecep.save(recep);
    }

    public Recepcionista pegaRecepPorId(Integer id){
       return repoRecep.getById(id);
    }

    public void deletaRecepPorId(Integer id){
        repoRecep.deleteById(id);
    }

    //Metodos do CRUD Paciente
    public List<Paciente> listarTodosPaci(){
        return repoPaci.findAll();
    }

    public void criaPaci(Paciente paci){
        repoPaci.save(paci);
    }

    public Paciente pegaPaciPorId(Integer id){
       return repoPaci.getById(id);
    }

    public void deletaPaciPorId(Integer id){
        repoPaci.deleteById(id);
    }

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

    //Metodos do CRUD Endereco
    public List<Endereco> listarTodosEnd(){
        return repoEnd.findAll();
    }

    public void criaEnd(Endereco end){
        repoEnd.save(end);
    }

    public Endereco pegaEndPorId(Integer id){
       return repoEnd.getById(id);
    }

    public void deletaEndPorId(Integer id){
        repoEnd.deleteById(id);
    }


    
}
