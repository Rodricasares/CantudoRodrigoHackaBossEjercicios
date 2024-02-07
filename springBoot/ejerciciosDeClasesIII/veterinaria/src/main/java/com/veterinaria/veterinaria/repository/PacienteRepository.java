package com.veterinaria.veterinaria.repository;

import com.veterinaria.veterinaria.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {

}
