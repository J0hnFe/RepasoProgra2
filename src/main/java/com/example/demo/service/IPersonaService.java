package com.example.demo.service;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;

import com.example.demo.repo.modelo.Persona;

public interface IPersonaService {
        public CompletableFuture<LocalDate> agregar(Persona persona);
}
