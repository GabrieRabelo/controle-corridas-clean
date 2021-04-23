package com.architecture.gambi.controlecorridasclean.negocio.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import java.util.List;


public interface ICorredorRepository {
    List<Corredor> todos();
    void removeTodos();
    Corredor cadastra(Corredor corredor);
}
