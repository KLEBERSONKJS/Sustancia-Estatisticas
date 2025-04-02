package com.ads.sustancia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.enums.UserRole;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.email.EmailService;


@Service
public class EntrevistadorService {

    @Autowired
    private EntrevistadorRepository entrevistadorRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void cadastrarEntrevistador(EntrevistadorDTO dadosCadastroEntrevistador) {

        if (entrevistadorRepository.findByEmail(dadosCadastroEntrevistador.email()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado.");
        }
        UserRole userRole = UserRole.USER;
        var password = passwordEncoder.encode(dadosCadastroEntrevistador.email());
        Entrevistador entity = new Entrevistador(dadosCadastroEntrevistador.nome(),
                dadosCadastroEntrevistador.email(), password, dadosCadastroEntrevistador.dataNascimento(),
                userRole);
        entrevistadorRepository.save(entity);

      
    }

    public List<Entrevistador> listarTodos() {
        return entrevistadorRepository.findAll();
    }

   
}
