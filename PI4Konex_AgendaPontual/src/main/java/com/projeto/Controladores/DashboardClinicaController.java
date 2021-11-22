package com.projeto.Controladores;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Entidades.Agenda;
import com.projeto.Entidades.Ajuda;
import com.projeto.Entidades.Feedback;
import com.projeto.Entidades.Pagamento;
import com.projeto.Entidades.Recepcionista;

@Controller
public class DashboardClinicaController {
	
	@GetMapping("/NovoMed")
	public ModelAndView createMedico(Recepcionista recep){
		ModelAndView mv = new ModelAndView("/Clinica/CadastroMed");
		return mv;
	}
	
	@GetMapping("/NovoRecep")
	public ModelAndView createRecep(Recepcionista recep){
		ModelAndView mv = new ModelAndView("/Clinica/CadastroRecep");
		return mv;
	}

	@GetMapping("/ConsultaPagamentos")
	public ModelAndView listPag(Pagamento pagamentos){
		ModelAndView mv = new ModelAndView("/Clinica/ConsultarPagamentos");
		return mv;
	}

	@GetMapping("/HistoricoAgenda")
	public ModelAndView listaHistorico(Agenda agenda){
		ModelAndView mv = new ModelAndView("/Clinica/ConsultarAgendamentos");
		return mv;
	}

	@GetMapping("/FeedbackClinica")
	public ModelAndView listaFeedbacks(Feedback feedbacks){
		ModelAndView mv = new ModelAndView("/Clinica/ConsultarFeedback");
		return mv;
	}

	@GetMapping("/AjudaClinica")
	public ModelAndView listaFeedbacks(Ajuda ajuda){
		ModelAndView mv = new ModelAndView("/Clinica/Ajuda");
		return mv;
	}
	/*
	@PostMapping("/createAjuda")
	public ModelAndView createAjuda(@ModelAttribute Ajuda ajuda){
		ModelAndView mv = new ModelAndView("");
		Date dataAtual = new Date(0);
		DateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		String dataSoli= format.format("dataAtual");
		ajuda.set
		return mv;
	}*/

}