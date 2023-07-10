package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Carro;
import com.example.demo.repository.modelo.dto.CarroDTO;

public interface ICarroService {

	public void agregar(Carro c);
	
	public List<CarroDTO> buscarTodosDTO();
}
