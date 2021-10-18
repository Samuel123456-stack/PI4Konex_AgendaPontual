package com.projeto.Controladores;

import com.projeto.Servicos.RecepcionistaServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecepcionistaController {
    
    @Autowired
    RecepcionistaServico recepServ;
    //Averiguar melhor este metodo
    @GetMapping("/painelRecep")
    private String painelRecep(){
        return "tela_painelRecep";
    }
}
