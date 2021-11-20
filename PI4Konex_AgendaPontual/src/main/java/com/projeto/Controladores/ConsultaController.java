package com.projeto.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Entidades.Consulta;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.Paciente;
import com.projeto.Servicos.ConsultaServico;
import com.projeto.Servicos.ConvenioServico;
import com.projeto.Servicos.FeedbackServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.PacienteServico;
import com.projeto.Servicos.UltimoIdDTOServico;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {
	
	@Autowired
	private ConsultaServico consServ;
	
	@Autowired
	private ConvenioServico convServ;
	
	@Autowired
	private FeedbackServico feeServ;
	
	@Autowired
	private MedicoServico medServ;
	
	@Autowired
	private UltimoIdDTOServico ultServ;
	
	@PostMapping("/validacao/{idMed}")
	public ModelAndView valida(
			@PathVariable("idMed") Integer idMed,
			@ModelAttribute("dados") Consulta dados,@ModelAttribute("paciente") Paciente paciente) {
		ModelAndView mv = new ModelAndView("tela_validation");
		Medico med = new Medico();
		 mv.addObject("medico", medServ.medicoResumo(idMed));
		 //mv.addObject("paciente", new Paciente());
		 mv.addObject("feedback", feeServ.buscaFeedbackPorMedico(idMed));
		 mv.addObject("positiva", feeServ.buscaPositiva(idMed));
		 mv.addObject("negativa", feeServ.buscaNegativa(idMed));
		 mv.addObject("total", medServ.buscaQteAtendimento(idMed));
		 mv.addObject("convenios", convServ.listaConvenio());
		 med.setIdMed(idMed);
		 dados.setMedico(med);
		 consServ.cadastro(dados);
		 mv.addObject("numero", ultServ.buscaUtimoId());
		 mv.addObject("detalhes", consServ.buscaConsultaPorId(ultServ.buscaUtimoId().getNum()));
		return mv;
	}
	
	@PostMapping("/validacao/addInfo")
	public ResponseEntity<Consulta> addFavorito(@RequestParam Integer id, @RequestParam String inforAd) {
		Consulta consulta = consServ.buscaConsultaPorId(id);
		consulta.setInformaAdicio(inforAd);
		consServ.cadastro(consulta);
		return ResponseEntity.ok().body(null);
	}
}
