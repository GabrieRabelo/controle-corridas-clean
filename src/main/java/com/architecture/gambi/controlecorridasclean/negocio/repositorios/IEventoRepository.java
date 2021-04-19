package com.architecture.gambi.controlecorridasclean.negocio.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoRepository extends JpaRepository<Evento, Integer> {
}
