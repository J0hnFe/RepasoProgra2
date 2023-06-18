package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repository.modelo.CtaBancaria;

public interface ICtaBancariaService {
	public void aperturar(CtaBancaria bancaria);
	public void actualizar(CtaBancaria bancaria);
	public CtaBancaria consultar(Integer id);
}
