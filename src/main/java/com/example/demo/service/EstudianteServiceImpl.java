package com.example.demo.service;

import org.aspectj.weaver.IEclipseSourceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepoImpl;
import com.example.demo.repository.IEstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void agregar(Estudiante e) {
		this.estudianteRepo.insertar(e);
	}

	@Override
	public void actualizar(Estudiante e) {
		this.estudianteRepo.actualizar(e);
	}

	@Override
	public Estudiante buscar(String cedula) {
		return this.estudianteRepo.seleccionar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		this.estudianteRepo.eliminar(cedula);
		
	}

}
