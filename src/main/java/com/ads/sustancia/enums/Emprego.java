package com.ads.sustancia.enums;

public enum Emprego {
    
    MEIOPERIODO("Meio período"),
    DESEMPREGADO("Desempregado"),
    INCAPAZDETRABALHAR("Incapaz de trabalhar"),
    APOSENTADO("Aposentado"),
    PREFERENAODIZER("Prefere não dizer"),
    OUTRO("Outro");


    private final String descricao;

    Emprego(String descricao){
        this.descricao = descricao;
    }

    public static Emprego respostaEmprego(String valor){
        if (valor.equals("Meio período")) {
            return MEIOPERIODO;
        }else if (valor.equals("Desempregado")) {
            return DESEMPREGADO;
        }else if (valor.equals("Incapaz de trabalhar")) {
            return INCAPAZDETRABALHAR;
        }else if (valor.equals("Aposentado")) {
            return APOSENTADO;
        }else if (valor.equals("Prefere não dizer")) {
            return PREFERENAODIZER;
        }else{
            return OUTRO;
        }
    }
}
