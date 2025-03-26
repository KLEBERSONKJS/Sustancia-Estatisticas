package com.ads.sustancia.service.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ads.sustancia.record.CadastroCoordenadorDTO;
import com.ads.sustancia.record.CadastroEntrevistadorDTO;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    private void sendEmail(String destinatario, String assunto, String corpo) {

        try {
            SimpleMailMessage mensagem = new SimpleMailMessage();
            mensagem.setTo(destinatario);
            mensagem.setSubject(assunto);
            mensagem.setText(corpo);
            javaMailSender.send(mensagem);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }

    public void emailCadastroEntrevistador(CadastroEntrevistadorDTO dadosCadastroEntrevistador, String token) {

        this.sendEmail(dadosCadastroEntrevistador.email(),
                "🎉 Bem-vindo ao Time de Entrevistadores do Projeto Sustância!",
                "Olá " + dadosCadastroEntrevistador.nome()
                        + ", Parabéns! 🎉 Você agora faz parte do time de entrevistadores do projeto. Estamos muito felizes em tê-lo conosco!\n"
                        + "Nosso software Sustância lhe dá as boas-vindas e estamos ansiosos para trabalhar juntos nessa jornada. Se precisar de qualquer suporte, estamos à disposição\n"
                        + "Seja bem-vindo ao time! 🚀\n"
                        + "Atenciosamente,\n"
                        +"Clique no link para confirmar o cadastro http://localhost:8080/entrevistador/verificar-codigo?token=" + token);
    }

    public void emailCadastroCoordenador(CadastroCoordenadorDTO dados) {
        String corpoEmail = "Olá " + dados.nome() + ",\n\n"
                + "Bem-vindo(a) à nossa equipe de coordenadores!\n"
                + "Agradecemos por se juntar a nós.\n\n"
                + "Atenciosamente,\nEquipe Sustância";

        sendEmail(dados.email(), "Bem-vindo(a)!", corpoEmail);
    }

    public void enviarCodigoVerificacao(String email, int codigo) {
        String corpoEmail = "Olá,\n\n"
                + "Seu código de verificação para cadastro é: " + codigo + "\n\n"
                + "Se você não solicitou este código, ignore este email.\n\n"
                + "Atenciosamente,\nEquipe Sustância";

        sendEmail(email, "Código de Verificação - Sustância", corpoEmail);
    }

}
