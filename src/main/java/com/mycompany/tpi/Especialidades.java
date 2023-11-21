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
class Especialidades {
    private int idEsp;
private List<String>tipos;

    public Especialidades(int idEsp, List<String> tipos) {
        this.idEsp = idEsp;
        this.tipos = tipos;
    }

    public Especialidades() {
    }

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

}
