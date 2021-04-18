package com.architecture.gambi.controlecorridasclean.aplicacao.servicos;


import com.architecture.gambi.controlecorridasclean.aplicacao.dtos.EstatisticasDTO;

public interface ICalculoEstatistica {
    EstatisticasDTO calculaEstatisticas(int distancia);
}
