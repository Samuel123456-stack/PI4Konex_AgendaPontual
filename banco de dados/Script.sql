CREATE USER 'agendaPontual'@'localhost' IDENTIFIED BY 'Konex2021';
GRANT ALL PRIVILEGES ON agendapontual. * TO 'agendaPontual'@'localhost';
FLUSH PRIVILEGES;

create database agendapontual;

USE agendapontual;

CREATE TABLE endereco (
    id_end Integer AUTO_INCREMENT PRIMARY KEY,
    logradouro varchar(50) null,
    numero Integer  null,
    complemento varchar(30) null,
    bairro varchar(30)  null,
    cidade varchar(30)  null,
    estado varchar(2) null,
    cep varchar(30) null
);

insert into endereco(logradouro,numero,complemento,bairro, cidade,estado,cep) values
/*1*/	 ('Avenida Bem-te-vi',791,'Casa','Indianópolis','São Paulo','SP','04524-911'),
/*2*/    ('Rua Francisco Enes',434,'Casa','Balneário Mar Paulista','São Paulo','SP','04464-020'),
/*3*/    ('Rua Piratininga',909,'Casa','Brás','São Paulo','SP','03042-000'),
/*4*/    ('Rua da Consolação',2697,'Casa','Cerqueira César','São Paulo','SP','01416-900'),
/*5*/    ('Rua Manuel Correia Penteado',770,'Casa','Vila Seabra','São Paulo','SP','08180-140'),
/*6*/    ('Rua Domingos de Matos',850,'Casa','Jardim Íris','São Paulo','SP','05144-020'),
/*7*/    ('Rua Ângelo Pedroso',207,'Casa','Vila ABC','São Paulo','SP','08460-345'),
/*8*/    ('Avenida Euclides',860,'Casa','Vila Fachini','São Paulo','SP','04326-080'),
/*9*/    ('Rua Frei Durão',732,'Casa','Vila São José (Ipiranga)','São Paulo','SP','04274-000'),
/*10*/   ('Rua Igati',915,'Casa','Vila Anhangüera','São Paulo','SP','04673-040'),
/*11*/   ('Rua Professor Carlos Benjamin de Lyra',211,'Casa','Chácara São João','São Paulo','SP','05110-050'),
/*12*/   ('Rua Ana Ribeiro',645,'Casa','Vila Ester','São Paulo','SP','02536-010'),
/*13*/   ('Praça Nicola Antônio Camardo',685,'Casa','Vila Gomes Cardim','São Paulo','SP','03319-130'),
/*14*/   ('Rua Banco das Palmas',664,'Casa','Santana','São Paulo','SP','02016-020'),
/*15*/   ('Rua Amico Aspertini',382,'Casa','Vila Tiradentes','São Paulo','SP','05367-250'),
/*16*/   ('Rua Itapeva',500,'Casa','Bela Vista','São Paulo','SP','01332-903'),
/*17*/   ('Rua Maquerobi',744,'Casa','Saúde','São Paulo','SP','04053-030'),
/*18*/   ('Rua Piedade do Paraopeba',386,'Casa','Jardim Peri','São Paulo','SP','02679-010'),
/*19*/   ('Rua Mercado de Ferro',408,'Casa','Vila Aurea','São Paulo','SP','08411-210'),
/*20*/   ('Rua Doutor Tomás Carvalhal',300,'Casa','Paraíso','São Paulo','SP','04006-000');

