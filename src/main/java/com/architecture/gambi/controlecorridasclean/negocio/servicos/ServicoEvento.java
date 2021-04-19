package com.architecture.gambi.controlecorridasclean.negocio.servicos;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.adaptadores.repositorios.EventoRepository;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoEvento {

    private EventoRepository eventoRep;

    @Autowired
    public ServicoEvento(EventoRepository eventoRep){
        this.eventoRep = eventoRep;
    } 

    public List<Evento> todos(){
        return eventoRep.todos();
    }

    public void cadastra(Evento evento){
        eventoRep.cadastra(evento);
    }
    
}
