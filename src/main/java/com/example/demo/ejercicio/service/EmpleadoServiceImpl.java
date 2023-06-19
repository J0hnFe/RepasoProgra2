package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repository.IEmpleadoRepo;
import com.example.demo.ejercicio.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepo empleadoRepo;
	
	@Override
	public void agregar(Empleado e) {
		this.empleadoRepo.insertar(e);
	}

	@Override
	public void actualizar(Empleado e) {
		this.empleadoRepo.actualizar(e);
	}

	@Override
	public Empleado buscar(Integer id) {
		return this.empleadoRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.empleadoRepo.eliminar(id);
	}

}
