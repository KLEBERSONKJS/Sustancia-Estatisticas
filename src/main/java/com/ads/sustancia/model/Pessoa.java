package com.ads.sustancia.model;

import java.util.List;

import com.ads.sustancia.enums.*;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @Column
    private int idade;

    @Enumerated(EnumType.STRING)
    private GeneroEnum genero;

    @Enumerated(EnumType.STRING)
    private RacaEnum raca;

    @Enumerated(EnumType.STRING)
    private ReligiaoEnum religiao;

    @Enumerated(EnumType.STRING)
    private EscolaridadeEnum escolaridade;

    @Enumerated(EnumType.STRING)
    private EstadoCivilEnum estadoCivil;

    @Enumerated(EnumType.STRING)
    private EmpregoEnum emprego;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuxilioEnum> auxilios;

    @Enumerated(EnumType.STRING)
    private DependentesEnum dependentes;

    @Embedded
    private ConsumoAlimentar consumoAlimentar;

    @Embedded
    private InsegurancaAlimentar inseguracaAlimentar;

    @ManyToOne
    @JoinColumn(name = "entrevistador_id")  
    private Entrevistador entrevistador;
  

    public Pessoa(Entrevistador entrevistador, String nome, int idade, GeneroEnum genero, RacaEnum raca, ReligiaoEnum religiao, EscolaridadeEnum escolaridade,
                  EstadoCivilEnum estadoCivil, EmpregoEnum emprego, List<AuxilioEnum> auxiliosList, DependentesEnum dependentes,
                  ConsumoAlimentar consumoAlimentar, InsegurancaAlimentar inseguracaAlimentar) {

        this.entrevistador = entrevistador;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.raca = raca;
        this.religiao = religiao;
        this.escolaridade = escolaridade;
        this.estadoCivil = estadoCivil;
        this.emprego = emprego;
        this.auxilios = auxiliosList;
        this.dependentes = dependentes;
        this.consumoAlimentar = consumoAlimentar;
        this.inseguracaAlimentar = inseguracaAlimentar;

    }

}
