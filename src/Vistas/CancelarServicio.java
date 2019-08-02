/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Controlador;
import javax.swing.JOptionPane;
import modulo.Prestador;
import modulo.Productor;
import modulo.Servicio;
import modulo.ServicioCancelado;

/**
 *
 * @author Hp1
 */
public class CancelarServicio extends javax.swing.JFrame {

    private Controlador controlador;
    
    public CancelarServicio(Controlador controlador) {
        initComponents();
        this.controlador=controlador;
        this.setVisible(true);
        this.ListaServi.setListData(this.controlador.listarServiciosActivos().toArray());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaServi = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        causa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cuit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ListaServi);

        jLabel1.setText("Servicios Activos");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel2.setText("Causa:");

        jLabel3.setText("Total a pagar");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Cancelar Servicio");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel5.setText("Cuit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(causa, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk)
                        .addGap(38, 38, 38)
                        .addComponent(btnVolver)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(causa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOk)
                            .addComponent(btnVolver))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try{
            if(!this.ListaServi.isSelectionEmpty()){
                if(!(this.causa.getText().isEmpty()||this.total.getText().isEmpty()||this.cuit.getText().isEmpty())){
                    ServicioCancelado sc = new ServicioCancelado(this.causa.getText(),Double.parseDouble(this.total.getText()),(Servicio)this.ListaServi.getSelectedValue());
                    if(Integer.parseInt(this.total.getText())>=0){
                        if(this.controlador.obtenerProductorGral(Long.parseLong(this.cuit.getText())) == null){
                            if(this.controlador.obtenerPrestadorGral(Long.parseLong(this.cuit.getText()))== null){
                                JOptionPane.showMessageDialog(null,"El cuit ingresado es incorrecto");
                            }
                            else{//es un prestador
                                if(sc.getServicio().getServicioOfrecido().getPrestador()==(Prestador)this.controlador.obtenerPrestador(Long.parseLong(this.cuit.getText()))){
                                    sc.setPrestador((Prestador)this.controlador.obtenerPrestador(Long.parseLong(this.cuit.getText())));
                                    this.controlador.cancelarServicio(sc);
                                }else{
                                    JOptionPane.showMessageDialog(null,"El cuit no coincide con el prestador del servicio");
                                }

                            }
                        }
                        else{//es un productor
                            if((Productor)this.controlador.obtenerProductor(Long.parseLong(this.cuit.getText()))== sc.getServicio().getProductor()){
                                sc.setProductor((Productor)this.controlador.obtenerProductor(Long.parseLong(this.cuit.getText())));
                                this.controlador.cancelarServicio(sc);
                            }else{
                                JOptionPane.showMessageDialog(null,"El cuit no coincide con el productor del servicio");                
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"total debe ser mayor a cero");
                    }    
                }else{
                    JOptionPane.showMessageDialog(null,"Complete todos los campos");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Seleccione el servicio que desea cancelar");
            }
            this.causa.setText("");
            this.cuit.setText("");
            this.total.setText("");
            this.ListaServi.setListData(this.controlador.listarServiciosActivos().toArray());      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingrese correctamente los datos");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaServicios vs = new VistaServicios(this.controlador,this);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaServi;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField causa;
    private javax.swing.JTextField cuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
