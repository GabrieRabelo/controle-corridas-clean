package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaEventosRepository extends JpaRepository<Evento, Integer> {
}
