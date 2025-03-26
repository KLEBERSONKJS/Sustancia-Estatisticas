package com.ads.sustancia.enums;

public enum UsuarioStatus {

    ATIVO("ativo"),
    PENDENTE("pendente"),
    INATIVO("inativo");


    private final String status;

    UsuarioStatus(String status){
        this.status = status;
    }
}
