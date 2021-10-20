package com.projeto.Controladores;

import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Usuario;
import com.projeto.Servicos.RecepcionistaServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/recepcionista")
public class RecepcionistaController {

    @Autowired
    RecepcionistaServico recepServ;

    @GetMapping("/painelRecep")
    private String painelRecep() {
        return "/tela_painelRecep";
    }

    @RequestMapping("/mostraPaci")
    private String paginaAddPaci(Model model) {
        Paciente paci = new Paciente();
        Usuario usu = new Usuario();
        Endereco end = new Endereco();
        model.addAttribute("paciente", paci);
        model.addAttribute("usuario", usu);
        model.addAttribute("endereco", end);
        return "/tela_cadClientes";

    }
    @RequestMapping("/cadPaci")
    public String salvaInfoPaciBD(@ModelAttribute("paciente") Paciente paci, @ModelAttribute("usuario") Usuario usu, @ModelAttribute("endereco") Endereco end){
        recepServ.criaPaci(paci);
        recepServ.criaUsu(usu);
        recepServ.criaEnd(end);
        return "/tela_agendamento";
    }
}
