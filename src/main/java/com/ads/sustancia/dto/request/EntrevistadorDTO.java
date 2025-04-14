package com.ads.sustancia.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntrevistadorDTO{

        @NotBlank(message = "O nome não pode estar em branco")
        private String nome;

        @NotBlank(message = "O email não pode estar em branco")
        @Email(message = "Email inválido")
        private String email;

        @NotBlank(message = "A senha não pode estar em branco")
        private String senha;

        private LocalDate dataNascimento;
}
