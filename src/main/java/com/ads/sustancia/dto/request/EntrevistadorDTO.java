package com.ads.sustancia.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntrevistadorDTO {

    private Long idCoordenador;
    private Long id;
    
    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "A senha não pode estar em branco")
    private String senha;

    @NotBlank(message = "o cpf não pode estar em branco")
    private String cpf;

    private LocalDate dataNascimento;

}
