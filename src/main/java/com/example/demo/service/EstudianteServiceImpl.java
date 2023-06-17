package com.example.demo.service;

import org.aspectj.weaver.IEclipseSourceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepoImpl;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private EstudianteRepoImpl estudianteRepoImpl;
	
	@Override
	public void agregar(Estudiante e) {
		this.estudianteRepoImpl.insertar(e);
	}

}
