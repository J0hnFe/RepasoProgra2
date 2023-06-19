package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.repository.modelo.Ciudadano;
import com.example.demo.ejercicio.repository.modelo.CtaBancaria;
import com.example.demo.ejercicio.repository.modelo.Empleado;
import com.example.demo.ejercicio.service.ICtaBancariaService;
import com.example.demo.repository.EstudianteRepoImpl;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
	}
}
