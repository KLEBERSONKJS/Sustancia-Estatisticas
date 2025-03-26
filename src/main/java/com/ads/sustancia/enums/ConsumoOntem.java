package com.ads.sustancia.enums;


public enum ConsumoOntem {
    FEIJAO("Feijão"),
    FRUTAS_FRESCAS("Frutas frescas"),
    VERDURAS_E_LEGUMES("Verduras e legumes"),
    HAMBURGUER_E_OU_EMBUTIDOS("Hambúrguer e/ou embutidos"),
    BEBIDAS_ADOCADAS("Bebidas adoçadas"),
    MACARRAO_INSTANTANEO_OU_SALGADINHOS("Macarrão instantâneo ou salgadinhos"),
    BISCOITPS_RECHEADOS_E_DOCES("Biscoitos recheados e doces"),
    NENHUM("nenhum");


    private final String resposta;

    ConsumoOntem(String resposta){
        this.resposta = resposta;
    }

    public static ConsumoOntem respostaConsumoOntem(String valor){
        if (valor.equals("Feijão")) {
            return FEIJAO;
        }else if (valor.equals("Frutas frescas")) {
            return FRUTAS_FRESCAS;
        }else if (valor.equals("Verduras e legumes")) {
            return VERDURAS_E_LEGUMES;
        }else if (valor.equals("Hambúrguer e/ou embutidos")) {
            return HAMBURGUER_E_OU_EMBUTIDOS;
        }else if (valor.equals("Bebidas adoçadas")) {
            return BEBIDAS_ADOCADAS;
        }else if (valor.equals("Macarrão instantâneo ou salgadinhos")) {
            return MACARRAO_INSTANTANEO_OU_SALGADINHOS;
        }else if(valor.equals("Biscoitos recheados e doces")){
            return BISCOITPS_RECHEADOS_E_DOCES;
        }else{
            return NENHUM;
        }
    }
}

