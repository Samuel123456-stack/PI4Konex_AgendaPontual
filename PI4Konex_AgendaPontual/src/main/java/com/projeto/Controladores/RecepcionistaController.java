package com.projeto.Controladores;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import com.projeto.Entidades.Agenda;
import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.AjudaRec;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Convenio;
import com.projeto.Entidades.Endereco;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Paciente;
import com.projeto.Entidades.Pagamento;
import com.projeto.Entidades.Recepcionista;
import com.projeto.Entidades.Usuario;
import com.projeto.Repositorios.AgendaRepositorio;
import com.projeto.Repositorios.UsuarioRepositorio;
import com.projeto.Servicos.AgendaServico;
import com.projeto.Servicos.AjudaServico;
import com.projeto.Servicos.ClinicasServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.PagamentoServico;
import com.projeto.Servicos.RecepcionistaServico;
import com.projeto.Servicos.UsuarioServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/recepcionista")
public class RecepcionistaController {

    @Autowired
    RecepcionistaServico recepServ;
    @Autowired
    EspecialidadeServico espServ;
    @Autowired
    UsuarioServico usuServ;
    @Autowired
    UsuarioRepositorio repoUsu;
    @Autowired
    PagamentoServico pagServ;
    @Autowired
    AjudaServico ajuServ;
    @Autowired
    AgendaServico agenServ;
    @Autowired
    AgendaRepositorio repoAgen;
    @Autowired
    ClinicasServico cliServ;
    @Autowired
    MedicoServico medServ;
    


