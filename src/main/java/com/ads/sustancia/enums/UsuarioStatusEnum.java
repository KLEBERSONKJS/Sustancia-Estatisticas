package com.ads.sustancia.enums;

public enum UsuarioStatusEnum {

    ATIVO("ativo"),
    PENDENTE("pendente"),
    INATIVO("inativo");


    private final String status;

    UsuarioStatusEnum(String status){
        this.status = status;
    }
}
