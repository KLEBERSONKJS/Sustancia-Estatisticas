package com.ads.sustancia.record;

public record FiltroDTO (
    int idade,
    String genero,
    String raca,
    String escolaridade,
    String estadoCivil,
    String emprego,
    String auxilio,
    String dependentes,
    String religiao
){
    public Integer getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getRaca() {
        return raca;
    }
}
