package com.ads.sustancia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.service.EntrevistadorService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/entrevistador")
@RequiredArgsConstructor
public class EntrevistadorController {

    private final EntrevistadorService service;

    @PostMapping("/cadastrar")
    @Transactional
    public String cadastrarEntrevistador(@ModelAttribute EntrevistadorDTO dadosCadastroEntrevistador, Model model) {
        try {
            //entrevistadorService.cadastrarEntrevistador(dadosCadastroEntrevistador);
           // model.addAttribute("O cadastro de " + dadosCadastroEntrevistador.nome() + " teve exito!");
            service.save(dadosCadastroEntrevistador);
            model.addAttribute("mensagem", "O cadastro de " + dadosCadastroEntrevistador.nome() + " foi realizado com sucesso!");
            return "redirect:/entrevistador";
        } catch (Exception e) {
            model.addAttribute("erro", "Erro ao cadastrar entrevistador: " + e.getMessage());
            return "entrevistador";
        }
    }

    @DeleteMapping("/remover/{id}")
    public String removerEntrevistador(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/entrevistador";
    }

    @PutMapping("/atualizar/{id}")
    public String atualizarEntrevistador(@PathVariable Long id, @ModelAttribute EntrevistadorDTO dto) {
        service.update(dto);
        return "redirect:/entrevistador";
    }



    @GetMapping()
    public String cadastroEntrevistador(){
        return "entrevistador";
    }

}
