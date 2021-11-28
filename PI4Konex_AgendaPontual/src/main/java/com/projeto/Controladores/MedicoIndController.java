package com.projeto.Controladores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.Doenca;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Feedback;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.ProjecaoSalarial;
import com.projeto.Entidades.Recepcionista;
import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.FeedbackRepositorio2;
import com.projeto.Repositorios.MedicojpaRepository;
import com.projeto.Repositorios.ProjecaoRepositorio;
import com.projeto.Servicos.AjudaServico;
import com.projeto.Servicos.DoencaServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.FeedbackServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.PagamentoServico;
import com.projeto.Servicos.RecepcionistaServico;
import com.projeto.Servicos.UsuarioServico;

@Controller
@RequestMapping(value = "/medInd")
public class MedicoIndController {

    @Autowired
    EspecialidadeServico espServ;
    @Autowired
    AjudaServico ajuServ;
    @Autowired
    UsuarioServico usuServ;
    @Autowired
    MedicoServico medServ;
    @Autowired
    MedicojpaRepository medJpaRepo;
    @Autowired
    DoencaServico doeServ;
    @Autowired
    FeedbackServico feedServ;
    @Autowired
    RecepcionistaServico recepServ;
    @Autowired
    PagamentoServico pagServ;
    @Autowired
    ProjecaoRepositorio projRepo;
    @Autowired
    FeedbackRepositorio2 feedRepo;


    //Por hora serão metodos sem uma logica ou despachamento de tela
    @RequestMapping("/primeiroPassoMedInd")
    public String primeiroPasso(){

        return "/medInd/primPt1Med";
    }

    @RequestMapping("/segundoPassoMedInd")
    public String segundoPasso(Model model){
        Medico medInd = new Medico();
        List<Especialidade> listaEsp = espServ.findAll();
        model.addAttribute("medInd", medInd);
        model.addAttribute("listaEsp", listaEsp);


        return "/medInd/primPt2MedInd";
    }

    @RequestMapping("/cadPt1")
    public String cadPt1(@ModelAttribute("medInd") Medico medInd, Model model){

        return "/medInd/primPt2Med";
    }

    @RequestMapping("/terceiroPassoMedInd")
    public String terceiroPasso(Model model){
        return "/medInd/primPt2Med";
    }

    @RequestMapping("/cadPt2")
    public String cadPt2(@ModelAttribute("medInd")Medico medInd, Model model){
        
        return "/medInd/priMedClin";
    }

    @RequestMapping("/quartoPassoMedInd")
    public String quartoPasso(@ModelAttribute("medInd") Medico medInd,Model model){
    	ProjecaoSalarial projSal = new ProjecaoSalarial();
    	model.addAttribute("proj", projSal);

        return "/medInd/priMedClin";
    }
    
    @RequestMapping("/salvaProj")
    public String salvaProj(@ModelAttribute("medInd") Medico medInd,
    @ModelAttribute("proj")ProjecaoSalarial projSal, HttpServletRequest request, Model model) throws ParseException {
    	medInd.setIdMed(2);
        projSal.setMedico(medInd);
        //Atributos web
String time1 =  projSal.getHoraInicio().toString();
String time2 =  projSal.getHoraSaida().toString();
LocalTime horaInter = LocalTime.of(1, 0);
projSal.setHoraIntervalo(horaInter);
float meta = projSal.getMetaPaci();
float valorPorPaci = projSal.getValorPaci();
int qtdDiasTrab = projSal.getQtdDias();
String opSegure = request.getParameter("tempoSeguranca");

//atributos auxiliares
int qtdPaciDia = 0;
int minBase = 0;
float qtdPaciMes = 0f;
int intervalo = 60;

//calculando a diferença
SimpleDateFormat format = new SimpleDateFormat("HH:mm");
Date date1 = format.parse(time1);
Date date2 = format.parse(time2);
long difference = date2.getTime() - date1.getTime();

//horario Base do calculo qtd de minutros trabalhos
long diffMinutos = difference / (60 * 1000);
minBase = (int) diffMinutos; 

//Base menos o intervalo
minBase = minBase - intervalo;

//Verifica se ele deseja tempo de segunraça 
if("Sim".equalsIgnoreCase(opSegure)){
	minBase = minBase - 20;		
}

//Calcular a qtd de paciente que ele deve atender no mes 
qtdPaciMes = meta/valorPorPaci;
qtdPaciMes = Math.round(qtdPaciMes);

//Calcula a qtd de paciente no dia
qtdPaciDia = 30/qtdDiasTrab; 
qtdPaciDia  = Math.round(qtdPaciDia);

//Gerar a duração da consulta
//dividir o minBase pela qtdPaciente do dia
int durationMin = (minBase/qtdPaciDia) -5;
//qtdPaciDia  = Math.round(durationMin);
//Consulta 190. sendo que era 119
//int totalCons = Math.round(qtdPaciMes);
//setar os valores
projSal.setTempoDuracao(durationMin);
projSal.setQtdPaciDias(qtdPaciDia);
projSal.setTotalConsulta(qtdPaciMes);

//salvar no banco
System.out.println("PROJ:"+ qtdPaciDia);
System.out.println("PROJ:"+qtdPaciMes);
System.out.println("PROJ:"+ time1);
System.out.println("PROJ:"+ minBase);
System.out.println("PROJ:"+ durationMin);
model.addAttribute("proj", projSal);
    	projRepo.save(projSal);
    	return "/medInd/priMedClin";
    }

