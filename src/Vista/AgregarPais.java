/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAgregarPais;

/**
 *
 * @author estudiante
 */
public class AgregarPais extends javax.swing.JFrame {

    ControladorAgregarPais controladorAgregarPais;
    public AgregarPais() {
        initComponents();

       this.btnGuardar.addActionListener(controladorAgregarPais);
       this.btnLimpiar.addActionListener(controladorAgregarPais);
        
    }
    
    public void agregarEvento(){
        controladorAgregarPais= new ControladorAgregarPais();
        this.btnGuardar.addActionListener(controladorAgregarPais);
        this.btnLimpiar.addActionListener(controladorAgregarPais);
    }
    
    public Boolean verEspacios(){
        if(txtCantPersonas.getText().equals("") || txtNombre.getText().equals(""))
            return false;
        return true;
    }

    public void limpiar(){
        txtCantPersonas.setText("");
        txtNombre.setText("");
    }
    
    public String getNombre(){
        return txtNombre.getText();
    }
    
    public String getCantPersonas(){
        return txtCantPersonas.getText();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblCantPersonas = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantPersonas = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblCantPersonas.setText("Cantidad de Personas:");

        btnGuardar.setText("Guardar");

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCantPersonas)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnGuardar)
                        .addGap(81, 81, 81)
                        .addComponent(btnLimpiar)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantPersonas)
                    .addComponent(txtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblCantPersonas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCantPersonas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
