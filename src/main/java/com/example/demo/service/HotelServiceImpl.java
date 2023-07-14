package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.IHotelRepo;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public void agregar(Hotel h) {
		this.hotelRepo.insertar(h);
	}

	@Override
	public List<Hotel> buscarHotelInnerJoin() {
		return this.hotelRepo.seleccionarHotelInnerJoin();
	}

}
