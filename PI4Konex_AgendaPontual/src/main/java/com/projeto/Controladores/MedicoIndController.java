package com.projeto.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/medInd")
public class MedicoIndController {


    //Por hora serão metodos sem uma logica ou despachamento de tela
    @RequestMapping("/primeiroPasso")
    public String primeiroPasso(){

        return "";
    }

    @RequestMapping("/segundoPasso")
    public String segundoPasso(){

        return "";
    }

    @RequestMapping("/terceiroPasso")
    public String terceiroPasso(){

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
