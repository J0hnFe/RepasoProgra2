package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	private static List<Estudiante> baseEstudiante = new ArrayList<>();

	@Override
	public void insertar(Estudiante e) {
		baseEstudiante.add(e);
	}

}
