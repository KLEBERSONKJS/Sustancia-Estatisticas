package com.ads.sustancia.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PessoaDTO {

        private Long idEntrevistador;
        @NotBlank(message = "Campo Nome não pode está em branco")
        private String nome;
        @NotNull(message = "Campo Idade não pode está em branco")
        private int idade;
        @NotBlank(message = "Campo Gênero não pode está em branco")
        private String genero;
        @NotBlank(message = "Campo Raça não pode está em branco")
        private String raca;
        @NotBlank(message = "Campo Escolaridade não pode está em branco")
        private String escolaridade;
        @NotBlank(message = "Campo Estado Civil não pode está em branco")
        private String estado_civil;
        @NotBlank(message = "Campo Emprego não pode está em branco")
        private String emprego;
        @NotBlank(message = "Campo Auxilios não pode está em branco")
        private String auxilios;
        @NotBlank(message = "Campo Família não pode está em branco")
        private String familia;
        @NotBlank(message = "Campo Relígião não pode está em branco")
        private String religiao;
        @NotBlank(message = "Campo Refeições com tecnlogia não pode está em branco")
        private String refeicoes_com_tecnologia;
        @NotBlank(message = "Campo Refeições ao logo do dia não pode está em branco")
        private String refeicoes;
        @NotBlank(message = "Campo Ontem Você consumiu não pode está em branco")
        private String consumo;
        @NotBlank(message = "Campo Pergunta 1 não pode está em branco")
        private String ebia_1;
        @NotBlank(message = "Campo Pergunta 2 não pode está em branco")
        private String ebia_2;
        @NotBlank(message = "Campo Pergunta 3 não pode está em branco")
        private String ebia_3;
        @NotBlank(message = "Campo Pergunta 4 não pode está em branco")
        private String ebia_4;
        @NotBlank(message = "Campo Pergunta 5 não pode está em branco")
        private String ebia_5;
        @NotBlank(message = "Campo Pergunta 6 não pode está em branco")
        private String ebia_6;
        @NotBlank(message = "Campo Pergunta 7 não pode está em branco")
        private String ebia_7;
        @NotBlank(message = "Campo Pergunta 8 não pode está em branco")
        private String ebia_8;
}
