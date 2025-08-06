package com.ads.sustancia.controller;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.service.CoordenadorService;
import com.ads.sustancia.service.EntrevistadorService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/entrevistador")
@RequiredArgsConstructor
public class EntrevistadorController {

    private final EntrevistadorService service;
    private final CoordenadorService coordenadorService;
    private final PasswordEncoder encoder;

    @PostMapping("/cadastrar")
    @Transactional
    public String cadastrarEntrevistador(@Valid EntrevistadorDTO dados, Model model,Principal principal) {
        try {
            var coordenador = coordenadorService.findByEmail(principal.getName());
            dados.setIdCoordenador(coordenador.getId());
            dados.setSenha(encoder.encode(dados.getSenha()));
            service.save(dados);
            model.addAttribute("mensagem", "O cadastro de %s teve exito".formatted(dados.getNome()));
            return "redirect:/entrevistador/entrevistadores";
        } catch (RuntimeException e) {
            model.addAttribute("error", "Erro ao cadastrar entrevistador: " + e.getMessage());
        }
        return "entrevistadores";
    }

    @GetMapping("/buscar")
    public String buscarPorNome(String nome, Model model) {
        List<EntrevistadorDTO> resultado = service.findByNome(nome);
        model.addAttribute("entrevistadores", resultado);
        return "entrevistadores";
    }

    @GetMapping("/buscarPorCpf")
    public String buscarPorCpf(@RequestParam("cpf") String cpf, Model model) {
        List<EntrevistadorDTO> resultado = service.findByCpf(cpf);
        model.addAttribute("entrevistadores", resultado);
        return "entrevistadores";
    }

    @GetMapping("/entrevistadores")
    public String entrevistadores(Model model) {
        List<EntrevistadorDTO> entrevistadores = new ArrayList<>();
        entrevistadores = service.findAll();
        model.addAttribute("entrevistadores", entrevistadores);
        return "entrevistadores";
    }

    @PostMapping("/atualizar")
    public String atualizarEntrevistador(@ModelAttribute EntrevistadorDTO dados, RedirectAttributes redirectAttributes) {
        try {
            dados.setSenha(encoder.encode(dados.getSenha()));
            service.atualizarDTO(dados);
            redirectAttributes.addFlashAttribute("mensagem", "Entrevistador atualizado com sucesso!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Erro ao atualizar: " + e.getMessage());
        }
        return "redirect:/entrevistador/entrevistadores";
    }

    @GetMapping("/delete")
    public String deletarID(@RequestParam Long id, Model model) {
        try {
            service.delete(id);
            return "redirect:/entrevistador/entrevistadores";
        } catch (RuntimeException e) {
            model.addAttribute("erro", "Erro ao deletar entrevistador: " + e.getMessage());
            return "/entrevistador/entrevistadores";
        }
    }

}
