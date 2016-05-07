/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Ciudadano {
    private String cedula;
    private int diasPermanecer=30;

    public Ciudadano(String cedula, int diasPermanecer) {
        setCedula(cedula);
        setDiasPermanecer(diasPermanecer);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getDiasPermanecer() {
        return diasPermanecer;
    }

    public void setDiasPermanecer(int diasPermanecer) {
        this.diasPermanecer = diasPermanecer;
    }

      
}
