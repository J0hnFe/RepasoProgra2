package com.example.demo.ejercicio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel ho) {
		this.entityManager.persist(ho);
	}

	@Override
	public void actualizar(Hotel ho) {
		this.entityManager.merge(ho);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Hotel hotelTemp = this.seleccionar(id);
		this.entityManager.remove(hotelTemp);
	}

}
