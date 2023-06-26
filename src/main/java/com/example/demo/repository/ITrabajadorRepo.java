package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Trabajador;

public interface ITrabajadorRepo {

	public void insertar(Trabajador t);
	public void actualizar(Trabajador t);
	public Trabajador seleccionar(Integer id);
	public void eliminar(Integer id);
	
	public Trabajador  seleccionarPorApellido(String apellido);
	public List<Trabajador> seleccionarPorCargo(String cargo);
	public Trabajador  seleccionarPorApellidoTyped(String apellido);
	public List<Trabajador> seleccionarPorCargoTyped(String cargo);
	
}
