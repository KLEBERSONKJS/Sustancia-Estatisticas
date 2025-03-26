package com.ads.sustancia.enums;

public enum Genero {
    
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    TRANSGENERO("Transgênero"),
    NAOBINARIO("Não Binário"),
    OUTRO("Outro");

    private final String descricao;
    
    Genero(String descricao){
        this.descricao = descricao;
    }

    public static Genero repostaGenero(String valor){
        if (valor.equals("Masculino")) {
            return MASCULINO;
        }else if (valor.equals("Feminino")) {
            return FEMININO;
        }else if (valor.equals("Transgênero")) {
            return TRANSGENERO;
        }else if (valor.equals("Não Binário")) {
            return NAOBINARIO;
        }else{
            return OUTRO;
        }
    }
}
