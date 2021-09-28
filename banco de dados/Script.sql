create database agendapontual;

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
    forma_pagamento varchar(30) null
);

CREATE TABLE plano (
    id_plan Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    valor Double null,
    qte_recepcionista integer null,
    qte_medico Integer null,
    detalhes varchar(50) null,
    tolerancia Integer null,
    fk_pagamento Integer null,
    FOREIGN KEY (fk_pagamento) REFERENCES pagamento (id_pag)
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
    fk_plano Integer null,
    fk_endereco Integer null,
    FOREIGN KEY (fk_plano) REFERENCES plano (id_plan),
    FOREIGN KEY (fk_endereco) REFERENCES endereco (id_end)
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
    sobre_mim varchar(50) not null,
    fk_clinica Integer null,
    fk_endereco Integer null,
    FOREIGN KEY (fk_clinica) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_endereco) REFERENCES endereco (id_end)
);

CREATE TABLE convenio (
    id_conv Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    valorconvenio decimal(5,2) null
);

CREATE TABLE convenio_medico (
    fk_medico Integer null,
    fk_convenio Integer null,
    FOREIGN KEY (fk_medico) REFERENCES medico (id_med),
    FOREIGN KEY (fk_convenio) REFERENCES convenio (id_conv)
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
    fk_triagem Integer null,
    fk_endereco Integer null,
    FOREIGN KEY (fk_triagem) REFERENCES triagem (id_tria),
    FOREIGN KEY (fk_endereco) REFERENCES endereco (id_end)
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
    fk_medico Integer null,
    FOREIGN KEY (fk_medico) REFERENCES medico (id_med)
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
    fk_dias_semana integer null,
    fk_horario Integer null,
    fk_medico Integer null,
    data_agendada date null,
    fk_paciente Integer null,
    FOREIGN KEY (fk_dias_semana) REFERENCES dias_semana (id_dia),
    FOREIGN KEY (fk_horario) REFERENCES horario (id_hor),
    FOREIGN KEY (fk_medico) REFERENCES medico (id_med),
    FOREIGN KEY (fk_paciente) REFERENCES paciente (id_paci)
);

CREATE TABLE recepcionista (
    id_recep Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30) null,
    sexo varchar(1)null,
    data_nascimento Date null,
    cpf varchar(11) null,
    email varchar(30) null,
    senha varchar(8) null,
    fk_clinica Integer null,
    fk_endereco Integer null,
    FOREIGN KEY (fk_clinica) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_endereco) REFERENCES endereco (id_end)
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
	hora Time null,
	confirmada Boolean null,
	retorno Boolean null,
	hora_chegada Time null,
	hora_saida Time null,
	duracao Time null,
	concluida Boolean null,
	fk_medico Integer null,
    fk_paciente Integer null,
    fk_receita Integer null,
    fk_feedback Integer null,
    fk_notificacao Integer null,
    fk_pagamento Integer null,
    FOREIGN KEY (fk_medico) REFERENCES medico (id_med),
    FOREIGN KEY (fk_paciente) REFERENCES paciente (id_paci),
    FOREIGN KEY (fk_receita) REFERENCES receita (id_rece),
    FOREIGN KEY (fk_notificacao) REFERENCES notificacao (id_notif),
    FOREIGN KEY (fk_pagamento) REFERENCES pagamento (id_pag),
    FOREIGN KEY (fk_feedback) REFERENCES feedback (id_feed)
);