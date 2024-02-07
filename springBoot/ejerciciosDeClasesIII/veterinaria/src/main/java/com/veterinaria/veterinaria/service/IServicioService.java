package com.veterinaria.veterinaria.service;
import com.veterinaria.veterinaria.model.Servicio;
import java.util.List;

public interface IServicioService {

  public List<Servicio> getPersonas();
  public void savePersona(Servicio persona);

  public void deletePersona(Long id);
  public Servicio findPersona(Long id);




}
