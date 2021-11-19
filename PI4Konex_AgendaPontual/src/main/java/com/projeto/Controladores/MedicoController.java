package com.projeto.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.Entidades.Consulta;
import com.projeto.Entidades.Medico;
import com.projeto.Entidades.NewsLatter;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.ConsultaServico;
import com.projeto.Servicos.ConvenioServico;
import com.projeto.Servicos.DoencaServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.FeedbackServico;
import com.projeto.Servicos.MedicoServico;
import com.projeto.Servicos.UltimoIdDTOServico;

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
	
	@Autowired
	private UltimoIdDTOServico ultServ;
	
	@Autowired
	private ConsultaServico consServ; 
	
	@Autowired
	private ConvenioServico convServ; 

	
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
		 mv.addObject("seg", medServ.buscaSeg(idMed));
		 mv.addObject("ter", medServ.buscaTer(idMed));
		 mv.addObject("qua", medServ.buscaQua(idMed));
		 mv.addObject("qui", medServ.buscaQui(idMed));
		 mv.addObject("sex", medServ.buscaSex(idMed));
		 mv.addObject("sab", medServ.buscaSab(idMed));
		 mv.addObject("dados", new Consulta());
		 
		return mv;
	}
	
	@PostMapping("/medico/validacao/{idMed}")
	public ModelAndView valida(
			@PathVariable("idMed") Integer idMed,
			@ModelAttribute("dados") Consulta dados) {
		ModelAndView mv = new ModelAndView("tela_validation");
		Medico med = new Medico();
		 mv.addObject("medico", medServ.medicoResumo(idMed));
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
	
	@GetMapping("/teste")
	public ModelAndView teste() {
		ModelAndView mv =  new ModelAndView("teste");
		mv.addObject("medico", medServ.medicoResumo(1));
		mv.addObject("dados", new Consulta());
		return mv;
	}
	
	@PostMapping("/teste2")
	public ModelAndView teste(@ModelAttribute("dados") Consulta dados) {
		ModelAndView mv =  new ModelAndView("teste");
		consServ.cadastro(dados);
		return mv;
	}
}
