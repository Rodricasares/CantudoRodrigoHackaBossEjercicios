package com.veterinaria.veterinaria.service;
import com.veterinaria.veterinaria.model.Paciente;
import java.util.List;

public interface IPacienteService {

    public List<Paciente> getPersonas();

    public void savePersona(Paciente persona);

    public void deletePersona(Long id);

    public Paciente findPersona(Long id);


}
