package com.ads.sustancia.model;

import java.util.List;

import com.ads.sustancia.enums.ConsumoOntem;
import com.ads.sustancia.enums.RefeicaoDia;
import com.ads.sustancia.enums.SimNaoNaoSabe;

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
    private SimNaoNaoSabe refeicaoComCelular;
    
    @ElementCollection
    @Enumerated(EnumType.STRING )
    private List<RefeicaoDia> refeicoesDiaList;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ConsumoOntem> tiposRefeicoesList;


    public ConsumoAlimentar(String refeicaoString, List<ConsumoOntem> tiposRefeicoes,
            List<RefeicaoDia> voceConsumiu) {

        this.refeicaoComCelular = SimNaoNaoSabe.repostaSimNaoNaoSabe(refeicaoString);
        this.tiposRefeicoesList = tiposRefeicoes;
        this.refeicoesDiaList = voceConsumiu;
      
    }

}
