package com.ads.sustancia.enums;

public enum Dependentes {

    NENHUM("Nenhum"),
    UM("1"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCOMAIS("5"),
    PREFIRONAODIZER("Prefere não dizer");

    private final String descricao;

    Dependentes(String descricao){
        this.descricao = descricao;
    }

    public static Dependentes respostaDependentes(String valor){
        if (valor.equals("Nenhum")) {
            return NENHUM;
        }else if (valor.equals("1")) {
            return UM;
        }else if (valor.equals("2")) {
            return DOIS;
        }else if (valor.equals("3")) {
            return TRES;
        }else if (valor.equals("4")) {
            return QUATRO;
        }else{
            return PREFIRONAODIZER;
        }
    }
}
