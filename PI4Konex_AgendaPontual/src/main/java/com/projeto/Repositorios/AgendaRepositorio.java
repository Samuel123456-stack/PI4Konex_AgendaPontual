package com.projeto.Repositorios;

import java.util.List;

import com.projeto.Entidades.Agenda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AgendaRepositorio extends JpaRepository<Agenda,Integer> {

    @Query(nativeQuery = true, value = "select a.idagen, a.fk_dia_agen, a.fk_hor_agen, a.fk_med_agen, a.fk_paci_agen, a.informacoesadic, m.nome as Medico, e.nome as Especialidade, a.dataagendada, h.horario from agenda_medica as a join medico as m on a.fk_med_agen=m.idmed join especialidade as e on m.fk_esp_med=e.idesp join horario as h on a.fk_hor_agen=h.idhor where a.fk_paci_agen = ?1")
    List<Agenda> consultaAgendamentos(Integer idPaci);
    

    @Query(nativeQuery = true,  value = "select a.idagen, a.fk_dia_agen, a.fk_hor_agen, a.fk_med_agen, a.fk_paci_agen, m.nome as Medico, e.nome as Especialidade, a.dataagendada, a.informacoesadic from agenda_medica as a join paciente as p on a.fk_paci_agen=p.idpaci join medico as m on a.fk_med_agen=m.idmed join horario as h on a.fk_hor_agen=h.idhor join especialidade as e on m.fk_esp_med=e.idesp join clinica as cli on m.fk_cli_med = cli.idcli where idmed = ?1 and idcli = ?2")
    List<Agenda> listagemPainel(Integer idMed, Integer idCli); 

    @Query(nativeQuery = true, value="select h.idhor from horario as h where h.idhor = ?1")
    Integer verificaIdHora(String horario);

    @Query(nativeQuery = true, value = "select a.idagen, a.fk_dia_agen, a.fk_hor_agen, a.fk_med_agen, a.fk_paci_agen, m.nome as Medico, e.nome as Especialidade, a.dataagendada, a.informacoesadic from agenda_medica as a join medico as m on a.fk_med_agen=m.idmed join especialidade as e on m.fk_esp_med=e.idesp join horario as h on a.fk_hor_agen=h.idhor join paciente as p on a.fk_paci_agen=p.idpaci where p.cpf = ?1 and idagen = ?2")
    List<Agenda> listaCancela(String cpf, Integer idAgen);

    @Query(nativeQuery = true, value = "select a.idagen, a.fk_dia_agen, a.fk_hor_agen, a.fk_med_agen,a.fk_paci_agen,a.dataagendada, a.informacoesadic, m.valor, e.logradouro, e.numero, e.complemento, e.cep  from agenda_medica as a join medico as m on a.fk_med_agen=m.idmed join clinica as c on m.fk_cli_med=c.idcli join endereco as e on c.fk_end_cli= e.idend where idagen = ?1 ")
    List<Agenda> listaResumo(Integer idAgen);
}
