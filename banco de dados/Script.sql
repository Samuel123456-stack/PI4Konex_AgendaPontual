create database agendapontual;

drop database agendapontual;

CREATE USER 'agendaPontual'@'localhost' IDENTIFIED BY 'Konex2021';
GRANT ALL PRIVILEGES ON agendapontual. * TO 'agendaPontual'@'localhost';
FLUSH PRIVILEGES;

USE agendapontual;

CREATE TABLE adm (
    id_adm Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    email varchar(30) null,
    senha varchar(8) null
);

CREATE TABLE endereco (
    id_end Integer AUTO_INCREMENT PRIMARY KEY,
    logradouro varchar(50) null,
    numero Integer  null,
    complemento varchar(30) null,
    bairro varchar(30)  null,
    estado varchar(30) null,
    cep varchar(30) null
);

CREATE TABLE feedback (
    id_feed Integer AUTO_INCREMENT PRIMARY KEY,
    avaliacao Integer null,
    comentario Integer null,
    para_medico Boolean null,
    para_consultorio Boolean null,
    anonimo Boolean null
);

CREATE TABLE receita (
    id_rece Integer AUTO_INCREMENT PRIMARY KEY,
    dataeHora Date null,
    informacoes varchar(50) null
);

CREATE TABLE pagamento (
    id_pag Integer AUTO_INCREMENT PRIMARY KEY,
    data_pgto Date null,
    forma_pagamento varchar(30) null,
    valor_pgto decimal(5,2)
);

CREATE TABLE plano (
    id_plan Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    valor Double null,
    qte_recepcionista integer null,
    qte_medico Integer null,
    detalhes varchar(50) null,
    tolerancia Integer null,
    fk_pag_plan Integer null,
    FOREIGN KEY (fk_pag_plan) REFERENCES pagamento (id_pag)
);


CREATE TABLE clinica (
    id_cli Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    cnpj varchar(18) unique not null,
    status_assina varchar(7) null,
    qte_assentos Integer null,
    licenca varchar(30) null,
    email varchar(30) null,
    senha varchar(8) null,
    fk_plan_cli Integer null,
    fk_end_cli Integer null,
    FOREIGN KEY (fk_plan_cli) REFERENCES plano (id_plan),
    FOREIGN KEY (fk_end_cli) REFERENCES endereco (id_end)
);

CREATE TABLE medico (
    id_med Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    data_nasci Date null,
    sexo varchar(1) null,
    cpf varchar(11) null,
    email varchar(30) null,
    senha varchar(8) null,
    especialidade varchar(30) null,
    crm varchar(9) null,
    fone varchar(11) null,
    valor decimal(5,2) null,
    data_formatura Date null,
    sobre_mim varchar(50) null,
    biografia text null,
    sala varchar(10) null,
    fk_cli_med Integer null,
    fk_end_med Integer null,
    FOREIGN KEY (fk_cli_med) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_end_med) REFERENCES endereco (id_end)
);

CREATE TABLE convenio (
    id_conv Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    valorconvenio decimal(5,2) null
);

CREATE TABLE convenio_medico (
    fk_med_conv Integer null,
    fk_conv_med Integer null,
    FOREIGN KEY (fk_med_conv) REFERENCES medico (id_med),
    FOREIGN KEY (fk_conv_med) REFERENCES convenio (id_conv)
);

CREATE TABLE triagem (
    id_tria Integer AUTO_INCREMENT PRIMARY KEY,
    primeira_consulta boolean null,
    comorbidade Integer null
);

CREATE TABLE Paciente (
    id_paci Integer AUTO_INCREMENT PRIMARY KEY,
    nome Varchar(50) null,
    cpf varchar(16) null,
    telefone varchar(15) null,
    convenio varchar(20) null,
    email varchar(30) null,
    senha varchar(8) null,
    fk_tri_paci Integer null,
    fk_end_paci Integer null,
    FOREIGN KEY (fk_tri_paci) REFERENCES triagem (id_tria),
    FOREIGN KEY (fk_end_paci) REFERENCES endereco (id_end)
);

CREATE TABLE dias_semana (
    id_dia integer AUTO_INCREMENT PRIMARY KEY,
    dia varchar(13) null
);

insert into dias_semana (dia) values
	('Domingo'),
    ('Segunda-feira'),
    ('Terça-feira'),
    ('Quarta-feira'),
    ('Quinta-feira'),
    ('Sexta-feira'),
    ('Sábado');


