package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.repository.modelo.Habitacion;

public interface IHabitacionRepo {

	public void insertar(Habitacion h);
	public void actualizar(Habitacion h);
	public Habitacion seleccionar(Integer id);
	public void eliminar(Integer id);
}
