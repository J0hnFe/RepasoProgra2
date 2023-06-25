package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepoImpl implements ILibroRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro libro) {
		this.entityManager.persist(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		this.entityManager.merge(libro);
	}

	@Override
	public Libro encontrar(Integer id) {
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Libro libroAux = this.encontrar(id);
		this.entityManager.remove(libroAux);
	}
}
