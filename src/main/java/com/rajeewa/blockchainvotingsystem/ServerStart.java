/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem;

import com.formdev.flatlaf.FlatLightLaf;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;


/**
 *
 * @author Rajeewa Asmadala
 */
public class ServerStart extends javax.swing.JFrame {
    
    private static final String DEFAULT_SERVER_ADDR = "localhost";
    private static final int DEFAULT_PORT = 6777;
    private static int port;
    private static int intValue;

    /**
     * Creates new form ServerStart
     */
    public ServerStart() {
        initComponents();
        setSize(900,580);
        setLocationRelativeTo(null);
        setResizable(false);
        
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            System.out.println("Your current IP address : " + ip); 
            lbl_ip.setText("" + ip);
        } catch (UnknownHostException e) { 
            e.printStackTrace();
        }
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_port = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_ip = new javax.swing.JLabel();
        btn_startsv = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(41, 50, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Start Election Server");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_port.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txt_port.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_port.setText("6777");
        txt_port.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_portActionPerformed(evt);
            }
        });
        jPanel2.add(txt_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 290, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Port:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Server IP: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        lbl_ip.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ip.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_ip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lbl_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 290, 40));

        btn_startsv.setBackground(new java.awt.Color(255, 255, 255));
        btn_startsv.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_startsv.setText("Start Server");
        btn_startsv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_startsv.setContentAreaFilled(false);
        btn_startsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startsvActionPerformed(evt);
            }
        });
        jPanel2.add(btn_startsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 180, 47));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slemblem.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 60, 70));

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
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 70, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 630, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_portActionPerformed

    private void btn_startsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startsvActionPerformed
       //if no port no number is given, use default port
        if (txt_port.getText().isEmpty()){
            port = DEFAULT_PORT;
            
            System.out.println("Starting Server...");
                 
            
            ServerManager _svrMgr =new ServerManager(port);
            new Thread(_svrMgr).start();
            this.dispose();
//            System.out.println(""+ port);
        
        }else if (txt_port.getText().length() == 4) {
            
               try{
                intValue = Integer.parseInt(txt_port.getText());
                port = intValue;
//                System.out.println(""+intValue);
                
                ServerManager _svrMgr =new ServerManager(port);
                new Thread(_svrMgr).start();
                this.dispose();
                
                   } catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Port Number should only contain numbers.","Alert",JOptionPane.WARNING_MESSAGE);
//                        System.out.println("lol");
                    }
               
        } else{
                System.out.println("longer");
                JOptionPane.showMessageDialog(null,"Port Number should be 4 digits.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_startsvActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        OffMenu om = new OffMenu();
        om.setVisible(true);
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerStart().setVisible(true);
            }
        });
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_startsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_ip;
    private javax.swing.JTextField txt_port;
    // End of variables declaration//GEN-END:variables
}


