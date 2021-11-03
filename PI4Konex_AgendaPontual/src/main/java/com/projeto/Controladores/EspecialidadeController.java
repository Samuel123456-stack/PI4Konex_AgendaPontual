package com.projeto.Controladores;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.Servicos.EspecialidadeServico;

public class EspecialidadeController {

	@Autowired
	private EspecialidadeServico espServ;
	
//	@GetMapping("/especialidade")
//	@ResponseBody
//	public String listaEspec(){
//		
//		String json = null;
//		List<Object[]> list = espServ.findAll();
//		try {
//			json = new ObjectMapper().writeValueAsString(list);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		return json;
//	}
}
