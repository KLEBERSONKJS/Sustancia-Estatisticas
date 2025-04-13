package com.ads.sustancia.service.impl;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ads.sustancia.model.Entrevistador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.PessoaDTO;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.model.ConsumoAlimentar;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.repository.PessoaRepository;
import com.ads.sustancia.service.PessoaService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cadastrarPessoa(PessoaDTO dadosPessoaForms, Principal principal) {

        if (dadosPessoaForms == null) {
            throw new IllegalArgumentException("Dados do formulário não podem ser nulos.");
        }

        Pessoa entity = null;
        try {

            InsegurancaAlimentar insegurancaAlimentar = criarInsegurancaAlimentar(dadosPessoaForms);
            ConsumoAlimentar consumoAlimentar = criarConsumoAlimentar(dadosPessoaForms);

            entity = new Pessoa(
                    (Entrevistador) principal,
                    dadosPessoaForms.nome(),
                    dadosPessoaForms.idade(),
                    GeneroEnum.repostaGenero(dadosPessoaForms.genero()),
                    RacaEnum.respostaRaca(dadosPessoaForms.raca()),
                    ReligiaoEnum.repostaReligiao(dadosPessoaForms.religiao()),
                    EscolaridadeEnum.repostEscolariade(dadosPessoaForms.escolaridade()),
                    EstadoCivilEnum.respostaEstadoCivil(dadosPessoaForms.estado_civil()),
                    EmpregoEnum.respostaEmprego(dadosPessoaForms.emprego()),
                    addAuxilioEnum(dadosPessoaForms.auxilios()),
                    DependentesEnum.respostaDependentes(dadosPessoaForms.familia()),
                    consumoAlimentar,
                    insegurancaAlimentar);
        } catch (IllegalArgumentException e) {
            log.error("Erro ao criar entidades: {}", e.getMessage());
        } catch (Exception e) {
            log.error("Erro inesperado ao cadastrar pessoa: {}", e.getMessage());
        }

        return pessoaRepository.save(entity);
    }

    private List<RefeicaoDiaEnum> addRefeicoes(String refeicoesDto) {
        List<RefeicaoDiaEnum> refeicoes = new ArrayList<>();

        List<String> listaRefeicaoDia = Arrays.asList(refeicoesDto.split(","));
        for (String string : listaRefeicaoDia) {
            refeicoes.add(RefeicaoDiaEnum.respostaRefeicaoDia(string));
        }
        return refeicoes;
    }

    private List<ConsumoOntemEnum> addConsumoOntem(String consumoDto) {
        List<ConsumoOntemEnum> consumo = new ArrayList<>();
        List<String> listaConsumo = Arrays.asList(consumoDto.split(","));

        for (String string : listaConsumo) {
            consumo.add(ConsumoOntemEnum.respostaConsumoOntem(string));

        }
        return consumo;
    }

    private List<AuxilioEnum> addAuxilioEnum(String auxiliosDTO) {
        List<AuxilioEnum> auxiliosList = new ArrayList<>();
        List<String> listaAuxilios = Arrays.asList(auxiliosDTO.split(","));

        for (String string : listaAuxilios) {
            auxiliosList.add(AuxilioEnum.respostaAuxilioEnum(string));

        }
        return auxiliosList;
    }

    private ConsumoAlimentar criarConsumoAlimentar(PessoaDTO dadosPessoaForms) {
        return new ConsumoAlimentar(
                dadosPessoaForms.refeicoes_com_tecnologia(),
                addConsumoOntem(dadosPessoaForms.consumo()),
                addRefeicoes(dadosPessoaForms.refeicoes()));
    }

    private InsegurancaAlimentar criarInsegurancaAlimentar(PessoaDTO dadosPessoaForms) {
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
