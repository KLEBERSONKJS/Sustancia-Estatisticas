package com.ads.sustancia.enums;

public enum RacaEnum {
    BRANCO("Branco"),
    PRETO("Preto"),
    PARDO("Pardo"),
    POVOSORIGINARIOS("Povos Originários");


    private final String descricao;

    RacaEnum(String descricao){
        this.descricao = descricao;
    }

    public static RacaEnum respostaRaca(String valor){
        if (valor.equals("Branco")) {
            return BRANCO;
        }else if (valor.equals("Preto")) {
            return PRETO;
        }else if (valor.equals("Pardo")) {
            return PARDO;
        }else{
            return POVOSORIGINARIOS;
        }
    }

}
