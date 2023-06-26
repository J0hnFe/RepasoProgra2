package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
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

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Gregorio");
		estudiante1.setApellido("Perez");
		estudiante1.setCedula("001");
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Roberto");
		estudiante2.setApellido("Perez");
		estudiante2.setCedula("002");
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Luz");
		estudiante3.setApellido("Jackson");
		estudiante3.setCedula("003");
		
//		this.estudianteService.agregar(estudiante1);
//		this.estudianteService.agregar(estudiante2);
//		this.estudianteService.agregar(estudiante3);
		
		Estudiante busquedaSingle = this.estudianteService.buscarPorApellido("Jackson");
		System.out.println("Resultado busqueda single: " + busquedaSingle);
		
		Estudiante busquedaTyped = this.estudianteService.buscarPorApellidoTyped("Jackson");
		System.out.println("Resultado busqueda typed: " + busquedaTyped);
		
		Estudiante busquedaNombreApellido = this.estudianteService.buscarPorApellidoyNombre("Perez", "Roberto");
		System.out.println("Resultado busqueda nombre y apellido: " + busquedaNombreApellido);
		
		List<Estudiante> busquedaLista = this.estudianteService.buscarListaPorApellido("Perez");
		System.out.println("Resultado busqueda nombre y apellido:");
		busquedaLista.stream().forEach(System.out::println);
		
	}
}
