package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteServiceImpl;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante e = new Estudiante();
		e.setApellido("Tamal");
		e.setNombre("John");
		e.setCedula("1234");
		
		this.estudianteService.agregar(e);
		
	}

}
