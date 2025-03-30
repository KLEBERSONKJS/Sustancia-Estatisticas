package com.ads.sustancia.enums;

public enum EstadoCivilEnum {
    CASADO("Casado"),
    VIUVO("Viúvo"),
    DIVORCIADO("Divorciado"),
    SEPARADO("Separado"),
    SOLTEIRO("Solteiro"),
    PREFIRONAODIZER("Prefiro nao dizer");

    

    EstadoCivilEnum(String descricao){
        
    }

    
    public static EstadoCivilEnum respostaEstadoCivil(String valor){
        if (valor.equals("Casado")) {
            return CASADO;
        }else if (valor.equals("Viúvo")) {
            return VIUVO;
        }else if (valor.equals("Divorciado")) {
            return DIVORCIADO;
        }else if (valor.equals("Separado")) {
            return SEPARADO;
        }else if (valor.equals("Solteiro")) {
            return SOLTEIRO;
        }else{
            return PREFIRONAODIZER;
        }
    }

}
