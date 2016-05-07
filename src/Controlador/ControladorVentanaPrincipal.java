/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.AgregarPais;
import Vista.AgregarPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author estudiante
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private AgregarPais agregarPais;
    private AgregarPersona agregarPersona;

    public ControladorVentanaPrincipal() {
        agregarPersona= new AgregarPersona();
        agregarPais= new AgregarPais();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
                
        if(e.getActionCommand().equalsIgnoreCase("Pais"))
            agregarPais.setVisible(true);
            
        
        if(e.getActionCommand().equalsIgnoreCase("Persona"))
            agregarPersona.setVisible(true);
    }
    
}
