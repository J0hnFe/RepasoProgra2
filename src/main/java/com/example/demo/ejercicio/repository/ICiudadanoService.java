package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.repository.modelo.Ciudadano;

public interface ICiudadanoService {

	public void agregar(Ciudadano c);
	public void actualizar(Ciudadano c);
	public Ciudadano buscar(Integer id);
	public void borrar(Integer id);
}
