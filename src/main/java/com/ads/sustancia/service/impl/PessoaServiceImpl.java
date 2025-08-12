package com.ads.sustancia.service.impl;


import com.ads.sustancia.dto.request.PessoaDTO;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.model.ConsumoAlimentar;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.repository.PessoaRepository;
import com.ads.sustancia.service.PessoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cadastrarPessoa(PessoaDTO dto) {

        if (dto == null) {
            throw new IllegalArgumentException("Dados do formulário não podem ser nulos.");
        }

        Pessoa entity = null;
        try {

            InsegurancaAlimentar insegurancaAlimentar = criarInsegurancaAlimentar(dto);
            ConsumoAlimentar consumoAlimentar = criarConsumoAlimentar(dto);

            entity = new Pessoa(null,dto.getNome(),
                    dto.getIdade(),
                    GeneroEnum.repostaGenero(dto.getGenero()),
                    RacaEnum.respostaRaca(dto.getRaca()),
                    ReligiaoEnum.repostaReligiao(dto.getReligiao()),
                    EscolaridadeEnum.repostEscolariade(dto.getEscolaridade()),
                    EstadoCivilEnum.respostaEstadoCivil(dto.getEstado_civil()),
                    EmpregoEnum.respostaEmprego(dto.getEmprego()),
                    addAuxilioEnum(dto.getAuxilios()),
                    DependentesEnum.respostaDependentes(dto.getFamilia()),
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
                dadosPessoaForms.getRefeicoes_com_tecnologia(),
                addConsumoOntem(dadosPessoaForms.getConsumo()),
                addRefeicoes(dadosPessoaForms.getRefeicoes()));
    }

    private InsegurancaAlimentar criarInsegurancaAlimentar(PessoaDTO dadosPessoaForms) {
        return new InsegurancaAlimentar(
                dadosPessoaForms.getEbia_1(),
                dadosPessoaForms.getEbia_2(),
                dadosPessoaForms.getEbia_3(),
                dadosPessoaForms.getEbia_4(),
                dadosPessoaForms.getEbia_5(),
                dadosPessoaForms.getEbia_6(),
                dadosPessoaForms.getEbia_7(),
                dadosPessoaForms.getEbia_8());
    }

}
