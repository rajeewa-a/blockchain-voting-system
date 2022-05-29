/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajeewa Asmadala
 */
public class ClientStart extends javax.swing.JFrame {
    
    private static int port;
    private String addr;

    /**
     * Creates new form ClientStart
     */
    public ClientStart() {
        initComponents();
        setSize(900,580);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_connect = new javax.swing.JButton();
        txt_portno = new javax.swing.JTextField();
        txt_ip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(41, 50, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Join Election Server");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 47));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Presidential Election");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 47));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lkflag.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Election Commission of Sri Lanka ©");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 250, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Sri Lanka");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Server IP Address:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter Port Number:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        btn_connect.setBackground(new java.awt.Color(255, 255, 255));
        btn_connect.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_connect.setText("Connect");
        btn_connect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_connect.setContentAreaFilled(false);
        btn_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_connectActionPerformed(evt);
            }
        });
        jPanel1.add(btn_connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 180, 47));

        txt_portno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txt_portno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_portno.setText("6777");
        txt_portno.setToolTipText("");
        jPanel1.add(txt_portno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 155, 40));

        txt_ip.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txt_ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip.setText("localhost");
        txt_ip.setToolTipText("");
        jPanel1.add(txt_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 155, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slemblem.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 60, 70));

        btn_back.setBackground(new java.awt.Color(61, 90, 128));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 630, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_connectActionPerformed
        // TODO add your handling code here:

         
         if (txt_portno.getText().isEmpty() || txt_ip.getText().isEmpty()){
             
            
             JOptionPane.showMessageDialog(null,"Do not leave fields empty.","Alert",JOptionPane.WARNING_MESSAGE);
             
            
        }else if (txt_portno.getText().length() == 4) {
                
                addr = txt_ip.getText();
                port = Integer.parseInt(txt_portno.getText());
            
                ClientManager _cltMgr = new ClientManager(addr, port);
                
                new Thread(_cltMgr).start();
             try {
                 _cltMgr.startClient();
             } catch (SQLException ex) {
                 Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
             }
                this.dispose();
               
        } else{
            
                JOptionPane.showMessageDialog(null,"Port Number should be 4 digits.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_connectActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        OffMenu ro = new OffMenu();
        ro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       FlatLightLaf.setup();
        
        try {
            javax.swing.UIManager.setLookAndFeel( new FlatLightLaf() );
            } catch( Exception ex ) {
                   System.err.println( "Failed to initialize LaF" );
            }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_connect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_portno;
    // End of variables declaration//GEN-END:variables
}
