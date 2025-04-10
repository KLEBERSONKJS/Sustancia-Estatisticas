package com.ads.sustancia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.dto.response.ErrorResponse;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.service.impl.CoordenadorServiceImpl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/coordenador")
@Slf4j
@RequiredArgsConstructor
public class CoordenadorController {

   
    private final CoordenadorServiceImpl coordenadorService;

    @GetMapping("/profile")
    public Coordenador getCoordenadorProfile(@RequestParam String email) {
        return coordenadorService.getCoordenadorProfile(email);
    }

    @GetMapping("/perfil")
    public String perfil(Model model, @RequestParam String email) {
        Coordenador coordenador = coordenadorService.getCoordenadorProfile(email); 
        model.addAttribute("coordenador", coordenador); 
        return "perfil"; 
    }

    @PostMapping("/cadastrar")
    public String cadastrarCoordenador(@Valid CoordenadorDTO dados, Model model) {

            coordenadorService.save(dados);
            model.addAttribute("email", dados.email());
            log.info("Cadastro com Suscesso");
            return "verificacaoCadastro";
    }

    
    
    @GetMapping()
    public String cadastroCoordenador() {
        return "cadastro-coordenador";
    }
    

    
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
    ErrorResponse error = new ErrorResponse("Erro:", ex.getFieldError().getDefaultMessage());
        model.addAttribute("error", error);
        return "cadastro-coordenador";
        
    }
    
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(RuntimeException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("", ex.getMessage());
        model.addAttribute("error", error);
        return "cadastro-coordenador";
        
    }
}
