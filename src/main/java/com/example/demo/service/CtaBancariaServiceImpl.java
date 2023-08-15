package com.example.demo.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICtaBancariaRepo;
import com.example.demo.repo.modelo.CtaBancaria;

@Service
public class CtaBancariaServiceImpl implements ICtaBancariaService {

	private static final Logger LOG = LoggerFactory.getLogger(CtaBancariaServiceImpl.class);

	@Autowired
	private ICtaBancariaRepo ctaBancariaRepo;

	@Override
	public void agregar(CtaBancaria cb) {

		LOG.info("Hilo service: " + Thread.currentThread().getName()); // Indicar el hilo con el que se ejecuta el prog

		try {
			TimeUnit.SECONDS.sleep(1); // Sumar, restar etc: logica que tarda cierto tiempo
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.ctaBancariaRepo.insertar(cb);
	}

	@Override
	public String agregar2(CtaBancaria bancaria) {
		LOG.info("Hilo service: " + Thread.currentThread().getName());

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.ctaBancariaRepo.insertar(bancaria);
		return bancaria.getNumero();
	}

	@Override
	@Async // Indicar que el metodo es asincrono
	public void agregarAsincrono(CtaBancaria bancaria) {
		LOG.info("Hilo service (asincrono): " + Thread.currentThread().getName());

		// Lo hacemos esperar cierto tiempo
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.ctaBancariaRepo.insertar(bancaria);
	}

	@Override
	@Async
	public CompletableFuture<String> agregarAsincrono2(CtaBancaria bancaria) {
		LOG.info("Hilo service (asincrono CompletableFuture): " + Thread.currentThread().getName());

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.ctaBancariaRepo.insertar(bancaria);
		return CompletableFuture.completedFuture(bancaria.getNumero()); 
	}

	@Override
	public CtaBancaria buscar(String numero) {
		return this.ctaBancariaRepo.seleccionar(numero);
	}

	@Override
	public void actualizar(CtaBancaria cb) {
		this.ctaBancariaRepo.actualizar(cb);
	}

}
