package com.architecture.gambi.controlecorridasclean.negocio.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICorredorRepository extends JpaRepository<Corredor, String> {
}
