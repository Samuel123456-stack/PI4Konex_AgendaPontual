package com.projeto.Servicos;

import java.util.List;

import com.projeto.Entidades.Agenda;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Clinica;
import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Recepcionista;
import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.AgendaRepositorio;
import com.projeto.Repositorios.CidadeRepositorio;
import com.projeto.Repositorios.ClinicaRepositorio;
import com.projeto.Repositorios.EnderecoRepositorio;
import com.projeto.Repositorios.MedicoRepositorio;
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
    @Autowired
    private AgendaRepositorio repoAgen;
    @Autowired
    private ClinicaRepositorio repoCli;
    @Autowired
    private CidadeRepositorio repoCid;
    @Autowired
    private MedicoRepositorio repoMed;

    //Metodos do Crud
    public void AtualizaRecep(Recepcionista recep){
        repoRecep.save(recep);
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

    //Metodos CRUD Agenda
    public void criaAtualizaAgen(Agenda agen){
        repoAgen.save(agen);
    }

    public Agenda pegaAgenPorId(Integer id){
        return repoAgen.getById(id);
    }

    public void deletaAgenPorId(Integer id){
        repoAgen.deleteById(id);
    }


    //Metodos CRUD Clinica 
    public Clinica pegaCliPorId(Integer id){
        return repoCli.getById(id);
     }
     
     public List<Clinica> listaCliCidade(Integer idCid){
         return repoCli.buscaCliOpCid(idCid);
     }

     public List<Clinica> listarTodosCli(){
        return repoCli.findAll();
    }
     
     //Metodos CRUD Cidade
     public List<Cidade> listarTodosCid(){
         return repoCid.findAll();
     }

     //Metodos CRUD Medico
     //Rever melhor Metodos com o ID
     public List<Medico> listarMedCli(Integer idMed){
         return repoMed.listaMedPorCli(idMed);
     }
     public List<Medico> listarTodosMed(){
        return repoMed.findAll();
    }

    
}
