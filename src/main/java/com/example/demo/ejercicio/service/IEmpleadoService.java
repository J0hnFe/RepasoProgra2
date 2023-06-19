package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repository.modelo.Empleado;

public interface IEmpleadoService {

	public void agregar(Empleado e);
	public void actualizar(Empleado e);
	public Empleado buscar(Integer id);
	public void borrar(Integer id);
}
