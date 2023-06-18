package com.example.demo.ejercicio.repository.modelo;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Hotel {
	
	@Id
	private Integer id;
	private String nombre;
	private String direccion;
	
	@OneToMany(mappedBy = "hotel")
	private List<Habitacion> habitaciones;
	
	//toString
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", habitaciones=" + habitaciones
				+ "]";
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Integer getId() {
		return id;
	}	
}
