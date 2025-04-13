package com.ads.sustancia.model;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;


import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Entrevistador extends Usuario{


    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "coordenador_id")
    private Coordenador coordenador;

    @OneToMany(mappedBy = "entrevistador")
    private List<Pessoa> entrevistados;


    public Entrevistador(EntrevistadorDTO dados) {
        super(dados.getNome(), dados.getEmail(), dados.getSenha());
    }
}
