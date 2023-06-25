package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepoImpl implements IAutorRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor a) {
		this.entityManager.persist(a);
	}

	@Override
	public void actualizar(Autor a) {
		this.entityManager.merge(a);
	}

	@Override
	public Autor encontrar(Integer id) {
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Autor autorAux = this.encontrar(id);
		this.entityManager.remove(autorAux);
	}
}
