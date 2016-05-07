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
public class Refugiado {
    private String cedula;
    private int cantDias=30;

    public Refugiado(String cedula) {
        this.setCedula(cedula);
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
    
    
    
}
