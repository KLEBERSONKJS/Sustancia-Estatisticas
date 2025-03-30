package com.ads.sustancia.model;

import com.ads.sustancia.enums.SimNaoNaoSabeEnum;

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
    private SimNaoNaoSabeEnum pergunta1;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta2;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta3;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta4;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta5;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta6;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta7;
    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum pergunta8;


    public InsegurancaAlimentar( String ebia_1,String ebia_2, String ebia_3, String ebia_4, String ebia_5, String ebia_6, String ebia_7, String ebia_8) {
        this.pergunta1 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_1);
        this.pergunta2 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_2);
        this.pergunta3 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_3);
        this.pergunta4 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_4);
        this.pergunta5 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_5);
        this.pergunta6 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_6);
        this.pergunta7 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_7);
        this.pergunta8 = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(ebia_8);
    }

    

}
