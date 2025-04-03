package com.ads.sustancia.service;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import com.ads.sustancia.enums.SimNaoNaoSabeEnum;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioService {

        private final PessoaRepository pessoaRepository;

        public DadosGraficoDTO dadosFiltradosInseguracaAlimentar(FiltroDTO filtroDTO, String pergunta, String descricao, Function<InsegurancaAlimentar, SimNaoNaoSabeEnum> extrator) {
               
                 DadosGraficoDTO dto= getInsegurancaAlimentarDadosGrafico(filtroDTO,pergunta, descricao, extrator); 
                 if (!dto.getRespostas().isEmpty()) {
                        return dto;
                 }
                 return null;
        }

        private DadosGraficoDTO getInsegurancaAlimentarDadosGrafico(FiltroDTO filtro,String pergunta,String descricao,
                        Function<InsegurancaAlimentar,SimNaoNaoSabeEnum> extrator) {

                                

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
                                .map(entry -> new Resposta((entry.getValue().equals(0))?null:entry.getKey(), entry.getValue()))
                                .collect(Collectors.toList());

             
                        DadosGraficoDTO dto = new DadosGraficoDTO(pergunta,descricao, valores);
                        return dto;

        }

}
