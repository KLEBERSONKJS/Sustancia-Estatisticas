package com.ads.sustancia.dto.response;

import com.ads.sustancia.model.Resposta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosGraficoDTO {
    private String pergunta;
    private String descricao;
    private List<Resposta> respostas;
}
