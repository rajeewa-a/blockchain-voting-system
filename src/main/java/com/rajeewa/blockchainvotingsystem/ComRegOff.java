/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajeewa Asmadala
 */
public class ComRegOff extends javax.swing.JFrame {
        Connection conn;
        PreparedStatement pst;
        Validate ve = new Validate();
    /**
     * Creates new form ComRegOff
     */
    public ComRegOff() {
        
        initComponents();
        setSize(900,580);
        setLocationRelativeTo(null);
        setResizable(false);
            try {
                conn = SqlConn.connect();
            } catch (Exception ex) {
                Logger.getLogger(ComRegOff.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_pw = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_tp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbl_pw1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_regoff = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        txt_pwconfirm = new javax.swing.JPasswordField();
        txt_pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 50, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Register Official");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 47));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Presidential Election");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 47));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lkflag.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 80));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Election Commission of Sri Lanka ©");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 250, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sri Lanka");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel4.setText("E-Mail:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel5.setText("NIC Number:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        lbl_pw.setText("Password:");
        jPanel2.add(lbl_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));
        jPanel2.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 250, -1));
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 250, -1));
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 250, -1));
        jPanel2.add(txt_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, -1));

        jLabel7.setText("Telephone:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        lbl_pw1.setText("Confirm Password:");
        jPanel2.add(lbl_pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slemblem.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 60, 70));

        btn_regoff.setBackground(new java.awt.Color(61, 90, 128));
        btn_regoff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_regoff.setForeground(new java.awt.Color(255, 255, 255));
        btn_regoff.setText("Register");
        btn_regoff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_regoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regoffActionPerformed(evt);
            }
        });
        jPanel2.add(btn_regoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 50));

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
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 70, 30));

        txt_pwconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwconfirmActionPerformed(evt);
            }
        });
        jPanel2.add(txt_pwconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 250, -1));

        txt_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwActionPerformed(evt);
            }
        });
        jPanel2.add(txt_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 250, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 630, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regoffActionPerformed
            
        
            String password = new String(txt_pw.getPassword());
            String pwconfirm = new String(txt_pwconfirm.getPassword());
            if(!("".equals(txt_name.getText()) || "".equals(txt_nic.getText()) || "".equals(txt_email.getText()) || "".equals(txt_tp.getText()))){
                
                if(ve.isValidEmailAddress(txt_email.getText())){
                    
                    if(!(txt_tp.getText().length() > 10)){
                        
                        if((password.equals(pwconfirm))){
                            
                            String salt = PassEnc.getSaltvalue(30);
                            String encpw = PassEnc.generateSecurePassword(password, salt);

                            try {

                            String sql="INSERT INTO users (name,nic,email,telephone,password,pwsalt) VALUES (?,?,?,?,?,?)";
                            pst = conn.prepareStatement(sql);
                            pst.setString(1,txt_name.getText());
                            pst.setString(2,txt_nic.getText());
                            pst.setString(3,txt_email.getText());
                            pst.setString(4,txt_tp.getText());
                            pst.setString(5,encpw);
                            pst.setString(6,salt);
                            pst.execute();

                            JOptionPane.showMessageDialog(null, "Success");
                            }
                            catch (SQLException e)
                            {
                                e.printStackTrace();
                            }
                            
                            
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "Passwords do not match!","Error!", JOptionPane.ERROR_MESSAGE);
                        }
                                                
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid telephone number.","Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid email address.","Error!", JOptionPane.ERROR_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Cannot leave fields empty.","Error!", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_btn_regoffActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        ComMenu cm = new ComMenu();
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_pwconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwconfirmActionPerformed

    private void txt_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
             
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_regoff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_pw;
    private javax.swing.JLabel lbl_pw1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JPasswordField txt_pwconfirm;
    private javax.swing.JTextField txt_tp;
    // End of variables declaration//GEN-END:variables
}
