package com.pruebaJpa.jpa.service;

import com.pruebaJpa.jpa.model.Persona;
import com.pruebaJpa.jpa.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas () {

        return persoRepo.findAll();

    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {

        //acá si no encuentro a la persona, devuelvo null. Esto lo indica el orElse.
        return persoRepo.findById(id).orElse(null);

    }



}