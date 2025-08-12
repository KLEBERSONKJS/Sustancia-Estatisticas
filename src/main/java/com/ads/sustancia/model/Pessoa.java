package com.ads.sustancia.model;

import com.ads.sustancia.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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


    public Pessoa(Long id, String nome, int idade, GeneroEnum genero, RacaEnum raca, ReligiaoEnum religiao, EscolaridadeEnum escolaridade,
                  EstadoCivilEnum estadoCivil, EmpregoEnum emprego, List<AuxilioEnum> auxiliosList, DependentesEnum dependentes,
                  ConsumoAlimentar consumoAlimentar, InsegurancaAlimentar inseguracaAlimentar) {

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
