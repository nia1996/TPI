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
public class Tecnicos {
   private int id_tec;
private String nombre;
private String apellido;
private List<Especialidades> especialidades;
private Incidentes incidente; 

    public Tecnicos(int id_tec, String nombre, String apellido, List<Especialidades> especialidades, Incidentes incidente) {
        this.id_tec = id_tec;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidades = especialidades;
        this.incidente = incidente;
    }

    public Tecnicos() {
    }

    public int getId_tec() {
        return id_tec;
    }

    public void setId_tec(int id_tec) {
        this.id_tec = id_tec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Especialidades> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidades> especialidades) {
        this.especialidades = especialidades;
    }

    public Incidentes getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidentes incidente) {
        this.incidente = incidente;
    }

}