    @GetMapping("/painelRecep")
    private String painelRecep(Model model) {
        Integer idMed = 2;
        Integer idCli = 1;
        List<Agenda> listagemPainel = agenServ.listagemPainel(idMed, idCli);
        model.addAttribute("listagemPainel", listagemPainel);
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
    public ModelAndView salvaInfoPaciBD(@RequestParam(required = false) Integer idEsp,
    @RequestParam(required = false) Integer idCid, @RequestParam(required = false) Integer idCli,
    @RequestParam(required = false) Float valorMin, @RequestParam(required = false) Float valorMax,
    @RequestParam(required = false) String sexFem, @RequestParam(required = false) String sexMas, 
    @ModelAttribute("paciente") Paciente paci, @ModelAttribute("usuario") Usuario usu, 
    @ModelAttribute("endereco") Endereco end, Model model){
        //Salva as Informações
        //recepServ.criaPaci(paci);
        //usuServ.criaUsu(usu);
        //recepServ.criaEnd(end);
    
        ModelAndView modelView = new ModelAndView("tela_agendamento");
        //Cria a listagem do filtro e seus atributos
        Agenda agen = new Agenda();
        //Consulta cons = new Consulta();

        List<Cidade> listaCid = recepServ.listarTodosCid();
        List<Especialidade> listaEsp = espServ.findAll();
        List<Medico> listaFiltraMed = medServ.filtraMedCli(idEsp, idCid, idCli, sexMas, sexFem, valorMin, valorMax);
        modelView.addObject("listaCid", listaCid);
        modelView.addObject("listaEsp", listaEsp);
        modelView.addObject("listaFiltraMed", listaFiltraMed);
        modelView.addObject("agenda", agen);
        return modelView;
    }



    //Salva Informaçoes Adicionais, Horario e Data
    @RequestMapping("/salvaInfoAdic")
    public String salvaInfoAdici(@ModelAttribute("agenda")Agenda agen){
        Date dataAtual = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("YYYY-MM-dd");
        String dataAgen = dataFormatada.format(dataAtual);
        agen.setDataAgendada(dataAgen);
        agenServ.criaAtualizaAgen(agen);
        

        return "/tela_agendamento";
    }

    //Seleciona o Medico para saber suas informações
    @RequestMapping("/selecMed")
    public String infoEspecialista(@RequestParam Integer idMedd, Model model){
        model.addAttribute("teste", idMedd);
        return "/tela_agendamento";
    }

    //Passa para a tela de Consulta da Recepcionista
    @RequestMapping("/consRecep")
    public String consultaRecep(Model model){
        Paciente paci = new Paciente();
        Endereco end = new Endereco();
        Usuario usu = new Usuario();

        model.addAttribute("paci", paci);
        model.addAttribute("end", end);
        model.addAttribute("usu", usu);

        return "/tela_consRes";
    }

    @RequestMapping("/formConsRecep")
    public String formConsultaRecep(@ModelAttribute("paci") Paciente paci, @ModelAttribute("end") Endereco end,@ModelAttribute("usu") Usuario usu,  Model model){
        Integer idPaci = recepServ.buscaIdporNome(paci.getNomePaci());
        List<Agenda> listaConsulta = agenServ.listaConsAgenda(idPaci);
        model.addAttribute("listaConsulta", listaConsulta);

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
        

        model.addAttribute("recep", recep);
        model.addAttribute("usu", usu);

        return "/tela_configuracoes";
    }

    @RequestMapping("/atualizaRecep")
    public String telaAtualizaRecep(@ModelAttribute("recep") Recepcionista recep, @ModelAttribute("usu") Usuario usu, Model model){
        usu.setIdUsu(19);
        recep.setIdRec(1);
        
        usuServ.atualizaUsuario(usu);
        recepServ.atualizaRecep(recep);

        return painelRecep(model);
    }

    @RequestMapping("/telaAjuda")
    public String telaAjuda(Model model){
        Ajuda aju = new Ajuda();
        AjudaRec ajuRec = new AjudaRec();
        model.addAttribute("aju", aju);
        model.addAttribute("ajuRec", ajuRec);

        return "/tela_ajuda";
    }

    @RequestMapping("/telaFormAjuda")
    public String telaFormAjuda(@ModelAttribute("aju")Ajuda aju, @ModelAttribute("ajuRec") AjudaRec ajudaRec, Model model){
        Date dataAtual = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String dataSolic = dataFormatada.format(dataAtual);
        aju.setDataSolic(dataSolic);
        ajuServ.criaAjuda(aju);
        /*ajudaRec.setIdAjuda(aju.getIdAjuda());
        ajudaRec.setDataAjudaRec(dataSolic);
        ajudaRec.setStatusSoli("pendente");
        ajuServ.criaAjudaRec(ajudaRec);*/

        return painelRecep(model);
    }

    @RequestMapping("/telaRegPag")
    public String telaRegisPag(Model model){
        Pagamento pag = new Pagamento();
        model.addAttribute("pag", pag);

        return "/tela_regPayment";
    }

    @RequestMapping("/telaFormPag")
    public String telaFormaPag(@ModelAttribute("pag")Pagamento pag, Model model){
        Date dataAtual = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String dataPag = dataFormatada.format(dataAtual);
        pag.setDataPag(dataPag);
        pagServ.criaPag(pag);
        return painelRecep(model);
    }

    @RequestMapping("/{idAgen}/telaAtualizaAgen")
    public String telaAtualizaAgen(@PathVariable Integer idAgen, Model model){
        Optional<Agenda> agenOp = this.repoAgen.findById(idAgen);
        if(agenOp.isPresent()){
            Agenda agen = agenOp.get();

            model.addAttribute("agen", agen);
        }

        return "/tela_updateSchedule";
    }

    @RequestMapping("/telaFormAgen")
    public String telaFormAgen(@ModelAttribute("agen") Agenda agen, Model model){
        agenServ.atualizaAgenda(agen);
        return painelRecep(model);
    }

    @RequestMapping("/telaCancelaAgen")
    public String telaCancelaAgen(Model model){
        Agenda agen = new Agenda();
        model.addAttribute("agen", agen);

        return "/tela_cancelSchedule";
    }

    @RequestMapping("/telaCancelaFormAgen")
    public String telaCancelaFormAgen(@ModelAttribute("agen") Agenda agen, Model model){
        String cpf = agen.getIdPaci().getCpf();
        Integer idAgen = agen.getIdAgen();
        List<Agenda> listaCancela = agenServ.listaCancelaAgen(cpf, idAgen);

        model.addAttribute("listaCancela", listaCancela);

        return "/tela_cancelSchedule";
    }

    @PostMapping("/telaCancelaLista")
    public String telaCancelaLista(@RequestParam String cpf, @RequestParam Integer idAgen,Model model){
        agenServ.cancelaAgenda(cpf, idAgen);
        return painelRecep(model);
    }
    
}