CREATE TABLE feedback (
    id_feed Integer AUTO_INCREMENT PRIMARY KEY,
    dt_criacao datetime default current_timestamp(),
    avaliacao Integer null,
    comentario varchar(150) null,
    para_medico Boolean null,
    para_consultorio Boolean null,
    anonimo Boolean null
);
select * from feedback;
insert into feedback(avaliacao,comentario,para_medico,para_consultorio,anonimo)values
	(10,'Um excelente médico é muito atencioso me recomendou alguns medicamentos e fiquei melhor já na primeira consulta.',1,0,0),
    (10,'Algum tempo atrás perdi o contato com o Dr.Wilson, agenda pontual me ajudou encontrá-lo Dr Wilson é muito sorridente e atencioso.',1,0,0),
    (10,'Conheço o Dr.Willians desde pequena ele é o médico da família, sempre foi calmo, gentil e principalmente empático.',1,0,0),
    (10,'Me surpreendi com a Agenda.ual as opiniões que li foram verdadeiras, o Dr.Wilson é digno de estar em primeiro! Excelente médico.',1,0,0),
    (10,'Minha tireoide estava muita inchada, contei o meu problema para o Sr.Wilson, fiz alguns exames e iniciei o tratamento e hoje já me sinto bem agora!',1,0,0),
    (10,'Alguns meses atrás descobri que estava com hipotireodismo, o Dr.Wilson me ajudou com alguns tratamentos  e me sinto bem agora!',1,0,0),
    (10,'Alguns meses atrás sofri um acidente e fui atendido pelo Dr. Wilson, ele foi calmo e tomou decisões boas e já estou bem recuperado.',1,0,0),
    (10,'Eu descobri que tinha asma aos 12 anos de idade, minha família me levou até o Dr. Wilson, no qual faço acompanhamentos até hoje.',1,0,0),
    (10,'O Dr.Wilson sabe o que faz, é um médico cheio de experiência, conseguiu reduzir a minha tireoide sem fazer cirurgia.',1,0,0);

CREATE TABLE usuario (
    id_usu Integer AUTO_INCREMENT PRIMARY KEY,
    email varchar(50) null,
    email_confirma varchar(50) null,
    senha varchar(8) null,      
    senha_confirma varchar(8) null,
    perfil varchar(13) null
);

insert into usuario(email,email_confirma,senha,senha_confirma,perfil) values
/*1*/	('clinicahelpme@clinicahelpme.com','clinicahelpme@clinicahelpme.com','123456','123456','clinica'),
/*2*/   ('clinicasaude1lugar@clinicasaude1lugar.com','clinicasaude1lugar@clinicasaude1lugar.com','123456','123456','clinica'),
/*3*/   ('ricardo.davies@medico.com','ricardo.davies@medico.com','123456','123456','médico'),
/*4*/   ('marta.perez@medico.com','marta.perez@medico.com','123456','123456','médico'),
/*5*/   ('andreia.medeiros@medico.com','andreia.medeiros@medico.com','123456','123456','médico'), 
/*6*/   ('sophia.iaf@medico.com','sophia.iaf@medico.com','123456','123456','médico'),
/*7*/   ('wilson.santos@medico.com','wilson.santos@medico.com','123456','123456','médico'),
/*8*/	('Isaac.batista@medico.com','Isaac.batista@medico.com','123456','123456','médico'),
/*9*/	('elisa.sabrina@uol.com.br','elisa.sabrina@uol.com.br','123456','123456','paciente'),
/*10*/	('osvaldo.nogueira@outlook.com','osvaldo.nogueira@outlook.com','123456','123456','paciente'),
/*11*/	('victor.neves@ig.com.br','victor.neves@ig.com.br','123456','123456','paciente'),
/*12*/	('marina.rosa@hotmail.com','marina.rosa@hotmail.com','123456','123456','paciente'),
/*13*/	('luan.caldeira@globo.com','eluan.caldeira@globo.com','123456','123456','paciente'),
/*14*/	('ricardo.teixeira@hotmail.com','ricardo.teixeira@hotmail.com','123456','123456','paciente'),
/*15*/	('tatiane.cardoso@bol.com.br','tatiane.cardoso@bol.com.br','123456','123456','paciente'),
/*16*/	('rita.carvalho@gmail.com','rita.carvalho@gmail.com','123456','123456','paciente'),
/*17*/	('davi.rodrigues@msn.com','davi.rodrigues@msn.com','123456','123456','paciente'),
/*18*/	('sara.araujo@gmail.com','sara.araujo@gmail.com','123456','123456','paciente'),
/*19*/	('raimunda.almada@outlook.com','raimunda.almada@outlook.com','123456','123456','paciente'),
/*20*/	('fatima.freitas@yahoo.com','fatima.freitas@yahoo.com','123456','123456','paciente');

