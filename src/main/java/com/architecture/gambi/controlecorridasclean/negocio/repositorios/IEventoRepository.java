package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios;

import java.util.List;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Evento;

public interface IEventoRepository {
    List<Evento> todos();
    boolean cadastra(Evento evento);
}
