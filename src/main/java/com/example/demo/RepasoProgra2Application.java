package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.EstudianteRepoImpl;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{
	
	@Autowired
	IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Fritada");
		estudiante.setCedula("1122");
		estudiante.setNombre("Jeronimo");
		
		this.estudianteService.agregar(estudiante);
		
	}

}
