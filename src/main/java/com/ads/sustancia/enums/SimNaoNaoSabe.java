package com.ads.sustancia.enums;

public enum SimNaoNaoSabe {

    SIM("Sim"),
    NAO("Não"),
    NAOSABE("naosabe");
    
    private final String valor;
   
   
    SimNaoNaoSabe(String valor) {
        this.valor = valor;
    }

    public static SimNaoNaoSabe repostaSimNaoNaoSabe(String valor){
        if(valor.equals("Sim")){
            return SIM;
        }else if (valor.equals("Não")) {
            return NAO;
        }else 
            return NAOSABE;
    }

}
