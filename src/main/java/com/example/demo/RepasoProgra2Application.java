package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.IPropietarioService;

@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner {

	@Autowired
	private IPropietarioService propietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hay transaccion en el main?: " + TransactionSynchronizationManager.isActualTransactionActive());
		
		Propietario propietario1 = new Propietario();
		propietario1.setNombre("Juan");
		propietario1.setApellido("Perez");
		propietario1.setCedula("111");
		
		this.propietarioService.agregar(propietario1);
	}
	
}
