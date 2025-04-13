package com.ads.sustancia.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.PessoaDTO;
import com.ads.sustancia.dto.response.ErrorResponse;
import com.ads.sustancia.service.PessoaService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.security.Principal;

@Controller 
@Slf4j
@RequestMapping("/formulario")
@RequiredArgsConstructor
public class FormularioController {
    
    private final PessoaService service;


    @PostMapping("/save")
    @Transactional
    public String cadastrarPessoa(@Valid PessoaDTO dto, Model model, Principal principal) {
        try {

            service.cadastrarPessoa(dto);
            model.addAttribute("mensagem", "O cadastro de %s teve exito!".formatted(dto.nome()));
        } catch (Exception e) {
            model.addAttribute("error", "Erro ao cadastrar pessoa: " + e.getMessage());
        }
        return "formulario";
    }


    @GetMapping()
    public String formEntrevista(){
        return "formulario";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationException(MethodArgumentNotValidException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("Error:", ex.getBindingResult().getFieldError().getDefaultMessage());
        model.addAttribute("error", error);
        return "formulario";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("Error ao Cadastarar Interno", "Contate o Desenvolvedor");
        model.addAttribute("error", error);
        return "formulario";
    }

  

}

