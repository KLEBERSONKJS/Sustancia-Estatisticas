package com.ads.sustancia.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ads.sustancia.record.LoginDTO;

public interface AutenticacaoService extends UserDetailsService {
    

    public String obterToken(LoginDTO dadosLogin);

    public String validaTokenJwt(String token);
}
