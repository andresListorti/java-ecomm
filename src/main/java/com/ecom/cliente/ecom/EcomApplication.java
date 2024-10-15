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
		System.out.println("********************");
		System.out.println("Usando JPA con Spring");
		

		// Domicilio domicilioA = new Domicilio();
		// Domicilio domicilioB = new Domicilio();
		// Domicilio domicilioC = new Domicilio();
		// Domicilio domicilioD = new Domicilio();
		// Domicilio domicilioE = new Domicilio();
		// List<Domicilio> domiciliosC1 = new ArrayList<>();
		// List<Domicilio> domiciliosC2 = new ArrayList<>();
		// List<Domicilio> domiciliosC3 = new ArrayList<>();
		// List<Domicilio> domiciliosC4 = new ArrayList<>();
		// List<Domicilio> domiciliosC5 = new ArrayList<>();
		// domiciliosC1.add(domicilioA);
		// domiciliosC2.add(domicilioB);
		// domiciliosC3.add(domicilioC);
		// domiciliosC4.add(domicilioD);
		// domiciliosC5.add(domicilioE);
		// Cliente c1 = new Cliente("Andres", "Listorti", 42658958, domiciliosC1);
		// Cliente c2 = new Cliente("Maria Soledad", "Gallo", 43444958, domiciliosC2);
		// Cliente c3 = new Cliente("Yesica", "Vazquez", 396584118, domiciliosC3);
		// Cliente c4 = new Cliente("Luz", "Britez", 18658223, domiciliosC4);
		// Cliente c5 = new Cliente("Yamila", "White", 432228958, domiciliosC5);
		// clienteService.agregarCliente(c1);
		// clienteService.agregarCliente(c2);
		// clienteService.agregarCliente(c3);
		// clienteService.agregarCliente(c4);
		// clienteService.agregarCliente(c5);		

		System.out.println("Traer clientes Creados");
		for (Cliente c : clienteService.getAllClientes()) {
			
			System.out.println(c);
			
		}
		
		Optional<Cliente> buscadoPorId = clienteService.getById(1);
		
		System.out.println("************Buscado por ID 1*************************");
		System.out.println(buscadoPorId);
		
		
		// System.out.println("************Buscado por DNI*************************");
		
		// Cliente buscadoPorDni = clienteService.findByDni((long) 42658958);
		// System.out.println(buscadoPorDni);
		
		// System.out.println("************Buscado por Nombre *************************");
		
		// List<Cliente> buscadoPorNombre = clienteService.findByNombre("Yesica");
		// System.out.println(buscadoPorNombre);
		
		// System.out.println("************Buscado por Apellido *************************");
		
		// List<Cliente> buscadoPorApellido = clienteService.findByApellido("Gallo");
		// System.out.println(buscadoPorApellido);
		
		
		// System.out.println("************ Borrado Yamila*************************");
		// clienteService.borrarCliente(c5);
		// System.out.println("******************Borrada***********************");

		// System.out.println("Traer Clientes");
		// for (Cliente c : clienteService.getAllClientes()) {
			
		// 	System.out.println(c);
			
		// }

		ZoneId zonaArgentina = ZoneId.of("America/Argentina/Buenos_Aires");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		ZonedDateTime fechaActual = ZonedDateTime.now(zonaArgentina);

		System.out.println("LA fecha actual es: " + fechaActual.format(formato));




	}

}
