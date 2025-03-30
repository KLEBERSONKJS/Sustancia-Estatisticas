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
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.DadosGraficoDTO;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioService {

    private final PessoaRepository pessoaRepository;

    public List<DadosGraficoDTO> dadosFiltrados(FiltroDTO filtro) {
        List<Object[]> resultados = pessoaRepository.contarRespostasRefeicaoComCelular(filtro);
        if (resultados.isEmpty() || resultados.get(0) == null) {
            throw new RuntimeErrorException(null, "Sem Dados para exibir");
        }

        Object[] resultado = resultados.get(0);

        List<DadosGraficoDTO> dados = new ArrayList<>();
        dados.add(new DadosGraficoDTO("SIM", ((Number) resultado[0]).longValue()));
        dados.add(new DadosGraficoDTO("NAO", ((Number) resultado[1]).longValue()));
        dados.add(new DadosGraficoDTO("NAOSABE", ((Number) resultado[2]).longValue()));
        return dados;
    }

    public List<DadosGraficoDTO> dadosFiltradosTeste(FiltroDTO filtro) {
        List<Pessoa> resultados = pessoaRepository.filtrarPessoas(filtro);

        Map<SimNaoNaoSabeEnum, Long> contagemPorRefeicao = resultados.stream()
                .map(Pessoa::getConsumoAlimentar)
                .filter(Objects::nonNull)
                .map(ConsumoAlimentar::getRefeicaoComCelular)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        List<DadosGraficoDTO> contagem = new ArrayList<>();
        contagemPorRefeicao.forEach((arg0, arg1) -> {
            contagem.add(new DadosGraficoDTO(arg0.name(), arg1));
        });
        return contagem;

    }

}
