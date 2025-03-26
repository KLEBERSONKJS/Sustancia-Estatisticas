package com.ads.sustancia.enums;

public enum Raca {
    BRANCO("Branco"),
    PRETO("Preto"),
    PARDO("Pardo"),
    POVOSORIGINARIOS("Povos Originários");


    private final String descricao;

    Raca(String descricao){
        this.descricao = descricao;
    }

    public static Raca respostaRaca(String valor){
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
