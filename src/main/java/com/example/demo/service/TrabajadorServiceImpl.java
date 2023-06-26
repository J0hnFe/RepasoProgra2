package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ITrabajadorRepo;
import com.example.demo.repository.modelo.Trabajador;

@Service
public class TrabajadorServiceImpl implements ITrabajadorService{

	@Autowired
	private ITrabajadorRepo trabajadorRepo;
	
	@Override
	public void agregar(Trabajador t) {
		this.trabajadorRepo.insertar(t);
	}

	@Override
	public void actualizar(Trabajador t) {
		this.trabajadorRepo.actualizar(t);
	}

	@Override
	public Trabajador buscar(Integer id) {
		return this.trabajadorRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.trabajadorRepo.eliminar(id);
	}

	@Override
	public Trabajador buscarPorApellido(String apellido) {
		return this.trabajadorRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Trabajador> buscarPorCargo(String cargo) {
		return this.trabajadorRepo.seleccionarPorCargo(cargo);
	}

	@Override
	public Trabajador buscarPorApellidoTyped(String apellido) {
		return this.trabajadorRepo.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public List<Trabajador> buscarPorCargoTyped(String cargo) {
		return this.trabajadorRepo.seleccionarPorCargoTyped(cargo);
	}

}
