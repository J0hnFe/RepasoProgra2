package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.repository.modelo.CtaBancaria;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public interface ICtaBancariaRepo {

	public void insertar(CtaBancaria b);
	public void actualizar(CtaBancaria b);
	public CtaBancaria encontrar(Integer id);
}
