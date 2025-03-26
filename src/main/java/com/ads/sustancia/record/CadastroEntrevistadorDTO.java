package com.ads.sustancia.record;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CadastroEntrevistadorDTO(
        
        String nome, 
        @NotBlank
        @Email(message = "Email inválido")
        String email,
        LocalDate dataNascimento) {

}
