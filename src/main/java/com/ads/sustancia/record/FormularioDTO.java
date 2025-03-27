package com.ads.sustancia.record;

import java.util.List;

import com.ads.sustancia.model.Entrevistador;


public record FormularioDTO(
//ao receber a list de refeicoes e consumo, se caso marcado apenas um checkbox o front nao retorna um array, fazer este ajuste
//adiconar a referencia de quem é o entrevistardor, o entrevistador logado deverar ser referenciado aqui
//auxilios o front retorna apenas uma string, necessario array?
        Entrevistador entrevistador,
        String nome, int idade, String genero, String raca, String escolaridade, String estado_civil, String emprego,
        String auxilios, String familia, String religiao, String refeicoes_com_tecnologia, String refeicoes, String consumo,
        String ebia_1,String ebia_2, String ebia_3, String ebia_4, String ebia_5, String ebia_6, String ebia_7, String ebia_8
) {

}
