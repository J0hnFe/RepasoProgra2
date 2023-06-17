package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	public void agregar(Estudiante e);
	public void actualizar(Estudiante e);
	public Estudiante buscar(String cedula);
	public void borrar(String cedula);
}
