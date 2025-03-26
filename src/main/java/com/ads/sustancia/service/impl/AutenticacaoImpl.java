
package com.ads.sustancia.service.impl;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.record.LoginDTO;
import com.ads.sustancia.repository.CoordenadorRepository;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.AutenticacaoService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Service
public class AutenticacaoImpl implements AutenticacaoService {

    @Autowired
    private EntrevistadorRepository entrevistadorRepository;

    @Autowired
    private CoordenadorRepository coordenadorRepository;

    @Override
public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    
    // Tenta encontrar o Entrevistador
    Entrevistador entrevistador = entrevistadorRepository.findByEmail(email).orElse(null);
    if (entrevistador != null) {
        return entrevistador;
    }

    // Tenta encontrar o Coordenador
    Coordenador coordenador = coordenadorRepository.findByEmail(email).orElse(null);
    if (coordenador != null) {
        return coordenador;
    }

    // Caso não encontre nenhum, lança exceção
    throw new UsernameNotFoundException("Usuário não encontrado com o email: " + email);
}


    @Override
    public String obterToken(LoginDTO dadosLogin) {

        Entrevistador entrevistador = entrevistadorRepository.findByEmail(dadosLogin.email()).orElse(null);
        Coordenador coordenador = coordenadorRepository.findByEmail(dadosLogin.email()).orElse(null);
        if (entrevistador!=null) {
            return gerarToken(entrevistador);
        } else if(coordenador!= null) {
            return gerarToken(coordenador);
        }
        
        return "Erro ao obter Token";
       

    }

    public String gerarToken(Entrevistador entrevistador) {

        try {
            Algorithm algorithm = Algorithm.HMAC256("secret-sustancia-api-ads");
            return JWT.create()
                    .withIssuer("sustancia-api")
                    .withSubject(entrevistador.getEmail())
                    .withExpiresAt(geraDataExpiracao())
                    .sign(algorithm);

        } catch (JWTCreationException e) {
            throw new RuntimeException("Erro ao gerar o Token" + e.getLocalizedMessage());
        }
    }

    public String gerarToken(Coordenador coordenador) {

        try {
            Algorithm algorithm = Algorithm.HMAC256("secret-sustancia-api-ads");
            return JWT.create()
                    .withIssuer("sustancia-api")
                    .withSubject(coordenador.getEmail())
                    .withExpiresAt(geraDataExpiracao())
                    .sign(algorithm);

        } catch (JWTCreationException e) {
            throw new RuntimeException("Erro ao gerar o Token" + e.getLocalizedMessage());
        }
    }

    @Override
    public String validaTokenJwt(String token) {

        try {
            Algorithm algorithm = Algorithm.HMAC256("secret-sustancia-api-ads");

            return JWT.require(algorithm)
                    .withIssuer("sustancia-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            throw new RuntimeException("Erro ao validar Token");
        }

    }

    private Instant geraDataExpiracao() {
        return LocalDateTime.now()
                .plusHours(8)
                .toInstant(ZoneOffset.of("-03:00"));
    }

}
