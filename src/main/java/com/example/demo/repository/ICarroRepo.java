package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Carro;
import com.example.demo.repository.modelo.dto.CarroDTO;

public interface ICarroRepo {
	
	public void insertar(Carro c);
	
	public List<CarroDTO> seleccionarTodosDTO();

}
