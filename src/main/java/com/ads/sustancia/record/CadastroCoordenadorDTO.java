package com.ads.sustancia.record;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record  CadastroCoordenadorDTO(
    @NotBlank(message = "O nome não pode estar em branco")
    String nome,

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "Email inválido")
    String email,

    @NotBlank(message = "A senha não pode estar em branco")
    String senha,

    @Past(message= "A Data de Nascimento não pode ser a atual")
    LocalDate dataNascimento) {
}
