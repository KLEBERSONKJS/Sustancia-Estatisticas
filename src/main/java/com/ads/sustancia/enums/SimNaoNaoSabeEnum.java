package com.ads.sustancia.enums;

public enum SimNaoNaoSabeEnum {

    SIM("Sim"),
    NAO("Não"),
    NAOSABE("naosabe");
    
    private final String valor;
   
   
    SimNaoNaoSabeEnum(String valor) {
        this.valor = valor;
    }

    public static SimNaoNaoSabeEnum repostaSimNaoNaoSabe(String valor){
        if(valor.equals("Sim")){
            return SIM;
        }else if (valor.equals("Não")) {
            return NAO;
        }else 
            return NAOSABE;
    }
    
    public String getValor() {
        return valor;
    }

}
