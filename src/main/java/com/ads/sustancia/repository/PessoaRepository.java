package com.ads.sustancia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ads.sustancia.enums.Genero;
import com.ads.sustancia.enums.Raca;
import com.ads.sustancia.model.Pessoa;
import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, JpaSpecificationExecutor<Pessoa> {


    @Query("SELECT p FROM Pessoa p WHERE " +
       "(:raca IS NULL OR p.raca = :raca) AND " +
       "(:genero IS NULL OR p.genero = :genero) AND " +
       "(:idadeMin IS NULL OR p.idade >= :idadeMin) AND " +
       "(:idadeMax IS NULL OR p.idade <= :idadeMax)")
List<Pessoa> filtrarPessoas(
        @Param("raca") Raca raca,
        @Param("genero") Genero genero,
        @Param("idadeMin") Integer idadeMin,
        @Param("idadeMax") Integer idadeMax);
}
