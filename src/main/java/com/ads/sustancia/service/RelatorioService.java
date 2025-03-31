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

        public DadosGraficoDTO dadosFiltradosInseguracaAlimentar(FiltroDTO filtroDTO, String pergunta, String descricao, Function<InsegurancaAlimentar, SimNaoNaoSabeEnum> extrator) {
               
                 return getInsegurancaAlimentarDadosGrafico(filtroDTO,pergunta, descricao, extrator); 
        }

        private DadosGraficoDTO getInsegurancaAlimentarDadosGrafico(FiltroDTO filtro,String pergunta,String descricao,
                        Function<InsegurancaAlimentar,SimNaoNaoSabeEnum> extrator) {


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
                                .map(entry -> new Resposta(entry.getValue().equals(0)?null: entry.getKey(), entry.getValue()))
                                .collect(Collectors.toList());

                if (valores!=null) {
                        DadosGraficoDTO dto = new DadosGraficoDTO(pergunta,descricao, valores);
                        return dto;
                }
                return null;
        }

}
