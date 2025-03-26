package com.ads.sustancia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("relatorio")
public class RelatorioController {
    

    @GetMapping()
    public String visualizarRelatorio(){
        return "visualizar-relatorios";
    } 
}
