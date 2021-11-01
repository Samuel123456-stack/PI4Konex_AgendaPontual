package com.projeto.Servicos;

import java.util.List;

import com.projeto.Entidades.Agenda;
import com.projeto.Repositorios.AgendaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AgendaServico {

    @Autowired
    private AgendaRepositorio repoAgen;

    // Metodos CRUD Agenda
    @Transactional(readOnly = true)
    public List<Agenda> listaConsAgenda(Integer idPaci) {
        return repoAgen.consultaAgendamentos(idPaci);
    }

    @Transactional(readOnly = true)
    public List<Agenda> listagemPainel(Integer idMed, Integer idCli) {
        return repoAgen.listagemPainel(idMed, idCli);
    }

    @Transactional(readOnly = true)
    public List<Agenda> listaCancelaAgen(String cpf, Integer idAgen){
        return repoAgen.listaCancela(cpf, idAgen);
    }

    @Transactional(readOnly = false)
    public void criaAtualizaAgen(Agenda agen) {
        repoAgen.save(agen);
    }

    @Transactional(readOnly = true)
    public Agenda pegaAgenPorId(Integer id) {
        return repoAgen.getById(id);
    }

    @Transactional(readOnly = false)
    public Agenda atualizaAgenda(Agenda agen){
        Integer idAgen = agen.getIdAgen();
        Agenda agenda = repoAgen.findById(idAgen).get();
        agenda.setDataAgendada(agen.getDataAgendada());
        //Integer idhorario = repoAgen.verificaIdHora(agenda.getIdHora().getHorario());
        agenda.setIdHora(agenda.getIdHora());
        agenda.setInfoAdicAgen(agen.getInfoAdicAgen());
        return repoAgen.save(agenda);
    }

    @Transactional(readOnly = false)
    public void cancelaAgenda(String cpf, Integer idAgen){
        repoAgen.deleteById(idAgen);
    }

}
