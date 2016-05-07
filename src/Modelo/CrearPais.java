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
public class CrearPais {
    private String nombre="";
    private int cantPersonas;

    public CrearPais(String nombre, int cantPersonas) {
        this.setNombre(nombre);
        this.setCantPersonas(cantPersonas);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    
    
}