CREATE TABLE adm (
    id_adm Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    fk_usu_adm Integer null,
    FOREIGN KEY (fk_usu_adm) REFERENCES usuario (id_usu)
);

CREATE TABLE receita (
    id_rece Integer AUTO_INCREMENT PRIMARY KEY,
    data_criacao datetime DEFAULT current_timestamp(),
    informacoes text null
);

CREATE TABLE pagamento (
    id_pag Integer AUTO_INCREMENT PRIMARY KEY,
    dt_pgto timestamp default current_timestamp(),
    forma_pagamento varchar(30) null,
    valor decimal(6,2)
);

CREATE TABLE plano (
    id_plan Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    comentario varchar(100),
    valor decimal(6,2) null,
    qte_recep integer null,
    qte_medico Integer null,
    detalhes varchar(50) null,
    tolerancia Integer null,
    fk_pag_plan Integer null,
    FOREIGN KEY (fk_pag_plan) REFERENCES pagamento (id_pag)
);


insert into plano(nome,comentario,valor,qte_recep,qte_medico,detalhes,tolerancia) values
	('Peronal','Recomendado para médicos individuais e iniciantes na carreira.','99.99',
    1,1,'Todas funcionalidades inclusas',3),
	('Economy','Recomendado para pequenos consultórios, ou seja, de infraestrutura menor.','279.80',
    3,5,'Todas funcionalidades inclusas',5),
	('Premium','Para consultórios de médio porte, que tenham até 15 médicos','679.80',
    5,15,'Todas funcionalidades inclusas',7);

CREATE TABLE ajuda (
    id_aju Integer AUTO_INCREMENT PRIMARY KEY,
    dt_solic datetime default current_timestamp(),
    assunto varchar(20) null,
    mensagem text null
);

CREATE TABLE clinica (
    id_cli Integer AUTO_INCREMENT PRIMARY KEY,
    dt_criacao datetime default current_timestamp(),
    nome_cli varchar(50) null,
    nome_med_resp varchar(50) null,
    cnpj varchar(18) null,
    rg varchar (13) null,
    qte_assentos Integer null,
    fone varchar(14) null,
    fk_plan_cli Integer null,
    fk_end_cli Integer null,
    fk_usu_cli Integer null,
    FOREIGN KEY (fk_plan_cli) REFERENCES plano (id_plan),
    FOREIGN KEY (fk_end_cli) REFERENCES endereco (id_end),
    FOREIGN KEY (fk_usu_cli) REFERENCES usuario (id_usu)
);

insert into clinica (nome_cli,nome_med_resp,cnpj,rg,qte_assentos,fone,fk_plan_cli,fk_end_cli,fk_usu_cli)values
	('Clínica Help me', 'Tomás Breno da Silva','86.360.534/0001-44','34.110.465-6',10,'(11) 3695-5763',2,1,1),
	('Clínica Saúde 1 Lugar', 'Nelson Nicolas Otávio Almada','12.691.276/0001-42','38.131.813-8',8,'(11) 3920-1092',2,2,2);
    
CREATE TABLE especialidade (
    id_esp Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30)  null
); 

insert into especialidade(nome) values
/*1*/ ('Clinico(a) geral'),
/*2*/ ('Oftalmologia'),
/*3*/ ('Cardiologia'),
/*4*/ ('Dermatologia'),
/*5*/ ('Ginecologia'),
/*6*/ ('Ortopedia'),
/*7*/ ('Pediatra'),
/*8*/ ('Urologia'),
/*9*/('Gastroenterologia'),
/*10*/('Endocrinologia'),
/*11*/('Neurologia'),
/*12*/('Hematologia'),
/*13*/('Infectologia'),
/*14*/('Pneumologia'),
/*15*/('Hepatologista'); 


