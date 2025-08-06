package com.ads.sustancia.repository;

import com.ads.sustancia.model.Entrevistador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EntrevistadorRepository extends JpaRepository<Entrevistador, Long> {

  List<Entrevistador> findByNomeContainingIgnoreCase(String nome);

  Boolean existsEntrevistadorByEmail(String email);
  
  Optional<Entrevistador> findByEmail(String email);

  Optional<Entrevistador> findByCpf(String cpf); 
}
