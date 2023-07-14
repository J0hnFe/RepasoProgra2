package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;

public interface IHotelService {
	
	public void agregar(Hotel h);
	public List<Hotel> buscarHotelInnerJoin();

}
