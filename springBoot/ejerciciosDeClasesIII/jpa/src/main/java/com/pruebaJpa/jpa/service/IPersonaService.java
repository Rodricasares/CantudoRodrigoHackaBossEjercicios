package com.pruebaJpa.jpa.service;

import com.pruebaJpa.jpa.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();
    public void savePersona (Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);

}