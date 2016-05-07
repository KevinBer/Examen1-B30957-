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
public class Migrante{
    private String cedula;
    private String lugarProcedencia;
    private int cantDias=10;

    public Migrante(String cedula, String lugarProcedencia) {
        this.setCedula(cedula);
        this.setLugarProcedencia(lugarProcedencia);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

             
}
