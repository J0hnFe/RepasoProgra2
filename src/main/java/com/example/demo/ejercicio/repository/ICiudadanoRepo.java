package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.repository.modelo.Ciudadano;

public interface ICiudadanoRepo {

	public void insertar(Ciudadano c);
	public void actualizar(Ciudadano c);
	public Ciudadano seleccionar(Integer id);
	public void eliminar(Integer id);
	
}
