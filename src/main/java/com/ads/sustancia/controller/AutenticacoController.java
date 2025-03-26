package com.ads.sustancia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.record.LoginDTO;
import com.ads.sustancia.service.AutenticacaoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/auth")
@Slf4j
public class AutenticacoController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AutenticacaoService autenticacaoService;

    @PostMapping()
    public String auth(LoginDTO dadosLogin, Model model){
    
            var tokenUsuario = new UsernamePasswordAuthenticationToken(dadosLogin.email(),dadosLogin.senha());
            authenticationManager.authenticate(tokenUsuario);
            autenticacaoService.obterToken(dadosLogin);
            return "home";
     
    }

    @GetMapping()
    public String login(){
        return "login-administrador";
    }
}
