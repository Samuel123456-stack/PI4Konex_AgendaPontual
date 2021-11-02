package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Especialidade;
import com.projeto.Entidades.Medico;
import com.projeto.Servicos.BairroServico;
import com.projeto.Servicos.CidadeServico;
import com.projeto.Servicos.EspecialidadeServico;
import com.projeto.Servicos.MedicoServico;

@Controller
public class HomeController {
	
	@Autowired
	private CidadeServico cidServ;
	
	@Autowired
	private EspecialidadeServico espServ;
	
	@Autowired
	private MedicoServico medServ;
	
	
	@Autowired
	private BairroServico baiServ;
	
	
	private String ftc;
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Cidade> cidades = cidServ.findAll();
		model.addAttribute("cidades", cidades);
		return ("/home");
	}
	
//	@PostMapping("**/pesquisamedico")
//	public ModelAndView buscaMed(@RequestParam("cidade") Integer cidade, @RequestParam("esp") String esp) {
//		List<Medico> list = medServ.buscaMedEsp(cidade, esp);
//		return new ModelAndView("/resulBusca").addObject("medicos", list);
//	}
	
	@GetMapping("/busca")
	public ModelAndView busca(@RequestParam(required = false) Integer cidade,
			@RequestParam(required = false) String esp, @RequestParam(required = false) Integer bairro,
			@RequestParam(required = false) String espec, @RequestParam(required = false) String sexMas,
			@RequestParam(required = false) String sexFem, @RequestParam(required = false) Float valorMin,
			@RequestParam(required = false) Float valorMax, @RequestParam(required = false) Integer minExp,
			@RequestParam(required = false) Integer maxExp) {
		ModelAndView mv = new ModelAndView("resulBusca");

		List<Medico> medicos = medServ.buscaMedCompleta(cidade, bairro, espec, sexMas, sexFem,valorMin,
				valorMax, minExp, maxExp);
		List<Cidade> cidades = cidServ.findAll();
		List<Especialidade> especs = espServ.buscaEsp();
		mv.addObject("cidades", cidades);
		mv.addObject("medicos", medicos);
		mv.addObject("especs", especs);
		return mv;
	}
	
	@GetMapping("/bairro")
	@ResponseBody
	public String buscaBairro(@RequestParam Integer idcid){
		
		String json = null;
		List<Object[]> list = cidServ.buscaBairroPorCidade(idcid);
		try {
			json = new ObjectMapper().writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
	

	
	@GetMapping("/teste")
	@ResponseBody
	public ResponseEntity<List<Medico>> buscaTeste(@RequestParam(required = false) Integer cidade,
			@RequestParam(required = false) String esp, @RequestParam(required = false) Integer bairro,
			@RequestParam(required = false) String espec, @RequestParam(required = false) String sexMas,
			@RequestParam(required = false) String sexFem, @RequestParam(required = false) Float valorMin,
			@RequestParam(required = false) Float valorMax, @RequestParam(required = false) Integer minExp,
			@RequestParam(required = false) Integer maxExp){
		List<Medico> list = medServ.buscaMedCompleta(cidade, bairro, espec, sexMas, sexFem, valorMin, valorMax,
				minExp, maxExp);
		return ResponseEntity.ok().body(list);
	}
}