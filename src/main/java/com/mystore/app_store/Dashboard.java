/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mystore.app_store;

import com.formdev.flatlaf.FlatLightLaf;
import com.mystore.app_store.api.ApiLogin;
import com.mystore.app_store.api.ApiProducto;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JFrame {
    

    
    int xMouse, yMouse;
    
    /**
     * Creates new form dashboard
     */
    public Dashboard() {
        initComponents();
        
         accederLogin();
         cargarBarraNavegacion();


             InitStyles();
    }

   public void accederLogin(){
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
   

   public void cargarBarraNavegacion(){

                Navegador navegador = new Navegador();

         navegador.setSize(250, 490);
          navegador.setLocation(0,0);
          panelNavegacion.removeAll();
          panelNavegacion.add(navegador, BorderLayout.CENTER);
          panelNavegacion.validate();
          panelNavegacion.repaint();
          System.out.println( "deben colocar el panel");    
   }
 
    private void InitStyles() {
      //  boton1.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    
    
    
  
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelNavegacion = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        mostrarMenu = new javax.swing.JButton();
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

        javax.swing.GroupLayout panelNavegacionLayout = new javax.swing.GroupLayout(panelNavegacion);
        panelNavegacion.setLayout(panelNavegacionLayout);
        panelNavegacionLayout.setHorizontalGroup(
            panelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panelNavegacionLayout.setVerticalGroup(
            panelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
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
                .addGap(0, 1183, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        mostrarMenu.setBackground(new java.awt.Color(43, 141, 156));
        mostrarMenu.setText("MOSTRAR MENÚ");
        mostrarMenu.setToolTipText("");
        mostrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarMenuMouseEntered(evt);
            }
        });
        mostrarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(mostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(mostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void mostrarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMenuMouseClicked
        //        PageLogin p1 = new PageLogin();
        //        p1.setSize(970, 490);
        //        p1.setLocation(0,0);
        //
        //        content.removeAll();
        //        content.add(p1, BorderLayout.CENTER);
        //        content.validate();
        //        content.repaint();
    }//GEN-LAST:event_mostrarMenuMouseClicked

    private void mostrarMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMenuMouseEntered

    }//GEN-LAST:event_mostrarMenuMouseEntered

    private void mostrarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarMenuActionPerformed

  
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
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JButton mostrarMenu;
    private javax.swing.JPanel panelNavegacion;
    // End of variables declaration//GEN-END:variables


}
