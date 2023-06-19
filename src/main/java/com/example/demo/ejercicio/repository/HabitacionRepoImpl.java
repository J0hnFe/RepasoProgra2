package com.example.demo.ejercicio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Habitacion h) {
		this.entityManager.persist(h);
	}

	@Override
	public void actualizar(Habitacion h) {
		this.entityManager.merge(h);
	}

	@Override
	public Habitacion seleccionar(Integer id) {
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
	}
}
