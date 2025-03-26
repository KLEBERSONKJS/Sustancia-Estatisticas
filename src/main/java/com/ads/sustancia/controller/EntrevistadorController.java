package com.ads.sustancia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ads.sustancia.record.CadastroEntrevistadorDTO;
import com.ads.sustancia.service.EntrevistadorService;

import jakarta.transaction.Transactional;

@Controller
@RequestMapping("/entrevistador")
public class EntrevistadorController {


    @Autowired
    private EntrevistadorService entrevistadorService;

    @PostMapping("/cadastrar")
    @Transactional
    public String cadastrarEntrevistador(CadastroEntrevistadorDTO dadosCadastroEntrevistador, Model model) {
        try {
            entrevistadorService.cadastrarEntrevistador(dadosCadastroEntrevistador);
            model.addAttribute("O cadastro de " + dadosCadastroEntrevistador.nome() + " teve exito!");
            return "redirect:/entrevistador";
        } catch (Exception e) {
            model.addAttribute("Erro ao cadastrar pessoa: " + e.getMessage());
            return "cadastro-entrevistador";
        }
    }


     @PostMapping("/verificar-codigo")
    public ResponseEntity<?> verificarCodigo(@RequestParam String token) {
        try {
            String resultado = entrevistadorService.verificarCadastro(token); 
            return ResponseEntity.ok(resultado); 
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao verificar código.");
        }
    }


    @GetMapping()
    public String cadastroEntrevistador(){
        return "cadastro-entrevistador";
    }

}
