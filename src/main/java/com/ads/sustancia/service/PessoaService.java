package com.ads.sustancia.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.ads.sustancia.enums.ConsumoOntem;
import com.ads.sustancia.enums.Dependentes;
import com.ads.sustancia.enums.Emprego;
import com.ads.sustancia.enums.Escolariade;
import com.ads.sustancia.enums.EstadoCivil;
import com.ads.sustancia.enums.Genero;
import com.ads.sustancia.enums.Raca;
import com.ads.sustancia.enums.RefeicaoDia;
import com.ads.sustancia.enums.Religiao;
import com.ads.sustancia.model.ConsumoAlimentar;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.record.FormularioDTO;
import com.ads.sustancia.repository.PessoaRepository;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Método para filtrar pessoas
    public List<Pessoa> filtrarPessoas(@Valid FiltroDTO filtro) {
        return pessoaRepository.findAll(PessoaRepository.filtrarPorDadosFiltro(filtro));
    }

    public Pessoa cadastrarPessoa(FormularioDTO dadosPessoaForms) throws Exception {

        if (dadosPessoaForms == null) {
            throw new IllegalArgumentException("Dados do formulário não podem ser nulos.");
        }

        Pessoa entity = null;
        try {

            System.out.println(dadosPessoaForms.consumo().toString());
            InsegurancaAlimentar insegurancaAlimentar = criarInsegurancaAlimentar(dadosPessoaForms);
            ConsumoAlimentar consumoAlimentar = criarConsumoAlimentar(dadosPessoaForms);

            entity = new Pessoa(
                    dadosPessoaForms.entrevistador(),
                    dadosPessoaForms.nome(),
                    dadosPessoaForms.idade(),
                    Genero.repostaGenero(dadosPessoaForms.genero()),
                    Raca.respostaRaca(dadosPessoaForms.raca()),
                    Religiao.repostaReligiao(dadosPessoaForms.religiao()),
                    Escolariade.repostEscolariade(dadosPessoaForms.escolaridade()),
                    EstadoCivil.respostaEstadoCivil(dadosPessoaForms.estado_civil()),
                    Emprego.respostaEmprego(dadosPessoaForms.emprego()),
                    dadosPessoaForms.auxilios(),
                    Dependentes.respostaDependentes(dadosPessoaForms.familia()),
                    consumoAlimentar,
                    insegurancaAlimentar);
        } catch (IllegalArgumentException e) {
            log.error("Erro ao criar entidades: {}", e.getMessage());
        } catch (Exception e) {
            log.error("Erro inesperado ao cadastrar pessoa: {}", e.getMessage());
        }

        return pessoaRepository.save(entity);
    }

    private List<RefeicaoDia> addRefeicoes(List<String> refeicoesDto) {
        List<RefeicaoDia> refeicoes = new ArrayList<>();

        List<String> listaRefeicaoDia = Arrays.asList(refeicoesDto.get(0).split(","));
        for (String string : listaRefeicaoDia) {
            refeicoes.add(RefeicaoDia.respostaRefeicaoDia(string));
        }
        return refeicoes;
    }


    private List<ConsumoOntem> addConsumoOntem(List<String> consumoDto) {
        List<ConsumoOntem> consumo = new ArrayList<>();
        List<String> listaConsumo = Arrays.asList(consumoDto.get(0).split(","));

        for (String string : listaConsumo) {
            consumo.add(ConsumoOntem.respostaConsumoOntem(string));

        }
        return consumo;
    }

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }   

    private ConsumoAlimentar criarConsumoAlimentar(FormularioDTO dadosPessoaForms) {
        return new ConsumoAlimentar(
                dadosPessoaForms.refeicoes_com_tecnologia(),
                addConsumoOntem(dadosPessoaForms.consumo()),
                addRefeicoes(dadosPessoaForms.refeicoes()));
    }

    private InsegurancaAlimentar criarInsegurancaAlimentar(FormularioDTO dadosPessoaForms) {
        return new InsegurancaAlimentar(
                dadosPessoaForms.ebia_1(),
                dadosPessoaForms.ebia_2(),
                dadosPessoaForms.ebia_3(),
                dadosPessoaForms.ebia_4(),
                dadosPessoaForms.ebia_5(),
                dadosPessoaForms.ebia_6(),
                dadosPessoaForms.ebia_7(),
                dadosPessoaForms.ebia_8());
    }

}