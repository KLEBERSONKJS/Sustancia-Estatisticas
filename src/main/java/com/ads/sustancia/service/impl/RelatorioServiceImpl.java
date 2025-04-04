package com.ads.sustancia.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import com.ads.sustancia.enums.SimNaoNaoSabeEnum;
import com.ads.sustancia.model.ConsumoAlimentar;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.repository.PessoaRepository;
import com.ads.sustancia.service.RelatorioService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioServiceImpl implements RelatorioService {

        private final PessoaRepository pessoaRepository;

        public DadosGraficoDTO dadosFiltradosInseguracaAlimentar(FiltroDTO filtroDTO, String pergunta, String descricao,
                        Function<InsegurancaAlimentar, SimNaoNaoSabeEnum> extrator) {

                List<Resposta> valores = pessoaRepository.filtrarPessoas(filtroDTO).stream()
                                .map(Pessoa::getInseguracaAlimentar)
                                .filter(Objects::nonNull)
                                .map(extrator)
                                .filter(Objects::nonNull)
                                .map(Enum::name)
                                .collect(Collectors.groupingBy(
                                                Function.identity(),
                                                Collectors.counting()))
                                .entrySet().stream()
                                .map(entry -> new Resposta((entry.getValue().equals(0)) ? null : entry.getKey(),
                                                entry.getValue()))
                                .collect(Collectors.toList());

                DadosGraficoDTO dto = new DadosGraficoDTO(pergunta, descricao, valores);
                if (!dto.getRespostas().isEmpty()) {
                        return dto;
                }
                return null;
        }

        @Override
        public List<Resposta> refeicoesList (FiltroDTO filtroDTO) {

                 return pessoaRepository.filtrarPessoas(filtroDTO).stream()
                                .filter(p -> p.getConsumoAlimentar() != null)
                                .map(Pessoa::getConsumoAlimentar)
                                .filter(consumo -> consumo.getRefeicoesDiaList() != null)
                                .flatMap(consumo -> consumo.getRefeicoesDiaList().stream())
                                .map(Enum::name)
                                .collect(Collectors.groupingBy(
                                                Function.identity(),
                                                Collectors.counting()))
                                .entrySet()
                                .stream()
                                .map(entry -> new Resposta(entry.getKey(), entry.getValue()))
                                .collect(Collectors.toList());
        }

        @Override
        public List<Resposta> tiposRefeicoes (FiltroDTO filtroDTO) {

                 return pessoaRepository.filtrarPessoas(filtroDTO).stream()
                                .filter(p -> p.getConsumoAlimentar() != null)
                                .map(Pessoa::getConsumoAlimentar)
                                .filter(consumo -> consumo.getTiposRefeicoesList() != null)
                                .flatMap(consumo -> consumo.getTiposRefeicoesList().stream())
                                .map(Enum::name)
                                .collect(Collectors.groupingBy(
                                                Function.identity(),
                                                Collectors.counting()))
                                .entrySet()
                                .stream()
                                .map(entry -> new Resposta(entry.getKey(), entry.getValue()))
                                .collect(Collectors.toList());
        }

        public List<Resposta> refeicaoPorCelular(FiltroDTO filtro) {

                return pessoaRepository.filtrarPessoas(filtro).stream()
                                .map(Pessoa::getConsumoAlimentar)
                                .filter(Objects::nonNull)
                                .map(ConsumoAlimentar::getRefeicaoComCelular)
                                .filter(Objects::nonNull)
                                .map(Enum::name)
                                .collect(Collectors.groupingBy(
                                                Function.identity(),
                                                Collectors.counting()))
                                .entrySet().stream()
                                .map(entry -> new Resposta(entry.getKey(),
                                                entry.getValue()))
                                .collect(Collectors.toList());

        }

}
