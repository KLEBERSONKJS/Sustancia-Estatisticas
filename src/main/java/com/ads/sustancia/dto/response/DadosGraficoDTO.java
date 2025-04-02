package com.ads.sustancia.dto.response;

import java.util.List;
import java.util.Map;

import com.ads.sustancia.model.Resposta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosGraficoDTO {
    private String pergunta;
    private String descricao;
    private List<Resposta> respostas;
}
