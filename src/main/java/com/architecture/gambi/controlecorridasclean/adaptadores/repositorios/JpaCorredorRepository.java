package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaCorredorRepository extends JpaRepository<Corredor, String> {
    List<Corredor> findAll();
}
