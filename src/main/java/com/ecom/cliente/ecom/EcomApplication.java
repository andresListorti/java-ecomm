package com.ecom.cliente.ecom;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.ecom.cliente.ecom.model.Domicilio;


@SpringBootApplication
public class EcomApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*********************");		
		
		ZoneId zonaArgentina = ZoneId.of("America/Argentina/Buenos_Aires");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		ZonedDateTime fechaActual = ZonedDateTime.now(zonaArgentina);

		System.out.println("LA fecha actual es: " + fechaActual.format(formato));




	}

}
