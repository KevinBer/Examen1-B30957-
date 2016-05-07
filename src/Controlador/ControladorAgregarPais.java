/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CrearPais;
import Modelo.DBPersonaPais;
import Vista.AgregarPais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class ControladorAgregarPais implements ActionListener{
    AgregarPais agregarPais;
    CrearPais pais;
    DBPersonaPais<CrearPais> plantilla;
    
    public ControladorAgregarPais() {
        agregarPais= new AgregarPais();
        plantilla= new DBPersonaPais<>();
        agregarPais.agregarEvento();
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Limpiar"))
            agregarPais.limpiar();
        
        if(e.getActionCommand().equalsIgnoreCase("Guardar")){
            System.out.print("FJFJF");
            if(agregarPais.verEspacios()==true){
                pais= new CrearPais(agregarPais.getNombre(), Integer.parseInt(agregarPais.getCantPersonas()));
                plantilla.agregar(pais);
                
            }            
            else
                JOptionPane.showMessageDialog(null, "Debe llenar todos los datos");
        
        }
            
    }
    
}
