package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.repository.modelo.Ciudadano;
import com.example.demo.ejercicio.repository.modelo.CtaBancaria;
import com.example.demo.ejercicio.repository.modelo.Empleado;
import com.example.demo.ejercicio.service.ICiudadanoService;
import com.example.demo.ejercicio.service.ICtaBancariaService;
import com.example.demo.ejercicio.service.IEmpleadoService;
import com.example.demo.repository.EstudianteRepoImpl;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{
	
	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Empleado empleado = new Empleado();
		empleado.setCargo("Jugador");
		empleado.setSueldo(new BigDecimal(100));
		
		Empleado empleado2 = new Empleado();
		empleado2.setCargo("Arquitecto");
		empleado2.setSueldo(new BigDecimal(200));
		
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido("Pizarro");
		ciudadano.setCedula("1122");
		ciudadano.setNombre("Pancho");
		
		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setApellido("Resa");
		ciudadano2.setCedula("2288");
		ciudadano2.setNombre("Lucia");
		
		ciudadano.setEmpleado(empleado);
		empleado.setCiudadano(ciudadano);
		
		ciudadano2.setEmpleado(empleado2);
		empleado2.setCiudadano(ciudadano2);
		
		
		this.ciudadanoService.agregar(ciudadano);
		this.ciudadanoService.agregar(ciudadano2);
		
		
		Integer idTemp = this.ciudadanoService.buscar(2).getId();
		this.ciudadanoService.borrar(idTemp);
		
		ciudadano2.setApellido("Olivares");
		this.ciudadanoService.actualizar(ciudadano2);
	}
}
