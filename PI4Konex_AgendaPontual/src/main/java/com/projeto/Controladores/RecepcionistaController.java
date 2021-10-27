package com.projeto.Controladores;

import java.util.List;

import com.projeto.Entidades.Agenda;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Clinica;
import com.projeto.Entidades.Convenio;
import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Recepcionista;
import com.projeto.Entidades.Usuario;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.RecepcionistaServico;
import com.projeto.Servicos.UsuarioServico;

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
    EspecialidadeServico espServ;
    @Autowired
    UsuarioServico usuServ;

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
        usuServ.criaUsu(usu);
        recepServ.criaEnd(end);
        //Cria a listagem do filtro e seus atributos
        Agenda agen = new Agenda();

        List<Clinica> listaCli = recepServ.listarTodosCli();
        List<Cidade> listaCid = recepServ.listarTodosCid();
        List<Especialidade> listaEsp = espServ.findAll();

        model.addAttribute("listaCid", listaCid);
        model.addAttribute("listaCli", listaCli);
        model.addAttribute("listaEsp", listaEsp);
        model.addAttribute("agenda", agen);
        
        return "/tela_agendamento";
    }
    //Filtra os Medicos
    @RequestMapping("/filtraMedico")
    public String filtraMedicos(Model model){
        List<Medico> listaMed = recepServ.listarTodosMed();
        model.addAttribute("listaMed", listaMed);

        return "/tela_agendamento";
    }

    //Salva Informaçoes Adicionais
    @RequestMapping("/salvaInfoAdic")
    public String salvaInfoAdici(@ModelAttribute("agenda")Agenda agen){
        recepServ.criaAtualizaAgen(agen);

        return "/tela_agendamento";
    }

    //Seleciona o Medico para saber suas informações
    @RequestMapping("/selecMed")
    public String infoEspecialista(@ModelAttribute("listaMed")Medico med, Model model){
        model.getAttribute("listaMed");

        return "/tela_agendamento";
    }

    //Passa para a tela de Consulta da Recepcionista
    @RequestMapping("/consRecep")
    public String consultaRecep(){

        return "/tela_consRes";
    }

    //Passa para a tela de Confirmação
    @RequestMapping("/posConfirma")
    public String posConfirma(Model model){
        List<Convenio> listaConv = recepServ.listarTodasConv();
        model.addAttribute("listaConv", listaConv);

        return "/tela_proconfirmation";
    }
   

    //Passa para a tela de Atualizar Recepcionista
    @RequestMapping("/telaAtualizaRecep")
    public String telaAtualizaRecep(Model model){
        Recepcionista recep = new Recepcionista();
        Usuario usu = new Usuario();
        usu.setIdUsu(19);
        recep.setIdRec(1);
        model.addAttribute("recep", recep);
        model.addAttribute("usu", usu);

        return "/tela_configuracoes";
    }

    @RequestMapping("/atualizaRecep")
    public String telaAtualizaRecep(@ModelAttribute("recep") Recepcionista recep, @ModelAttribute("usu") Usuario usu){
        //recep = recepServ.AtualizaRecep(recep);
        //usu = usuServ.atualizaUsu(usu); 

        return "/tela_painelRecep";
    }

}
