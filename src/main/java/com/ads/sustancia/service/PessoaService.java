package com.ads.sustancia.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.sustancia.enums.AuxilioEnum;
import com.ads.sustancia.enums.ConsumoOntemEnum;
import com.ads.sustancia.enums.DependentesEnum;
import com.ads.sustancia.enums.EmpregoEnum;
import com.ads.sustancia.enums.EscolaridadeEnum;
import com.ads.sustancia.enums.EstadoCivilEnum;
import com.ads.sustancia.enums.GeneroEnum;
import com.ads.sustancia.enums.RacaEnum;
import com.ads.sustancia.enums.RefeicaoDiaEnum;
import com.ads.sustancia.enums.ReligiaoEnum;
import com.ads.sustancia.model.ConsumoAlimentar;
import com.ads.sustancia.model.InsegurancaAlimentar;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.FormularioDTO;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.repository.PessoaRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


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

    // public String dadosfiltrados(FiltrosDTO filtrosDTO){
    //     System.out.println(filtrosDTO);
    //     List<Pessoa> filtrarPessoas = pessoaRepository.filtrarPessoas(RacaEnum.respostaRaca(filtrosDTO.getRaca()), GeneroEnum.repostaGenero(filtrosDTO.getGenero()), filtrosDTO.getIdadeMin(), filtrosDTO.getIdadeMax());
    //     for ( Pessoa p : filtrarPessoas) {
    //         System.out.println(p);
    //     }
    //     return "fim sql";
    // }

    public String dadosFiltrados (FiltroDTO filtro){
        List<Pessoa> filtarPessoas = pessoaRepository.filtrarPessoasParaSubquery(filtro);
        System.out.println(filtarPessoas);
        return filtarPessoas + "";
    }
}
