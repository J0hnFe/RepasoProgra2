package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repository.IHabitacionRepo;
import com.example.demo.ejercicio.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{

	@Autowired
	private IHabitacionRepo habitacionRepo;
	
	@Override
	public void agregar(Habitacion h) {
		this.habitacionRepo.insertar(h);
	}

	@Override
	public void actualizar(Habitacion h) {
		this.habitacionRepo.actualizar(h);
	}

	@Override
	public Habitacion buscar(Integer id) {
		return this.habitacionRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.habitacionRepo.eliminar(id);
	}

}
