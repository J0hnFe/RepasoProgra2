package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioRepo {

	public void insertar(Propietario p);

	public Propietario seleccionar(String cedula);

}