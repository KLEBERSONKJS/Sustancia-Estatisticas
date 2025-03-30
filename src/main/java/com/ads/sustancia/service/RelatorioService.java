package com.ads.sustancia.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.ads.sustancia.enums.SimNaoNaoSabeEnum;
import com.ads.sustancia.model.ConsumoAlimentar;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.DadosGraficoDTO;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioService {

    private final PessoaRepository pessoaRepository;

    public List<DadosGraficoDTO> dadosFiltradosConsumoAlimentar(FiltroDTO filtro) {
        Function<ConsumoAlimentar,SimNaoNaoSabeEnum> extrator =
        ConsumoAlimentar::getRefeicaoComCelular;
        return getConsumoAlimentaGraficoDTOs(filtro, extrator);
    }

    public List<DadosGraficoDTO> dadosFiltradosInseguracaAlimentar(FiltroDTO filtroDTO){
        Function<InsegurancaAlimentar,SimNaoNaoSabeEnum> extractor = InsegurancaAlimentar::getPergunta1;
        return getDadosAgrupados(filtroDTO,extractor);
    }


    private List<DadosGraficoDTO> getConsumoAlimentaGraficoDTOs(FiltroDTO filtro,
            Function<ConsumoAlimentar, SimNaoNaoSabeEnum> extrator) {
        List<Pessoa> resultados = pessoaRepository.filtrarPessoas(filtro);

        return pessoaRepository.filtrarPessoas(filtro).stream()
                .map(Pessoa::getConsumoAlimentar)
                .filter(Objects::nonNull)
                .map(extrator)
                .filter(Objects::nonNull)
                .map(Enum::name)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .map(entry -> new DadosGraficoDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    private List<DadosGraficoDTO> getDadosAgrupados(FiltroDTO filtro,
            Function<InsegurancaAlimentar, SimNaoNaoSabeEnum> extrator) {
        List<Pessoa> resultados = pessoaRepository.filtrarPessoas(filtro);

        return pessoaRepository.filtrarPessoas(filtro).stream()
                .map(Pessoa::getInseguracaAlimentar)
                .filter(Objects::nonNull)
                .map(extrator)
                .filter(Objects::nonNull)
                .map(Enum::name)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .map(entry -> new DadosGraficoDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

}
