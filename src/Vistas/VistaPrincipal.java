/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Controlador;
import javax.swing.JOptionPane;


public class VistaPrincipal extends javax.swing.JFrame {

    public Controlador controlador; 
       
    public VistaPrincipal(Controlador c) {
        initComponents(); 
        this.controlador = c;
        this.setVisible(true);
        this.setResizable(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnServicios = new javax.swing.JButton();
        btnProductores = new javax.swing.JButton();
        btnPrestadores = new javax.swing.JButton();
        btnHistorialServicios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(448, 309));
        setMinimumSize(new java.awt.Dimension(448, 309));
        getContentPane().setLayout(null);

        btnServicios.setBackground(new java.awt.Color(204, 255, 255));
        btnServicios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(51, 51, 51));
        btnServicios.setText("Servicios");
        btnServicios.setMaximumSize(new java.awt.Dimension(101, 26));
        btnServicios.setMinimumSize(new java.awt.Dimension(101, 26));
        btnServicios.setPreferredSize(new java.awt.Dimension(101, 26));
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(btnServicios);
        btnServicios.setBounds(10, 180, 140, 26);

        btnProductores.setBackground(new java.awt.Color(255, 255, 255));
        btnProductores.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnProductores.setForeground(new java.awt.Color(51, 51, 51));
        btnProductores.setText("Productores");
        btnProductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductores);
        btnProductores.setBounds(190, 80, 145, 26);

        btnPrestadores.setBackground(new java.awt.Color(255, 204, 255));
        btnPrestadores.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnPrestadores.setForeground(new java.awt.Color(51, 51, 51));
        btnPrestadores.setText("Prestadores");
        btnPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrestadores);
        btnPrestadores.setBounds(10, 80, 140, 26);

        btnHistorialServicios.setBackground(new java.awt.Color(204, 204, 204));
        btnHistorialServicios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnHistorialServicios.setForeground(new java.awt.Color(51, 51, 51));
        btnHistorialServicios.setText("Historial de servicio ");
        btnHistorialServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistorialServicios);
        btnHistorialServicios.setBounds(190, 180, 145, 26);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coso.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -140, 480, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        VistaServicios ventanita = new VistaServicios(this.controlador, this);
        this.dispose();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnProductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoresActionPerformed
        // para ir a ventana de productores
        Productores productor = new Productores(this.controlador, this);
        this.dispose();
    }//GEN-LAST:event_btnProductoresActionPerformed

    private void btnHistorialServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialServiciosActionPerformed
        VistaHistorial historial = new VistaHistorial(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnHistorialServiciosActionPerformed

    private void btnPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestadoresActionPerformed
        VistaPrestadores prestador = new VistaPrestadores(this.controlador,this);
        this.dispose();
    }//GEN-LAST:event_btnPrestadoresActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorialServicios;
    private javax.swing.JButton btnPrestadores;
    private javax.swing.JButton btnProductores;
    private javax.swing.JButton btnServicios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
