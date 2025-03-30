package com.ads.sustancia.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.ads.sustancia.enums.SimNaoNaoSabeEnum;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.record.DadosGraficoDTO;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioService {

    private final PessoaRepository pessoaRepository;

    // public List<DadosGraficoDTO> dadosFiltradosConsumoAlimentar(FiltroDTO filtro)
    // {
    // Function<ConsumoAlimentar, SimNaoNaoSabeEnum> extrator =
    // ConsumoAlimentar::getRefeicaoComCelular;
    // return getConsumoAlimentaGraficos(filtro, extrator);
    // }

    public List<DadosGraficoDTO> dadosFiltradosInseguracaAlimentar(FiltroDTO filtroDTO) {

        List<Function<InsegurancaAlimentar, SimNaoNaoSabeEnum>> extratores = Arrays.asList(
                InsegurancaAlimentar::getPergunta1,
                InsegurancaAlimentar::getPergunta2,
                InsegurancaAlimentar::getPergunta3,
                InsegurancaAlimentar::getPergunta4,
                InsegurancaAlimentar::getPergunta5,
                InsegurancaAlimentar::getPergunta6,
                InsegurancaAlimentar::getPergunta7,
                InsegurancaAlimentar::getPergunta8);
        List<DadosGraficoDTO> resultados = new ArrayList<>();

        for (int i = 0 ; i < extratores.size(); i++) {
            DadosGraficoDTO dto = new DadosGraficoDTO("Pergunta "+ (i),
                    getInsegurancaAlimentarDadosGrafico(filtroDTO, extratores.get(i)));
            resultados.add(dto);
        }
        return resultados;
    }

    private List<Resposta> getInsegurancaAlimentarDadosGrafico(FiltroDTO filtro,
            Function<InsegurancaAlimentar, SimNaoNaoSabeEnum> extrator) {

        Map<SimNaoNaoSabeEnum, Long> contagens = pessoaRepository.filtrarPessoas(filtro).stream()
                .map(Pessoa::getInseguracaAlimentar)
                .filter(Objects::nonNull)
                .map(extrator)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        List<Resposta> valores = pessoaRepository.filtrarPessoas(filtro).stream()
                .map(Pessoa::getInseguracaAlimentar)
                .filter(Objects::nonNull)
                .map(extrator)
                .filter(Objects::nonNull)
                .map(Enum::name)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .map(entry -> new Resposta(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        return valores;

    }

}
