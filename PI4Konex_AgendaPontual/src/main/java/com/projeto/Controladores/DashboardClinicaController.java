package com.projeto.Controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Entidades.Agenda;
import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.Feedback;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Pagamento;
import com.projeto.Entidades.Recepcionista;

@Controller
public class DashboardClinicaController {
	
	@GetMapping("/viewDash")
	public ModelAndView viewCli() {
		ModelAndView mv = new ModelAndView("/clinica/DashboardClinica");
		return mv;
	}
	
	@GetMapping("/NovoMed")
	public ModelAndView createMedico(Medico medico){
		ModelAndView mv = new ModelAndView("/clinica/CadastroMed");
		return mv;
	}
	
	@GetMapping("/NovoRecep")
	public ModelAndView createRecep(Recepcionista recep){
		ModelAndView mv = new ModelAndView("/clinica/CadastroRecep");
		return mv;
	}

	@GetMapping("/ConsultaPagamentos")
	public ModelAndView listPag(Pagamento pagamentos){
		ModelAndView mv = new ModelAndView("/clinica/ConsultarPagamentos");
		return mv;
	}

	@GetMapping("/HistoricoAgenda")
	public ModelAndView listaHistorico(Agenda agenda){
		ModelAndView mv = new ModelAndView("/clinica/ConsultarAgendamentos");
		return mv;
	}

	@GetMapping("/FeedbackClinica")
	public ModelAndView listaFeedbacks(Feedback feedbacks){
		ModelAndView mv = new ModelAndView("/clinica/ConsultarFeedback");
		return mv;
	}

	@GetMapping("/AjudaClinica")
	public ModelAndView listaFeedbacks(Ajuda ajuda){
		ModelAndView mv = new ModelAndView("/clinica/Ajuda");
		return mv;
	}
	/*
	@PostMapping("/createAjuda")
	public ModelAndView createAjuda(@ModelAttribute Ajuda ajuda){
		ModelAndView mv = new ModelAndView("");
		return mv;
	}*/

}