package com.example.demo.repository;

import com.example.demo.repository.modelo.Autor;

public interface IAutorRepo {

	public void insertar(Autor a);
	public void actualizar(Autor a);
	public Autor encontrar(Integer id);
	public void eliminar(Integer id);
}
