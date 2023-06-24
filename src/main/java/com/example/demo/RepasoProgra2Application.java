package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.repository.modelo.Habitacion;
import com.example.demo.ejercicio.repository.modelo.Hotel;
import com.example.demo.ejercicio.service.IHotelService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{
	
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Hotel hotel = new Hotel();
		hotel.setDireccion("Inca");
		hotel.setNombre("Hotel El Fin");
		
		Habitacion habitacion = new Habitacion();
		habitacion.setHotel(hotel);
		habitacion.setNumero("12");
		habitacion.setValor(new BigDecimal(25));
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setHotel(hotel);
		habitacion2.setNumero("13");
		habitacion2.setValor(new BigDecimal(35));
		
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habitacion);
		habitaciones.add(habitacion2);
		
		hotel.setHabitaciones(habitaciones);
		
		//this.hotelService.agregar(hotel);
		
		System.out.println("Hotel encontrado: " + this.hotelService.buscar(1).getNombre());
		//hotel.setDireccion("Entrada la 8");
		//this.hotelService.actualizar(hotel);
		
		this.hotelService.borrar(1);
	}
}
