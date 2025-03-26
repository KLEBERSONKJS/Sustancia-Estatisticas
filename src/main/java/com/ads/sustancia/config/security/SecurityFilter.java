package com.ads.sustancia.config.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.repository.CoordenadorRepository;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.AutenticacaoService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private AutenticacaoService autenticacaoService;

    @Autowired
    private EntrevistadorRepository entrevistadorRepository;

    @Autowired
    private CoordenadorRepository coordenadorRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = extrairToken(request);

        if(token!= null){
            String login = autenticacaoService.validaTokenJwt(token);
            Entrevistador entrevistador = entrevistadorRepository.findByEmail(login).orElse(null);
            Coordenador coordenador = coordenadorRepository.findByEmail(login).orElse(null);

            if (entrevistador!= null) {
                var autentication = new UsernamePasswordAuthenticationToken(entrevistador,null, entrevistador.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(autentication);
            } else if(coordenador!= null) {
                var autentication = new UsernamePasswordAuthenticationToken(coordenador,null, coordenador.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(autentication);
            }
            
        }

        filterChain.doFilter(request, response);
    }

    public String extrairToken(HttpServletRequest request){
        var authHearder = request.getHeader("Authorization");

        if (authHearder == null) {
            return null;
        }
    
        if(!authHearder.split(" ")[0].equals("Bearer")){ 
            return null;
        }

        return authHearder.split(" ")[1];
    }
}
