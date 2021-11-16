package com.projeto.Controladores;

import java.util.List;

import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Servicos.EspecialidadeServico;

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

        return "";
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
    public String medIndConfig(){

        return "";
    }

    @RequestMapping("/ajuda")
    public String medIndAjuda(){

        return "";
    }


    
}
