package com.architecture.gambi.controlecorridasclean.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corredor {

    @Id
    private String cpf;
    private String nome;
    private int diaDn,mesDn,anoDn;
    private String genero;

    protected Corredor() {
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getDiaDn() {
        return diaDn;
    }

    public int getMesDn() {
        return mesDn;
    }
    public int getAnoDn() {
        return anoDn;
    }

    public String getGenero() {
        return genero;
    }

}