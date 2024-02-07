package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.model.Paciente;
import com.veterinaria.veterinaria.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService{



    @Autowired
    private PacienteRepository persoRepo;

    @Override
    public List<Paciente> getPersonas () {

        return persoRepo.findAll();

    }

    @Override
    public void savePersona(Paciente perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Paciente findPersona(Long id) {

        //acá si no encuentro a la persona, devuelvo null. Esto lo indica el orElse.
        return persoRepo.findById(id).orElse(null);

    }


}

