package com.example.demo.service;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPersonaRepo;
import com.example.demo.repo.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

    private static final Logger LOG = LoggerFactory.getLogger(PersonaServiceImpl.class);

    @Autowired
    private IPersonaRepo personaRepo;

    @Override
    @Async
    public CompletableFuture<LocalDate> agregar(Persona persona) {
        LOG.info("Hilo service (asincrono CompletableFuture): " + Thread.currentThread().getName());

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.personaRepo.insertar(persona);
        return CompletableFuture.completedFuture(persona.getFechaNacimiento());
    }

}
