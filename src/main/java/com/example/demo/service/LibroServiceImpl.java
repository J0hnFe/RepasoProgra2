package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ILibroRepo;
import com.example.demo.repository.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepo libroRepo;
	
	@Override
	public void agregar(Libro l) {
		this.libroRepo.insertar(l);;
	}

	@Override
	public void actualizar(Libro l) {
		this.libroRepo.actualizar(l);
	}

	@Override
	public Libro buscar(Integer id) {
		return this.libroRepo.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.libroRepo.eliminar(id);
	}

}
