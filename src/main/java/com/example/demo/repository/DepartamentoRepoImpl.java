package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Departamento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DepartamentoRepoImpl implements IDepartamentoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Departamento d) {
		this.entityManager.persist(d);
	}

}
