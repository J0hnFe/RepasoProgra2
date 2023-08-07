package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.service.ICtaBancariaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner {

	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICtaBancariaService ctaBancariaService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BigDecimal montoCta1 = new BigDecimal(100);
		BigDecimal montoCta2 = new BigDecimal(200);



		CtaBancaria ctaOrigen = new CtaBancaria();
		ctaOrigen.setNumero("111");
		ctaOrigen.setSaldo(montoCta1);
		ctaOrigen.setTipo("A");

//		this.ctaBancariaService.agregar(ctaOrigen);

		CtaBancaria ctaDestino = new CtaBancaria();
		ctaDestino.setNumero("222");
		ctaDestino.setSaldo(montoCta2);
		ctaDestino.setTipo("A");

//		this.ctaBancariaService.agregar(ctaDestino);
		
		BigDecimal montoTrasferencia = new BigDecimal(200);		
		this.transferenciaService.realizarTransf(ctaOrigen.getNumero(), ctaDestino.getNumero(), montoTrasferencia);
		
	}
}
