package com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso;

import com.architecture.gambi.controlecorridasclean.aplicacao.dtos.EstatisticasDTO;
import com.architecture.gambi.controlecorridasclean.aplicacao.servicos.ServicoEstatistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaEstatisticasUC {
    private ServicoEstatistica servicoEstatistica;

    @Autowired
    public ConsultaEstatisticasUC(ServicoEstatistica servicoEstatistica) {
        this.servicoEstatistica = servicoEstatistica;
    }

    public EstatisticasDTO run(int distancia){
        return servicoEstatistica.calculaEstatisticas(distancia);
    }
}
