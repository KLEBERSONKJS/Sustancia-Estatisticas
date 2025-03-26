package com.ads.sustancia.service;

import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class FormularioService {

    @Autowired
    private PessoaRepository pessoaRepository;

    /**
     * Método para calcular os dados para o gráfico com base nos filtros aplicados.
     * 
     * @param filtro DTO com os filtros de idade, gênero e raça.
     * @return Um mapa de categorias e suas porcentagens para o gráfico.
     */
    public Map<String, Double> calcularGrafico(FiltroDTO filtro) {
        // Obtemos todas as pessoas do banco (ou aplicamos filtros, se necessário)
        List<Pessoa> pessoas = pessoaRepository.filtrarPessoas(filtro);

        // Se não houver pessoas, retornamos um mapa vazio
        if (pessoas.isEmpty()) {
            return new HashMap<>();
        }

        
        Map<String, Long> categoriaCounts = new HashMap<>();

        // Processando as categorias com base nos filtros
        for (Pessoa pessoa : pessoas) {
            
            String chave = criarChaveCategoria(pessoa, filtro);

            
            categoriaCounts.put(chave, categoriaCounts.getOrDefault(chave, 0L) + 1);
        }

        // Calculamos o total de pessoas para calcular a porcentagem
        long totalPessoas = pessoas.size();

        // Calculando a porcentagem de cada categoria
        Map<String, Double> porcentagens = categoriaCounts.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> (entry.getValue() * 100.0) / totalPessoas // Calcular a porcentagem
                ));

        return porcentagens;
    }

    /**
     * 
     * @param pessoa A pessoa a ser analisada.
     * @param filtro O filtro que contém as opções selecionadas.
     * @return U
     */
    private String criarChaveCategoria(Pessoa pessoa, FiltroDTO filtro) {
        String chave = "";

        // Adicionamos as categorias conforme os filtros selecionados
        if (filtro.getIdade() != null) { 
            chave += "Idade: " + pessoa.getIdade() + " ";
        }
        if (filtro.getGenero() != null) { 
            chave += "Gênero: " + pessoa.getGenero() + " ";
        }
        if (filtro.getRaca() != null) { 
            chave += "Raça: " + pessoa.getRaca() + " ";
        }

        return chave.trim();
    }
}
