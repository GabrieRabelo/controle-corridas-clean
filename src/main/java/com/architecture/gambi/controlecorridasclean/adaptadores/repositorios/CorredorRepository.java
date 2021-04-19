package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import com.architecture.gambi.controlecorridasclean.negocio.repositorios.ICorredorRepository;
import org.springframework.stereotype.Component;

@Component
public class CorredorRepository {

    private ICorredorRepository corredorRepository;

    public CorredorRepository(ICorredorRepository corredorRepository) {
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

    public void cadastra(Corredor corredor){
        corredorRepository.save(corredor);
    }
}
