package com.veterinaria.veterinaria.service;
import com.veterinaria.veterinaria.model.Servicio;
import com.veterinaria.veterinaria.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService implements IServicioService {

    @Autowired
    private ServicioRepository persoRepo;

    @Override
    public List<Servicio> getPersonas () {

        return persoRepo.findAll();

    }

    @Override
    public void savePersona(Servicio perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Servicio findPersona(Long id) {

        //acá si no encuentro a la persona, devuelvo null. Esto lo indica el orElse.
        return persoRepo.findById(id).orElse(null);

    }


}