CREATE TABLE doenca (
    id_doe Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    fk_esp_doe Integer,
    FOREIGN KEY (fk_esp_doe)REFERENCES especialidade (id_esp)
);

insert into doenca(nome,fk_esp_doe) values
    ('Cirrose hepática',15),
    ('Diabetes mellitus',10),
    ('Doença cerebro vascular',11),
    ('Doença neurológicas',11),
    ('Hemoglobinopatias graves',12),
    ('Hipertensão',3),
    ('Imunossuprimidos',13),
    ('Insuficiência cardíaca',3),
    ('Hemoglobinopatias graves',12),
    ('Hipertensão',3),
    ('Obesidade mórbida',10),
    ('Pneumopatias crônicas graves',14),
    ('Síndrome de Down',11),
    ('Síndromes coronarianas',3),
	('Dores de cabeça',1),
    ('Náuseas',1),
    ('Febre',1),
    ('Dor no olho',2),
    ('Dificuldade de visão',2),
    ('Conjuntivite',2);

CREATE TABLE medico (
    id_med Integer AUTO_INCREMENT PRIMARY KEY,
    dt_criacao timestamp default current_timestamp(),
    foto blob null,
    nome varchar(50) null,
    data_nasci Date null,
    sexo varchar(9) null,
    cpf varchar(14) null,
    rg varchar (13) null,
    crm varchar(9) null,
    celular varchar(15) null,
    valor decimal(5,2) null,
    data_formatura Date null,
    sobre_mim varchar(100) null,
    biografia text null,
    sala varchar(4) null,
    fk_cli_med Integer null,
    fk_end_med Integer null,
    fk_usu_med Integer null,
    fk_esp_med Integer null,
    FOREIGN KEY (fk_cli_med) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_end_med) REFERENCES endereco (id_end),
    FOREIGN KEY (fk_usu_med) REFERENCES usuario (id_usu),
    FOREIGN KEY (fk_esp_med) REFERENCES especialidade (id_esp)
);

insert into medico(nome,data_nasci,sexo,cpf,rg,crm,celular,valor,data_formatura,sobre_mim,biografia,sala,fk_cli_med,fk_end_med,fk_usu_med,fk_esp_med) values
	('Sophia Isabel Ayla Farias','1949-02-19','Feminino','554.955.177-25','46.681.022-2','1234','(11) 98661-0781','150.00',
    '1969-02-19','Uma pessoa super simpática, atenciosa, e super eficaz.', 'Profissional de vasta experiência e referência na área','1',1,3,6,1),  
    ('Wilson Santos','1975-08-12','Masculino','362.830.798-81','21.207.729-6','171428','(11) 98657-0621','150.00',
    '1995-05-21','Uma pessoa super simpática, atenciosa, e super eficaz.', 'Profissional de vasta experiência e referência na área','2',1,4,7,1),
    ('Ricardo Davies','1999-02-22','Masculino','113.638.718-89','22.147.686-6','44855','(11) 99927-4317','150.00',
    '2000-04-24','Uma pessoa super simpática, atenciosa, e super eficaz.', 'Profissional de vasta experiência e referência na área','3',1,5,3,10),
    ('Marta Perez','1972-03-19','Feminino','982.656.338-23','41.879.754-7','44855','(11) 98487-7992','150.00',
    '1992-04-19','Uma pessoa super simpática, atenciosa, e super eficaz.', 'Profissional de vasta experiência e referência na área','1',2,6,4,1),
    ('Andreia Medeiros','1978-06-03','Feminino','339.497.718-40','34.110.465-6','28894','(11) 99346-1802','150.00',
    '1990-12-19','Uma pessoa super simpática, atenciosa, e super eficaz.', 'Profissional de vasta experiência e referência na área','2',2,7,5,5),
    ('Isaac Otávio Baptista','1965-07-01','Masculino','621.326.558-98','18.860.455-8','28964','(11) 99427-7829','150.00',
    '1988-12-01','Uma pessoa super simpática, atenciosa, e super eficaz.', 'Profissional de vasta experiência e referência na área','3',2,8,8,10);

