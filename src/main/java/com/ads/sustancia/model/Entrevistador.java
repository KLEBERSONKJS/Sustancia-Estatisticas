package com.ads.sustancia.model;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
public class Entrevistador extends Usuario{

    @ManyToOne
    @JoinColumn(name = "coordenador_id")
    private Coordenador coordenador;

    @OneToMany(mappedBy = "entrevistador", cascade = CascadeType.REMOVE)
    private List<Pessoa> entrevistados;

    public Entrevistador(EntrevistadorDTO dados) {
        super(dados.getId(), dados.getNome(), dados.getEmail(),dados.getCpf(), dados.getSenha(), dados.getDataNascimento());
    }

    public Entrevistador(Long id) {
        super(id);
    }

    public Entrevistador() {
    }



}
