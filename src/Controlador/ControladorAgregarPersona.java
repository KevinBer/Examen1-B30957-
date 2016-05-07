/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBPersonaPais;
import Modelo.Persona;
import Vista.AgregarPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author estudiante
 */
public class ControladorAgregarPersona implements ActionListener{
    AgregarPersona agregarPersona;
    Persona persona;
    DBPersonaPais<Persona> plantilla;
    
    public ControladorAgregarPersona() {
        agregarPersona= new AgregarPersona();
        plantilla= new DBPersonaPais<>();
    }  
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equalsIgnoreCase("Limpiar")){
            agregarPersona.limpiar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Guardar")){
           /* persona= new Persona
            plantilla.agregar(persona*/
        }
            
    }
    
}
