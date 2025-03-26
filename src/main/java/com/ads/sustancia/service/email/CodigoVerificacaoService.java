package com.ads.sustancia.service.email;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class CodigoVerificacaoService {

    private final Map<String, String> codigosVerificacao = new HashMap<>();
    private final Random random = new Random();

    public String gerarCodigo(String email) {
        String codigo = String.format("%06d", random.nextInt(1000000));
        codigosVerificacao.put(email, codigo);
        return codigo;
    }

    public boolean verificarCodigo(String email, String codigoInformado) {
        return codigoInformado.equals(codigosVerificacao.get(email));
    }

    public void removerCodigo(String email) {
        codigosVerificacao.remove(email);
    }
}
