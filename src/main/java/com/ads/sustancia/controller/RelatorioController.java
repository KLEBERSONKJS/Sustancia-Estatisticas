package com.ads.sustancia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.record.FiltrosDTO;
import com.ads.sustancia.service.PessoaService;

@Controller
@RequestMapping("relatorio")
public class RelatorioController {
    
    @Autowired
    PessoaService pessoaService;

    @GetMapping()
    public String visualizarRelatorio(){
        return "grafico";
    } 


    @PostMapping
    public String aplicarFiltros(FiltrosDTO filtroDTO){
        pessoaService.dadosfiltrados(filtroDTO);
        return "ok";
    }
}
