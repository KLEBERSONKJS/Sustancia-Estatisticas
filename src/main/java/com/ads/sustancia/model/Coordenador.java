package com.ads.sustancia.model;

import java.time.LocalDate;

import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Coordenador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private UsuarioStatusEnum status;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    
   

    public Coordenador(String nome, String email, String senha,
            LocalDate dataNascimento, UserRole userRole) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.role = userRole;
        this.status = UsuarioStatusEnum.PENDENTE;

    }


    
    }


    

