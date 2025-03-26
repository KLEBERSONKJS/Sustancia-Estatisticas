package com.ads.sustancia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.sustancia.model.Entrevistador;

@Repository
public interface EntrevistadorRepository extends JpaRepository<Entrevistador, String> {
  Optional<Entrevistador> findByEmail(String email);

}
