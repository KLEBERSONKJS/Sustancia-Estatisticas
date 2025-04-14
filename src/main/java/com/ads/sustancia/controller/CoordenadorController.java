package com.ads.sustancia.controller;


import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.model.Usuario;
import com.ads.sustancia.repository.UsuarioRepository;
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

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/coordenador")
@Slf4j
@RequiredArgsConstructor
public class CoordenadorController {

   
    private final CoordenadorService service;
    private final EntrevistadorService entrevistadorService;
    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;



    @GetMapping("/perfil")
    public String perfil(Model model, Principal principal) {
        Usuario user = repository.findByEmail(principal.getName())
                .orElseThrow();
        model.addAttribute("user", user);
        return "perfil"; 
    }

    @PostMapping("/cadastrar")
    public String cadastrarCoordenador(@Valid CoordenadorDTO dados, Model model) {
        try {
            Coordenador coordenador = new Coordenador(dados);
            coordenador.setSenha(encoder.encode(dados.getSenha()));
            service.save(coordenador);
            model.addAttribute("mensagem", "O cadastro de %s teve exito".formatted(dados.getNome()));
            return "redirect:/coordenador/admin";
        } catch (RuntimeException e) {
            model.addAttribute("erro", "Erro ao cadastrar entrevistador: " + e.getMessage());
            return "coordenadores";
        }

    }

    
    
    @GetMapping("/admin")
    public String cadastroCoordenador(Model model) {
        List<CoordenadorDTO> coordenadores = new ArrayList<>();
        coordenadores = service.findAll();
        model.addAttribute("coordenadores",coordenadores );
        return "coordenadores";
    }


    @GetMapping("/entrevistadores")
    public String entrevistadores(Model model) {
        List<EntrevistadorDTO> entrevistadores = new ArrayList<>();
        entrevistadores = entrevistadorService.findAll();
        model.addAttribute("entrevistadores", entrevistadores);
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
