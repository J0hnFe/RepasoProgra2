package com.example.demo.repository.modelo.dto;

public class CarroDTO {
	
	private String marca;
	private String modelo;
	
	public CarroDTO() {}

	public CarroDTO(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//toString
	@Override
	public String toString() {
		return "CarroDTO [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	

}
