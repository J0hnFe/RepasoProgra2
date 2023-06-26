package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Trabajador;

public interface ITrabajadorService {

	public void agregar(Trabajador t);
	public void actualizar(Trabajador t);
	public Trabajador buscar(Integer id);
	public void borrar(Integer id);
	
	public Trabajador  buscarPorApellido(String apellido);
	public List<Trabajador> buscarPorCargo(String cargo);
	public Trabajador  buscarPorApellidoTyped(String apellido);
	public List<Trabajador> buscarPorCargoTyped(String cargo);
	
}
