package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import com.architecture.gambi.controlecorridasclean.negocio.repositorios.ICorredorRepository;
import org.springframework.stereotype.Component;

@Component
public class CorredorRepository implements ICorredorRepository{

    private JpaCorredorRepository corredorRepository;

    public CorredorRepository(JpaCorredorRepository corredorRepository) {
        this.corredorRepository = corredorRepository;
    }

    public CorredorRepository() {
    }
    
    public List<Corredor> todos() {
        return corredorRepository.findAll();
    }

    public void removeTodos(){
        corredorRepository.deleteAll();
    }

    public Corredor cadastra(Corredor corredor){
        return corredorRepository.save(corredor);

    }
}
