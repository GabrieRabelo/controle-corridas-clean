package com.bcopstein.ctrlcorredor_v7_CLEAN.aplicacao.casosDeUso;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Corredor;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.servicos.ServicoCorredor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraCorredoresUC {
    private ServicoCorredor servicoCorredor;

    @Autowired
    public CadastraCorredoresUC(ServicoCorredor servicoCorredor) {
        this.servicoCorredor = servicoCorredor;
    }
    
    public void run(Corredor corredor){
        servicoCorredor.cadastraCorredor(corredor);
    }
    
}
