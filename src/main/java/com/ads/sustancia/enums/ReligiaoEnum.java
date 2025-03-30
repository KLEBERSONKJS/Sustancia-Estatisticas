package com.ads.sustancia.enums;

public enum ReligiaoEnum {

    CATOLICO("Católico"),
    EVANGELICO("Evangélico"),
    CANDOMBLE("Candomblé"),
    UMBANDA("Umbanda"),
    ESPIRITA("Espirita"),
    NENHUM("Nenhum"),
    PREFERENAODIZER("Prefere não dizer"),
    OUTRO("Outro");

    private final String descricao;

    ReligiaoEnum(String descicao){
        this.descricao = descicao;
    }

    public static ReligiaoEnum repostaReligiao(String valor){

        if (valor.equals("Católico")) {
            return CATOLICO;
        }else if (valor.equals("Evangélico")) {
            return EVANGELICO;
        }else if (valor.equals("Candomblé")) {
            return CANDOMBLE;
        }else if (valor.equals("Umbanda")) {
            return UMBANDA;
        }else if (valor.equals("Espirita")) {
            return ESPIRITA;
        }else if (valor.equals("Nenhum")) {
            return NENHUM;
        }else if (valor.equals("Prefere não dizer")) {
            return PREFERENAODIZER;
        }else{
            return OUTRO;
        }
    }
}
