package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCorredorRepository extends JpaRepository<Corredor, String> {
}
