package com.architecture.gambi.controlecorridasclean.adaptadores.configuradores;


import com.architecture.gambi.controlecorridasclean.adaptadores.repositorios.EventoRepository;
import com.architecture.gambi.controlecorridasclean.aplicacao.servicos.EstatisticaDesconsidera;
import com.architecture.gambi.controlecorridasclean.aplicacao.servicos.EstatisticaNormal;
import com.architecture.gambi.controlecorridasclean.aplicacao.servicos.ICalculoEstatistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorCalculoEstatistica {
    private EventoRepository eventoRep;

    @Autowired
    public ConfiguradorCalculoEstatistica(EventoRepository eventoRep) {
        this.eventoRep = eventoRep;
    }

    @Bean
    @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "original", matchIfMissing = true)
    public ICalculoEstatistica opcaoRegraClassica() {
        return new EstatisticaNormal(eventoRep);
    }

    @Bean
    @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "desconsidera")
    public ICalculoEstatistica opcaoDesconsidera() {
        return new EstatisticaDesconsidera(eventoRep);
    }
}
