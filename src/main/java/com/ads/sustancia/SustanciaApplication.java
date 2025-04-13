package com.ads.sustancia;

import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.service.impl.CoordenadorServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SustanciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SustanciaApplication.class, args);
	}



}