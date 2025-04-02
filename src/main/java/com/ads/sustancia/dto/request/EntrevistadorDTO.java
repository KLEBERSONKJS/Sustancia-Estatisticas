package com.ads.sustancia.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EntrevistadorDTO(
        
        String nome, 
        @NotBlank
        @Email(message = "Email inválido")
        String email,
        LocalDate dataNascimento) {

}
