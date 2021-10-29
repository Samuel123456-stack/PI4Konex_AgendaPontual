package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Agenda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AgendaRepositorio extends JpaRepository<Agenda,Integer> {

    @Query(nativeQuery = true, value = "select a.idagen, a.fk_dia_agen, a.fk_hor_agen, a.fk_med_agen, a.fk_paci_agen, a.informacoesadic, m.nome as Medico, e.nome as Especialidade, a.dataagendada, h.horario from agenda_medica as a join medico as m on a.fk_med_agen=m.idmed join especialidade as e on m.fk_esp_med=e.idesp join horario as h on a.fk_hor_agen=h.idhor where a.fk_paci_agen = ?1")
    List<Agenda> consultaAgendamentos(Integer idPaci);
    
}
