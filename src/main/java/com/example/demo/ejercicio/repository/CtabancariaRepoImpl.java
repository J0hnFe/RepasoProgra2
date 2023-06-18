package com.example.demo.ejercicio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repository.modelo.CtaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CtabancariaRepoImpl implements ICtaBancariaRepo{

	@Autowired
	private EntityManager entityManager;
	@Override
	public void insertar(CtaBancaria b) {
		this.entityManager.persist(b);
	}

	@Override
	public void actualizar(CtaBancaria b) {
		this.entityManager.merge(b);
	}

	@Override
	public CtaBancaria encontrar(Integer id) {
		return this.entityManager.find(CtaBancaria.class, id);
	}
}
