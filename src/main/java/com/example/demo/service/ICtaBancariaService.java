package com.example.demo.service;

import com.example.demo.repository.modelo.CtaBancaria;

public interface ICtaBancariaService {

	public void agregar(CtaBancaria cb);

	public CtaBancaria buscar(String numero);

	public void actualizar(CtaBancaria cb);

}
