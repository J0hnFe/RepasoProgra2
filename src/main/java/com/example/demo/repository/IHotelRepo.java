package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.transaction.Transactional;

public interface IHotelRepo {
	
	public void insertar(Hotel h);
	public List<Hotel> seleccionarHotelInnerJoin();

}
