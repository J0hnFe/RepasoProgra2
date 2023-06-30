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
		estudiante1.setNombre("Francisca");
		estudiante1.setApellido("Lopez");
		estudiante1.setCedula("0012");
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Alberto");
		estudiante2.setApellido("Lopez");
		estudiante2.setCedula("0013");
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Rene");
		estudiante3.setApellido("Frog");
		estudiante3.setCedula("0014");
		
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setNombre("Jose");
		estudiante4.setApellido("Balvin");
		estudiante4.setCedula("0015");
		
//		this.estudianteService.agregar(estudiante1);
//		this.estudianteService.agregar(estudiante2);
//		this.estudianteService.agregar(estudiante3);
//		this.estudianteService.agregar(estudiante4);
		
		List<Estudiante> estudiantes1 = this.estudianteService.buscarListaPorApellido("Lopez");
		System.out.println("\nList query");
		estudiantes1.stream().forEach(System.out::println);
		
		Estudiante estudianteS = this.estudianteService.buscarPorApellido("Frog");
		System.out.println("\nSingle Query");
		System.out.println(estudianteS);
		
		Estudiante estudianteNA =  this.estudianteService.buscarPorApellidoyNombre("Frog", "Rene");
		System.out.println("\nSingleQuery (2 argumentos)");
		System.out.println(estudianteNA);
		
		Estudiante estudianteTy = this.estudianteService.buscarPorApellidoTyped("Balvin");
		System.out.println("\nTypedQuery Single");
		System.out.println(estudianteTy);
		
		Estudiante estudianteNam = this.estudianteService.buscarPorApellidoNamed("Frog");
		System.out.println("\nSingle Named query");
		System.out.println(estudianteNam);
	}
}
