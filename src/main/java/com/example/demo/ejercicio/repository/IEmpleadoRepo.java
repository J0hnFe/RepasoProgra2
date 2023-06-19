package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.repository.modelo.Empleado;

public interface IEmpleadoRepo {

	public void insertar(Empleado e);
	public void actualizar(Empleado e);
	public Empleado seleccionar(Integer id);
	public void eliminar(Integer id);
	
}
