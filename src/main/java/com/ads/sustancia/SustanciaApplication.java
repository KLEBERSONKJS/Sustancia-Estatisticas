package com.ads.sustancia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
public class SustanciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SustanciaApplication.class, args);
		abrirNavegador();
	}

	private static void abrirNavegador() {
		try {
			// URL padrão do Spring Boot (ajuste se necessário)
			String url = "http://localhost:8080/home";

			// Verifica se o ambiente suporta Desktop (GUI)
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				Desktop.getDesktop().browse(new URI(url));
			} else {
				System.out.println("Acesso automático não suportado. Abra manualmente: " + url);
			}
		} catch (Exception e) {
			System.err.println("Erro ao abrir navegador: " + e.getMessage());
		}
	}
}