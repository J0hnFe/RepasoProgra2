package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.demo.repo.modelo.Persona;
import com.example.demo.service.IPersonaService;

@SpringBootApplication
@EnableAsync // SIN ESTO NO FUNCIONA EL ASINCRONO OJOOOOOOO
public class RepasoProgra2Application implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(RepasoProgra2Application.class);

	@Autowired
	private IPersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Asincrono con respuesta
		LOG.info("Hilo: " + Thread.currentThread().getName());

		List<LocalDate> listaFechas = new ArrayList<>();
		listaFechas.add(LocalDate.of(2000, 1, 1));
		listaFechas.add(LocalDate.of(2000, 2, 1));
		listaFechas.add(LocalDate.of(2000, 3, 1));
		listaFechas.add(LocalDate.of(2000, 4, 1));
		listaFechas.add(LocalDate.of(2000, 5, 1));
		listaFechas.add(LocalDate.of(2000, 6, 1));
		listaFechas.add(LocalDate.of(2000, 7, 1));
		listaFechas.add(LocalDate.of(2000, 8, 1));
		listaFechas.add(LocalDate.of(2000, 9, 1));
		listaFechas.add(LocalDate.of(2000, 10, 1));


		// Inicio
		long tiempoInicial = System.currentTimeMillis();
		List<CompletableFuture<LocalDate>> listaRespuestas = new ArrayList<>();
		List<Persona> listaPersonas = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {

			Persona persona = new Persona();
			persona.setNombre("Persona_" + i);
			persona.setCedula("00" + i);
			persona.setFechaNacimiento(listaFechas.get(i-1));

			listaPersonas.add(persona);
			CompletableFuture<LocalDate> respuesta = this.personaService.agregar(persona);
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

		LOG.info("Se terminaron los procesos...");

	}

}
