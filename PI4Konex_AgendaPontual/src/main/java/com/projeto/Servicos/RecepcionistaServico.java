package com.projeto.Servicos;

import java.util.List;

import com.projeto.Entidades.Recepcionista;
import com.projeto.Repositorios.RecepcionistaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecepcionistaServico {

    @Autowired
    private RecepcionistaRepositorio repo;

    //Metodos do Crud
    public List<Recepcionista> listarTodos(){
        return repo.findAll();
    }

    public void criaEAtualiza(Recepcionista recep){
        repo.save(recep);
    }

    public Recepcionista pegaRecepPorId(Integer id){
       return repo.getById(id);
    }

    public void deletaRecepPorId(Integer id){
        repo.deleteById(id);
    }
    
}
