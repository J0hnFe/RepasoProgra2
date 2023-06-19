package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repository.modelo.Habitacion;

public interface IHabitacionService {

	public void agregar(Habitacion h);
	public void actualizar(Habitacion h);
	public Habitacion buscar(Integer id);
	public void borrar(Integer id);
}
