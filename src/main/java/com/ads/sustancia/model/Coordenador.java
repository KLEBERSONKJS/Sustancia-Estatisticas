package com.ads.sustancia.model;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
public class Coordenador extends Usuario {

    @OneToMany(mappedBy = "coordenador", cascade = CascadeType.REMOVE)
    private List<Entrevistador> entrevistadores;

    public Coordenador(CoordenadorDTO dados) {
        super(dados.getNome(), dados.getEmail(),dados.getCpf(), dados.getSenha(),dados.getDataNascimento());
    }

    public Coordenador(Long id) {
        super(id);
    }

    public Coordenador() {
    }
}


    

