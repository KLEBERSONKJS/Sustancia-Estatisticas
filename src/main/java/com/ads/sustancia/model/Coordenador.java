package com.ads.sustancia.model;

import java.time.LocalDate;
import java.util.List;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import org.mapstruct.Builder;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Coordenador extends Usuario {


    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "coordenador")
    private List<Entrevistador> entrevistadores;


    public Coordenador(CoordenadorDTO dados) {
        super(dados.getNome(), dados.getEmail(), dados.getSenha());
    }
}


    