    @RequestMapping("/projSalarialMedInd")
    public String projSalarialMedInd(@ModelAttribute("projSal")ProjecaoSalarial projSal, Model model){
        
        
        return "";
    }


    @RequestMapping("/painelMedInd")
    public String painelMedInd(Model model){
        Integer id = 2;
        List<ProjecaoSalarial> listaProj = projRepo.listaProj(id);
        model.addAttribute("listaProj", listaProj);

        return "/medInd/painelPinMedInd";
    }

    @RequestMapping("/consoleMed")
    public String consoleMed(){

        return ("/medInd/console");
    }

    @RequestMapping("/consultarAgenda")
    public String consultarAgenda(){

        return "";
    }

    @RequestMapping("/projSalarial")
    public String projecaoSalarial(){

        return "";
    }

    @RequestMapping("/pagamentos")
    public String medIndPagamentos(Model model){
        Integer idMed = 2;
        model.addAttribute("dadosPag", pagServ.listaPagPorMed(idMed));
        model.addAttribute("qtdTotal", pagServ.qtdTotal(idMed));
        model.addAttribute("qtdDin", pagServ.qtdDin(idMed));
        model.addAttribute("qtdCred", pagServ.qtdCre(idMed));
        model.addAttribute("qtdDeb", pagServ.qtdDeb(idMed));

        return "/medInd/consulPagClin";
    }


    @RequestMapping("/feedback")
    public String medIndFeedback(Model model){
        Integer idMed = 2;
        model.addAttribute("listaFeed", feedServ.listaFeedback(idMed));
        
        return "/medInd/feedBkMedInd";
    }

    @RequestMapping("/mostraFeed/{idFeed}")
    public String respondFeedback(@PathVariable Integer idFeed, Model model){
        Optional<Feedback> feedOp = this.feedRepo.findById(idFeed);
        if(feedOp.isPresent()){
            
            model.addAttribute("dadosFeed", feedServ.listaFeedPorID(idFeed));
        }


        return medIndFeedback(model);
    }

    @RequestMapping("/novoRecep")
    public String novoRecep(Model model){
        Usuario usu = new Usuario();
        Recepcionista recep = new Recepcionista();
        
        model.addAttribute("usu", usu);
        model.addAttribute("recep", recep);

        return "/medInd/novoRecepMedInd";
    }

    @RequestMapping("/criaRecep")
    public String criaRecep(@ModelAttribute("usu")Usuario usu, @ModelAttribute("recep")Recepcionista recep,Model model){
        usuServ.criaUsu(usu);
        recepServ.criaRecep(recep);
        return painelMedInd(model);
    }
    @RequestMapping("/medIndConfig")
    public String medIndConfig(Model model){
        Usuario usu = new Usuario();
        Medico med = new Medico();
      
        model.addAttribute("usu", usu);
        model.addAttribute("med", med);
        return "/medInd/tela_configMed";
    }

    @RequestMapping("/atualiza")
    public String atualizaMedInd(@ModelAttribute("usu") Usuario usu, @ModelAttribute("med") Medico med, Model model){
        usu.setIdUsu(7);
        med.setIdMed(2);

        usuServ.atualizaUsuario(usu);
        medServ.atualizaMedico(med);

        return painelMedInd(model);
    }

    @RequestMapping("/ajuda")
    public String medIndAjuda(Model model){
        model.addAttribute("aju", new Ajuda());
        return "/medInd/tela_ajudaMed";
    }
    
    @PostMapping("/criaAjudaMedInd")
    public String criaAjudaMedInd(@ModelAttribute("ajuda") Ajuda ajuda, Model model) {
    	Usuario usu = new Usuario();
    	usu.setIdUsu(2);
    	ajuda.setUsuario(usu);
    	ajuServ.criaAjuda(ajuda);
    	return painelMedInd(model);
    } 
}
