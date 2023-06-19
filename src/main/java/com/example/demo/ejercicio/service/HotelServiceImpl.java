package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repository.IHabitacionRepo;
import com.example.demo.ejercicio.repository.IHotelRepo;
import com.example.demo.ejercicio.repository.modelo.Habitacion;
import com.example.demo.ejercicio.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepo hotelRepo;
	
	@Override
	public void agregar(Hotel ho) {
		this.hotelRepo.insertar(ho);
	}

	@Override
	public void actualizar(Hotel ho) {
		this.hotelRepo.actualizar(ho);
	}

	@Override
	public Hotel buscar(Integer id) {
		return this.hotelRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.hotelRepo.eliminar(id);
	}

}
