package com.ads.sustancia.enums;

public enum RefeicaoDia {
    CAFE_DA_MANHA("Café da manhã"),
    LANCHE_DA_MANHA("Lanche da manhã"),
    ALMOCO("Almoço"),
    LANCHE_DA_TARDE("Lanche da tarde"),
    JANTA("Jantar"),
    CEIA_LANCHE_NOITE("Ceia"),
    NENHUM("nenhum");


    private final String resposta;

    RefeicaoDia(String resposta){
        this.resposta = resposta;
    }

    public static RefeicaoDia respostaRefeicaoDia(String valor){
        if (valor.equals("Café da manhã")) {
            return CAFE_DA_MANHA;
        }else if (valor.equals("Lanche da manhã")) {
            return LANCHE_DA_MANHA;
        }else if (valor.equals("Almoço")) {
            return ALMOCO;
        }else if (valor.equals("Lanche da tarde")) {
            return LANCHE_DA_TARDE;
        }else if (valor.equals("Jantar")) {
            return JANTA;
        }else if (valor.equals("Ceia")) {
            return CEIA_LANCHE_NOITE;
        }else {
            return NENHUM;
        }
    }
}
