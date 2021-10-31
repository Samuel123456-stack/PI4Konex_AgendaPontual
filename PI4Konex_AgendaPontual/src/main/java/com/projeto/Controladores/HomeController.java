package com.projeto.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projeto.Dto.MedicoDTO;
import com.projeto.Entidades.Cidade;
import com.projeto.Entidades.Especialidade;
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
//		List<MedicoDTO> list = medServ.buscaMedEsp(cidade, esp);
//		return new ModelAndView("/resulBusca").addObject("medicos", list);
//	}
	
	@RequestMapping("/busca")
	public ModelAndView buscaEsp(
			@RequestParam(required = false) Integer cidade,
			@RequestParam(required = false) String esp,
			@RequestParam(required = false) Integer bairro,
			@RequestParam(required = false) String espec,
			@RequestParam(required = false) String sexMas,
			@RequestParam(required = false) String sexFem,
			@RequestParam(required = false) Integer valorMin,
			@RequestParam(required = false) Integer valorMax,
			@RequestParam(required = false) Integer minExp,
			@RequestParam(required = false) Integer maxExp 
			) {
		ModelAndView mv = new ModelAndView("resulBusca");
		
		if(esp != null && cidade == null) {
			List<MedicoDTO> medicos = medServ.buscaEsp(esp.trim().toUpperCase());
			List<Cidade> cidades = cidServ.findAll();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("especs", especs);
			return mv;
			
		}
		else if (cidade != null && esp == null) {
			List<MedicoDTO> medicos = medServ.buscaMedCid(cidade);
			List<Cidade> cidades = cidServ.findAll();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("medicos", medicos);
			mv.addObject("cidades", cidades);
			mv.addObject("especs", especs);
			return mv;
		}
		else if (cidade != null && bairro != null && espec != null && 
				sexMas != null && sexFem != null && valorMin != null && 
				valorMax != null && minExp != null && maxExp != null) {
			List<MedicoDTO> medicos = medServ.buscaMedCompleta(cidade, esp, sexMas, sexFem,
					bairro, espec, valorMin, valorMax, minExp, maxExp);
			List<Cidade> cidades = cidServ.findAll();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("especs", especs);
			return mv;
			
		}
		else if (esp != null && cidade != null) {
			List<MedicoDTO> medicos = medServ.buscaMedEsp(cidade, esp);
			List<Cidade> cidades = cidServ.findAll();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("especs", especs);
			return mv;
			
		}
		else {
			List<MedicoDTO> medicos = medServ.buscaMed();
			List<Cidade> cidades = cidServ.findAll();
			List<Especialidade> especs = espServ.buscaEsp();
			mv.addObject("cidades", cidades);
			mv.addObject("medicos", medicos);
			mv.addObject("especs", especs);
			return mv;
		}
		
		
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
	public ResponseEntity<List<MedicoDTO>> buscaTeste(@RequestParam Integer cidade, @RequestParam Integer bairro){
		List<MedicoDTO> list = medServ.buscaTeste(cidade, bairro);
		return ResponseEntity.ok().body(list);
	}
}