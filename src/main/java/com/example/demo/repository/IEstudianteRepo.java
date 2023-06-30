package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante e);
	public void actualizar(Estudiante e);
	public Estudiante seleccionar(String cedula);
	public void eliminar(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre);
	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	public Estudiante seleccionarPorApellidoNamed(String apellido);
	
}
