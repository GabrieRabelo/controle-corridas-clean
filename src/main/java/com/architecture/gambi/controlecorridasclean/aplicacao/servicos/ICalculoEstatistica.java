package com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.servicos;

import com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.dtos.EstatisticasDTO;

public interface ICalculoEstatistica {
    EstatisticasDTO calculaEstatisticas(int distancia);
}
