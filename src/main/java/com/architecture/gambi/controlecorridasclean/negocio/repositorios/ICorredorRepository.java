package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios;

import java.util.List;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Corredor;

public interface ICorredorRepository {
    List<Corredor> todos();
    void removeTodos();
    boolean cadastra(Corredor corredor);
}
