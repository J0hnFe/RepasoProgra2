package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void agregar(Estudiante e);
	public void actualizar(Estudiante e);
	public Estudiante buscar(String cedula);
	public void borrar(String cedula);
	
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante buscarPorApellidoTyped(String apellido);
	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre);
	public List<Estudiante> buscarListaPorApellido(String apellido);
	public Estudiante buscarPorApellidoNamed(String apellido);
	
	public Estudiante buscarPorNombreNamed(String nombre);
	public Estudiante buscarPorApellidoNative(String apellido);
	public Estudiante buscarPorNombreNative(String nombre);
	public Estudiante buscarPorApellidoNativeNamed(String apellido);
	public Estudiante buscarPorNombreNativeNamed(String nombre);
	public Estudiante buscarPorApellidoCAQ(String apellido);
	
}
