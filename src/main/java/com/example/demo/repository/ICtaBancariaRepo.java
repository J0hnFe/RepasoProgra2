package com.example.demo.repository;

import com.example.demo.repository.modelo.CtaBancaria;

public interface ICtaBancariaRepo {

	public void insertar(CtaBancaria cb);

	public CtaBancaria seleccionar(String numero);

	public void actualizar(CtaBancaria cb);

}
