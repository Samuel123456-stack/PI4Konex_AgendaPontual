package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Recepcionista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcionistaRepositorio extends JpaRepository<Recepcionista, Integer> {

    @Query(nativeQuery = true,  value = "select p.nome as Paciente,e.nome as Especialidade, m.nome as Medico, m.sala, a.data_agendada, h.horario from agenda_medica as a join paciente as p on a.fk_paci_agen=p.id_paci join medico as m on a.fk_med_agen=m.id_med join horario as h on a.fk_hor_agen=h.id_hor join especialidade as e on m.fk_esp_med=e.id_esp")
    List<String> listagemPainel(); 

  
}
