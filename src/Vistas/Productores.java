package Vistas;

import Controlador.Controlador;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import modulo.Productor;

public class Productores extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame vistaAnterior;   
   
    public Productores(Controlador controlador, JFrame vistaAnterior) {
        initComponents();
        this.controlador = controlador;
        this.vistaAnterior = vistaAnterior;
        this.setVisible(true);
        this.setResizable(true);
        this.listaProductor.setListData(this.controlador.listarProductoresActivos().toArray());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cuit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        razonSocial = new javax.swing.JTextField();
        nroInscripcion = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductor = new javax.swing.JList();
        btnVolver = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cantHectareas = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Cuit:");

        cuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Razon Social:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("nro Inscripcion:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Domicilio:");

        razonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razonSocialActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        listaProductor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProductorValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaProductor);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRODUCTORES");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Cantidad De Hectareas");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-pincel-32.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(9, 9, 9)
                                .addComponent(cantHectareas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(razonSocial)
                                    .addComponent(nroInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar)
                                .addGap(33, 33, 33)
                                .addComponent(btnModificar)
                                .addGap(31, 31, 31)
                                .addComponent(btnEliminar))
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(razonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nroInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cantHectareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnLimpiar)))
                .addGap(64, 64, 64)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuitActionPerformed

    private void razonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razonSocialActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
            if(this.cuit.getText().isEmpty()||this.nombre.getText().isEmpty()||this.razonSocial.getText().isEmpty()||this.nroInscripcion.getText().isEmpty()||this.domicilio.getText().isEmpty()||this.cantHectareas.getText().isEmpty()){           
                JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
            }
            else{

                if((Integer.parseInt(this.cantHectareas.getText()))<=0){
                    JOptionPane.showMessageDialog(null,"Rango de valores erroneos en cant de hectareas");
                }
                else{
                    this.controlador.agregarProductor(Long.parseLong(this.cuit.getText()), this.razonSocial.getText(),Integer.parseInt(this.nroInscripcion.getText()),this.domicilio.getText(),this.nombre.getText(),Integer.parseInt(this.cantHectareas.getText()));
                     this.listaProductor.setListData(this.controlador.listarProductoresActivos().toArray());        
                    this.limpiar();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos correctamente");
            this.limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            if(this.listaProductor.getSelectedValue()!= null){
                if(this.cuit.getText().isEmpty()||this.nombre.getText().isEmpty()||this.razonSocial.getText().isEmpty()||this.nroInscripcion.getText().isEmpty()||this.domicilio.getText().isEmpty()||this.cantHectareas.getText().isEmpty()){           
                    JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
                }else{
                        if((Integer.parseInt(this.cantHectareas.getText()))<=0){
                            JOptionPane.showMessageDialog(null,"Rango de valores erroneos en cant de hectareas");
                        }
                        else{
                            Productor p = (Productor)this.listaProductor.getSelectedValue();
                            p.setCantHectarea(Integer.parseInt(this.cantHectareas.getText()));
                            p.setDomicilioLegal(this.domicilio.getText());
                            p.setNroInscripcion(Integer.parseInt(this.nroInscripcion.getText()));
                            p.setRazonSocial(this.razonSocial.getText());
                            p.setNombre(this.nombre.getText());
                            this.controlador.modificarProductor(p);
                            this.listaProductor.setListData(this.controlador.listarProductoresActivos().toArray());
                            this.limpiar();
                        }

                }

            }
            else{
                JOptionPane.showMessageDialog(null, "No hay nada seleccionado");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Por favor complete correctamente los campos");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.listaProductor.getSelectedValue()!= null){
            this.controlador.eliminarProductor((Productor)this.listaProductor.getSelectedValue());
            this.listaProductor.setListData(this.controlador.listarProductoresActivos().toArray());
            this.limpiar();
            this.cuit.setEditable(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void limpiar(){
        this.cuit.setEnabled(true);
        this.btnAgregar.setEnabled(true);
        this.cuit.setText("");
        this.nombre.setText("");  
        this.razonSocial.setText("");
        this.nroInscripcion.setText("");
        this.domicilio.setText("");
        this.cantHectareas.setText("");
    }
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaPrincipal v = new VistaPrincipal(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void listaProductorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProductorValueChanged
        this.btnAgregar.setEnabled(false);
        if(this.listaProductor.getSelectedValue()!= null){
            this.cuit.setEditable(false);
            Productor p = (Productor)this.listaProductor.getSelectedValue();
            this.cuit.setText(Long.toString(p.getCuit()));
            this.nombre.setText(p.getNombre());
            this.razonSocial.setText(p.getRazonSocial());
            this.nroInscripcion.setText(Integer.toString(p.getNroInscripcion()));
            this.domicilio.setText(p.getDomicilioLegal());
            this.cantHectareas.setText(Integer.toString(p.getCantHectarea()));
         }
    }//GEN-LAST:event_listaProductorValueChanged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiar();
        this.cuit.setEditable(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cantHectareas;
    private javax.swing.JTextField cuit;
    private javax.swing.JTextField domicilio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaProductor;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nroInscripcion;
    private javax.swing.JTextField razonSocial;
    // End of variables declaration//GEN-END:variables
}
