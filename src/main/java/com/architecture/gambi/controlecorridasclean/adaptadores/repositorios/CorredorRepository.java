package com.architecture.gambi.controlecorridasclean.adaptadores.repositorios;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import com.architecture.gambi.controlecorridasclean.negocio.repositorios.ICorredorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CorredorRepository implements ICorredorRepository {

    private JpaCorredorRepository jpaCorredorRepository;

    @Autowired
    public CorredorRepository(JpaCorredorRepository jpaCorredorRepository) {
        this.jpaCorredorRepository = jpaCorredorRepository;
    }

    public CorredorRepository() {
    }
    
    public List<Corredor> todos() {
        return jpaCorredorRepository.findAll();
    }

    public void removeTodos(){
        jpaCorredorRepository.deleteAll();
    }

    public Corredor cadastra(Corredor corredor){
        return jpaCorredorRepository.save(corredor);

    }
}
