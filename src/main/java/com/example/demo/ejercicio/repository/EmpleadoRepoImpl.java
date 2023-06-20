package com.example.demo.ejercicio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado e) {
		this.entityManager.persist(e);
	}

	@Override
	public void actualizar(Empleado e) {
		this.entityManager.merge(e);
	}

	@Override
	public Empleado seleccionar(Integer id) {
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Empleado empleadoTemp = this.seleccionar(id);
		this.entityManager.remove(empleadoTemp);
	}

}
