package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Transferencia;

public interface ITransferenciaRepo {

	public void insertar(Transferencia t);

	public List<Transferencia> seleccionarTodos();

}
