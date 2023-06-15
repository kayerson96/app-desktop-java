/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mystore.app_store;

import com.formdev.flatlaf.FlatLightLaf;
import com.mystore.app_store.servicioApi.ApiLogin;
import com.mystore.app_store.servicioApi.ApiProducto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.UIManager;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JFrame {
    
    
     public void setBtnUsuarioVisible(boolean visible) {
        btnUsuario.setVisible(visible);
    }
    
     ApiLogin apiLogin = new ApiLogin();

 
 Boolean mostrar = ApiLogin.ESTADO;

 


     public static  Boolean pgUser = false;
     
    int xMouse, yMouse;
    
    /**
     * Creates new form dashboard
     */
    public Dashboard() {
        initComponents();
        thread.start();
        btnUsuario.setVisible(false);
        btnConfig.setVisible(false);

        
        if(mostrar == false){btnInicio.setText("MOSTRAR MAS OPCIONES");}
         accederLogin();
             InitStyles();
    }
    
 
   public void accederLogin(){
       
            pgUser = false;
       ApiLogin apiLogin = new ApiLogin();
       Boolean validacionSesion = apiLogin.ESTADO;
       
       
       if(validacionSesion == false){
           

           PageLogin p1 = new PageLogin();

         p1.setSize(970, 490);
          p1.setLocation(0,0);
          content.removeAll();
          content.add(p1, BorderLayout.CENTER);
          content.validate();
          content.repaint();
          System.out.println(validacionSesion);
          
       } 
   }
   
  
    private void InitStyles() {
//      btnInicio.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelNavegacion = new javax.swing.JPanel();
        navegator = new javax.swing.JPanel();
        btnCatalogo = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        barra = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgMouseEntered(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNavegacion.setBackground(new java.awt.Color(43, 141, 156));

        navegator.setBackground(new java.awt.Color(43, 141, 156));

        btnCatalogo.setBackground(new java.awt.Color(43, 141, 156));
        btnCatalogo.setText("CATALOGO");
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnInicio.setBackground(new java.awt.Color(43, 141, 156));
        btnInicio.setText("INICIO");
        btnInicio.setToolTipText("");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(43, 141, 156));
        btnProducto.setText("PRODUCTOS");
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductoMouseClicked(evt);
            }
        });
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(43, 141, 156));
        btnUsuario.setText("USUARIOS");
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
        });

        btnConfig.setBackground(new java.awt.Color(43, 141, 156));
        btnConfig.setText("CONFIGURACION");
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout navegatorLayout = new javax.swing.GroupLayout(navegator);
        navegator.setLayout(navegatorLayout);
        navegatorLayout.setHorizontalGroup(
            navegatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navegatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navegatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        navegatorLayout.setVerticalGroup(
            navegatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navegatorLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelNavegacionLayout = new javax.swing.GroupLayout(panelNavegacion);
        panelNavegacion.setLayout(panelNavegacionLayout);
        panelNavegacionLayout.setHorizontalGroup(
            panelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(panelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNavegacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(navegator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelNavegacionLayout.setVerticalGroup(
            panelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(panelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNavegacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(navegator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(panelNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 490));

        barra.setBackground(new java.awt.Color(51, 158, 175));

        header.setBackground(new java.awt.Color(43, 141, 156));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(15, 16));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1183, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelHora.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        labelHora.setText("jLabel1");

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(labelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 150));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bgMouseEntered

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
            System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

       btnExit.setForeground(Color.RED);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
 
        btnExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnExitMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMousePressed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        
        Boolean ESTADO = ApiLogin.ESTADO;
        if(ESTADO==true ){
         btnUsuario.setVisible(true);
        btnConfig.setVisible(true);
        btnInicio.setText("INICIO");

        
        System.out.println(ESTADO);}
        else{
        javax.swing.JOptionPane.showMessageDialog(this, "POR FAVOR INICIA SESION");
        accederLogin();
        }
        
        
//        PageLogin p1 = new PageLogin();
        //        p1.setSize(970, 490);
        //        p1.setLocation(0,0);
        //
        //        content.removeAll();
        //        content.add(p1, BorderLayout.CENTER);
        //        content.validate();
        //        content.repaint();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered

    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseClicked
                PageProduct pgProduct = new PageProduct();
                pgProduct.setSize(970, 490);
                pgProduct.setLocation(0,0);
        
                content.removeAll();
                content.add(pgProduct, BorderLayout.CENTER);
                content.validate();
                content.repaint();
    }//GEN-LAST:event_btnProductoMouseClicked

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
     if(mostrar = true){
           PageUsuario pgUsuario = new PageUsuario();
        
        pgUsuario.setSize(970, 490);
        pgUsuario.setLocation(0,0);

        content.removeAll();
        content.add(pgUsuario, BorderLayout.CENTER);
        content.validate();
        content.repaint();
        System.out.println("debe colocar el usuario");}
  
                
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductoActionPerformed

  
    public static void main(String args[]) {
        ApiProducto api = new ApiProducto();
        api.mostrar();
        
     try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
    
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
     
     
    UIManager.put( "Button.arc", 999 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnConfig;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelHora;
    private javax.swing.JPanel navegator;
    private javax.swing.JPanel panelNavegacion;
    // End of variables declaration//GEN-END:variables


    //el siguiente codigo muestra la hora
    Thread thread = new Thread(() -> {
                while (true) {
                    // Obtener la hora actual
                    LocalTime horaActual = LocalTime.now();
                    
                LocalDateTime fechaHoraActual = LocalDateTime.now();
                    
                   
                    
                    //formatear la hora
                 
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                    String horaFormateada = horaActual.format(formatter);
                    
                    //formatear la fecha
                    DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                     String fechaFormateada = fechaHoraActual.format(formatterFecha);
                    
                    
                     // Actualizar el texto del JLabel
                    labelHora.setText("Hora: "+horaFormateada.toString() + " FECHA: "+fechaFormateada);
                    try {
                        // Esperar un segundo antes de actualizar nuevamente
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

}
