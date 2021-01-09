package net.amartinez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.amartinez.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
