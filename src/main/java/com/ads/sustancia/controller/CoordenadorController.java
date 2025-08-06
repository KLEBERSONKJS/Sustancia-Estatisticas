package com.ads.sustancia.controller;

import com.ads.sustancia.dto.request.UsuarioDTO;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.service.CoordenadorService;
import com.ads.sustancia.service.UsuarioService;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    private final UsuarioService usuarioService;
    private final PasswordEncoder encoder;

    @PostMapping("/atualizar")
    public String atualizarCoordenador(@Valid @ModelAttribute CoordenadorDTO dados, Model model) {
        try {
            if (dados.getSenha() != null && !dados.getSenha().isEmpty()) {
                dados.setSenha(encoder.encode(dados.getSenha()));
            } else {
                CoordenadorDTO coordenadorExistente = service.findById(dados.getId());
                dados.setSenha(coordenadorExistente.getSenha());
            }
            service.update(dados);
            return "redirect:/coordenador/admin";
        } catch (RuntimeException e) {
            log.error("Erro ao editar coordenador: {}", e.getMessage(), e);
            model.addAttribute("erro", "Erro ao editar coordenador: " + e.getMessage());
            return "coordenadores";
        }
    }

    @GetMapping("/delete")
    public String deletarID(@RequestParam Long id, Model model, RedirectAttributes redirectAttributes) {
        try {
            service.deleteById(id);
            redirectAttributes.addFlashAttribute("mensagem", "Coordenador excluido com sucesso!");
            return "redirect:/coordenador/admin";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "coordenador/admin";
        }

    }

    @GetMapping("/perfil")
    public String perfil(Model model, Principal principal) {
        UsuarioDTO user = usuarioService.findByEmail(principal.getName());
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

    @GetMapping("/buscar")
    public String buscarPorNome(String nome, Model model) {
        List<CoordenadorDTO> resultado = service.findByNome(nome);
        model.addAttribute("coordenadores", resultado);
        return "coordenadores";
    }

    @GetMapping("/buscarPorCpf")
    public String buscarPorCpf(@RequestParam("cpf") String cpf, Model model) {
        List<CoordenadorDTO> resultado = service.findByCpf(cpf);
        model.addAttribute("coordenadores", resultado);
        return "coordenadores";
    }

    @GetMapping("/admin")
    public String cadastroCoordenador(Model model) {
        List<CoordenadorDTO> coordenadores = new ArrayList<>();
        coordenadores = service.findAll();
        model.addAttribute("coordenadores",coordenadores );
        return "coordenadores";
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