CREATE TABLE convenio (
    id_conv Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    valor decimal(5,2) null
);

insert into convenio(nome,valor) values
	('Particular','150.00'),
    ('Amil','20.00'),
    ('Sul América', '15.50'), 
    ('Unimed', '16.98'),
    ('Notre Dame Intermédica', '18.50'),
    ('Porto seguro saúde', '19.00'),
    ('Bradesco', '21.00');
    
CREATE TABLE convenio_medico (
    fk_med_conv Integer null,
    fk_conv_med Integer null,
    FOREIGN KEY (fk_med_conv) REFERENCES medico (id_med),
    FOREIGN KEY (fk_conv_med) REFERENCES convenio (id_conv)
);

CREATE TABLE paciente (
    id_paci Integer AUTO_INCREMENT PRIMARY KEY,
    dt_criacao datetime default current_timestamp(),
    foto blob null,
    nome varchar(50) null,
    cpf varchar(14) null,
    data_nasci Date null,
    rg varchar (13) null,
    celular varchar(15) null,
    sexo varchar(9) null,
    primeira_consulta boolean,
    sintomas_gripe boolean,
    fk_conv_paci Integer null,
    fk_end_paci Integer null,
    fk_usu_paci Integer null,
    FOREIGN KEY (fk_end_paci) REFERENCES endereco (id_end),
    FOREIGN KEY (fk_usu_paci) REFERENCES usuario (id_usu),
    FOREIGN KEY (fk_conv_paci) REFERENCES convenio (id_conv)
);

insert into paciente(nome,cpf,data_nasci,rg,celular,sexo,primeira_consulta,sintomas_gripe,fk_conv_paci,fk_end_paci,fk_usu_paci)values
	('Elisa Lara Sabrina Fernandes','570.840.078-14','1964-02-27','32.266.700-8','(11) 98818-3740','Feminino',1,0,2,9,9),
    ('Osvaldo Erick Calebe Nogueira','251.166.328-73','1974-09-19','43.877.631-8','(11) 98845-2508','Masculino',1,0,2,10,10),
    ('Victor Matheus das Neves','096.480.838-27','1979-10-06','20.901.924-4','(11) 99579-5031','Masculino',1,0,1,11,11),
    ('Marina Julia da Rosa','725.569.828-02','1954-10-02','13.411.804-2','(11) 98978-6567','Feminino',1,0,1,12,12),
    ('Luan Yago Renato Caldeira','192.394.768-06','1972-02-21','14.940.867-5','(11) 99620-3117','Masculino',1,0,3,13,13),
    ('Ricardo Davi Caio Teixeira','347.852.818-63','1962-03-13','32.402.071-5','(11) 98639-6054','Masculino',1,0,3,14,14),
    ('Tatiane Rebeca Jaqueline Cardoso','813.008.548-80','1988-08-12','40.456.015-5','(11) 98279-6383','Feminino',1,0,4,15,15),
    ('Rita Ayla Carvalho','162.581.058-07','1980-01-25','33.511.994-3','(11) 99970-2497','Feminino',1,0,4,16,16),
    ('Davi Danilo Bryan Rodrigues','511.249.128-00','2000-09-20','35.500.550-5','(11) 99371-7482','Masculino',1,0,5,17,17),
    ('Sara Alana Débora Araújo','189.159.978-08','1990-03-15','42.238.660-1','(11) 98274-6578','Feminino',1,0,5,18,18);

 CREATE TABLE triagem (
    dt_criacao datetime default current_timestamp(),
    fk_doe_paci Integer null,
    fk_paci_doe Integer null,
    FOREIGN KEY (fk_doe_paci) REFERENCES doenca (id_doe)
    ON DELETE CASCADE,
    FOREIGN KEY (fk_paci_doe) REFERENCES paciente (id_paci)
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
    ON DELETE CASCADE
);

