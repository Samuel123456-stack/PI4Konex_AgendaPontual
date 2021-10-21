package com.projeto.Controladores;

import java.util.List;

import com.projeto.Entidades.Agenda;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Usuario;
import com.projeto.Servicos.EspecialidadeServico;
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
    @Autowired
    EspecialidadeServico recepEsp;

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
    @RequestMapping("/addAgenda")
    public String salvaInfoPaciBD(@ModelAttribute("paciente") Paciente paci, @ModelAttribute("usuario") Usuario usu, @ModelAttribute("endereco") Endereco end, Model model){
        //Salva as Informações
        recepServ.criaPaci(paci);
        recepServ.criaUsu(usu);
        recepServ.criaEnd(end);
        //Cria a listagem do filtro e seus atributos
        Agenda agen = new Agenda();
        List<Cidade> listaCid = recepServ.listarTodosCid();
        List<Especialidade> listaEsp = recepEsp.findAll();
        model.addAttribute("listaCid", listaCid);
        model.addAttribute("listaEsp", listaEsp);
        model.addAttribute("agenda", agen);
        
        return "/tela_agendamento";
    }
    //Filtra os Medicos
    @RequestMapping("/filtraMedico")
    public String filtraMedicos(){
        return "";
    }

}