CREATE TABLE horario (
    id_hor Integer AUTO_INCREMENT PRIMARY KEY,
    horario Time null,
    fk_med_hor Integer null,
    FOREIGN KEY (fk_med_hor) REFERENCES medico (id_med)
);

INSERT INTO horario (horario) values
	('08:00'),('08:20'),
    ('08:40'),('09:00'),
    ('09:20'),('09:40'),
    ('10:00'),('10:20'),
    ('10:40'),('11:00'),
    ('11:20'),('11:40'),
    ('13:00'),('13:20'),
    ('13:40'),('14:00'),
    ('14:20'),('14:40'),
    ('15:00'),('15:20'),
    ('15:40'),('16:00'),
    ('16:20'),('16:40'),
    ('17:00'),('17:20'),
    ('17:40');

CREATE TABLE agenda_medica(
	id_agen integer AUTO_INCREMENT PRIMARY KEY,
    fk_dia_agen integer null,
    fk_hor_agen Integer null,
    fk_med_agen Integer null,
    data_agendada date null,
    fk_paci_agen Integer null,
    FOREIGN KEY (fk_dia_agen) REFERENCES dias_semana (id_dia),
    FOREIGN KEY (fk_hor_agen) REFERENCES horario (id_hor),
    FOREIGN KEY (fk_med_agen) REFERENCES medico (id_med),
    FOREIGN KEY (fk_paci_agen) REFERENCES paciente (id_paci)
);

CREATE TABLE recepcionista (
    id_recep Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    sexo varchar(1)null,
    data_nascimento Date null,
    cpf varchar(11) null,
    email varchar(30) null,
    senha varchar(8) null,
    fk_cli_rece Integer null,
    fk_end_rece Integer null,
    FOREIGN KEY (fk_cli_rece) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_end_rece) REFERENCES endereco (id_end)
);

CREATE TABLE notificacao (
    id_notif Integer AUTO_INCREMENT PRIMARY KEY,
    data_notificacao Date null,
    assunto varchar(20) null,
    motivo varchar(50) null
);

CREATE TABLE consulta (
	id_con Integer AUTO_INCREMENT PRIMARY KEY,
	data_consulta Date null,
	fk_hor_cons integer null,
	confirmada Boolean null,
	retorno Boolean null,
	hora_chegada Time null,
	hora_saida Time null,
	duracao Time null,
	concluida Boolean null,
    nao_compareceu Boolean null,
    cancelada Boolean null,
	fk_med_cons Integer null,
    fk_paci_cons Integer null,
    fk_rec_agen Integer null,
    fk_feed_cons Integer null,
    fk_not_agen Integer null,
    fk_pag_agen Integer null,
    FOREIGN KEY (fk_med_cons) REFERENCES medico (id_med),
    FOREIGN KEY (fk_paci_cons) REFERENCES paciente (id_paci),
    FOREIGN KEY (fk_rec_agen) REFERENCES receita (id_rece),
    FOREIGN KEY (fk_not_agen) REFERENCES notificacao (id_notif),
    FOREIGN KEY (fk_pag_agen) REFERENCES pagamento (id_pag),
    FOREIGN KEY (fk_feed_cons) REFERENCES feedback (id_feed),
    FOREIGN KEY (fk_hor_cons) REFERENCES horario (id_hor)
);

/* Triggers*/

delimiter $$
create trigger tr_consulta after update on agenda_medica for each row
begin
insert into consulta (data_consulta,fk_hor_cons,fk_med_cons,fk_paci_cons) values (new.data_agendada,old.fk_hor_agen,old.fk_med_agen,new.fk_paci_agen);
end $$


/*Viewers*/
create or replace view vw_cont_atend_concl
as
select nome as 'Médico', crm as 'CRM', count(concluida) as 'Qte.Atendido(s)' from consulta
inner join medico
on fk_med_cons = id_med
where concluida = true;

create or replace view vw_agenda_medica
as
select data_agendada as 'Data agendamento', dia as Dia, horario as 'Horário', m.nome as 'Dr(a)', p.nome as 'Paciente' from agenda_medica
	inner join dias_semana
	on fk_dia_agen = id_dia
	inner join horario
	on fk_hor_agen = id_hor
	inner join paciente p
	on fk_paci_agen = id_paci
	inner join medico m 
    on fk_med_agen = id_med; 
    
create view vw_med_pesq
as
SELECT nome as 'Médico', sobre_mim, TIMESTAMPDIFF(YEAR, data_formatura, CURDATE()) as 'Experiência', sexo, especialidade, valor
FROM medico