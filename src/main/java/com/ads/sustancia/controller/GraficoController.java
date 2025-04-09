package com.ads.sustancia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/graficos")
public class GraficoController {

    @GetMapping()
    public String homePage() {
        return "visualizar-relatorios";
    }
}
