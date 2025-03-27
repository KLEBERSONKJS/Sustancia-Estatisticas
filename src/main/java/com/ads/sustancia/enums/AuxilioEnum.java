package com.ads.sustancia.enums;

public enum AuxilioEnum {
    NENHUM("Nenhum"),
    BOLSA_FAMILIA("Bolsa familia"),
    BPC("Beneficio de Prestação Continuada"),
    SEGURO_DESEMPREGO("Seguro Desemprego"),
    AUXILIO_GAS("Auxilio Gas"),
    OUTROS("Outros");

    private final String resposta;

    AuxilioEnum(String resposta){
        this.resposta = resposta;
    }

    public static AuxilioEnum respostaAuxilioEnum(String valor){

        if (valor.equals("Bolsa familia")) {
            return BOLSA_FAMILIA;
        }else if (valor.equals("Beneficio de Prestação Continuada")) {
            return BPC;
        }else if (valor.equals("Seguro Desemprego")) {
            return SEGURO_DESEMPREGO;
        }else if (valor.equals("Auxilio Gas")) {
            return AUXILIO_GAS;
        }else if (valor.equals("Outros")) {
            return OUTROS;
        }else {
            return NENHUM;
        }
    }
}
