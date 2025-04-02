package com.ads.sustancia.controller;

import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.LoginDTO;
import com.ads.sustancia.dto.response.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/auth")
@Slf4j
public class AutenticacoController {


    @PostMapping()
    public String auth(LoginDTO dadosLogin, Model model){

            return "home";
     
    }

    @GetMapping()
    public String login(){
        return "login-administrador";
    }
    

    @ExceptionHandler(AuthenticationException.class)
    public String handleAuthenticationException(AuthenticationException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("", ex.getLocalizedMessage());
        model.addAttribute("error", error);
        return "login-administrador";
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(RuntimeException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("", ex.getMessage());
        model.addAttribute("error", error);
        return "login-administrador";
        
    }
}

