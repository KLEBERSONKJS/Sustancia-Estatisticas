package com.ads.sustancia.enums;

public enum Escolariade {

    ENSINOFUNDAMENTALINCOMPLETO("EFI","Ensino Fundamental Incompleto"),
    ENSINOFUNDAMENTALCOMPLETO("EFC","Ensino Fundamental Completo"),
    ENSINOMEDIOINCOMPLETO("EMI","Ensino Médio Incompleto"),
    ENSINOMEDIOCOMPLETO("EMC","Ensino Médio Completo"),
    GRADUACAOINCOMPLETA("GI","Graduação Incompleta"),
    GRADUACAOCOMPLETA("GR","Graduação Completa"),
    PREFIRONAODIZER("PN","Prefere não dizer");

    private final String codigo;
    private final String descricao;

    Escolariade(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Escolariade repostEscolariade(String valor){
        if (valor.equals("Ensino Fundamental Incompleto")) {
            return ENSINOFUNDAMENTALINCOMPLETO;
        }else if (valor.equals("Ensino Fundamental Completo")) {
            return ENSINOFUNDAMENTALCOMPLETO;
        }else if (valor.equals("Ensino Médio Incompleto")) {
            return ENSINOMEDIOINCOMPLETO;
        }else if (valor.equals("Ensino Médio Completo")) {
            return ENSINOMEDIOCOMPLETO;
        }else if (valor.equals("Graduação Incompleta")) {
            return GRADUACAOINCOMPLETA;
        }else if (valor.equals("Graduação Completa")) {
            return GRADUACAOCOMPLETA;
        }else{
            return PREFIRONAODIZER;
        }
    }

    

}
