package com.ads.sustancia.controller;

import com.ads.sustancia.dto.request.UsuarioDTO;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.service.UsuarioService;
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
    private final UsuarioService service2;
    private final PasswordEncoder encoder;

    @PostMapping("/cadastrar")
    @Transactional
    public String cadastrarEntrevistador(@Valid EntrevistadorDTO dados, Model model) {
        try {
            Entrevistador entrevistador = new Entrevistador(dados);
            entrevistador.setSenha(encoder.encode(dados.getSenha()));
            service.save(entrevistador);
            model.addAttribute("mensagem", "O cadastro de %s teve exito".formatted(dados.getNome()));
            return "redirect:/coordenador/entrevistadores";
        } catch (RuntimeException e) {
            model.addAttribute("erro", "Erro ao cadastrar entrevistador: " + e.getMessage());
        }
        return "entrevistadores";
    }


}
