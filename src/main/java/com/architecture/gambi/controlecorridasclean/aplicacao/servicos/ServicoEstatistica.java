package com.architecture.gambi.controlecorridasclean.aplicacao.servicos;

import java.util.List;
import java.util.stream.Collectors;


import com.architecture.gambi.controlecorridasclean.adaptadores.repositorios.EventoRepository;
import com.architecture.gambi.controlecorridasclean.aplicacao.dtos.EstatisticasDTO;
import com.architecture.gambi.controlecorridasclean.aplicacao.dtos.PerformanceDTO;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoEstatistica {
    private EventoRepository eventoRep;
    private ICalculoEstatistica calculoEstatistica;

    @Autowired
    public ServicoEstatistica(EventoRepository eventoRepository,ICalculoEstatistica calculoEstatistica){
        this.eventoRep = eventoRepository;
        this.calculoEstatistica = calculoEstatistica;
    }

    public EstatisticasDTO calculaEstatisticas(int distancia){
        return calculoEstatistica.calculaEstatisticas(distancia);
    }

    public PerformanceDTO calculaAumentoPerformance(int distancia, int ano){
        List<Evento> eventos = eventoRep
                        .todos()
                        .stream()
                        .filter(e->e.getAno() == ano)
                        .collect(Collectors.toList());
        int indiceMaiorDif = 0;
        double maiorDif = -1.0;
        for(int i=0;i<eventos.size()-1;i++){
            Evento e1 = eventos.get(i);
            Evento e2 = eventos.get(i+1);
            double tempo1  = e1.getHoras()*60*60 + e1.getMinutos()*60.0 + e1.getSegundos();
            double tempo2  = e2.getHoras()*60*60 + e2.getMinutos()*60.0 + e2.getSegundos();
            if ((tempo1-tempo2)>maiorDif){
                maiorDif = tempo1-tempo2;
                indiceMaiorDif = i;
            }
        }         
        return new PerformanceDTO(eventos.get(indiceMaiorDif).getNome(),
                                  eventos.get(indiceMaiorDif+1).getNome(),
                                  maiorDif);
    }
}