insert into horario(horario)values
	('08:00'),('08:30'),
    ('09:00'),('09:30'),
    ('10:00'),('10:30'),
    ('11:00'),('11:30'),
    ('13:00'),('13:30'),
    ('14:00'),('14:30'),
    ('15:00'),('15:30'),
    ('16:00'),('16:30'),
    ('17:00'),('17:30');

CREATE TABLE agenda_medica(
	id_agen integer AUTO_INCREMENT PRIMARY KEY,
    data_agendada date null,
    fk_dia_agen integer null,
    fk_hor_agen Integer null,
    fk_med_agen Integer null,
	fk_paci_agen Integer null,
	informacoes_adic text null,
    FOREIGN KEY (fk_dia_agen) REFERENCES dias_semana (id_dia),
    FOREIGN KEY (fk_hor_agen) REFERENCES horario (id_hor),
    FOREIGN KEY (fk_med_agen) REFERENCES medico (id_med),
    FOREIGN KEY (fk_paci_agen) REFERENCES paciente (id_paci),
    unique (data_agendada, fk_dia_agen,fk_hor_agen,fk_med_agen)
);

insert into agenda_medica(fk_dia_agen,fk_hor_agen,fk_med_agen,data_agendada,fk_paci_agen)values
	(2,1,2,'2021-03-05',1),
	(3,2,2,'2021-05-05',2),
    (4,1,2,'2021-07-08',3),
    (6,1,2,'2021-03-07',4),
    (5,1,2,'2021-03-10',5),
    (4,1,2,'2021-03-20',5),
    (2,1,2,'2021-02-26',4),
    (3,1,2,'2021-04-28',3),
    (2,1,2,'2021-06-10',1);

CREATE TABLE recepcionista (
    id_recep Integer AUTO_INCREMENT PRIMARY KEY,
    foto blob null,
    nome varchar(30) null,
    cpf varchar(14) null, 
    sexo varchar(9)null,                        
    data_nasci Date null, 
    celular varchar(15) null,
    fk_cli_recep Integer null,
    fk_usu_recep Integer null,
    FOREIGN KEY (fk_cli_recep) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_usu_recep) REFERENCES usuario (id_usu)
);

insert into recepcionista(nome,cpf,sexo,data_nasci,celular,fk_cli_recep,fk_usu_recep)values
	('Raimunda Sophia Clara Almada','405.724.908-79','Feminino','1996-10-10','(11) 98822-8252',1,19),
    ('Fátima Catarina Freitas','860.620.058-18','Feminino','1998-11-13','(11) 98125-8675',2,20);

CREATE TABLE ajuda_paci (
	dt_criacao datetime default current_timestamp(),
    fk_paci_aju Integer,
    fk_aju_paci Integer,
    fk_adm_aju_paci integer,
    status_soli varchar(12) null,   
    desc_solucao varchar(100) null,
	FOREIGN KEY (fk_aju_paci) REFERENCES ajuda (id_aju),
    FOREIGN KEY (fk_paci_aju) REFERENCES paciente (id_paci),
    FOREIGN KEY (fk_adm_aju_paci) REFERENCES adm (id_adm)
);

