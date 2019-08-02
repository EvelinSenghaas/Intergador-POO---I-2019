/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Controlador;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modulo.Productor;
import modulo.ServicioOfrecido;
import modulo.TipoServicio;

public class SolicitarServicio extends javax.swing.JFrame {
     private final Controlador controlador;
     private final JFrame vistaAnterior;   
   
    public SolicitarServicio(Controlador controlador, JFrame vistaAnterior) {
        initComponents();
        this.controlador = controlador;
        this.vistaAnterior = vistaAnterior;
        this.setVisible(true);
        this.setResizable(true);
        this.ListaServiciosOfrecidos.setListData((Vector) this.controlador.listarServiciosOfrecidosActivos());
        this.ListaProductores.setListData(this.controlador.listarProductoresActivos().toArray());
        this.TipoDeServicio.setModel(new DefaultComboBoxModel(this.controlador.ListarTiposServcios().toArray()));
        Date d = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaInicial.setText(formatoFecha.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaServiciosOfrecidos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaProductores = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        TipoDeServicio = new javax.swing.JComboBox<>();
        btnSolicitar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        fechaInicial = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        prestador = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        unidad = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fechafin = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(575, 400));
        setMinimumSize(new java.awt.Dimension(575, 400));
        setPreferredSize(new java.awt.Dimension(591, 376));
        getContentPane().setLayout(null);

        ListaServiciosOfrecidos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaServiciosOfrecidosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaServiciosOfrecidos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 137, 118, 131);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("SOLICITAR SERVICIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(163, 12, 259, 33);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servicios Ofrecidos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 115, 112, 16);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Productores");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(174, 63, 71, 16);

        jScrollPane2.setViewportView(ListaProductores);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(174, 85, 129, 183);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de inicio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(321, 63, 84, 16);

        TipoDeServicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoDeServicioItemStateChanged(evt);
            }
        });
        getContentPane().add(TipoDeServicio);
        TipoDeServicio.setBounds(12, 85, 118, 24);

        btnSolicitar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolicitar);
        btnSolicitar.setBounds(381, 320, 81, 26);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripcion");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(321, 137, 68, 16);
        getContentPane().add(descripcion);
        descripcion.setBounds(402, 137, 139, 67);

        fechaInicial.setEditable(false);
        fechaInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(fechaInicial);
        fechaInicial.setBounds(447, 69, 94, 19);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prestador: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 280, 63, 16);

        prestador.setBackground(new java.awt.Color(255, 255, 255));
        prestador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        prestador.setForeground(new java.awt.Color(255, 255, 255));
        prestador.setText("--------------------");
        getContentPane().add(prestador);
        prestador.setBounds(80, 280, 80, 16);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unidad:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 300, 42, 16);

        unidad.setBackground(new java.awt.Color(255, 255, 255));
        unidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        unidad.setForeground(new java.awt.Color(255, 255, 255));
        unidad.setText("--------------------");
        getContentPane().add(unidad);
        unidad.setBounds(80, 300, 80, 16);

        costo.setBackground(new java.awt.Color(255, 255, 255));
        costo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        costo.setForeground(new java.awt.Color(255, 255, 255));
        costo.setText("--------------------");
        getContentPane().add(costo);
        costo.setBounds(80, 330, 80, 16);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Costo / u:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 330, 60, 16);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de Servicio");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(12, 63, 90, 16);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha de finalizacion");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(321, 101, 118, 16);
        getContentPane().add(fechafin);
        fechafin.setBounds(451, 100, 90, 19);

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(480, 320, 70, 26);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/obscuro (1).png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-70, 0, 750, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoDeServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoDeServicioItemStateChanged
        TipoServicio tp;
        tp = (TipoServicio) this.TipoDeServicio.getSelectedItem();
        this.ListaServiciosOfrecidos.setListData(tp.getSO().toArray());
       
    }//GEN-LAST:event_TipoDeServicioItemStateChanged

    private void ListaServiciosOfrecidosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaServiciosOfrecidosValueChanged
        ServicioOfrecido so;
        so = (ServicioOfrecido) this.ListaServiciosOfrecidos.getSelectedValue();
        this.prestador.setText(so.getPrestador().getNombre());
        this.unidad.setText(so.getTipoServicio().getUnidad().getDescripcion());
        this.costo.setText(Double.toString(so.getCostoPorPrestador()));
    }//GEN-LAST:event_ListaServiciosOfrecidosValueChanged

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        if(this.ListaProductores.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor seleccione el productor");
        }
        else{
            if(this.ListaServiciosOfrecidos.isSelectionEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor seleccione el servicio que desea solicitar");
            }
            else{
                try{
                    Date fecha = new Date();
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                    
                    if (formatoFecha.parse(this.fechafin.getText()).compareTo(fecha) > 0) {
                        this.controlador.agregarServicio(Double.parseDouble(this.costo.getText()),this.descripcion.getText(),formatoFecha.parse(this.fechafin.getText()), (ServicioOfrecido) this.ListaServiciosOfrecidos.getSelectedValue(),(Productor)this.ListaProductores.getSelectedValue());                      
                        this.descripcion.setText("");
                        this.fechafin.setText("");
                        this.ListaProductores.clearSelection();
                        this.ListaServiciosOfrecidos.clearSelection();
                        this.ListaServiciosOfrecidos.setListData((Vector) this.controlador.listarServiciosOfrecidosActivos());
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"No puede introducir una fecha anterior o igual a la actual");
                    }

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null," Ingrese los datos correctamente");
                }
            }
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaServicios vs = new VistaServicios(this.controlador,this);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaProductores;
    private javax.swing.JList ListaServiciosOfrecidos;
    private javax.swing.JComboBox<String> TipoDeServicio;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel costo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JFormattedTextField fechaInicial;
    private javax.swing.JTextField fechafin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel prestador;
    private javax.swing.JLabel unidad;
    // End of variables declaration//GEN-END:variables
}
