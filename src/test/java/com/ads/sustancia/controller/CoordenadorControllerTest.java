package com.ads.sustancia.controller;

import com.ads.sustancia.dto.request.UsuarioDTO;
import com.ads.sustancia.model.Usuario;
import com.ads.sustancia.repository.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import net.datafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions.*;

import java.security.Principal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CoordenadorControllerTest {

//    @Autowired
//    EntityManager entityManager;
//
//    private final Faker faker = new Faker(new Locale("pt-BR"));
//
//    @Autowired
//    UsuarioRepository repository;


//    @Test
//    @DisplayName("Retorno de perfil com suscesso")
//    void perfilSucesso() {
//
//        String nome = faker.name().firstName();
//        String email = faker.internet().emailAddress();
//        String senha = faker.internet().password();
//        Date date = faker.date().birthday();
//
//        LocalDate dataNascimento = Instant.ofEpochMilli(date.getTime())
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//
//        UsuarioDTO data = new UsuarioDTO(nome, email, senha, dataNascimento);
//
//        newUser(data);
//
//        Optional<Usuario> result = this.repository.findByEmail(data.getNome());
//
//        assertThat(result.isPresent()).isTrue();
//    }
//
//    @Test
//    @DisplayName("Erro ao retornar o perfil")
//    void perfilFail() {
//
//        String nome = faker.name().firstName();
//        String email = faker.internet().emailAddress();
//        String senha = faker.internet().password();
//        Date date = faker.date().birthday();
//
//        LocalDate dataNascimento = Instant.ofEpochMilli(date.getTime())
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//
//        UsuarioDTO data = new UsuarioDTO(nome, email, senha, dataNascimento);
//
//        newUser(data);
//
//        Optional<Usuario> result = this.repository.findByEmail(data.getNome());
//
//        assertThat(result.isPresent()).isFalse();
//    }
//
//    @Test
//    void cadastrarCoordenador() {
//    }
//
//    private Usuario newUser(UsuarioDTO data){
//        Usuario user = new Usuario(data);
//        entityManager.persist(user);
//        return user;
//    }
}