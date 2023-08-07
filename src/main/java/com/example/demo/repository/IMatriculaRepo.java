package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaRepo {

	public void insertar(Matricula matricula);

	public List<Matricula> seleccionarTodos();

}
