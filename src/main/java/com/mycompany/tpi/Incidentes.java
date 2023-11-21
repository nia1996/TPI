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
class Incidentes {
    private int id_inc;
private List<Servicios> servicios;
private String problema;
private Problema tipoP;
private Boolean estado;

    public Incidentes(int id_inc, List<Servicios> servicios, String problema, Problema tipoP, Boolean estado) {
        this.id_inc = id_inc;
        this.servicios = servicios;
        this.problema = problema;
        this.tipoP = tipoP;
        this.estado = estado;
    }

    public Incidentes() {
    }

    public int getId_inc() {
        return id_inc;
    }

    public void setId_inc(int id_inc) {
        this.id_inc = id_inc;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public Problema getTipoP() {
        return tipoP;
    }

    public void setTipoP(Problema tipoP) {
        this.tipoP = tipoP;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
