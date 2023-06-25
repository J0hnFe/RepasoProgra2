package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAutorRepo;
import com.example.demo.repository.modelo.Autor;

@Service
public class AutorsServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepo autorRep;

	@Override
	public void agregar(Autor a) {
		this.autorRep.insertar(a);
	}

	@Override
	public void actualizar(Autor a) {
		this.autorRep.actualizar(a);
	}

	@Override
	public Autor buscar(Integer id) {
		return this.autorRep.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.autorRep.eliminar(id);
	}
	
	
	
	
}
