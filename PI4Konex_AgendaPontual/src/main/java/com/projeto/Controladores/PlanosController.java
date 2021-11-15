package com.projeto.Controladores;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.Entidades.Planos;
//import com.projeto.Repositorios.PlanosRepository;


@Controller
public class PlanosController {
	// importar o repository
	//private PlanosRepository pr;
	
	// abrir a tela
	@GetMapping("/planos")
	public String abertura(Planos planos) {
		return "Planos";
	}
	
	//Aquisição do plano 1
	@PostMapping("/personalSelected")
	public ModelAndView createPersonal(@ModelAttribute Planos planos) {
		ModelAndView mv = new ModelAndView("/PosPlanos");
		mv.addObject("planos",planos);
		return mv;
	}
	
	//Aquisição do plano 2
	@PostMapping("/economySelected")
	public ModelAndView createEconomy(@ModelAttribute Planos planos) {
		ModelAndView mv = new ModelAndView("/PosPlanos");
		mv.addObject("planos", planos);
		return mv;
	}
	
	//Aquisição do plano 3
	@PostMapping("/premiumSelected")
	public ModelAndView createPremium(@ModelAttribute Planos planos) {
		ModelAndView mv = new ModelAndView("/PosPlanos");
		mv.addObject("planos", planos);
		return mv;
	}
	@PostMapping("/personalize")
	public ModelAndView createPersonalize(
		@Valid 
		@ModelAttribute Planos planos, BindingResult verifica) {
		
		//Model
		ModelAndView mv = new ModelAndView("/Planos");
		
		//Var
		String nome;
		int qtdRecep;
		int qtdMed;
		int qtdTol;
		float valor;
		
		nome = "Personalizado";
		qtdRecep = planos.getQntRec();
		qtdMed = planos.getQntMed();
		qtdTol = planos.getQntTolerancia();
		valor = planos.getValorPlano();
		
		if(verifica.hasErrors()) {
			mv = new ModelAndView("planos");
			System.out.println("tem errooooo*****");
			
		}else {
			
			//verificando os valores preenchidos
			if(qtdRecep == 1 && qtdMed == 1 && qtdTol == 3){
				valor = 99.99f;
				
			}else if(qtdRecep == 3 && qtdMed == 5 && qtdTol == 5){
				valor = 279.80f;
				
			}else if(qtdRecep == 5 && qtdMed == 15 && qtdTol == 7){
				valor = 679.80f;
				
			}else{
				//calculando valor o total
				valor = ((qtdRecep * 7 ) + (qtdMed * 10) + ( qtdTol * 20));
			}
			//resolve o bug
			mv.addObject("nomePl", nome);
			mv.addObject("valor", valor);
			mv.addObject("recep", qtdRecep);
			mv.addObject("med", qtdMed);
			mv.addObject("tole", qtdTol);
		}
		
		planos = new Planos(nome, valor, qtdRecep, qtdMed, qtdTol);
		mv.addObject("planos", planos);
		return mv;
	}
	
	//Aquisição do plano 
	@PostMapping("/personalizedSelected")
	public ModelAndView createPersonalized(@ModelAttribute Planos planos) {
		ModelAndView mv = new ModelAndView("/PosPlanos");
		mv.addObject("planos", planos);
		return mv;
	}
	
	//Aplicação do desconto
	@PostMapping("/desconto")
	public ModelAndView createDesconto(@ModelAttribute Planos planos, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("/PosPlanos");
		
		String codigo = request.getParameter("cupomDesc");
		float valorAux;
		float valorFinal;
		boolean temErro = false;
		
		if("10PONTUAL".equalsIgnoreCase(codigo)) {
			valorAux = (planos.getValorPlano() * 10)/100;
			valorFinal = planos.getValorPlano() - valorAux;
			planos.setValorPlano(valorFinal);
		}else{
			temErro = true;
		}
		System.out.println(planos.getValorPlano());
		return mv;
	}
}