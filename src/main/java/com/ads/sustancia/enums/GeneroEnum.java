package com.ads.sustancia.enums;

public enum GeneroEnum {
    
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    TRANSGENERO("Transgênero"),
    NAOBINARIO("Não Binário"),
    OUTRO("Outro");

    private final String descricao;
    
    GeneroEnum(String descricao){
        this.descricao = descricao;
    }

    public static GeneroEnum repostaGenero(String valor){
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
