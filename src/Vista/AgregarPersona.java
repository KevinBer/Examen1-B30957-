/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAgregarPersona;
import javax.swing.ButtonGroup;

/**
 *
 * @author estudiante
 */
public class AgregarPersona extends javax.swing.JFrame {

    private ButtonGroup grupoRadio;
    private  ControladorAgregarPersona controladorAgregarPersona;
   
    public AgregarPersona() {
        initComponents();
        grupoRadio= new ButtonGroup();
        grupoRadio.add(rbnIndigena);
        grupoRadio.add(rbnCiudadano);
        grupoRadio.add(rbnMigrante);
        grupoRadio.add(rbnRefugiados);
        
        btnGuardar.addActionListener(controladorAgregarPersona);
        btnLimpiar.addActionListener(controladorAgregarPersona);
    }
    
    public Boolean zonaIndigena(){
        if(rbnZonaIndigena.isSelected())
            return true;
        else
            return false;
    }
    
    public void limpiar(){
        txtCedula.setText("");
        txtLugarProcedencia.setText("");
    }

    public String getSeleccion(){
        String tipo="";
        
        if(rbnCiudadano.isSelected())
            tipo="Ciudadano";
        else{
            if(rbnIndigena.isSelected())
                tipo="Indigena";
            else{
                if(rbnMigrante.isSelected())
                    tipo="Migrante";
                else
                    tipo="Refugiado";
            }
        }
        return tipo;             
    }
    
    
    public String getCedula(){
        return txtCedula.getText();
    }
    
    public String getLugarProcedencia(){
        return txtLugarProcedencia.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbnCiudadano = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbnIndigena = new javax.swing.JRadioButton();
        rbnMigrante = new javax.swing.JRadioButton();
        rbnRefugiados = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLugarProcedencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        rbnZonaIndigena = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbnCiudadano.setText("Ciudadano");

        jLabel1.setText("Tipo de Persona:");

        rbnIndigena.setText("Indigenas");

        rbnMigrante.setText("Migrantes");

        rbnRefugiados.setText("Refugiado");

        jLabel2.setText("Cedula o carnet:");

        jLabel3.setText("Lugar Procedencia");

        jLabel4.setText("Pais de Origen");

        jLabel5.setText("Pais Actual");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setText("Guardar");

        btnLimpiar.setText("Limpiar");

        rbnZonaIndigena.setText("Zona Indigena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbnCiudadano)
                            .addComponent(rbnIndigena)
                            .addComponent(rbnRefugiados)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGuardar)
                                .addComponent(rbnMigrante)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLugarProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnLimpiar)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(rbnZonaIndigena))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbnCiudadano)
                            .addComponent(jLabel2)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbnIndigena)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addComponent(rbnMigrante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtLugarProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbnRefugiados)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(rbnZonaIndigena)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbnCiudadano;
    private javax.swing.JRadioButton rbnIndigena;
    private javax.swing.JRadioButton rbnMigrante;
    private javax.swing.JRadioButton rbnRefugiados;
    private javax.swing.JRadioButton rbnZonaIndigena;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtLugarProcedencia;
    // End of variables declaration//GEN-END:variables
}
