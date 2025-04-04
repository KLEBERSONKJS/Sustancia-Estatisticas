package com.ads.sustancia.service;

import java.util.List;
import java.util.function.Function;

import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import com.ads.sustancia.enums.SimNaoNaoSabeEnum;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Resposta;

public interface RelatorioService {

       DadosGraficoDTO dadosFiltradosInseguracaAlimentar(FiltroDTO filtroDTO, String pergunta, String descricao, Function<InsegurancaAlimentar, SimNaoNaoSabeEnum> extrator);

       List<Resposta> refeicoesList(FiltroDTO filtroDTO);

       List<Resposta> tiposRefeicoes(FiltroDTO filtroDTO);
       
}

