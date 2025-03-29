package com.ads.sustancia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.record.ErrorResponse;
import com.ads.sustancia.record.FormularioDTO;
import com.ads.sustancia.service.PessoaService;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Controller 
@Slf4j
@RequestMapping("/formulario")
public class PessoaController {
    
    @Autowired
    private PessoaService pessoaService;


    @PostMapping("/save")
    @Transactional
    public String cadastrarPessoa(FormularioDTO dadosPessoaForms, Model model) {
        try {
            pessoaService.cadastrarPessoa(dadosPessoaForms);
            System.out.println(dadosPessoaForms);
            return "redirect:/formulario";
        } catch (Exception e) {
            model.addAttribute("error", "Erro ao cadastrar pessoa: " + e.getMessage());
            return "formulario";  
        }
    }

   
    @GetMapping()
    public String formEntrevista(){
        return "formulario";
    }

    @ExceptionHandler(Exception.class)
    public String handleValidationException(Exception ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("Error ao Cadastarar: ", ex.getLocalizedMessage());
        model.addAttribute("error", error);
        return "formulario";
    }

}

