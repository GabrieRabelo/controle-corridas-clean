package com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.casosDeUso;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Evento;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.servicos.ServicoEvento;

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
