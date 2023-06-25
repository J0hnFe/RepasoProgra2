package com.example.demo.repository;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;

public interface ILibroRepo {

	public void insertar(Libro libro);
	public void actualizar(Libro libro);
	public Libro encontrar(Integer id);
	public void eliminar(Integer id);
}
