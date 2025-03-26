package com.ads.sustancia.model;

import com.ads.sustancia.enums.Dependentes;
import com.ads.sustancia.enums.Emprego;
import com.ads.sustancia.enums.Escolariade;
import com.ads.sustancia.enums.EstadoCivil;
import com.ads.sustancia.enums.Genero;
import com.ads.sustancia.enums.Raca;
import com.ads.sustancia.enums.Religiao;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
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
    private Genero genero;

    @Enumerated(EnumType.STRING)
    private Raca raca;

    @Enumerated(EnumType.STRING)
    private Religiao religiao;

    @Enumerated(EnumType.STRING)
    private Escolariade escolaridade;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @Enumerated(EnumType.STRING)
    private Emprego emprego;

    @Column
    private String auxilios;

    @Enumerated(EnumType.STRING)
    private Dependentes dependentes;

    @Embedded
    private ConsumoAlimentar consumoAlimentar;

    @Embedded
    private InsegurancaAlimentar inseguracaAlimentar;

    @ManyToOne
    @JoinColumn(name = "entrevistador_id")  
    private Entrevistador entrevistador;
  

    public Pessoa(Entrevistador entrevistador,String nome, int idade, Genero genero, Raca raca, Religiao religiao, Escolariade escolaridade,
            EstadoCivil estadoCivil, Emprego emprego, String auxilios, Dependentes dependentes,
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
        this.auxilios = auxilios;
        this.dependentes = dependentes;
        this.consumoAlimentar = consumoAlimentar;
        this.inseguracaAlimentar = inseguracaAlimentar;

    }

}