CREATE TABLE ajuda_recep (
    dt_criacao datetime default current_timestamp(),
    fk_recep_aju Integer,
    fk_aju_recep Integer,
	fk_adm_aju_recep integer,
    status_soli varchar(12) null,             
    desc_solucao varchar(100) null,
	FOREIGN KEY (fk_recep_aju) REFERENCES recepcionista (id_recep),
    FOREIGN KEY (fk_aju_recep) REFERENCES ajuda (id_aju),
    FOREIGN KEY (fk_adm_aju_recep) REFERENCES adm (id_adm)
);

CREATE TABLE ajuda_med (
	dt_criacao datetime default current_timestamp(),
    fk_med_aju Integer,
    fk_aju_med Integer,
	fk_adm_ajud_med integer,
    status_soli varchar(12) null,
    desc_solucao varchar(100) null,
	FOREIGN KEY (fk_med_aju) REFERENCES medico (id_med),
    FOREIGN KEY (fk_aju_med) REFERENCES ajuda (id_aju),
    FOREIGN KEY (fk_adm_ajud_med) REFERENCES adm (id_adm)
);

CREATE TABLE ajuda_cli (
    dt_criacao datetime default current_timestamp(),
    fk_cli_aju Integer,
    fk_aju_cli Integer,
	fk_adm_ajud_cli integer,
    status_soli varchar(12) null,
    desc_solucao varchar(100) null,
	FOREIGN KEY (fk_cli_aju) REFERENCES clinica (id_cli),
    FOREIGN KEY (fk_aju_cli) REFERENCES ajuda (id_aju),
    FOREIGN KEY (fk_adm_ajud_cli) REFERENCES adm (id_adm)
);

CREATE TABLE notificacao (
    id_notif Integer AUTO_INCREMENT PRIMARY KEY,
    data_notificacao datetime default current_timestamp(),
    assunto varchar(20) null,
    mensagem varchar(100) null,
    resposta varchar(100) null
); 

CREATE TABLE consulta (
	id_cons Integer AUTO_INCREMENT PRIMARY KEY,
	fk_agen_cons Integer null,
    confirmada Boolean null,
	retorno Boolean null,
	hora_chegada Time null,
	hora_saida Time null,
	duracao Time null,
	concluida Boolean null,
    nao_compareceu Boolean null,
    cancelada Boolean null,
    fk_rec_cons Integer null,
    fk_not_cons Integer null,
    fk_pag_cons Integer null,
    fk_feed_cons Integer null,
    FOREIGN KEY (fk_agen_cons) REFERENCES agenda_medica (id_agen),
    FOREIGN KEY (fk_rec_cons) REFERENCES receita (id_rece),
    FOREIGN KEY (fk_not_cons) REFERENCES notificacao (id_notif),
    FOREIGN KEY (fk_pag_cons) REFERENCES pagamento (id_pag),
    FOREIGN KEY (fk_feed_cons) REFERENCES feedback (id_feed)
);

insert into consulta(fk_agen_cons,retorno,hora_chegada,hora_saida,concluida,duracao,nao_compareceu,cancelada,fk_feed_cons)values
	(1,0,'08:00','08:15',1,'00:15',0,0,1),
    (2,0,'08:00','08:20',1,'00:20',0,0,2),
    (3,0,'08:00','08:15',1,'00:15',0,0,3),
    (4,0,'08:00','08:15',1,'00:15',0,0,4),
    (5,0,'08:00','08:15',1,'00:15',0,0,5),
    (6,1,'08:00','08:15',1,'00:15',0,0,6),
    (7,0,'08:00','08:15',1,'00:15',0,0,7),
    (8,0,'08:00','08:15',1,'00:15',0,0,8),
    (9,0,'08:00','08:15',1,'00:15',0,0,9);

CREATE TABLE historico (
    id_his Integer AUTO_INCREMENT PRIMARY KEY,
    dt_criacao datetime default current_timestamp(),
    historico text null,
    fk_cons_his Integer null,
    foreign key (fk_cons_his) references consulta (id_cons)
); 
insert into historico(historico) values
	('O paciente alegou muitas dores de cabeça.');

