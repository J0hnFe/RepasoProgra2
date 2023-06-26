package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.IMatriculaService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{

	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Alumno alumno = new Alumno();
		alumno.setNombre("Homero");
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Teresa");
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Lupita");
		
		Materia materia = new Materia();
		materia.setNombre("Literatura");
		Materia materia2 = new Materia();
		materia2.setNombre("Ingles");
		
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(alumno);
		alumnos.add(alumno2);
		
		List<Materia> materias = new ArrayList<>();
		materias.add(materia);
		materias.add(materia2);
		
		Matricula matricula = new Matricula();
		matricula.setAlumno(alumno);
		matricula.setFecha(LocalDateTime.now());
		matricula.setMateria(materia);
		matricula.setNumero("001");
		
		this.matriculaService.agregar(matricula);
	}
}
