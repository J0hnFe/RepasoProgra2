package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Departamento;
import com.example.demo.repository.modelo.Universidad;
import com.example.demo.service.IUniversidadService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{

	@Autowired
	private IUniversidadService universidadService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
		Universidad u1 = new Universidad();
		u1.setNombre("UCE");
		u1.setTipo("Publica");
		u1.setCantidadEstudiantes(50000.0);
		
		Universidad u2 = new Universidad();
		u2.setNombre("USFQ");
		u2.setTipo("Privada");
		u2.setCantidadEstudiantes(5000.0);
		
		Universidad u3 = new Universidad();
		u3.setNombre("EPN");
		u3.setTipo("Publica");
		u3.setCantidadEstudiantes(16000.0);
		
		Departamento d1 = new Departamento();
		d1.setCodigo("1111");
		d1.setNombre("Bienestar Estudiantil");
		d1.setUniversidad(u1);
		
		Departamento d2 = new Departamento();
		d2.setCodigo("2222");
		d2.setNombre("Relaciones Internacionales");
		d2.setUniversidad(u1);
		
		Departamento d3 = new Departamento();
		d3.setCodigo("3333");
		d3.setNombre("Tecnologias");
		d3.setUniversidad(u3);
		
		List<Departamento> dptosUCE = new ArrayList<>();
		dptosUCE.add(d1);
		dptosUCE.add(d2);
		
		List<Departamento> dptosEPN = new ArrayList<>();
		dptosEPN.add(d3);
		
		//Hay un departamento sin universidad agregado manualmente en la BD
		
		u1.setDepartamentos(dptosUCE);
		u3.setDepartamentos(dptosEPN);
		
//		this.universidadService.agregar(u1);
//		this.universidadService.agregar(u2);
//		this.universidadService.agregar(u3);
		
		System.out.println("Inner Join:");
		this.universidadService.buscarInnerJoin().stream().forEach(System.out::println);
		this.universidadService.buscarDptoInnerJoin().stream().forEach(System.out::println);
		System.out.println("");
		System.out.println("Right Join:");
		this.universidadService.buscarOuterRightJoin().stream().forEach(System.out::println);
		this.universidadService.buscarDptoOuterRightJoin().stream().forEach(System.out::println);
		System.out.println("");
		System.out.println("Left Join:");
		this.universidadService.buscarOuterLeftJoin().stream().forEach(System.out::println);
		this.universidadService.buscarDptoOuterLeftJoin().stream().forEach(System.out::println);
		System.out.println("");
		System.out.println("Full Join:");
		this.universidadService.buscarOuterFullJoin().stream().forEach(System.out::println);
		this.universidadService.buscarDptoOuterFullJoin().stream().forEach(System.out::println);
		System.out.println("");
		System.out.println("Join Where:");
		this.universidadService.buscarWhereJoin().stream().forEach(System.out::println);
		this.universidadService.buscarDptoWhereJoin().stream().forEach(System.out::println);
		System.out.println("");
		System.out.println("Join Fetch:");
		this.universidadService.buscarFetchJoin().stream().forEach(System.out::println);
		this.universidadService.buscarDptoFetchJoin().stream().forEach(System.out::println);
		
	}
}
