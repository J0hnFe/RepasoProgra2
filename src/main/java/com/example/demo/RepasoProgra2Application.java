package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Trabajador;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.ITrabajadorService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{
	
	@Autowired
	private ITrabajadorService trabajadorService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Trabajador trabajador1 = new Trabajador();
		trabajador1.setNombre("Homero");
		trabajador1.setApellido("Simpson");
		trabajador1.setCedula("001");
		trabajador1.setCargo("Tecnico");
		
		Trabajador trabajador2 = new Trabajador();
		trabajador2.setNombre("Marge");
		trabajador2.setApellido("Simpson");
		trabajador2.setCedula("002");
		trabajador2.setCargo("Juez");
		
		Trabajador trabajador3 = new Trabajador();
		trabajador3.setNombre("Barney");
		trabajador3.setApellido("Gomez");
		trabajador3.setCedula("003");
		trabajador3.setCargo("Tecnico");
		
//		this.trabajadorService.agregar(trabajador1);
//		this.trabajadorService.agregar(trabajador2);
//		this.trabajadorService.agregar(trabajador3);
		
		//Query con single result
		Trabajador t1 =  this.trabajadorService.buscarPorApellido("Gomez");
		System.out.println("Trabajador single: " + t1);
		
		//Query con result list
		List<Trabajador> t2 =  this.trabajadorService.buscarPorCargo("Tecnico");
		System.out.println("Trabajadores result list: ");
		t2.stream().forEach(System.out :: println);
		
		//TypedQuery con single result
		Trabajador t3 =  this.trabajadorService.buscarPorApellidoTyped("Gomez");
		System.out.println("Trabajador typedQuery: " + t3);
		
		//TypedQuery con result list
		List<Trabajador> t4 =  this.trabajadorService.buscarPorCargo("Tecnico");
		System.out.println("Trabajadores typedQuery: ");
		t4.stream().forEach(System.out :: println);
		
	}
}
