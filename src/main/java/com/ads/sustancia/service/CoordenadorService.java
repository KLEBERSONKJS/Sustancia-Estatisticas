package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.CadastroCoordenadorDTO;
import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.repository.CoordenadorRepository;
import com.ads.sustancia.service.email.EmailService;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CoordenadorService {

    @Autowired
    private CoordenadorRepository coordenadorRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    private final java.util.Map<String, Integer> codigosVerificacao = new java.util.HashMap<>();

    public String cadastrarCoordenador(CadastroCoordenadorDTO dados) {
        if (dados == null) {
            throw new RuntimeException("Parametro não pode ser Nulo");
        }
        int codigo = new Random().nextInt(900000) + 100000;
        codigosVerificacao.put(dados.email(), codigo);
        emailService.enviarCodigoVerificacao(dados.email(), codigo);

        armazenarDadosPendentes(dados.email(), dados);

        return "Um código de verificação foi enviado para o email " + dados.email();
    }

    public String verificarCodigo(String email, int codigo) {
        Integer codigoArmazenado = codigosVerificacao.get(email);

        if (codigoArmazenado == null) {
            throw new IllegalArgumentException("Nenhum código de verificação encontrado para este email.");
        }

        if (codigoArmazenado == codigo) {
            codigosVerificacao.remove(email);
            Optional<CadastroCoordenadorDTO> dadosOptional = getDadosPendentes(email);

            if (dadosOptional.isPresent()) {
                CadastroCoordenadorDTO dados = dadosOptional.get();
                var passwordHash = passwordEncoder.encode("1234");
                UserRole userRole = UserRole.ADMIN;
                Coordenador novoCoordenador = new Coordenador(dados.nome(), dados.email(), passwordHash,
                        dados.dataNascimento(), userRole);
                novoCoordenador.setStatus(UsuarioStatusEnum.ATIVO);
                coordenadorRepository.save(novoCoordenador);
                return "Cadastro confirmado! Coordenador " + novoCoordenador.getNome() + " foi registrado com sucesso.";
            } else {
                throw new IllegalStateException("Erro ao recuperar dados do cadastro.");
            }
        } else {
            throw new IllegalArgumentException("Código de verificação inválido.");
        }
    }

    public Optional<Coordenador> buscarPorEmail(String email) {
        return coordenadorRepository.findByEmail(email);
    }

    public List<Coordenador> listarTodos() {
        return coordenadorRepository.findAll();
    }

    public Optional<Coordenador> buscarPorId(Long id) {
        return coordenadorRepository.findById(id);
    }

    public void atualizarCoordenador(Coordenador coordenador) {
        coordenadorRepository.save(coordenador);
    }

    public void deletarPorId(Long id) {
        coordenadorRepository.deleteById(id);
    }

    private final java.util.Map<String, CadastroCoordenadorDTO> dadosPendentes = new java.util.HashMap<>();

    public void armazenarDadosPendentes(String email, CadastroCoordenadorDTO dados) {
        dadosPendentes.put(email, dados);
    }

    public Optional<CadastroCoordenadorDTO> getDadosPendentes(String email) {
        return Optional.ofNullable(dadosPendentes.get(email));
    }

    public Coordenador getCoordenadorProfile(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCoordenadorProfile'");
    }

}
