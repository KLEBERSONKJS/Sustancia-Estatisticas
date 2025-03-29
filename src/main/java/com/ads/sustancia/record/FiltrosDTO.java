package com.ads.sustancia.record;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FiltrosDTO {
    
    private String raca;
    private String genero;
    private int idadeMax = 50;
    private int idadeMin = 5;
}
