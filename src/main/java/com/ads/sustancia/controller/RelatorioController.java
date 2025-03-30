package com.ads.sustancia.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.enums.AuxilioEnum;
import com.ads.sustancia.enums.DependentesEnum;
import com.ads.sustancia.enums.EmpregoEnum;
import com.ads.sustancia.enums.EscolaridadeEnum;
import com.ads.sustancia.enums.EstadoCivilEnum;
import com.ads.sustancia.enums.GeneroEnum;
import com.ads.sustancia.enums.RacaEnum;
import com.ads.sustancia.enums.ReligiaoEnum;
import com.ads.sustancia.record.DadosGraficoDTO;
import com.ads.sustancia.record.ErrorResponse;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.service.RelatorioService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("relatorio")
@RequiredArgsConstructor
@Slf4j
public class RelatorioController {
    
    private final RelatorioService relatorioService;
    private java.util.Map<String, Long> dadosFiltrados;

    @GetMapping()
    public String visualizarRelatorio(FiltroDTO filtroDTO, Model model){
        List<DadosGraficoDTO> dadosFiltrados2 = relatorioService.dadosFiltradosTeste(filtroDTO);
        model.addAttribute("dados", dadosFiltrados2);
        return "grafico";
    } 


    @PostMapping
    public String aplicarFiltros(){
        return "ok";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, Model model) {
        log.error("Error ocorrido: {}", ex.getMessage());
    ErrorResponse error = new ErrorResponse("Erro:", ex.getFieldError().getDefaultMessage());
        model.addAttribute("error", error);
        return "grafico";
        
    }


     @ModelAttribute("racas")
    public RacaEnum[] getTodasRacas() {
        return RacaEnum.values();
    }

    @ModelAttribute("generos")
    public GeneroEnum[] getTodosGeneros() {
        return GeneroEnum.values();
    }

    @ModelAttribute("religioes")
    public ReligiaoEnum[] getReligiaoEnums(){
        return ReligiaoEnum.values();
    }

    @ModelAttribute("escolaridades")
    public EscolaridadeEnum[] getEscolariadeEnums(){
        return EscolaridadeEnum.values();
    }

    @ModelAttribute("estadosCivis")
    public EstadoCivilEnum[] getEstadoCivilEnums(){
        return EstadoCivilEnum.values();
    }

    @ModelAttribute("empregos")
    public EmpregoEnum[] getEmpregoEnums() {
        return EmpregoEnum.values();
    }

    @ModelAttribute("dependentes")
    public DependentesEnum[] getDependentesEnums() {
        return DependentesEnum.values();
    }

    @ModelAttribute("auxilios")
    public AuxilioEnum[] getAuxilioEnums() {
        return AuxilioEnum.values();
    }
}
