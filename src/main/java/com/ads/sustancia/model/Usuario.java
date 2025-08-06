package com.ads.sustancia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "TB_USUARIO")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = true)
    private String email;

    @Column(unique = true, nullable = true)
    private String cpf;

    @Column(nullable = false)
    private String senha;

    private String papel;

    private LocalDate dataNascimento;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String cpf, String senha, LocalDate dataNascimento) {
        this.Id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
       
    }

    public Usuario(String nome, String email, String cpf, String senha, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        
    }

    public Usuario(Long id) {
        Id = id;
    }


    public Long getId() {
        return Id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}
