package com.example.demo.service;

import com.example.demo.repository.modelo.Autor;

public interface IAutorService {

	public void agregar(Autor a);
	public void actualizar(Autor a);
	public Autor buscar (Integer id);
	public void borrar(Integer id);
}
