package com.ads.sustancia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.FiltroDTO;

import jakarta.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, JpaSpecificationExecutor<Pessoa> {
    
    // Definindo a filtragem com a Criteria API
    static Specification<Pessoa> filtrarPorDadosFiltro(FiltroDTO filtro) {
        return (root, query, criteriaBuilder) -> {
            // Criação de predicados (condições) de filtragem
            Predicate predicate = criteriaBuilder.conjunction();
            
            if (filtro.idade() > 0) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("idade"), filtro.idade()));
            }
            if (filtro.genero() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("genero"), filtro.genero()));
            }
            if (filtro.raca() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("raca"), filtro.raca()));
            }
            if (filtro.escolaridade() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("escolaridade"), filtro.escolaridade()));
            }
            if (filtro.estadoCivil() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("estadoCivil"), filtro.estadoCivil()));
            }
            if (filtro.emprego() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("emprego"), filtro.emprego()));
            }
            if (filtro.auxilio() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("auxilios"), filtro.auxilio()));
            }
            if (filtro.dependentes() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("dependentes"), filtro.dependentes()));
            }
            if (filtro.religiao() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("religiao"), filtro.religiao()));
            }

            return predicate;
        };
    }

    // Método para chamar a Specification e filtrar as pessoas
    default List<Pessoa> filtrarPessoas(FiltroDTO filtro) {
        return findAll(filtrarPorDadosFiltro(filtro));  // Usando a Specification para filtrar
    }
}
