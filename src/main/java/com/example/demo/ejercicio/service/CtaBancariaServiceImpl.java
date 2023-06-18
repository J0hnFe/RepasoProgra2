package com.example.demo.ejercicio.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repository.ICtaBancariaRepo;
import com.example.demo.ejercicio.repository.modelo.CtaBancaria;

@Service
public class CtaBancariaServiceImpl implements ICtaBancariaService{

	@Autowired
	private ICtaBancariaRepo bancariaRepo;
	@Autowired
	@Qualifier("impar")
	private ICalculoExtra calculoExtraImpar;
	@Autowired
	@Qualifier("par")
	private ICalculoExtra calculoExtraPar;
	
	@Override
	public void aperturar(CtaBancaria bancaria) {
		LocalDate fechaAper = LocalDate.now();
		bancaria.setFechaApertura(fechaAper);
		Integer diaMes = fechaAper.getDayOfMonth();
		
		if(diaMes%2 == 0) {
			BigDecimal saldoAper = bancaria.getSaldo();
			BigDecimal saldoPromocion = this.calculoExtraPar.calcular(bancaria.getSaldo());
			BigDecimal saldoFinal = saldoAper.add(saldoPromocion);
			bancaria.setSaldo(saldoFinal);
		} else {
			BigDecimal saldoAper = bancaria.getSaldo();
			BigDecimal saldoPromocion = this.calculoExtraImpar.calcular(saldoAper);
			BigDecimal saldoFinal = saldoAper.add(saldoPromocion);
			bancaria.setSaldo(saldoFinal);
		}
		
		this.bancariaRepo.insertar(bancaria);
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		this.bancariaRepo.actualizar(bancaria);
		
	}

	@Override
	public CtaBancaria consultar(Integer id) {
		return this.bancariaRepo.encontrar(id);
	}
	
}
