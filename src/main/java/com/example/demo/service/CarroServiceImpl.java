package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICarroRepo;
import com.example.demo.repository.modelo.Carro;
import com.example.demo.repository.modelo.dto.CarroDTO;

@Service
public class CarroServiceImpl implements ICarroService{
	
	@Autowired
	private ICarroRepo carroRepo;

	@Override
	public void agregar(Carro c) {
		this.carroRepo.insertar(c);
	}

	@Override
	public List<CarroDTO> buscarTodosDTO() {
		return this.carroRepo.seleccionarTodosDTO();
	}

}
