package com.architecture.gambi.controlecorridasclean.negocio.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;

import java.util.List;

public interface IEventoRepository {
    List<Evento> todos();
    Evento cadastra(Evento evento);
}
