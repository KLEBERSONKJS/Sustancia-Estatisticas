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
public class CoordenadorDTO{
    private Long id;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "Email inválido")
    private String email;

   
    private String senha;

    @NotBlank(message = "O cpf não pode estar em branco")
    private String cpf;

    private LocalDate dataNascimento;
}
