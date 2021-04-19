package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import com.architecture.gambi.controlecorridasclean.negocio.repositorios.IEventoRepository;
import org.springframework.stereotype.Component;

@Component
public class EventoRepository {

    private IEventoRepository eventoRepository;

    public EventoRepository(IEventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> todos() {
        return eventoRepository.findAll();
    }

    public Evento cadastra(Evento evento){
        return eventoRepository.save(evento);
    }
}
