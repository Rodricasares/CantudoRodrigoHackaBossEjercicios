package com.pruebaJpa.jpa.repository;

import com.pruebaJpa.jpa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// La interface extiende de JpaRepository (ecargada por defecto de manejo de repositorios JPA)
// En los parámetros <> deben ir: <Clase a persistir, tipo de dato de su Id>
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

}