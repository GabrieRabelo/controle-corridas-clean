package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import com.architecture.gambi.controlecorridasclean.negocio.repositorios.IEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventoRepository implements IEventoRepository {

    private JpaEvetosRepository jpaEvetosRepository;

    @Autowired
    public EventoRepository(JpaEvetosRepository jpaEvetosRepository) {
        this.jpaEvetosRepository = jpaEvetosRepository;
    }

    public List<Evento> todos() {
        return jpaEvetosRepository.findAll();
    }

    public Evento cadastra(Evento evento){
        return jpaEvetosRepository.save(evento);
    }
}