CREATE TABLE exame (
	id_exa Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
	cod_amb_92 varchar(10),
    tuss integer    
);

insert into exame(nome, cod_amb_92, tuss) values
	('Ácido fólico', '28.010.060', 40301087),
    ('Ácido úrico', '28.010.175', 40301150),
    ('Alfa Fetoproteína', '28.010.213', 40316068),
    ('Alfa 1 glicoproteína ácida(AGP)', '28.010.230', 40301257),
    ('Amilase', '28.010.256', 40301281),
    ('Bilirrubina total e frações', '28.010.329', 40301397),
    ('Cálcio', '28.010.337', 40301400),
    ('Cálcio iônico', '28.010.353', 40301419);

CREATE TABLE exame_consulta (
    fk_exame_cons Integer null,
    fk_cons_exame Integer null,
    FOREIGN KEY (fk_exame_cons) REFERENCES exame (id_exa),
    FOREIGN KEY (fk_cons_exame) REFERENCES consulta (id_cons) 
);

/*Viewers*/

create view vw_cont_atend_concl
	as
	select nome as 'medico', crm as 'crm', count(concluida) as 'qte.atendido(s)' from consulta
	join agenda_medica
	on fk_agen_cons = id_agen
	join medico m
	on fk_med_agen = id_med;

create view vw_agenda_medica  as
	select data_agendada as 'data agendamento', dia as Dia, horario as 'horario', m.nome as 'dr_a', p.nome as 'paciente' from agenda_medica
	inner join dias_semana
	on fk_dia_agen = id_dia
	inner join horario
	on fk_hor_agen = id_hor
	inner join paciente p
	on fk_paci_agen = id_paci
	inner join medico m 
    on fk_med_agen = id_med; 
    
create view vw_feed_med_maior7 as
	select foto, comentario, nome  from consulta
	join feedback
	on fk_feed_cons = id_feed
	join agenda_medica
	on fk_agen_cons = id_agen
	join paciente
	on fk_paci_agen = id_paci
	where avaliacao >= 7;

create view vw_pesq_med	as
	select avg(avaliacao) as pontuacao, m.nome as medico, sobre_mim, TIMESTAMPDIFF(YEAR, data_formatura, CURDATE()) as experiencia, sexo, e.nome as especialidade, valor 
	from consulta
	inner join agenda_medica a
	on fk_agen_cons = id_agen
	inner join medico m
	on fk_med_agen = id_med
	inner join especialidade e
	on fk_esp_med = id_esp
	inner join endereco
	on fk_end_med = id_end
	inner join feedback f
	on fk_feed_cons = id_feed;
    
create view vw_feed_detalhes as
	select p.nome as paciente, m.nome as medico, avaliacao, comentario 
    from consulta
	inner join agenda_medica a
	on fk_agen_cons = id_agen
	inner join medico m
	on fk_med_agen = id_med
    join paciente p
    on fk_paci_agen = id_paci
	inner join especialidade e
	on fk_esp_med = id_esp
	inner join endereco
	on fk_end_med = id_end
	inner join feedback f
	on fk_feed_cons = id_feed;
 
create view vw_best_medicos as
	select m.nome, e.nome as especialidade, avg(avaliacao) as pontos from consulta
	join feedback
	on fk_feed_cons = id_feed
	join agenda_medica
	on fk_agen_cons = id_agen
	join medico m
	on fk_med_agen = id_med
    join especialidade e
    on fk_esp_med = id_esp;

create view vw_historico_agendamento as
	select p.nome, concat(data_agendada, '- ',horario) as data_horario, m.nome as medico, id_cons as consulta, e.nome as especialidade from consulta
	join agenda_medica
	on fk_agen_cons = id_agen
	join paciente p
	on fk_paci_agen = id_paci
	join medico m
	on fk_med_agen = id_med
	join especialidade e
	on fk_esp_med = id_esp
    join horario
    on fk_hor_agen = id_hor;
