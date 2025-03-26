package com.ads.sustancia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.ErrorResponse;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.record.FormularioDTO;
import com.ads.sustancia.service.PessoaService;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Controller 
@Slf4j
@RequestMapping("/formulario")
public class PessoaController {
    
    @Autowired
    private PessoaService pessoaService;

    // Método para exibir o formulário de filtro
    @GetMapping("/filtro")
    public String exibirFormularioFiltro(Model model) {
        // Apenas renderiza o formulário de filtro
        return "filtro";  // Página onde você terá o formulário para filtro
    }

    // Método para realizar a filtragem via GET
    @GetMapping("/filtro/resultado")
    public String filtrarPessoas(FiltroDTO dadosFiltro, Model model) {

    // Adiciona um log para ver os dados do filtro
    System.out.println("Filtrando com os seguintes dados:");
    System.out.println("Idade: " + dadosFiltro.idade());
    System.out.println("Gênero: " + dadosFiltro.genero());
    System.out.println("Raça: " + dadosFiltro.raca());
    


        List<Pessoa> pessoasFiltradas = pessoaService.filtrarPessoas(dadosFiltro);
        model.addAttribute("pessoas", pessoasFiltradas);
        return "resultado";  // Página para exibir os resultados filtrados
    }

    @PostMapping("/save")
    @Transactional
    public String cadastrarPessoa(FormularioDTO dadosPessoaForms, Model model) {
        try {
            pessoaService.cadastrarPessoa(dadosPessoaForms);
            return "redirect:/formulario";
        } catch (Exception e) {
            model.addAttribute("error", "Erro ao cadastrar pessoa: " + e.getMessage());
            return "formulario";  
        }
    }

   
    @GetMapping()
    public String formEntrevista(){
        return "formulario";
    }

    @ExceptionHandler(Exception.class)
    public String handleValidationException(Exception ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse("Error ao Cadastarar: ", ex.getLocalizedMessage());
        model.addAttribute("error", error);
        return "formulario";
    }

}

