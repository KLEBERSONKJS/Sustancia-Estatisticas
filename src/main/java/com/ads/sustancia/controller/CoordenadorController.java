package com.ads.sustancia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.record.CadastroCoordenadorDTO;
import com.ads.sustancia.record.ErrorResponse;
import com.ads.sustancia.record.VerificacaoCadastroDTO;
import com.ads.sustancia.service.CoordenadorService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/coordenador")
@Slf4j
public class CoordenadorController {

    @Autowired
    private CoordenadorService coordenadorService;

    @PostMapping("/cadastrar")
    public String cadastrarCoordenador(@Valid CadastroCoordenadorDTO dados, Model model) {

            coordenadorService.cadastrarCoordenador(dados);
            model.addAttribute("email", dados.email());
            log.info("Cadastro com Suscesso");
            return "verificacaoCadastro";
    }

    
    
    @GetMapping()
    public String cadastroCoordenador() {
        return "cadastro-coordenador";
    }
    
    @PostMapping("/verificar-codigo")
    public String verificarCodigo(VerificacaoCadastroDTO verificar, Model model) {
        try {
            coordenadorService.verificarCodigo(verificar.email(), verificar.codigo());
            log.error("logou");
            return "login";
        } catch (Exception e) {
            log.error("nao logou");
            return "verificarCadastro";
        }
    }
    
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
    ErrorResponse error = new ErrorResponse("Erro:", ex.getFieldError().getDefaultMessage());
        model.addAttribute("error", error);
        return "cadastro-coordenador";
        
    }
    
}
