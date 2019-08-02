/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Controlador;
import java.util.Vector;
import static javafx.application.Platform.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modulo.Prestador;
import modulo.TipoServicio;
import modulo.Unidad;

public class AgregarTipoServicio extends javax.swing.JFrame {

    private final JFrame vistaAnterior;
    private Controlador controlador;

    
    public AgregarTipoServicio(Controlador controlador,JFrame vistaAnterior) {
        initComponents();
        this.controlador = controlador;
        this.vistaAnterior= vistaAnterior;
        this.setVisible(true);
        this.actualizarLista(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        unidad = new javax.swing.JComboBox();
        descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaTipoServicio = new javax.swing.JList();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("TIPO DE SERVICIOS");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Unidad");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion");

        unidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "metros", "hectareas", "horas", "producto" }));
        unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Nombre");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        ListaTipoServicio.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaTipoServicioValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListaTipoServicio);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Lista Tipo de Servicios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(35, 35, 35)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(35, 35, 35)
                                        .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Volver atras
        this.vistaAnterior.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        TipoServicio tiposervicio;
        if(this.nombre.getText().isEmpty()||this.descripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"DEBE RELLENAR TODOS LOS CAMPOS");
        }
        else{
            tiposervicio = new TipoServicio(this.nombre.getText(),this.descripcion.getText());
            this.controlador.agregarTipoServicio(tiposervicio);
            if(this.unidad.getSelectedIndex()!= -1){
                System.out.println("entre al if");
                if("metros".equals(this.unidad.getSelectedItem().toString())){
                    this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(0));
                }
                if("hectareas".equals(this.unidad.getSelectedItem().toString())){
                    this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(1));
                }
                if("horas".equals(this.unidad.getSelectedItem().toString())){
                    this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(2));
                }
                if("producto".equals(this.unidad.getSelectedItem().toString())){
                    this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(3));
                }
                this.limpiar();
                this.actualizarLista();
            }
            else{
                JOptionPane.showMessageDialog(null,"Por favor seleccione la unidad");
            }
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!this.ListaTipoServicio.isSelectionEmpty()){
            this.controlador.eliminarTipoServicio((TipoServicio)this.ListaTipoServicio.getSelectedValue());
            this.limpiar();
            this.actualizarLista();
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Ningun Tipo de Servicio fue Seleccionado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ListaTipoServicioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaTipoServicioValueChanged
        try{
            this.btnAgregar.setEnabled(false);
            if(!this.ListaTipoServicio.isSelectionEmpty()){
                TipoServicio tiposervicio = (TipoServicio) this.ListaTipoServicio.getSelectedValue();
                this.nombre.setText(tiposervicio.getNombre());
                this.descripcion.setText(tiposervicio.getDescripcion());
                this.unidad.setSelectedItem(tiposervicio.getUnidad());      
            }
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_ListaTipoServicioValueChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            if(!this.ListaTipoServicio.isSelectionEmpty()){
                TipoServicio tiposervicio=(TipoServicio) this.ListaTipoServicio.getSelectedValue();
                tiposervicio.setNombre(this.nombre.getText());
                tiposervicio.setDescripcion(this.descripcion.getText());
                this.controlador.modificarTipoServicio(tiposervicio);
                if(this.unidad.getSelectedIndex()!= -1){
                    System.out.println("entre al if");
                    if("metros".equals(this.unidad.getSelectedItem().toString())){
                        this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(0));
                    }
                    if("hectareas".equals(this.unidad.getSelectedItem().toString())){
                        this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(1));
                    }
                    if("hora".equals(this.unidad.getSelectedItem().toString())){
                        this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(2));
                    }
                    if("producto".equals(this.unidad.getSelectedItem().toString())){
                        this.controlador.AgregarUnidad(tiposervicio, (Unidad)this.controlador.ListarUnidades().get(3));
                    }
                }

                this.limpiar();
                this.actualizarLista();
            }
            else{
                JOptionPane.showMessageDialog(null, "No hay nada que modificar");
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null,"Por favor ingrese correctamete los datos");
        
        }
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadActionPerformed
        
    }//GEN-LAST:event_unidadActionPerformed
    
    private void limpiar(){
       this.btnAgregar.setEnabled(true);
        this.descripcion.setText("");
        this.nombre.setText("");
        this.unidad.setSelectedIndex(0);
    }
    private void actualizarLista(){
        this.ListaTipoServicio.setListData(this.controlador.ListarTiposServcios().toArray());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaTipoServicio;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox unidad;
    // End of variables declaration//GEN-END:variables
}
