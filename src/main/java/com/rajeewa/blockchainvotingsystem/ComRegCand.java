/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem;

import com.formdev.flatlaf.FlatLightLaf;
import com.rajeewa.blockchainvotingsystem.PassEnc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rajeewa Asmadala
 */
public class ComRegCand extends javax.swing.JFrame {
        Connection conn;
        PreparedStatement pst;
        String imgpath;
        Validate ve = new Validate();
    /**
     * Creates new form ComRegCand
     */
    public ComRegCand() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_logo = new javax.swing.JTextField();
        btn_logo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_reg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        txt_tp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 50, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 20));

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
        jLabel10.setText("Election Commission of Sri Lanka ??");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 250, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sri Lanka");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 40));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Register Candidate");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 47));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel4.setText("E-Mail:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel5.setText("NIC Number:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel6.setText("Telephone:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
        jPanel2.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 250, -1));
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, -1));
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, -1));
        jPanel2.add(txt_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 250, -1));

        btn_logo.setText("Select");
        btn_logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, 20));

        jLabel7.setText("Logo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        btn_reg.setBackground(new java.awt.Color(61, 90, 128));
        btn_reg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reg.setForeground(new java.awt.Color(255, 255, 255));
        btn_reg.setText("Register");
        btn_reg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slemblem.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 60, 70));

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
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 70, 30));
        jPanel2.add(txt_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 250, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 630, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed

            
            if(!("".equals(txt_name.getText()) || "".equals(txt_nic.getText()) || "".equals(txt_email.getText()) || "".equals(txt_tp.getText()))){
                
                if(ve.isValidEmailAddress(txt_email.getText())){
                    
                    if(!(txt_tp.getText().length() > 10)){
                        
                        if(!("".equals(imgpath))){
                            
                                    try {
            
                                        String sql="INSERT INTO candidates (name,nic,email,telephone,logo) VALUES (?,?,?,?,?)";
                                        pst = conn.prepareStatement(sql);
                                        pst.setString(1,txt_name.getText());
                                        pst.setString(2,txt_nic.getText());
                                        pst.setString(3,txt_email.getText());
                                        pst.setInt(4,Integer.parseInt(txt_tp.getText()));

                                        InputStream in = new FileInputStream(imgpath);
                                        pst.setBlob(5,in);

                                        pst.execute();

                                        JOptionPane.showMessageDialog(null, "Success");
                                        }
                                        catch (SQLException e)
                                        {
                                            JOptionPane.showMessageDialog(null, "Error!");
                                            e.printStackTrace();
                                        }   catch (FileNotFoundException ex) {
                                                Logger.getLogger(ComRegCand.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "Invalid candidate logo.","Error!", JOptionPane.ERROR_MESSAGE);
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
            


        
        

    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        ComMenu cm = new ComMenu();
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
        file.addChoosableFileFilter(filter);
        int res = file.showSaveDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
          File selFile = file.getSelectedFile();
          imgpath = selFile.getAbsolutePath();
          txt_logo.setText(imgpath);
          
        }
        
    }//GEN-LAST:event_btn_logoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {            
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
                new ComRegCand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_logo;
    private javax.swing.JButton btn_reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_logo;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_tp;
    // End of variables declaration//GEN-END:variables
}
