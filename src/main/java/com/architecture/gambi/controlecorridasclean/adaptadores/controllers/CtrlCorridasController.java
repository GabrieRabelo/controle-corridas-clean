package com.architecture.gambi.controlecorridasclean.adaptadores.controllers;

import java.util.List;

import com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso.CadastraCorredoresUC;
import com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso.CadastraEventoUC;
import com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso.ConsultaCorredoresUC;
import com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso.ConsultaEstatisticasUC;
import com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso.ConsultaEventosUC;
import com.architecture.gambi.controlecorridasclean.aplicacao.casosDeUso.ConsultaPerformanceUC;
import com.architecture.gambi.controlecorridasclean.aplicacao.dtos.EstatisticasDTO;
import com.architecture.gambi.controlecorridasclean.aplicacao.dtos.PerformanceDTO;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Corredor;
import com.architecture.gambi.controlecorridasclean.negocio.entidades.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrlCorridas")
public class CtrlCorridasController {
    private ConsultaCorredoresUC consultaCorredoresUC;
    private CadastraCorredoresUC cadastraCorredoresUC;
    private ConsultaEventosUC consultaEventosUC;
    private CadastraEventoUC cadastraEventoUC;
    private ConsultaEstatisticasUC consultaEstatisticasUC;
    private ConsultaPerformanceUC consultaPerformanceUC;

    @Autowired
    public CtrlCorridasController(ConsultaCorredoresUC consultaCorredoresUC, CadastraCorredoresUC cadastraCorredoresUC,
            ConsultaEventosUC consultaEventosUC, CadastraEventoUC cadastraEventoUC,
            ConsultaEstatisticasUC consultaEstatisticasUC, ConsultaPerformanceUC consultaPerformanceUC) {
        this.consultaCorredoresUC = consultaCorredoresUC;
        this.cadastraCorredoresUC = cadastraCorredoresUC;
        this.consultaEventosUC = consultaEventosUC;
        this.cadastraEventoUC = cadastraEventoUC;
        this.consultaEstatisticasUC = consultaEstatisticasUC;
        this.consultaPerformanceUC = consultaPerformanceUC;
    }

    @GetMapping("/corredor")
    @CrossOrigin(origins = "*")
    public List<Corredor> consultaCorredor() {
        return consultaCorredoresUC.run();
    }

    @PostMapping("/corredor")
    @CrossOrigin(origins = "*")
    public boolean cadastraCorredor(@RequestBody final Corredor corredor) {
        cadastraCorredoresUC.run(corredor);
        return true;
    }

    @GetMapping("/eventos")
    @CrossOrigin(origins = "*")
    public List<Evento> consultaEventos() {
        return consultaEventosUC.run();
    }

    @PostMapping("/eventos") // adiciona evento no único corredor
    @CrossOrigin(origins = "*")
    public boolean informaEvento(@RequestBody final Evento evento) {
        cadastraEventoUC.run(evento);
        return true;
    }

    @GetMapping("/estatisticas")
    @CrossOrigin(origins = "*")
    public EstatisticasDTO estatisticas(@RequestParam final Integer distancia) {
        return consultaEstatisticasUC.run(distancia);
    }

    @GetMapping("/aumentoPerformance")
    @CrossOrigin(origins = "*")
    public PerformanceDTO aumentoPerformance(@RequestParam final Integer distancia, @RequestParam final Integer ano) {
        return consultaPerformanceUC.run(distancia, ano);
    }
}
