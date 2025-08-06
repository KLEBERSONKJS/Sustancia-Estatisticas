package com.ads.sustancia.repository;

import com.ads.sustancia.model.Coordenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoordenadorRepository extends JpaRepository<Coordenador, Long> {
    
    List<Coordenador> findByNomeContainingIgnoreCase(String nome);

    boolean existsCoordenadorByEmail(String email);

    Optional<Coordenador> findByEmail(String email);

    Optional<Coordenador> findByCpf(String cpf); 
}