package com.ads.sustancia.dto.request;

import com.ads.sustancia.model.Entrevistador;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record PessoaDTO(
//ao receber a list de refeicoes e consumo, se caso marcado apenas um checkbox o front nao retorna um array, fazer este ajuste
//adiconar a referencia de quem é o entrevistardor, o entrevistador logado deverar ser referenciado aqui
//auxilios o front retorna apenas uma string, necessario array?
        Entrevistador entrevistador,
        @NotBlank
        String nome,
        @NotNull
        int idade,
        @NotBlank
        String genero,
        @NotBlank
        String raca,
        @NotBlank
        String escolaridade,
        @NotBlank
        String estado_civil,
        @NotBlank
        String emprego,
        @NotBlank(message = "NAO PODE SER NULO")
        String auxilios,
        @NotBlank
        String familia,
        @NotBlank
        String religiao,
        @NotBlank
        String refeicoes_com_tecnologia,
        @NotBlank
        String refeicoes,
        @NotBlank
        String consumo,
        @NotBlank
        String ebia_1,
        @NotBlank
        String ebia_2,
        @NotBlank
        String ebia_3,
        @NotBlank
        String ebia_4,
        @NotBlank
        String ebia_5,
        @NotBlank
        String ebia_6,
        @NotBlank
        String ebia_7,
        @NotBlank
        String ebia_8
) {

}
