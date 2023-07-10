package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Carro;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.ICarroService;
import com.example.demo.service.IEstudianteService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{

	@Autowired
	private ICarroService carroService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Carro carro1 = new Carro();
		carro1.setAnio("2003");
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Grand Vitara");
		
		Carro carro2 = new Carro();
		carro2.setAnio("2021");
		carro2.setMarca("Toyota");
		carro2.setModelo("Fortuner");
		
		Carro carro3 = new Carro();
		carro3.setAnio("1964");
		carro3.setMarca("Pontiac");
		carro3.setModelo("GTO");
		
		Carro carro4 = new Carro();
		carro4.setAnio("1989");
		carro4.setMarca("Jaguar");
		carro4.setModelo("XJS");
		
//		this.carroService.agregar(carro1);
//		this.carroService.agregar(carro2);
//		this.carroService.agregar(carro3);
//		this.carroService.agregar(carro4);
		
		this.carroService.buscarTodosDTO().stream().forEach(System.out::println);
		
		

	}
}
