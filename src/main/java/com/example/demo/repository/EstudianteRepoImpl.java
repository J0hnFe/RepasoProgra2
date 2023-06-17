package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional // Cuando ya declaro entity manager
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante e) {
		this.entityManager.persist(e);
	}

	@Override
	public void actualizar(Estudiante e) {
		this.entityManager.merge(e);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estudiante = this.seleccionar(cedula);
		this.entityManager.remove(estudiante);
	}
}
