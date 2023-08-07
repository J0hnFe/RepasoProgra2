package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepo;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public void agregar(Materia materia) {
		this.iMateriaRepo.insertar(materia);
	}

	@Override
	public List<Materia> buscarPorCodigo(String codigo) {
		return this.iMateriaRepo.encontrarTodos();
	}

	@Override
	public Materia buscarPorcodigo(String codigo) {
		return this.iMateriaRepo.encontrarPorcodigo(codigo);
	}

}
