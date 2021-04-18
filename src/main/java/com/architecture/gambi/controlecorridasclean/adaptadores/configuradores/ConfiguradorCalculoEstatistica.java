package com.bcopstein.ctrlcorredor_v7_CLEAN.adaptadores.configuradores;

import com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.servicos.EstatisticaDesconsidera;
import com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.servicos.EstatisticaNormal;
import com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.servicos.ICalculoEstatistica;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios.IEventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorCalculoEstatistica {
    private IEventoRepository eventoRep;

    @Autowired
    public ConfiguradorCalculoEstatistica(IEventoRepository eventoRep) {
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
