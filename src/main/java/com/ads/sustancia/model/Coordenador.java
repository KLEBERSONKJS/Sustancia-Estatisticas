package com.ads.sustancia.model;

import java.time.LocalDate;
import java.util.List;

import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Coordenador extends Usuario {


    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "coordenador")
    private List<Entrevistador> entrevistadores;

    public Coordenador(String nome, String email, String senha) {
        super(nome,email,senha);
    }
    
    }


    

