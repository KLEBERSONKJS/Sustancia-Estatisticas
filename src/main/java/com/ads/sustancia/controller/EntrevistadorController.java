package com.ads.sustancia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String cadastrarEntrevistador(@ModelAttribute EntrevistadorDTO dto, Model model) {
        try {
            service.save(dto);
            model.addAttribute("mensagem", "O cadastro de %s foi realizado com sucesso!".formatted(dto.nome()));
            return "entrevistador";
        } catch (Exception e) {
            model.addAttribute("erro", "Erro ao cadastrar entrevistador: " + e.getMessage());
            return "entrevistador";
        }
    }


    @GetMapping()
    public String cadastroEntrevistador(){
        return "entrevistador";
    }

    @ResponseBody
    @GetMapping("/api/entrevistadores")
    public List<EntrevistadorDTO> listar() {
        return service.findAll();
    }

    @ResponseBody
    @PostMapping("/api/entrevistadores")
    @Transactional
    public ResponseEntity<Void> cadastrar(@RequestBody EntrevistadorDTO dto) {
        service.save(dto);
        return ResponseEntity.ok().build();
    }


    @ResponseBody
    @PutMapping("/api/entrevistadores/{id}")
    @Transactional
    public ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody EntrevistadorDTO dto) {
        EntrevistadorDTO atualizado = new EntrevistadorDTO(
            id,
            dto.nome(),
            dto.email(),
            dto.dataNascimento(),
            dto.senha()
        );
        service.update(atualizado);
        return ResponseEntity.ok().build();
    }
    

    @ResponseBody
    @DeleteMapping("/api/entrevistadores/{id}")
    @Transactional
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    


}
