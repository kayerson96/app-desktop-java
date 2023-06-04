/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mystore.app_store;

import com.mystore.app_store.DTO.Usuario;
import static com.mystore.app_store.Dashboard.pgUser;
import com.mystore.app_store.api.ApiLogin;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class PageLogin extends javax.swing.JPanel {

     private Dashboard dashboard;

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public void cambiarVisibilidadBtnUsuario(boolean visible) {
        if (dashboard != null) {
            dashboard.setBtnUsuarioVisible(visible);
        }
    }
    
    
    /**
     * Creates new form Page1
     */
    public PageLogin() {
   
        initComponents();
    }

   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPageOne = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        separadorUsuario = new javax.swing.JSeparator();
        separadorClave = new javax.swing.JSeparator();
        usuario = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        clave = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 153, 153));

        separadorUsuario.setBackground(new java.awt.Color(0, 0, 0));
        separadorUsuario.setForeground(new java.awt.Color(0, 0, 0));

        separadorClave.setBackground(new java.awt.Color(0, 0, 0));
        separadorClave.setForeground(new java.awt.Color(0, 0, 0));

        usuario.setBackground(new java.awt.Color(255, 153, 153));
        usuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setText("usuario");
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(255, 193, 211));
        btnIniciar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnIniciarMouseMoved(evt);
            }
        });
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });

        clave.setBackground(new java.awt.Color(255, 153, 153));
        clave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        clave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clave.setText("jPasswordField1");
        clave.setBorder(null);
        clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                claveMousePressed(evt);
            }
        });
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separadorClave, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorClave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgPageOneLayout = new javax.swing.GroupLayout(bgPageOne);
        bgPageOne.setLayout(bgPageOneLayout);
        bgPageOneLayout.setHorizontalGroup(
            bgPageOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPageOneLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        bgPageOneLayout.setVerticalGroup(
            bgPageOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPageOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(bgPageOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
        usuario.setText("");
        usuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_usuarioMousePressed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void btnIniciarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarMouseMoved

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
         
     Dashboard dashboard = new Dashboard();
setDashboard(dashboard);
cambiarVisibilidadBtnUsuario(true);
        
                String usuarioLogin = usuario.getText();
        String claveLogin = new String(clave.getPassword());
ApiLogin ApiLogin = new ApiLogin ();
ApiLogin.enviarLogin(usuarioLogin,claveLogin );
Boolean estadoLogin = ApiLogin.enviarLogin(usuarioLogin, claveLogin);

        if (estadoLogin == true) {
            javax.swing.JOptionPane.showMessageDialog(this, "BIENVENIDO " + usuarioLogin);
        PageProduct pgProduct = new PageProduct();
          pgProduct.setSize(970, 490);
          pgProduct.setLocation(0,0);
          
          bgPageOne.removeAll();
          bgPageOne.add(pgProduct, BorderLayout.CENTER);
          bgPageOne.validate();
          bgPageOne.repaint();
          
        }else{
             javax.swing.JOptionPane.showMessageDialog(this, "DATOS EQUIVOCADOS ");
         System.out.println("es falso");
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    public JPasswordField getClave() {
        return clave;
    }

    public JTextField getUsuario() {
        return usuario;
    }

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(43,141,156));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(255,193,211));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void claveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claveMousePressed
        clave.setText("");
        clave.setForeground(Color.BLACK);
    }//GEN-LAST:event_claveMousePressed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPageOne;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPasswordField clave;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JSeparator separadorClave;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
