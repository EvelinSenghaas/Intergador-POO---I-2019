package Vistas;

import Controlador.Controlador;
import javax.swing.JFrame;

public class VistaServicios extends javax.swing.JFrame {

    private Controlador controlador;
    private JFrame vistaAnterior;
    
    public VistaServicios(Controlador controlador, JFrame vistaAnterior) {
        initComponents();
        this.controlador=controlador;
        this.vistaAnterior=vistaAnterior;
        this.setVisible(true);
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnAgregarTipoServicio = new javax.swing.JButton();
        btnSolicitarServicio = new javax.swing.JButton();
        btnCancelarServicio = new javax.swing.JButton();
        btnFinalizarServi = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
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
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(374, 300));
        setMinimumSize(new java.awt.Dimension(374, 300));
        setPreferredSize(new java.awt.Dimension(374, 300));
        getContentPane().setLayout(null);

        btnAgregarTipoServicio.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarTipoServicio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAgregarTipoServicio.setForeground(new java.awt.Color(102, 0, 102));
        btnAgregarTipoServicio.setText("Agregar Tipo de Servicio");
        btnAgregarTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoServicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarTipoServicio);
        btnAgregarTipoServicio.setBounds(73, 40, 167, 26);

        btnSolicitarServicio.setBackground(new java.awt.Color(255, 255, 255));
        btnSolicitarServicio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnSolicitarServicio.setForeground(new java.awt.Color(102, 0, 102));
        btnSolicitarServicio.setText("Solicitar Servicios");
        btnSolicitarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarServicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolicitarServicio);
        btnSolicitarServicio.setBounds(73, 84, 167, 26);

        btnCancelarServicio.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarServicio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCancelarServicio.setForeground(new java.awt.Color(102, 0, 102));
        btnCancelarServicio.setText("Cancelar Servicios");
        btnCancelarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarServicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarServicio);
        btnCancelarServicio.setBounds(73, 172, 167, 26);

        btnFinalizarServi.setBackground(new java.awt.Color(255, 255, 255));
        btnFinalizarServi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFinalizarServi.setForeground(new java.awt.Color(102, 0, 102));
        btnFinalizarServi.setText("Finalizar Servicio");
        btnFinalizarServi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarServiActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizarServi);
        btnFinalizarServi.setBounds(73, 128, 167, 26);

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(232, 228, 80, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoServicioActionPerformed
        AgregarTipoServicio venti = new AgregarTipoServicio(this.controlador,this);
        this.dispose();
    }//GEN-LAST:event_btnAgregarTipoServicioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaPrincipal v = new VistaPrincipal(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSolicitarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarServicioActionPerformed
       SolicitarServicio ss = new SolicitarServicio(this.controlador,this);
       this.dispose();
    }//GEN-LAST:event_btnSolicitarServicioActionPerformed

    private void btnCancelarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarServicioActionPerformed
        CancelarServicio cs = new CancelarServicio(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnCancelarServicioActionPerformed

    private void btnFinalizarServiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarServiActionPerformed
        FinalizarServicio fs = new FinalizarServicio(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnFinalizarServiActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTipoServicio;
    private javax.swing.JButton btnCancelarServicio;
    private javax.swing.JButton btnFinalizarServi;
    private javax.swing.JButton btnSolicitarServicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
