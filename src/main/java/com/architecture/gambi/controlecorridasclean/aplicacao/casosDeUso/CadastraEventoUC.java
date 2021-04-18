package com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import com.architecture.gambi.controlecorridasclean.negocio.servicos.ServicoEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraEventoUC {
    private ServicoEvento servicoEvento;

    @Autowired
    public CadastraEventoUC(ServicoEvento servicoEvento) {
        this.servicoEvento = servicoEvento;
    }
    
    public void run(Evento evento){
        servicoEvento.cadastra(evento);
    }    
}
