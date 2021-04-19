package com.architecture.gambi.controlecorridasclean.negocio.servicos;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.adaptadores.repositorios.CorredorRepository;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoCorredor {
    public CorredorRepository corredorRep;

    @Autowired
    public ServicoCorredor(CorredorRepository corredorRep){
        this.corredorRep = corredorRep;
    }

    public List<Corredor> todos(){
        return corredorRep.todos();
    }

    public void cadastraCorredor(Corredor corredor){
        corredorRep.removeTodos();
        corredorRep.cadastra(corredor);
    }
    
}
