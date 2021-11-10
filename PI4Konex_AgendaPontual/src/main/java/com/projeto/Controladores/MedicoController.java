package com.projeto.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Entidades.NewsLatter;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.DoencaServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.FeedbackServico;
import com.projeto.Servicos.MedicoServico;

@Controller
public class MedicoController {
	
	@Autowired
	private MedicoServico medServ;
	
	@Autowired
	private EspecialidadeServico espServ;
	
	@Autowired
	private CidadeServico cidServ;
	
	@Autowired
	private DoencaServico doeServ;
	
	@Autowired
	private FeedbackServico feeServ;

	
	@GetMapping("/medico/busca")
	public ModelAndView busca(@RequestParam(required = false) Integer cidade,
			@RequestParam(required = false) String esp, @RequestParam(required = false) Integer bairro,
			@RequestParam(required = false) String espec, @RequestParam(required = false) String sexMas,
			@RequestParam(required = false) String sexFem, @RequestParam(required = false) Float valorMin,
			@RequestParam(required = false) Float valorMax, @RequestParam(required = false) Integer minExp,
			@RequestParam(required = false) Integer maxExp) {
		
		ModelAndView mv = new ModelAndView("resulBusca");

		mv.addObject("cidades", cidServ.findAll());
		mv.addObject("medicos", medServ.buscaMedCompleta(cidade, bairro, espec, sexMas, sexFem,valorMin,
				valorMax, minExp, maxExp));
		mv.addObject("especs", espServ.findAll());
		mv.addObject("news", new NewsLatter());
		return mv;
	}
	
	@GetMapping("/medico/resumo")
	public ModelAndView resumo(@RequestParam Integer idMed) {
		ModelAndView mv = new ModelAndView("tela_resumo");
		 mv.addObject("medico", medServ.medicoResumo(idMed));
		 mv.addObject("doencas", doeServ.buscaDoencaPorMedico(idMed));
		 mv.addObject("feedback", feeServ.buscaFeedbackPorMedico(idMed));
		 mv.addObject("positiva", feeServ.buscaPositiva(idMed));
		 mv.addObject("negativa", feeServ.buscaNegativa(idMed));
		 mv.addObject("total", medServ.buscaQteAtendimento(idMed));
		return mv;
	}

}
