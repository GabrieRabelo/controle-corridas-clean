package com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso;

import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import com.architecture.gambi.controlecorridasclean.negocio.servicos.ServicoCorredor;
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
