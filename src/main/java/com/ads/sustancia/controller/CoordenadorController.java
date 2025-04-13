package com.ads.sustancia.controller;


import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.service.CoordenadorService;
import com.ads.sustancia.service.EntrevistadorService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.dto.response.ErrorResponse;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/coordenador")
@Slf4j
@RequiredArgsConstructor
public class CoordenadorController {

   
    private final CoordenadorService service;
    private final EntrevistadorService entrevistadorService;
    private final PasswordEncoder encoder;



    @GetMapping("/perfil")
    public String perfil() {
        return "perfil"; 
    }

    @PostMapping("/cadastrar")
    public String cadastrarCoordenador(@Valid CoordenadorDTO dados, Model model) {
        try {
            dados.setSenha(encoder.encode(dados.getSenha()));
            Coordenador coordenador = new Coordenador(dados);
            service.save(coordenador);
            model.addAttribute("mensagem", "O cadastro de %s teve exito".formatted(dados.getNome()));
        } catch (RuntimeException e) {
            model.addAttribute("erro", "Erro ao cadastrar entrevistador: " + e.getMessage());
        }
            return "cadastroCoordenador";
    }

    
    
    @GetMapping("/admin")
    public String cadastroCoordenador(Model model) {
        model.addAttribute("coordenadores",service.findAll() );
        return "coordenadores";
    }


    @GetMapping("/entrevistadores")
    public String entrevistadores(Model model) {

        model.addAttribute("entrevistadores",entrevistadorService.findAll() );
        return "entrevistadores";
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
