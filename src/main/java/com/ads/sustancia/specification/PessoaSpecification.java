package com.ads.sustancia.specification;

import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.model.Pessoa;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class PessoaSpecification {

    // Método que cria uma Specification dinâmica baseada nos filtros
    public static Specification<Pessoa> filtrar(FiltroDTO filtro) {

        // Retorna uma implementação de Specification
        return (root, query, criteriaBuilder) -> {
            // Lista para armazenar os predicados (condições WHERE)
            List<Predicate> predicates = new ArrayList<>();

            
            //Filtro por Idade
            if (filtro.getIdade() != null) {
                /*  
                 * Verifica se o campo idade foi informado no filtro
                 * Cria um predicado de igualdade para a idade:
                 * root.get("idade") - acessa o campo "idade" da entidade Pessoa
                 * filtro.getIdade() - pega o valor de idade do DTO
                 * criteriaBuilder.equal - cria condição SQL "idade = ?" 
                 */
                predicates.add(criteriaBuilder.equal(root.get("idade"), filtro.getIdade()));
            }

            // Filtro por   Gênero
            if (filtro.getGenero() != null && !filtro.getGenero().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("genero"), filtro.getGenero()));
            }

            // Filtro por Raça
            if (filtro.getRaca() != null && !filtro.getRaca().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("raca"), filtro.getRaca()));
            }

            // Filtro por Escolaridade
            if (filtro.escolaridade() != null && !filtro.escolaridade().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("escolaridade"), filtro.escolaridade()));
            }

            // Filtro por Estado Civil
            if (filtro.estadoCivil() != null && !filtro.estadoCivil().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("estadoCivil"), filtro.estadoCivil()));
            }

            // Filtro por Empreego
            if (filtro.emprego() != null && !filtro.emprego().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("emprego"), filtro.emprego()));
            }

            // Filtro por auxilio
            if (filtro.auxilio() != null && !filtro.auxilio().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("auxilio"), filtro.auxilio()));
            }

            // Filtro por Dependentes
            if (filtro.dependentes() != null && !filtro.dependentes().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("dependentes"), filtro.dependentes()));
            }

            // Filtro por religião
            if (filtro.religiao() != null && !filtro.religiao().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("religiao"), filtro.religiao()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
