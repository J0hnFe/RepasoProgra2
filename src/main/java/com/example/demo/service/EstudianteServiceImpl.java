package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		return this.estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoTyped(String apellido) {
		return this.estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre) {
		return this.estudianteRepo.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public List<Estudiante> buscarListaPorApellido(String apellido) {
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNamed(String apellido) {
		return this.estudianteRepo.seleccionarPorApellidoNamed(apellido);
	}
	
	

}
