package com.ads.sustancia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.service.EntrevistadorService;

import jakarta.transaction.Transactional;

@Controller
@RequestMapping("/entrevistador")
public class EntrevistadorController {


    @Autowired
    private EntrevistadorService entrevistadorService;

    @PostMapping("/cadastrar")
    @Transactional
    public String cadastrarEntrevistador(EntrevistadorDTO dadosCadastroEntrevistador, Model model) {
        try {
            //entrevistadorService.cadastrarEntrevistador(dadosCadastroEntrevistador);
           // model.addAttribute("O cadastro de " + dadosCadastroEntrevistador.nome() + " teve exito!");
            return "redirect:/entrevistador";
        } catch (Exception e) {
            model.addAttribute("Erro ao cadastrar pessoa: " + e.getMessage());
            return "entrevistador";
        }
    }




    @GetMapping()
    public String cadastroEntrevistador(){
        return "entrevistador";
    }

}
