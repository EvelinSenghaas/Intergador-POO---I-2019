
package Vistas;

import Controlador.Controlador;
import java.awt.MenuComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modulo.Prestador;
import modulo.ServicioOfrecido;
import modulo.TipoServicio;
import modulo.ZonaServicio;


public class VistaPrestadores extends javax.swing.JFrame {
    private final Controlador controlador;
    private final JFrame vistaAnterior;   
    private List<ServicioOfrecido> serviofrecido = new ArrayList<>();
    
    public VistaPrestadores(Controlador controlador, JFrame vistaAnterior) {
        initComponents();
        this.controlador = controlador;
        this.vistaAnterior = vistaAnterior;
        this.setVisible(true);
        this.setResizable(true);
        this.listaPrestadores.setListData(this.controlador.listarPrestadoresActivos().toArray());
        this.TipoServicios.setModel(new DefaultComboBoxModel(this.controlador.ListarTiposServcios().toArray()));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        razonSocial = new javax.swing.JTextField();
        nroInscripcion = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cuit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPrestadores = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        optEste = new javax.swing.JCheckBox();
        optOeste = new javax.swing.JCheckBox();
        optSur = new javax.swing.JCheckBox();
        optNorte = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        TipoServicios = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaServicioOfrecido = new javax.swing.JList();
        btnAgregarTipoServi = new javax.swing.JButton();
        btnQuitarTipoServi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        btnNuevoTipoServi = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        razonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razonSocialActionPerformed(evt);
            }
        });

        jLabel1.setText("Cuit:");

        cuit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cuitFocusLost(evt);
            }
        });
        cuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuitActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Razon Social:");

        jLabel4.setText("Nro Inscripcion:");

        jLabel5.setText("Domicilio:");

        listaPrestadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPrestadoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPrestadores);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

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

        jLabel6.setText("Zona de Servicio");

        optEste.setText("Este");

        optOeste.setText("Oeste");

        optSur.setText("Sur");

        optNorte.setText("Norte");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("PRESTADORES");

        TipoServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ListaServicioOfrecido.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaServicioOfrecidoValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListaServicioOfrecido);

        btnAgregarTipoServi.setText("+");
        btnAgregarTipoServi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoServiActionPerformed(evt);
            }
        });

        btnQuitarTipoServi.setText("-");
        btnQuitarTipoServi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTipoServiActionPerformed(evt);
            }
        });

        jLabel8.setText("Costo ");

        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        btnNuevoTipoServi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnNuevoTipoServi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTipoServiActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cuit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(domicilio)
                                                .addComponent(razonSocial)
                                                .addComponent(nroInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregarTipoServi)
                                            .addComponent(btnQuitarTipoServi))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(optEste)
                                                .addGap(18, 18, 18)
                                                .addComponent(optOeste))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TipoServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNuevoTipoServi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(optNorte)
                                                .addGap(18, 18, 18)
                                                .addComponent(optSur))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpiar)))
                                .addContainerGap(12, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnNuevoTipoServi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregar)
                                .addComponent(btnModificar)
                                .addComponent(btnEliminar)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optEste)
                            .addComponent(optSur)
                            .addComponent(optNorte)
                            .addComponent(optOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarTipoServi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuitarTipoServi)))
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void razonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razonSocialActionPerformed

    private void cuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuitActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Prestador p;
        
        if(this.cuit.getText().isEmpty()||this.nombre.getText().isEmpty()||this.razonSocial.getText().isEmpty()||this.nroInscripcion.getText().isEmpty()||this.domicilio.getText().isEmpty()){           
            JOptionPane.showMessageDialog(null,"DEBE RELLENAR TODOS LOS CAMPOS"); 
        }
        else{
            try{
                p=this.controlador.obtenerPrestadorGral(Integer.parseInt(this.cuit.getText()));
                if(p!=null){
                    
                    int Respuesta=JOptionPane.showConfirmDialog(null, "desea restaurar el prestador", "so o te ace", JOptionPane.YES_NO_OPTION);
                    if(Respuesta == JOptionPane.YES_OPTION){
                        p.setBorrado(false);
                        this.controlador.modificarPrestador(p);
                        this.limpiar();
                        this.listaPrestadores.setListData(this.controlador.listarPrestadoresActivos().toArray());

                        
                    }else{
                        JOptionPane.showMessageDialog(null, "no se agrego el prestador");
                    }
                }else{
                    if(this.optEste.isSelected()||this.optOeste.isSelected()||this.optNorte.isSelected()||this.optSur.isSelected()){
                        int size = this.serviofrecido.size(); 
                        if(size > 0 ){
                            this.controlador.agregarPrestador(Long.parseLong(this.cuit.getText()), this.razonSocial.getText(),Integer.parseInt(this.nroInscripcion.getText()),this.domicilio.getText(),this.nombre.getText());        
                            p = new Prestador(Long.parseLong(this.cuit.getText()), this.razonSocial.getText(),Integer.parseInt(this.nroInscripcion.getText()),this.domicilio.getText(),this.nombre.getText());
                            if(this.optEste.isSelected()){  
                                this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(0));
                            }
                            if(this.optOeste.isSelected()){
                                this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(1));
                            }
                            if(this.optNorte.isSelected()){
                                this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(2));
                            }
                            if(this.optSur.isSelected()){
                                this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(3));
                            }
                            this.controlador.agregarServicioOfrecido(p, serviofrecido);
                            this.limpiar();
                            this.listaPrestadores.setListData(this.controlador.listarPrestadoresActivos().toArray());
                        }                   
                        else{
                            JOptionPane.showMessageDialog(null,"DEBE SELECCIONAR El SERVICIO QUE OFRECE");
                        }
                    } 
                    else{
                        JOptionPane.showMessageDialog(null,"DEBE SELECCIONAR LA ZONA");
                     }
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaPrincipal v = new VistaPrincipal(this.controlador);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       if(this.listaPrestadores.getSelectedValue()!= null){
           int size = ((Prestador)this.listaPrestadores.getSelectedValue()).getServiviosOfrecidos().size();
           for(int i =0 ; i < size ; i++){
                this.controlador.eliminarServicioOfrecido((ServicioOfrecido)((Prestador)this.listaPrestadores.getSelectedValue()).getServiviosOfrecidos().get(0));
           }
            this.controlador.eliminarPrestador((Prestador)this.listaPrestadores.getSelectedValue());
            this.listaPrestadores.setListData((Vector) this.controlador.listarPrestadoresActivos());
            this.limpiar();
            this.cuit.setEditable(true);

        }
       else{
            JOptionPane.showMessageDialog(null, "No hay nada seleccionado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            if(this.listaPrestadores.getSelectedValue()!= null){
                if(this.cuit.getText().isEmpty()||this.nombre.getText().isEmpty()||this.razonSocial.getText().isEmpty()||this.nroInscripcion.getText().isEmpty()||this.domicilio.getText().isEmpty()){           
                    JOptionPane.showMessageDialog(null,"DEBE RELLENAR TODOS LOS CAMPOS"); 
                }
                else{
                    Prestador p;
                    if(this.optEste.isSelected()||this.optOeste.isSelected()||this.optNorte.isSelected()||this.optSur.isSelected()){                
                        p = (Prestador)this.listaPrestadores.getSelectedValue();
                        p.setDomicilioLegal(this.domicilio.getText());
                        p.setNroInscripcion(Integer.parseInt(this.nroInscripcion.getText()));
                        p.setRazonSocial(this.razonSocial.getText());
                        p.setNombre(this.nombre.getText());
                        int size=p.getZona().size();
                        for(int i=0;i<size;i++){
                            this.controlador.eliminarZonaPrestador(p,p.getZona().get(0));
                        }
                        if(this.optEste.isSelected()){  
                            this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(0));
                        }
                        if(this.optOeste.isSelected()){
                            this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(1));
                        }
                        if(this.optNorte.isSelected()){
                            this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(2));
                        }
                        if(this.optSur.isSelected()){
                            this.controlador.agregarZonaPrestador(p,(ZonaServicio) this.controlador.ListarZonas().get(3));
                        }            

                        this.listaPrestadores.setListData((Vector) this.controlador.listarPrestadoresActivos());
                        this.controlador.modificarPrestador(p);
                        this.limpiar();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No hay nada seleccionado");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Por favor complete correctamente los datos");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void listaPrestadoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPrestadoresValueChanged
        try{
            this.btnAgregar.setEnabled(false);
            if(this.listaPrestadores.getSelectedValue()!= null){
                this.optEste.setSelected(false);
                this.optOeste.setSelected(false);
                this.optNorte.setSelected(false);
                this.optSur.setSelected(false);
                this.cuit.setEditable(false);
                Prestador p = (Prestador)this.listaPrestadores.getSelectedValue();
                this.cuit.setText(Long.toString(p.getCuit()));
                this.nombre.setText(p.getNombre());
                this.razonSocial.setText(p.getRazonSocial());
                this.nroInscripcion.setText(Integer.toString(p.getNroInscripcion()));
                this.domicilio.setText(p.getDomicilioLegal());
                ZonaServicio zona;
                for(int i = 0; i< p.getZona().size();i++){
                    zona = p.getZona().get(i);
                   if(p.getZona().get(i)==zona && zona.getIdZona()==1){
                       this.optEste.setSelected(true);
                   }
                   if(p.getZona().get(i)==zona && zona.getIdZona()==2){
                       this.optOeste.setSelected(true);
                   }
                   if(p.getZona().get(i)==zona && zona.getIdZona()==3){
                       this.optNorte.setSelected(true);
                   }
                   if(p.getZona().get(i)==zona && zona.getIdZona()==4){
                       this.optSur.setSelected(true);
                   }
                }
               this.serviofrecido = p.getServiviosOfrecidos();

               this.ListaServicioOfrecido.setListData(p.getServiviosOfrecidos().toArray());
             }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_listaPrestadoresValueChanged

    private void btnAgregarTipoServiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoServiActionPerformed
        //agrego el servicio ofrecido primero a una lista (serviofrecido) despues persisto
        if(this.TipoServicios.getSelectedIndex()!= -1){
            if(!this.costo.getText().isEmpty()){
                if((Integer.parseInt(this.costo.getText()))>0){
                    ServicioOfrecido so = new ServicioOfrecido(); //un servicio ofrecido que voy a agregar a la lista
                    so.setTipoServicio((TipoServicio) this.TipoServicios.getSelectedItem());
                    so.setCostoPorPrestador(Double.parseDouble(this.costo.getText()));
                    if(this.cuit.isEditable()==false){ //significa que hay un prestador
                        Prestador p = this.controlador.obtenerPrestadorGral(Long.parseLong(this.cuit.getText()));
                        so.setPrestador(p);
                        System.out.println(p);
                        System.out.println(so);
                        p.setServiciosOfrecidos(so);
                        this.controlador.modificarPrestador(this.controlador.obtenerPrestador(Long.parseLong(this.cuit.getText())));
                       
                    }
                    this.serviofrecido.add(so);
                    this.ListaServicioOfrecido.setListData(this.serviofrecido.toArray());
                    this.TipoServicios.removeItemAt(this.TipoServicios.getSelectedIndex());
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "ingrese un costo por servicio");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un tipo de servicio");
        }
    }//GEN-LAST:event_btnAgregarTipoServiActionPerformed

    private void btnQuitarTipoServiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTipoServiActionPerformed
        try{
            //if(this.TipoServicios.getSelectedIndex()!=-1){
                ServicioOfrecido so;
                so =((ServicioOfrecido)this.ListaServicioOfrecido.getSelectedValue());
                int indice = this.ListaServicioOfrecido.getSelectedIndex();
                System.out.println(indice);
                if(this.cuit.isEnabled()){
                    //System.out.println("oli");
                    this.serviofrecido.remove(so);
                    this.ListaServicioOfrecido.setListData(this.serviofrecido.toArray());

                }else{
                    int rsp = JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar el Servicio Ofrecido");
                    if(rsp==JOptionPane.YES_OPTION){
                        System.out.println(so);
                        this.controlador.eliminarServicioOfrecido(so);
                        this.ListaServicioOfrecido.setListData(so.getPrestador().getServiviosOfrecidos().toArray());
                    }
                }
            //}
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnQuitarTipoServiActionPerformed

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void ListaServicioOfrecidoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaServicioOfrecidoValueChanged
        this.costo.setText(Double.toString(((ServicioOfrecido)this.ListaServicioOfrecido.getSelectedValue()).getCostoPorPrestador()));
    }//GEN-LAST:event_ListaServicioOfrecidoValueChanged

    private void cuitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuitFocusLost
        try{
            if(!this.cuit.getText().isEmpty()){
                Prestador p;
                p=this.controlador.obtenerPrestadorGral(Integer.parseInt(this.cuit.getText()));
                if(p!=null){
                    this.optEste.setSelected(false);
                    this.optOeste.setSelected(false);
                    this.optNorte.setSelected(false);
                    this.optSur.setSelected(false);
                    this.cuit.setEditable(false);
                    this.nombre.setText(p.getNombre());
                    this.razonSocial.setText(p.getRazonSocial());
                    this.nroInscripcion.setText(Integer.toString(p.getNroInscripcion()));
                    this.domicilio.setText(p.getDomicilioLegal());
                    ZonaServicio zona;
                    for(int i = 0; i< p.getZona().size();i++){
                        zona = p.getZona().get(i);
                       if(p.getZona().get(i)==zona && zona.getIdZona()==1){
                           this.optEste.setSelected(true);
                       }
                       if(p.getZona().get(i)==zona && zona.getIdZona()==2){
                           this.optOeste.setSelected(true);
                       }
                       if(p.getZona().get(i)==zona && zona.getIdZona()==3){
                           this.optNorte.setSelected(true);
                       }
                       if(p.getZona().get(i)==zona && zona.getIdZona()==4){
                           this.optSur.setSelected(true);
                       }
                    }
                   this.serviofrecido = p.getServiviosOfrecidos();

                   this.ListaServicioOfrecido.setListData(p.getServiviosOfrecidos().toArray());
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingrese numeros validos en el cuit");
            this.cuit.setText("");
        }
        
    }//GEN-LAST:event_cuitFocusLost

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoTipoServiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTipoServiActionPerformed
       AgregarTipoServicio tp = new AgregarTipoServicio(this.controlador,this);
       this.dispose();
    }//GEN-LAST:event_btnNuevoTipoServiActionPerformed

    private void limpiar(){
         this.btnAgregar.setEnabled(true);
        this.cuit.setText("");
        this.nombre.setText("");  
        this.razonSocial.setText("");
        this.nroInscripcion.setText("");
        this.domicilio.setText("");
        this.optEste.setSelected(false);
        this.optOeste.setSelected(false);
        this.optNorte.setSelected(false);
        this.optSur.setSelected(false);
        this.cuit.setEditable(true);
        this.costo.setText("");
        this.serviofrecido.clear();
        this.ListaServicioOfrecido.setListData(this.serviofrecido.toArray());
        this.TipoServicios.setModel(new DefaultComboBoxModel(this.controlador.ListarTiposServcios().toArray()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaServicioOfrecido;
    private javax.swing.JComboBox<String> TipoServicios;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarTipoServi;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoTipoServi;
    private javax.swing.JButton btnQuitarTipoServi;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField cuit;
    private javax.swing.JTextField domicilio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaPrestadores;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nroInscripcion;
    private javax.swing.JCheckBox optEste;
    private javax.swing.JCheckBox optNorte;
    private javax.swing.JCheckBox optOeste;
    private javax.swing.JCheckBox optSur;
    private javax.swing.JTextField razonSocial;
    // End of variables declaration//GEN-END:variables
}
