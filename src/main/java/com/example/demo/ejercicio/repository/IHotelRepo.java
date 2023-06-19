package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.repository.modelo.Hotel;

public interface IHotelRepo {

	public void insertar(Hotel ho);
	public void actualizar(Hotel ho);
	public Hotel seleccionar(Integer id);
	public void eliminar(Integer id);
}
