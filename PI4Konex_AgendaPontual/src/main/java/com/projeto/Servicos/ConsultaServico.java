package com.projeto.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.projeto.Entidades.Consulta;
import com.projeto.Repositorios.AgendaRepositorio;
import com.projeto.Repositorios.ConsultaRepositorio;

@Service
public class ConsultaServico {
	
	@Autowired
	private ConsultaRepositorio conRepo;
	@Autowired
	private AgendaRepositorio agenRepo;
	
	public void cadastro(Consulta obj) {		
		conRepo.save(obj);
	}
	
	@Transactional(readOnly = true)
	public Consulta buscaConsultaPorId(Integer id) {
		return conRepo.findByIdConsulta(id);
	}

	@Transactional(readOnly = false)
    public Consulta atualizaCons(Consulta cons){
        Integer idCons = cons.getIdConsulta();
        Consulta consulta = conRepo.findById(idCons).get();
        consulta.setDtAgendada(cons.getDtAgendada());
        consulta.setHora(cons.getHora());
        consulta.setInformaAdicio(cons.getInformaAdicio());
        return conRepo.save(consulta);
    }

    @Transactional(readOnly = false)
    public void cancelaConsulta(String cpf, Integer idCons){
        conRepo.deleteById(idCons);
        agenRepo.deleteById(idCons);
    }

	@Transactional(readOnly = true)
    public List<Consulta> listaCons(Integer idPaci) {
        return conRepo.consultaAgendamentos(idPaci);
    }

    @Transactional(readOnly = true)
    public List<Consulta> listagemPainel(Integer idCli) {
        return conRepo.listagemPainel(idCli);
    }

    @Transactional(readOnly = true)
    public List<Consulta> listaCancelaCons(String cpf, Integer idAgen){
        return conRepo.listaCancela(cpf, idAgen);
    }

	@Transactional(readOnly = true)
    public List<Consulta> listaPosConfirma(Integer idAgen){
        return conRepo.listaResumo(idAgen);
    }
	
	@Transactional(readOnly = true)
	public List<Consulta> pesquisaConsultaSemFeed(Integer paciente){
		return conRepo.pesquisaConsultaPorPaciente(paciente);
	}
}
