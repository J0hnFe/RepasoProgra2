package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.demo.repo.modelo.CtaBancaria;
import com.example.demo.service.ICtaBancariaService;

@SpringBootApplication
@EnableAsync			//SIN ESTO NO FUNCIONA EL ASINCRONO OJOOOOOOO
public class RepasoProgra2Application implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(RepasoProgra2Application.class);

	@Autowired
	private ICtaBancariaService ctaBancariaService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// // Asincrono sin retorno

		// LOG.info("Hilo: " + Thread.currentThread().getName());
		// // Inicio
		// long tiempoInicial = System.currentTimeMillis();
		// List<CtaBancaria> listaCtaBancaria = new ArrayList<>();

		// for (int i = 1; i <= 10; i++) {
		// 	CtaBancaria ctaBancaria = new CtaBancaria();
		// 	ctaBancaria.setNumero(String.valueOf(i));
		// 	ctaBancaria.setSaldo(new BigDecimal(100));
		// 	ctaBancaria.setTipo("Ahorro");

		// 	listaCtaBancaria.add(ctaBancaria);
		// 	this.ctaBancariaService.agregarAsincrono(ctaBancaria);
		// }

		// // Final
		// long tiempoFinal = System.currentTimeMillis();
		// long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		// LOG.info("Tiempo transcurrido: " + (tiempoFinal - tiempoInicial) +
		// 		" milisegundos");
		// LOG.info("Tiempo transcurrido: " + tiempoTranscurrido + " segundos");

		// LOG.info("Se termino todo...");

		// ****************************************************************************************************************

		// Asincrono con respuesta
		LOG.info("Hilo: " + Thread.currentThread().getName());

		// Inicio
		long tiempoInicial = System.currentTimeMillis();
		List<CompletableFuture<String>> listaRespuestas = new ArrayList<>();
		List<CtaBancaria> listaCtaBancaria = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			CtaBancaria ctaBancaria = new CtaBancaria();
			ctaBancaria.setNumero(String.valueOf(i));
			ctaBancaria.setSaldo(new BigDecimal(100));
			ctaBancaria.setTipo("Ahorro");

			listaCtaBancaria.add(ctaBancaria);
			CompletableFuture<String> respuesta = this.ctaBancariaService.agregarAsincrono2(ctaBancaria);
			listaRespuestas.add(respuesta);
		}

		// Sentencia que espera que terminen de procesarse
		// todos los hilos para obtener la respuesta

		CompletableFuture.allOf(
				listaRespuestas.get(0),
				listaRespuestas.get(1),
				listaRespuestas.get(2),
				listaRespuestas.get(3),
				listaRespuestas.get(4),
				listaRespuestas.get(5),
				listaRespuestas.get(6),
				listaRespuestas.get(7),
				listaRespuestas.get(8),
				listaRespuestas.get(9));

		LOG.info("Respuesta 0: " + listaRespuestas.get(0).get());

		// Final
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		LOG.info("Tiempo transcurrido: " + (tiempoFinal - tiempoInicial) + " milisegundos");
		LOG.info("Tiempo transcurrido: " + tiempoTranscurrido + " segundos");

		LOG.info("Se termino todo...");

	}

}
