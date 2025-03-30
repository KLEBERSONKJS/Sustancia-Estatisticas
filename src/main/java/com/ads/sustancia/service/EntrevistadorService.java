package com.ads.sustancia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.enums.UsuarioStatusEnum;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.record.CadastroEntrevistadorDTO;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.email.EmailService;
import com.ads.sustancia.service.impl.AutenticacaoImpl;

@Service
public class EntrevistadorService {

    @Autowired
    private EntrevistadorRepository entrevistadorRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    AutenticacaoImpl autenticacaoImpl;

    public void cadastrarEntrevistador(CadastroEntrevistadorDTO dadosCadastroEntrevistador) {

        if (entrevistadorRepository.findByEmail(dadosCadastroEntrevistador.email()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado.");
        }
        UserRole userRole = UserRole.USER;
        var password = passwordEncoder.encode(dadosCadastroEntrevistador.email());
        Entrevistador entity = new Entrevistador(dadosCadastroEntrevistador.nome(),
                dadosCadastroEntrevistador.email(), password, dadosCadastroEntrevistador.dataNascimento(),
                userRole);
        entrevistadorRepository.save(entity);

        emailService.emailCadastroEntrevistador(dadosCadastroEntrevistador, autenticacaoImpl.gerarToken(entity));

    }

    public List<Entrevistador> listarTodos() {
        return entrevistadorRepository.findAll();
    }

    public String verificarCadastro(String token) {
        try {
            Optional<Entrevistador> entrevistadorVerificar = entrevistadorRepository
                    .findByEmail(autenticacaoImpl.validaTokenJwt(token));
            if (entrevistadorVerificar.isPresent()) {
                Entrevistador entrevistadorVerificado = entrevistadorVerificar.get();
                entrevistadorVerificado.setStatus(UsuarioStatusEnum.ATIVO);
                entrevistadorRepository.save(entrevistadorVerificado);
            }
            return ("Confirmação bem Sucedida");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao validar token");
        }
    }

}
