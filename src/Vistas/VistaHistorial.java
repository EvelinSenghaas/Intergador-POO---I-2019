
package Vistas;

import Controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import modulo.Prestador;
import modulo.Productor;
import modulo.Servicio;
import modulo.ServicioCancelado;
import modulo.ServicioRealizado;

public class VistaHistorial extends javax.swing.JFrame {

    private Controlador controlador;
    public VistaHistorial(Controlador controlador) {
        initComponents();
        this.controlador = controlador;
        this.setVisible(true);
        this.ListaPrestadores.setListData(this.controlador.listarPrestadoresActivos().toArray());
        this.ListaProductores.setListData(this.controlador.listarProductoresActivos().toArray());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaServiRealizados = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaPrestadores = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaServiCancelado = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaPuntaje = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaProductores = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ListaServiRealizados);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Historial Servicio");

        jLabel2.setText("Servicios Realizados");

        ListaPrestadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaPrestadoresValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListaPrestadores);

        jLabel3.setText("Servicios Cancelados");

        jLabel4.setText("Prestadores");

        jScrollPane3.setViewportView(ListaServiCancelado);

        jScrollPane4.setViewportView(ListaPuntaje);

        jLabel5.setText("Puntaje");

        ListaProductores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaProductoresValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(ListaProductores);

        jLabel7.setText("Productores");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(194, 194, 194)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btnVolver))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnVolver))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaPrestadoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaPrestadoresValueChanged
        try{
            this.ListaProductores.clearSelection();
            this.ListaPuntaje.clearSelection();
            this.ListaServiCancelado.clearSelection();
            this.ListaServiRealizados.clearSelection();
            Prestador p = (Prestador) this.ListaPrestadores.getSelectedValue();
            int size;
            List<ServicioCancelado>sc=this.controlador.listarServiciosCancelados();
            size=sc.size();
            for (int i = 0; i < size; i++) {
                if(sc.get(i).getPrestador() != p){
                    sc.remove(i);
                    i--;
                    size-=1;
                }          
            }
            this.ListaServiCancelado.setListData(sc.toArray());

            List<ServicioRealizado> sr=this.controlador.listarServiciosRealizados();
            size=sr.size();
            List<String> puntaje = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if(sr.get(i).getPrestador() != p){
                    sr.remove(i);
                    i--;
                    size-=1;
                }else{
                    puntaje.add(sr.get(i).getPuntaje());
                }
            }
            this.ListaServiRealizados.setListData(sr.toArray());
            this.ListaPuntaje.setListData(puntaje.toArray());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ListaPrestadoresValueChanged

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaPrincipal vp = new VistaPrincipal(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void ListaProductoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaProductoresValueChanged
        try{
            this.ListaPrestadores.clearSelection();
            this.ListaPuntaje.clearSelection();
            this.ListaServiCancelado.clearSelection();
            this.ListaServiRealizados.clearSelection();
            Productor p = (Productor) this.ListaProductores.getSelectedValue();
            int size;
            List<ServicioCancelado>sc=this.controlador.listarServiciosCancelados();
            size=sc.size();
            for (int i = 0; i < size; i++) {
                if(sc.get(i).getProductor()!= p){
                    sc.remove(i);
                    i--;
                    size-=1;
                }          
            }
            this.ListaServiCancelado.setListData(sc.toArray());

            List<ServicioRealizado> sr=this.controlador.listarServiciosRealizados();
            size=sr.size();
            for (int i = 0; i < size; i++) {
                if(sr.get(i).getProductor() != p){
                    sr.remove(i);
                    i--;
                    size-=1;
                }

            }
            this.ListaServiRealizados.setListData(sr.toArray());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ListaProductoresValueChanged

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaPrestadores;
    private javax.swing.JList ListaProductores;
    private javax.swing.JList ListaPuntaje;
    private javax.swing.JList ListaServiCancelado;
    private javax.swing.JList ListaServiRealizados;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
