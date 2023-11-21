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
class Cliente {
  private int id_c;
private String rznSocial;
private int cuit;
private List<Servicios>servicios;

    public Cliente(int id_c, String rznSocial, int cuit, List<Servicios> servicios) {
        this.id_c = id_c;
        this.rznSocial = rznSocial;
        this.cuit = cuit;
        this.servicios = servicios;
    }

    public Cliente() {
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getRznSocial() {
        return rznSocial;
    }

    public void setRznSocial(String rznSocial) {
        this.rznSocial = rznSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }

}
