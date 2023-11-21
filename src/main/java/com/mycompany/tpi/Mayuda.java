/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpi;

import java.util.List;

/**
 *
 * @author NICOLAS
 */
public class Mayuda {
    private Cliente cliente;
private Incidentes indicentes;
private List<Tecnicos>tecDisp;
private int problemaComplejo;

    public Mayuda(Cliente cliente, Incidentes indicentes, List<Tecnicos> tecDisp, int problemaComplejo) {
        this.cliente = cliente;
        this.indicentes = indicentes;
        this.tecDisp = tecDisp;
        this.problemaComplejo = problemaComplejo;
    }

    public Mayuda() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Incidentes getIndicentes() {
        return indicentes;
    }

    public void setIndicentes(Incidentes indicentes) {
        this.indicentes = indicentes;
    }

    public List<Tecnicos> getTecDisp() {
        return tecDisp;
    }

    public void setTecDisp(List<Tecnicos> tecDisp) {
        this.tecDisp = tecDisp;
    }

    public int getProblemaComplejo() {
        return problemaComplejo;
    }

    public void setProblemaComplejo(int problemaComplejo) {
        this.problemaComplejo = problemaComplejo;
    }

}
