package com.ads.sustancia.record;

import org.springframework.format.annotation.NumberFormat;

public record VerificacaoCadastroDTO(
    String email,
    @NumberFormat(pattern = "000000" )
    int codigo
) {
    
}


