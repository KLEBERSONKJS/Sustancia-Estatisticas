package com.ads.sustancia.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

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
}
