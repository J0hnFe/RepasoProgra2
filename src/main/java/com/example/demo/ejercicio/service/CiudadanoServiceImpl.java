package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repository.ICiudadanoRepo;
import com.example.demo.ejercicio.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;

	@Override
	public void agregar(Ciudadano c) {
		this.ciudadanoRepo.insertar(c);
	}

	@Override
	public void actualizar(Ciudadano c) {
		this.ciudadanoRepo.actualizar(c);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		return this.ciudadanoRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.ciudadanoRepo.eliminar(id);
	}
	
}
