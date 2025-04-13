package com.ads.sustancia.controller;

import jakarta.validation.Valid;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.service.EntrevistadorService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/entrevistador")
@RequiredArgsConstructor
public class EntrevistadorController {

    private final EntrevistadorService service;
    private final PasswordEncoder encoder;

    @PostMapping("/cadastrar")
    @Transactional
    public String cadastrarEntrevistador(@Valid EntrevistadorDTO dados, Model model) {
        try {
            dados.setSenha(encoder.encode(dados.getSenha()));
            service.save(dados);
        } catch (Exception e) {
            model.addAttribute("erro", "Erro ao cadastrar entrevistador: " + e.getMessage());
        }
        return "entrevistador";
    }


    @GetMapping()
    public String cadastroEntrevistador() {
        return "entrevistador";
    }



}
