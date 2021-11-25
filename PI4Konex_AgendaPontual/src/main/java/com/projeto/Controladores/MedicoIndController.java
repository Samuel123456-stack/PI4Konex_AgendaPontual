package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.Doenca;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Recepcionista;
import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.MedicojpaRepository;
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

        /*String crm  = medInd.getCrm();
        Integer idEsp  = medInd.getEspecialidade().getIdEsp();*/
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

        /*Integer idMed = 1;
        System.out.println("IDMED"+medInd.getEspecialidade().getIdEsp());
        model.addAttribute("listaDoe", doeServ.buscaDoencaPorMedico(idMed));*/

        return "/medInd/priMedClin";
    }

    @RequestMapping("/projSalarialMedInd")
    public String projSalarialMedInd(){

        return "";
    }


    @RequestMapping("/painelMedInd")
    public String painelMedInd(){

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

        return "/medInd/consulPagClin";
    }


    @RequestMapping("/feedback")
    public String medIndFeedback(Model model){
        Integer idMed = 2;
        model.addAttribute("listaFeed", feedServ.listaFeedback(idMed));
        model.addAttribute("dadosFeed", feedServ.listaFeedback(idMed));
        return "/medInd/feedBkMedInd";
    }

    @RequestMapping("/proximoFeed")
    public String respondFeedback(Model model){

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
        return painelMedInd();
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

        return painelMedInd();
    }

    @RequestMapping("/ajuda")
    public String medIndAjuda(Model model){
        model.addAttribute("aju", new Ajuda());
        return "/medInd/tela_ajudaMed";
    }

//    @RequestMapping("/criaAjudaMedInd")
//    public String criaAjudaMedInd(@ModelAttribute("aju") Ajuda aju, @ModelAttribute("ajuMed") AjudaMed ajuMed, Model model){
//        Date dataAtual = new Date();
//        DateFormat dataFormatada = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//        String dataSolic = dataFormatada.format(dataAtual);
//        aju.setDataSolic(dataSolic);
//        ajuServ.criaAjuda(aju);
//        ajuMed.setIdAjuda(aju.getIdAjuda());
//        ajuMed.setDataAjudaMed(dataAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
//        ajuMed.setStatusSoli("pendente");
//        ajuServ.criaAjudaMed(ajuMed);
//
//        return painelMedInd();
//    }
    
    @PostMapping("/criaAjudaMedInd")
    public String criaAjudaMedInd(@ModelAttribute("ajuda") Ajuda ajuda) {
    	Usuario usu = new Usuario();
    	usu.setIdUsu(2);
    	ajuda.setUsuario(usu);
    	ajuServ.criaAjuda(ajuda);
    	return painelMedInd();
    } 
}
