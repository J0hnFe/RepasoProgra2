package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante e);
	public void actualizar(Estudiante e);
	
	//buscamos por un identificador, por ahora usamos la cedula
	public Estudiante seleccionar(String cedula);
	
	//eliminamos por un identificador, por ahora usamos la cedula
	public void eliminar(String cedula);
	
}
