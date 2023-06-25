package com.example.demo.service;

import com.example.demo.repository.modelo.Libro;

public interface ILibroService {

	public void agregar(Libro l);
	public void actualizar(Libro l);
	public Libro buscar (Integer id);
	public void borrar(Integer id);
}
