package com.example.demo.ejercicio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudadano c) {
		this.entityManager.persist(c);
	}

	@Override
	public void actualizar(Ciudadano c) {
		this.entityManager.merge(c);
	}

	@Override
	public Ciudadano seleccionar(Integer id) {
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
	}
	

}
