package com.projeto.Controladores;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.AjudaMed;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Usuario;
import com.projeto.Servicos.AjudaServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.UsuarioServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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


    //Por hora serão metodos sem uma logica ou despachamento de tela
    @RequestMapping("/primeiroPassoMedInd")
    public String primeiroPasso(){

        return "/primPt1Med";
    }

    @RequestMapping("/segundoPassoMedInd")
    public String segundoPasso(Model model){
        Medico medInd = new Medico();
        List<Especialidade> listaEsp = espServ.findAll();
        model.addAttribute("medInd", medInd);
        model.addAttribute("listaEsp", listaEsp);


        return "/primPt2MedInd";
    }

    @RequestMapping("/cadPt1")
    public String cadPt1(@ModelAttribute("medInd") Medico medInd, Model model){

        return "/primPt2Med";
    }

    @RequestMapping("/terceiroPassoMedInd")
    public String terceiroPasso(){

        return "/primPt2Med";
    }

    @RequestMapping("/quartoPassoMedInd")
    public String quartoPasso(Model model){
        List<Especialidade> listaEsp = espServ.findAll();
        model.addAttribute("listaEsp", listaEsp);

        return "/priMedClin";
    }

    @RequestMapping("/projSalarialMedInd")
    public String projSalarialMedInd(){

        return "";
    }


    @RequestMapping("/painelMedInd")
    public String painelMedInd(){

        return "/painelPinMedInd";
    }

    @RequestMapping("/consoleMed")
    public String consoleMed(){

        return "";
    }

    @RequestMapping("/consultarAgenda")
    public String consultarAgenda(){

        return "";
    }

    @RequestMapping("/projSalarial")
    public String projecaoSalarial(){

        return "";
    }


    @RequestMapping("/feedback")
    public String medIndFeedback(){

        return "";
    }

    @RequestMapping("/medIndConfig")
    public String medIndConfig(Model model){
        Usuario usu = new Usuario();
        Medico med = new Medico();
      
        model.addAttribute("usu", usu);
        model.addAttribute("med", med);
        return "/tela_configMed";
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
        Ajuda aju = new Ajuda();
        AjudaMed ajuMed = new AjudaMed();
        model.addAttribute("aju", aju);
        model.addAttribute("ajuMed", ajuMed);
        return "tela_ajudaMed";
    }

    @RequestMapping("/criaAjudaMedInd")
    public String criaAjudaMedInd(@ModelAttribute("aju") Ajuda aju, @ModelAttribute("ajuMed") AjudaMed ajuMed, Model model){
        Date dataAtual = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String dataSolic = dataFormatada.format(dataAtual);
        aju.setDataSolic(dataSolic);
        ajuServ.criaAjuda(aju);
        ajuMed.setIdAjuda(aju.getIdAjuda());
        ajuMed.setDataAjudaMed(dataAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        ajuMed.setStatusSoli("pendente");
        ajuServ.criaAjudaMed(ajuMed);

        return painelMedInd();
    }


    
}
