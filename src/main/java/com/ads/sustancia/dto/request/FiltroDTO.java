package com.ads.sustancia.dto.request;

import com.ads.sustancia.enums.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiltroDTO {
    private RacaEnum raca;
    private GeneroEnum genero;
    @Min(0) @Max(120) private Integer idadeMin;
    @Min(0) @Max(120) private Integer idadeMax;
    private ReligiaoEnum religiao;
    private EscolaridadeEnum escolaridade;
    private EstadoCivilEnum estadoCivil;
    private EmpregoEnum emprego;
    private DependentesEnum dependentes;
    private AuxilioEnum auxilio;  

}