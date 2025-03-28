package com.ads.sustancia.specification;

import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.model.Pessoa;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class PessoaSpecification {
    public static Specification<Pessoa> filtrar(FiltroDTO filtro) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (filtro.getIdade() != null) {
                predicates.add(criteriaBuilder.equal(root.get("idade"), filtro.getIdade()));
            }
            if (filtro.getGenero() != null && !filtro.getGenero().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("genero"), filtro.getGenero()));
            }
            if (filtro.getRaca() != null && !filtro.getRaca().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("raca"), filtro.getRaca()));
            }
            if (filtro.escolaridade() != null && !filtro.escolaridade().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("escolaridade"), filtro.escolaridade()));
            }
            if (filtro.estadoCivil() != null && !filtro.estadoCivil().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("estadoCivil"), filtro.estadoCivil()));
            }
            if (filtro.emprego() != null && !filtro.emprego().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("emprego"), filtro.emprego()));
            }
            if (filtro.auxilio() != null && !filtro.auxilio().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("auxilio"), filtro.auxilio()));
            }
            if (filtro.dependentes() != null && !filtro.dependentes().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("dependentes"), filtro.dependentes()));
            }
            if (filtro.religiao() != null && !filtro.religiao().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("religiao"), filtro.religiao()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
