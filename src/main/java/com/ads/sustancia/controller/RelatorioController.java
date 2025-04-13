package com.ads.sustancia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import com.ads.sustancia.dto.response.ErrorResponse;
import com.ads.sustancia.enums.AuxilioEnum;
import com.ads.sustancia.enums.DependentesEnum;
import com.ads.sustancia.enums.EmpregoEnum;
import com.ads.sustancia.enums.EscolaridadeEnum;
import com.ads.sustancia.enums.EstadoCivilEnum;
import com.ads.sustancia.enums.GeneroEnum;
import com.ads.sustancia.enums.RacaEnum;
import com.ads.sustancia.enums.ReligiaoEnum;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.service.impl.RelatorioServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("relatorio")
@RequiredArgsConstructor
@Slf4j
public class RelatorioController {

    private final RelatorioServiceImpl relatorioService;
    private java.util.Map<String, Long> dadosFiltrados;

    @GetMapping()
    public String visualizarRelatorio(FiltroDTO filtroDTO, Model model) {
        DadosGraficoDTO refeicaoComCelular = new DadosGraficoDTO("Você tem costume de fazer refeições mexendo no computador ou celular?", " Coleta de Marcadores de Consumo Alimentar",relatorioService.refeicaoPorCelular(filtroDTO));
        DadosGraficoDTO refeicoes = new DadosGraficoDTO("Quais refeições você faz ao longo do dia?"," Coleta de Marcadores de Consumo Alimentar", relatorioService.refeicoesList(filtroDTO));
        DadosGraficoDTO consumoOntem = new DadosGraficoDTO("Ontem, você consumiu?"," Coleta de Marcadores de Consumo Alimentar", relatorioService.tiposRefeicoes(filtroDTO));
        model.addAttribute("refeicaoPCelular",refeicaoComCelular);
        model.addAttribute("refeicoes",refeicoes);
        model.addAttribute("consumoOntem",consumoOntem);
        model.addAttribute("inseguracaAlimentarList", insegurancaAlimentar(filtroDTO));
        model.addAttribute("filtro",filtroDTO);
        return "relatorio";
    }

    private List<DadosGraficoDTO> insegurancaAlimentar(FiltroDTO filtroDTO) {
        List<DadosGraficoDTO> dadosInsegurancaAlimentar = new ArrayList<>();
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Os moradores deste domicílio tiveram a preocupação de que os alimentos acabassem antes de poderem comprar ou receber mais comida?",
                "Pergunta 1", InsegurancaAlimentar::getPergunta1));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Os alimentos acabaram antes que os moradores deste domicílio tivessem dinheiro para comprar mais comida?",
                "Pergunta 2", InsegurancaAlimentar::getPergunta2));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Os moradores deste domicílio ficaram sem dinheiro para ter uma alimentação saudável e variada?",
                "Pergunta 3", InsegurancaAlimentar::getPergunta3));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                " Os moradores deste domicílio comeram apenas alguns poucos tipos de alimentos que ainda tinham, porque o dinheiro acabou?",
                "Pergunta 4", InsegurancaAlimentar::getPergunta4));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Algum/a morador/a de 18 anos ou mais deixou de fazer alguma refeição, porque não havia dinheiro para comprar comida?",
                "Pergunta 5", InsegurancaAlimentar::getPergunta5));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Algum/a morador/a de 18 anos ou mais comeu menos do que achou que devia, porque não havia dinheiro para comprar comida?",
                "Pergunta 6", InsegurancaAlimentar::getPergunta6));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Algum/a morador/a de 18 anos ou mais sentiu fome, mas não comeu, porque não havia dinheiro para comprar comida?",
                "Pergunta 7", InsegurancaAlimentar::getPergunta7));
        dadosInsegurancaAlimentar.add(relatorioService.dadosFiltradosInseguracaAlimentar(filtroDTO,
                "Algum/a morador/a de 18 anos ou mais fez apenas uma refeição ao dia ou ficou um dia inteiro sem comer porque não havia dinheiro para comprar comida?",
                "Pergunta 8", InsegurancaAlimentar::getPergunta8));

        return dadosInsegurancaAlimentar;
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
    public ReligiaoEnum[] getReligiaoEnums() {
        return ReligiaoEnum.values();
    }

    @ModelAttribute("escolaridades")
    public EscolaridadeEnum[] getEscolariadeEnums() {
        return EscolaridadeEnum.values();
    }

    @ModelAttribute("estadosCivis")
    public EstadoCivilEnum[] getEstadoCivilEnums() {
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
