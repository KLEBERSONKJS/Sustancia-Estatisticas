package com.ads.sustancia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.model.Pessoa;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, JpaSpecificationExecutor<Pessoa> {

       // @Query("SELECT p FROM Pessoa p WHERE " +
       // "(:raca IS NULL OR p.raca = :raca) AND " +
       // "(:genero IS NULL OR p.genero = :genero) AND " +
       // "(:idadeMin IS NULL OR p.idade >= :idadeMin) AND " +
       // "(:idadeMax IS NULL OR p.idade <= :idadeMax)" +
       // "(:religiao IS NULL OR p.religiao = :religiao) AND " +
       // "(:escolaridade IS NULL OR p.escolaridade = :escolaridade) AND" +
       // "(:estadoCivil IS NULL OR p.estadoCivil = :estadoCivil) AND" +
       // "(:emprego IS NULL OR p.emprego = :emprego) AND" +
       // "(:dependentes IS NULL OR p.dependentes = :dependentes) AND" +
       // "(:auxilio IS NULL OR :auxilio MEMBER OF p.auxilios)"
       // )
       // List<Pessoa> filtrarPessoas(
       // @Param("raca") RacaEnum raca,
       // @Param("genero") GeneroEnum genero,
       // @Param("idadeMin") Integer idadeMin,
       // @Param("idadeMax") Integer idadeMax,
       // @Param("religiao") ReligiaoEnum religiao,
       // @Param("escolaridade") EscolariadeEnum escolaridade,
       // @Param("estadoCivil") EstadoCivilEnum estadoCivil,
       // @Param("emprego") EmpregoEnum emprego,
       // @Param("dependentes") DependentesEnum dependentes,
       // @Param("auxilios") AuxilioEnum auxilioEnum

       // );

       @Query("SELECT p FROM Pessoa p " +
                     "WHERE " +
                     "(:#{#filtro.raca} IS NULL OR p.raca = :#{#filtro.raca}) AND " +
                     "(:#{#filtro.genero} IS NULL OR p.genero = :#{#filtro.genero}) AND " +
                     "(:#{#filtro.idadeMin} IS NULL OR p.idade >= :#{#filtro.idadeMin}) AND " +
                     "(:#{#filtro.idadeMax} IS NULL OR p.idade <= :#{#filtro.idadeMax}) AND " +
                     "(:#{#filtro.religiao} IS NULL OR p.religiao = :#{#filtro.religiao}) AND " +
                     "(:#{#filtro.escolaridade} IS NULL OR p.escolaridade = :#{#filtro.escolaridade}) AND " +
                     "(:#{#filtro.estadoCivil} IS NULL OR p.estadoCivil = :#{#filtro.estadoCivil}) AND " +
                     "(:#{#filtro.emprego} IS NULL OR p.emprego = :#{#filtro.emprego}) AND " +
                     "(:#{#filtro.dependentes} IS NULL OR p.dependentes = :#{#filtro.dependentes}) AND " +
                     "(:#{#filtro.auxilio} IS NULL OR EXISTS (" +
                     "   SELECT 1 FROM p.auxilios a WHERE a = :#{#filtro.auxilio}" +
                     "))")
       List<Pessoa> filtrarPessoas(@Param("filtro") FiltroDTO filtro);




       
       // @Query("SELECT " +
       //               "SUM(CASE WHEN p.consumoAlimentar.refeicaoComCelular = 'SIM' THEN 1 ELSE 0 END), " +
       //               "SUM(CASE WHEN p.consumoAlimentar.refeicaoComCelular = 'NAO' THEN 1 ELSE 0 END), " +
       //               "SUM(CASE WHEN p.consumoAlimentar.refeicaoComCelular = 'NAOSABE' THEN 1 ELSE 0 END) " +
       //               "FROM Pessoa p " +
       //               "WHERE " +
       //               "(:#{#filtro.raca} IS NULL OR p.raca = :#{#filtro.raca}) AND " +
       //               "(:#{#filtro.genero} IS NULL OR p.genero = :#{#filtro.genero}) AND " +
       //               "(:#{#filtro.idadeMin} IS NULL OR p.idade >= :#{#filtro.idadeMin}) AND " +
       //               "(:#{#filtro.idadeMax} IS NULL OR p.idade <= :#{#filtro.idadeMax}) AND " +
       //               "(:#{#filtro.religiao} IS NULL OR p.religiao = :#{#filtro.religiao}) AND " +
       //               "(:#{#filtro.escolaridade} IS NULL OR p.escolaridade = :#{#filtro.escolaridade}) AND " +
       //               "(:#{#filtro.estadoCivil} IS NULL OR p.estadoCivil = :#{#filtro.estadoCivil}) AND " +
       //               "(:#{#filtro.emprego} IS NULL OR p.emprego = :#{#filtro.emprego}) AND " +
       //               "(:#{#filtro.dependentes} IS NULL OR p.dependentes = :#{#filtro.dependentes}) AND " +
       //               "(:#{#filtro.auxilio} IS NULL OR EXISTS (" +
       //               "   SELECT 1 FROM p.auxilios a WHERE a = :#{#filtro.auxilio}" +
       //               "))")
       // List<Object[]> contarRespostasRefeicaoComCelular(@Param("filtro") FiltroDTO filtro);

}
