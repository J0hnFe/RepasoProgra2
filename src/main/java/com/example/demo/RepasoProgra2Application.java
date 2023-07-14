package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.IHotelService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{

	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
		Hotel hotel1 = new Hotel();
		hotel1.setNombre("Hotel Uno");
		hotel1.setDireccion("La Kennedy");
		
		Hotel hotel2 = new Hotel();
		hotel2.setNombre("Hotel Dos");
		hotel2.setDireccion("Jipijapa");
		
		Hotel hotel3 = new Hotel();
		hotel3.setNombre("Hotel Tres");
		hotel3.setDireccion("La Mascota");
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setHotel(hotel1);
		habitacion1.setNumero("10");
		habitacion1.setValor(new BigDecimal(28));
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setHotel(hotel1);
		habitacion2.setNumero("11");
		habitacion2.setValor(new BigDecimal(54));
		
		Habitacion habitacion3 = new Habitacion();
		habitacion3.setHotel(hotel2);
		habitacion3.setNumero("20");
		habitacion3.setValor(new BigDecimal(15));
		
		List<Habitacion> habitacionesHotel1 = new ArrayList<>();
		habitacionesHotel1.add(habitacion1);
		habitacionesHotel1.add(habitacion2);
		
		List<Habitacion> habitacionesHotel2 = new ArrayList<>();
		habitacionesHotel2.add(habitacion3);
		
		hotel1.setHabitaciones(habitacionesHotel1);
		hotel2.setHabitaciones(habitacionesHotel2);
		
//		this.hotelService.agregar(hotel1);
//		this.hotelService.agregar(hotel2);
//		this.hotelService.agregar(hotel3);
		
		this.hotelService.buscarHotelInnerJoin().stream().forEach(System.out::println);
		
	}
}
