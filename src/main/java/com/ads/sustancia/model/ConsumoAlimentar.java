package com.ads.sustancia.model;

import java.util.List;

import com.ads.sustancia.enums.ConsumoOntemEnum;
import com.ads.sustancia.enums.RefeicaoDiaEnum;
import com.ads.sustancia.enums.SimNaoNaoSabeEnum;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Getter
public class ConsumoAlimentar {

    @Enumerated(EnumType.STRING)
    private SimNaoNaoSabeEnum refeicaoComCelular;
    
    @ElementCollection
    @Enumerated(EnumType.STRING )
    private List<RefeicaoDiaEnum> refeicoesDiaList;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ConsumoOntemEnum> tiposRefeicoesList;


    public ConsumoAlimentar(String refeicaoString, List<ConsumoOntemEnum> tiposRefeicoes,
            List<RefeicaoDiaEnum> voceConsumiu) {

        this.refeicaoComCelular = SimNaoNaoSabeEnum.repostaSimNaoNaoSabe(refeicaoString);
        this.tiposRefeicoesList = tiposRefeicoes;
        this.refeicoesDiaList = voceConsumiu;
      
    }

}
