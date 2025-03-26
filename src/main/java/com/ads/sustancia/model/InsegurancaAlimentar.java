package com.ads.sustancia.model;

import com.ads.sustancia.enums.SimNaoNaoSabe;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Getter
public class InsegurancaAlimentar {
    
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta1;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta2;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta3;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta4;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta5;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta6;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta7;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabe pergunta8;


    public InsegurancaAlimentar( String ebia_1,String ebia_2, String ebia_3, String ebia_4, String ebia_5, String ebia_6, String ebia_7, String ebia_8) {
        this.pergunta1 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_1);
        this.pergunta2 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_2);
        this.pergunta3 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_3);
        this.pergunta4 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_4);
        this.pergunta5 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_5);
        this.pergunta6 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_6);
        this.pergunta7 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_7);
        this.pergunta8 = SimNaoNaoSabe.repostaSimNaoNaoSabe(ebia_8);
    }

    

}
