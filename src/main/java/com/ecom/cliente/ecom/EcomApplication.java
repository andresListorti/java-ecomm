package com.ecom.cliente.ecom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecom.cliente.ecom.model.Cliente;
import com.ecom.cliente.ecom.model.Domicilio;
import com.ecom.cliente.ecom.service.ClienteService;

@SpringBootApplication
public class EcomApplication implements CommandLineRunner {

	@Autowired
	ClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*********************");		
		System.out.println("**********************");
		System.out.println("Usando JPA con Spring");
		

		Domicilio domicilioA = new Domicilio();
		List<Domicilio> domiciliosC1 = new ArrayList<>();
		domiciliosC1.add(domicilioA);
		Cliente c1 = new Cliente("andres", "Perez", 23658958, domiciliosC1);
		clienteService.agregarCliente(c1);
		
		System.out.println("traer cliente Creado");
		for (Cliente c : clienteService.getAllClientes()) {
			
			System.out.println(c);
			
		}


		

	}

}
