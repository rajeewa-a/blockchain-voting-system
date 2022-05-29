/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem;

import static com.rajeewa.blockchainvotingsystem.Main.decrypt;
import com.rajeewa.blockchainvotingsystem.block.Block;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SealedObject;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author Rajeewa Asmadala
 */
public class ClientManager extends NetworkManager {

	private Socket _socket = null;
	private Block genesisBlock;
	private ArrayList<SealedObject> blockList;
	private ArrayList<String> candidates;
	private HashSet<String> hashVotes;
	private int prevHash=0;
        
	private int clientId;
        private Statement st1;
        private ResultSet rs1;
        String candidateN;
        String voterId;
        
        Connection conn;
        PreparedStatement pst;
        ArrayList<String> candlist = new ArrayList<>();
        ArrayList<Blob> logolist = new ArrayList<>();
        List<JToggleButton> candbtn = new ArrayList<>();
        List<JLabel> candlbl = new ArrayList<>();
        

	public ClientManager(String addr, int port) {
            
                
		try {   
			_socket = new Socket(addr, port);
			System.out.println("Connected to server: " + addr + ":" + port);
			genesisBlock=new Block(0, "", "");
			hashVotes=new HashSet<>();
			candidates = new ArrayList<>();
			candidates.add("Rajeewa");
			candidates.add("Rojeewa");
			candidates.add("Rijeewa");

			blockList=new ArrayList<>();
			blockList.add(encrypt(genesisBlock));
		} catch (IOException e) {
			System.out.println("Cannot connect to server " + addr + ":" + port);
			e.setStackTrace(e.getStackTrace());
			System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//                Client cl1 = new Client();
//                cl1.setVisible(true);

                try {
                    conn = SqlConn.connect();
                    } catch (Exception ex) {
                        Logger.getLogger(ComRegOff.class.getName()).log(Level.SEVERE, null, ex);
                    }
	}
        

	public void startClient() throws SQLException, IOException {
            
           
            
            
            
            
        //Voting UI
                        
         JFrame mainFrame;         
         JPanel pnl_top;
         JLabel lbl_logo;
         JLabel lbl_heading;
         JLabel lbl_electioncomm;
         JPanel pnl_left;
         JLabel lbl_nic;
         JLabel lbl_secret;
         JTextField txt_nic1;
         JTextField txt_secret;
         JButton btn_enter;
         JPanel pnl_right;
         JToggleButton tglbtn_cand1 = null;
         JToggleButton tglbtn_cand2 = null;
         JToggleButton tglbtn_cand3 = null;
         JToggleButton tglbtn_cand4 = null;
         JToggleButton tglbtn_cand5 = null;
         JToggleButton tglbtn_cand6;
         JToggleButton tglbtn_cand7;
         JToggleButton tglbtn_cand8;
         JToggleButton tglbtn_cand9;
         JToggleButton tglbtn_cand10;
         JToggleButton tglbtn_cand11;
         JToggleButton tglbtn_cand12;
         JToggleButton tglbtn_cand13;
         JToggleButton tglbtn_cand14;
         JToggleButton tglbtn_cand15;
         JLabel lbl_cand1;
         JLabel lbl_cand2;
         JLabel lbl_cand3;
         JLabel lbl_cand4;
         JLabel lbl_cand5;
         JLabel lbl_cand6;
         JLabel lbl_cand7;
         JLabel lbl_cand8;
         JLabel lbl_cand9;
         JLabel lbl_cand10;
         JLabel lbl_cand11;
         JLabel lbl_cand12;
         JLabel lbl_cand13;
         JLabel lbl_cand14;
         JLabel lbl_cand15;
         JButton btn_vote;
         JButton btn_clear;
         JLabel lbl_instruct;
         
       

      mainFrame = new JFrame("MyFrame");
      mainFrame.setSize(1246,800);
      mainFrame.setLocationRelativeTo(null);
      mainFrame.setResizable(false);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent windowEvent){
            close();
         }        
      });    

        pnl_top = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_heading = new javax.swing.JLabel();
        lbl_electioncomm = new javax.swing.JLabel();
        pnl_left = new javax.swing.JPanel();
        lbl_nic = new javax.swing.JLabel();
        lbl_secret = new javax.swing.JLabel();
        txt_secret = new javax.swing.JTextField();
        txt_nic1 = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        pnl_right = new javax.swing.JPanel();
        tglbtn_cand1 = new javax.swing.JToggleButton();
        lbl_cand1 = new javax.swing.JLabel();
        lbl_cand2 = new javax.swing.JLabel();
        tglbtn_cand2 = new javax.swing.JToggleButton();
        lbl_cand3 = new javax.swing.JLabel();
        tglbtn_cand3 = new javax.swing.JToggleButton();
        lbl_cand4 = new javax.swing.JLabel();
        tglbtn_cand4 = new javax.swing.JToggleButton();
        lbl_cand5 = new javax.swing.JLabel();
        tglbtn_cand5 = new javax.swing.JToggleButton();
        lbl_cand6 = new javax.swing.JLabel();
        tglbtn_cand6 = new javax.swing.JToggleButton();
        lbl_cand7 = new javax.swing.JLabel();
        tglbtn_cand7 = new javax.swing.JToggleButton();
        lbl_cand8 = new javax.swing.JLabel();
        tglbtn_cand8 = new javax.swing.JToggleButton();
        lbl_cand9 = new javax.swing.JLabel();
        tglbtn_cand9 = new javax.swing.JToggleButton();
        lbl_cand10 = new javax.swing.JLabel();
        tglbtn_cand10 = new javax.swing.JToggleButton();
        lbl_cand11 = new javax.swing.JLabel();
        tglbtn_cand11 = new javax.swing.JToggleButton();
        lbl_cand12 = new javax.swing.JLabel();
        tglbtn_cand12 = new javax.swing.JToggleButton();
        lbl_cand13 = new javax.swing.JLabel();
        tglbtn_cand13 = new javax.swing.JToggleButton();
        lbl_cand14 = new javax.swing.JLabel();
        tglbtn_cand14 = new javax.swing.JToggleButton();
        lbl_cand15 = new javax.swing.JLabel();
        tglbtn_cand15 = new javax.swing.JToggleButton();
        btn_vote = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_instruct = new javax.swing.JLabel();
        
        
         candbtn.add(tglbtn_cand1);
         candbtn.add(tglbtn_cand2);
         candbtn.add(tglbtn_cand3);
         candbtn.add(tglbtn_cand4);
         candbtn.add(tglbtn_cand5);
         candbtn.add(tglbtn_cand6);
         candbtn.add(tglbtn_cand7);
         candbtn.add(tglbtn_cand8);
         candbtn.add(tglbtn_cand9);
         candbtn.add(tglbtn_cand10);
         candbtn.add(tglbtn_cand11);
         candbtn.add(tglbtn_cand12);
         candbtn.add(tglbtn_cand13);
         candbtn.add(tglbtn_cand14);
         candbtn.add(tglbtn_cand15);
         
         
         candlbl.add(lbl_cand1);
         candlbl.add(lbl_cand2);
         candlbl.add(lbl_cand3);
         candlbl.add(lbl_cand4);
         candlbl.add(lbl_cand5);
         candlbl.add(lbl_cand6);
         candlbl.add(lbl_cand7);
         candlbl.add(lbl_cand8);
         candlbl.add(lbl_cand9);
         candlbl.add(lbl_cand10);
         candlbl.add(lbl_cand11);
         candlbl.add(lbl_cand12);
         candlbl.add(lbl_cand13);
         candlbl.add(lbl_cand14);
         candlbl.add(lbl_cand15);
         
         pnl_right.setVisible(false);
         
         try {
            
                st1 = conn.createStatement();
                rs1=st1.executeQuery("SELECT * FROM candidates");
                
                while (rs1.next()) {  

                    String id = rs1.getString("name");
                    candlist.add(id);
                    
                    Blob logo = rs1.getBlob("logo");
                    logolist.add(logo);
                    
                }


                 } catch (Exception e) {

                JOptionPane.showMessageDialog(null,"Failed to Connect to Database","Error Connection", JOptionPane.WARNING_MESSAGE);  

                }
         
         
         
         for( JToggleButton tbtn : candbtn){
             tbtn.setVisible(false);
    
         }
         
         for( JLabel lbl : candlbl){
             lbl.setVisible(false);
         }
         
         for(int i=0; i < candlist.size(); i++){
             String name = candlist.get(i);
             candbtn.get(i).setText(name);
             candbtn.get(i).setVisible(true);
             
             Blob blob = logolist.get(i);
             InputStream in = blob.getBinaryStream();
             BufferedImage img = ImageIO.read(in);
             
             candlbl.get(i).setIcon(new ImageIcon(img));
             candlbl.get(i).setVisible(true);
         }
         
         
         

//        mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_top.setBackground(new java.awt.Color(255, 255, 255));
        pnl_top.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_logo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajeewa Asmadala\\Pictures\\emblemNew.jpg")); // NOI18N

        lbl_heading.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        lbl_heading.setText("Presidential Election 2022 - Sri Lanka\n");
        lbl_heading.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_electioncomm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_electioncomm.setText("|    Election Commission of Sri Lanka");

        javax.swing.GroupLayout pnl_topLayout = new javax.swing.GroupLayout(pnl_top);
        pnl_top.setLayout(pnl_topLayout);
        pnl_topLayout.setHorizontalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_topLayout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_electioncomm)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnl_topLayout.setVerticalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_electioncomm)
                .addGap(22, 22, 22))
        );

        mainFrame.getContentPane().add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, -1));

        pnl_left.setBackground(new java.awt.Color(152, 193, 217));
        pnl_left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_nic.setText("Enter Your NIC:");

        lbl_secret.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_secret.setText("Enter Your Secret Key:");

        txt_secret.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txt_secret.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_secret.addActionListener((java.awt.event.ActionEvent evt) -> {
//            txt_secretActionPerformed(evt);
         });

        txt_nic1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txt_nic1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_enter.setBackground(new java.awt.Color(255, 255, 255));
        btn_enter.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_enter.setText("ENTER");
        btn_enter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_enter.addActionListener((java.awt.event.ActionEvent evt) -> {
            
            
            try {
            String query = ("SELECT * FROM voters where nic=? AND pin=?");
            pst = conn.prepareStatement(query);
            pst.setString(1,txt_nic1.getText());
            pst.setInt(2,Integer.parseInt(txt_secret.getText()));

            ResultSet rs = pst.executeQuery(); 

        if(!rs.next()) {
              JOptionPane.showMessageDialog(null, "Invalid Credentials!"); 
              
        } else {
            
                    //authentication success
                    pnl_right.setVisible(true);
                    txt_nic1.setEnabled(false);
                    txt_secret.setEnabled(false);
                    btn_enter.setEnabled(false);
        }

         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, "Try again!"); 
         }
         });

        javax.swing.GroupLayout pnl_leftLayout = new javax.swing.GroupLayout(pnl_left);
        pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leftLayout.createSequentialGroup()
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nic1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_secret, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_secret))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leftLayout.createSequentialGroup()
                        .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leftLayout.createSequentialGroup()
                        .addComponent(lbl_nic)
                        .addGap(91, 91, 91))))
        );
        pnl_leftLayout.setVerticalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lbl_nic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nic1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbl_secret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_secret, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        mainFrame.getContentPane().add(pnl_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        pnl_right.setBackground(new java.awt.Color(224, 251, 252));
        pnl_right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tglbtn_cand1.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand1.setText("Rajeewa Asmadala");
        tglbtn_cand1.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand1ActionPerformed(evt);
         });

        lbl_cand1.setBackground(new java.awt.Color(204, 204, 255));
//        lbl_cand1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajeewa Asmadala\\Downloads\\icons8-kermit-the-frog-50.png")); // NOI18N

        lbl_cand2.setBackground(new java.awt.Color(204, 204, 255));
//        lbl_cand2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajeewa Asmadala\\Downloads\\icons8-kermit-the-frog-50.png")); // NOI18N

        tglbtn_cand2.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand2.setText("Candidate ");
        tglbtn_cand2.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand2ActionPerformed(evt);
         });

        lbl_cand3.setBackground(new java.awt.Color(204, 204, 255));
//        lbl_cand3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajeewa Asmadala\\Downloads\\icons8-kermit-the-frog-50.png")); // NOI18N
        lbl_cand3.setText("LOGO");

        tglbtn_cand3.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand3.setText("Candidate ");
        tglbtn_cand3.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand3ActionPerformed(evt);
         });

        lbl_cand4.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand4.setToolTipText("");

        tglbtn_cand4.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand4.setText("Candidate ");
        tglbtn_cand4.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand4ActionPerformed(evt);
         });

        lbl_cand5.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand5.setToolTipText("");

        tglbtn_cand5.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand5.setText("Candidate ");
        tglbtn_cand5.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand5ActionPerformed(evt);
         });

        lbl_cand6.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand6.setToolTipText("");

        tglbtn_cand6.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand6.setText("Candidate ");
        tglbtn_cand6.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand6ActionPerformed(evt);
         });

        lbl_cand7.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand7.setToolTipText("");

        tglbtn_cand7.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand7.setText("Candidate ");
        tglbtn_cand7.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand7ActionPerformed(evt);
         });

        lbl_cand8.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand8.setToolTipText("");

        tglbtn_cand8.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand8.setText("Candidate ");
        tglbtn_cand8.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand8ActionPerformed(evt);
         });

        lbl_cand9.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand9.setToolTipText("");

        tglbtn_cand9.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand9.setText("Candidate ");
        tglbtn_cand9.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand9ActionPerformed(evt);
         });

        lbl_cand10.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand10.setToolTipText("");

        tglbtn_cand10.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand10.setText("Candidate ");
        tglbtn_cand10.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand10ActionPerformed(evt);
         });

        lbl_cand11.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand11.setToolTipText("");

        tglbtn_cand11.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand11.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand11.setText("Candidate ");
        tglbtn_cand11.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand11ActionPerformed(evt);
         });

        lbl_cand12.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand12.setToolTipText("");

        tglbtn_cand12.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand12.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand12.setText("Candidate ");
        tglbtn_cand12.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand12ActionPerformed(evt);
         });

        lbl_cand13.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand13.setToolTipText("");

        tglbtn_cand13.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand13.setText("Candidate ");
        tglbtn_cand13.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand13ActionPerformed(evt);
         });

        lbl_cand14.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand14.setToolTipText("");

        tglbtn_cand14.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand14.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand14.setText("Candidate ");
        tglbtn_cand14.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand14ActionPerformed(evt);
         });

        lbl_cand15.setBackground(new java.awt.Color(204, 204, 255));
        lbl_cand15.setToolTipText("");

        tglbtn_cand15.setBackground(new java.awt.Color(255, 255, 255));
        tglbtn_cand15.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
//        tglbtn_cand15.setText("Candidate ");
        tglbtn_cand15.addActionListener((java.awt.event.ActionEvent evt) -> {
//            tglbtn_cand15ActionPerformed(evt);
         });

        btn_vote.setBackground(new java.awt.Color(233, 212, 96));
        btn_vote.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_vote.setText("VOTE");
        btn_vote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_vote.addActionListener((java.awt.event.ActionEvent evt) -> {
            
            int count = 0;
            Block blockObj=null;
            voterId = txt_nic1.getText();
            
            
            for( JToggleButton tbtn : candbtn){
             if(tbtn.isSelected()){
                 count = count + 1;
                }
            }
            
            if (count==1){            
                
                    for( JToggleButton tbtn : candbtn){
                        if(tbtn.isSelected()){
                           candidateN = tbtn.getText();
                        }
                    }
                    
                    
                    try {	

				blockObj=new Block(prevHash, voterId, candidateN);

				if(checkValidity(blockObj)) {
					hashVotes.add(voterId);
					sendMsg(new MessageStruct( 1,encrypt(blockObj) ));

					prevHash=blockObj.getBlockHash();
					blockList.add(encrypt(blockObj));
					//add
                                        
                                        JOptionPane.showMessageDialog(null,"Vote successfully sent!","Success", JOptionPane.INFORMATION_MESSAGE);
                                        
                                        for( JToggleButton tbtn : candbtn){
                                            tbtn.setSelected(false);
                                        }
                                        
                                        pnl_right.setVisible(false);
                                        txt_nic1.setEnabled(true);
                                        txt_nic1.setText("");
                                        txt_secret.setEnabled(true);
                                        txt_secret.setText("");
                                        btn_enter.setEnabled(true);
                                        
                                        
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid!","Invalid", JOptionPane.INFORMATION_MESSAGE);
                                        
                                        for( JToggleButton tbtn : candbtn){
                                            tbtn.setSelected(false);
                                        }
                                        
                                        pnl_right.setVisible(false);
                                        txt_nic1.setEnabled(true);
                                        txt_nic1.setText("");
                                        txt_secret.setEnabled(true);
                                        txt_secret.setText("");
                                        btn_enter.setEnabled(true);
				}

			} catch (IOException e) {
//				System.out.println("ERROR: read line failed!");
				return;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                
  
            }else {
                JOptionPane.showMessageDialog(null,"Vote successfully sent BLIN!","Success", JOptionPane.INFORMATION_MESSAGE);
                
                    for( JToggleButton tbtn : candbtn){
                        tbtn.setSelected(false);
                    }
                                        
                pnl_right.setVisible(false);
                txt_nic1.setEnabled(true);
                txt_nic1.setText("");
                txt_secret.setEnabled(true);
                txt_secret.setText("");
                btn_enter.setEnabled(true);
            }

              
         });

        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btn_clear.setText("Clear Selection");
        btn_clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_clear.addActionListener((java.awt.event.ActionEvent evt) -> {
            
            for( JToggleButton tbtn : candbtn){
                        tbtn.setSelected(false);
                    }
            
         });

        lbl_instruct.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_instruct.setText("Please Select Candidate(s) of Your Choice and Press Vote to Cast Your Vote.");

        javax.swing.GroupLayout pnl_rightLayout = new javax.swing.GroupLayout(pnl_right);
        pnl_right.setLayout(pnl_rightLayout);
        pnl_rightLayout.setHorizontalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btn_vote, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(pnl_rightLayout.createSequentialGroup()
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rightLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57)
                        .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rightLayout.createSequentialGroup()
                                    .addComponent(lbl_cand8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tglbtn_cand8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_rightLayout.createSequentialGroup()
                                .addComponent(lbl_cand15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tglbtn_cand15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_rightLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(lbl_instruct)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnl_rightLayout.setVerticalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rightLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_instruct, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tglbtn_cand1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_cand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_cand15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglbtn_cand15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vote, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );


        mainFrame.getContentPane().add(pnl_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 930, -1));

        mainFrame.pack();    
              
        mainFrame.setVisible(true);
        
        
    }                



        
        
	public SealedObject encrypt(Block b) throws Exception
	{
		SecretKeySpec sks = new SecretKeySpec("MyDifficultPassw".getBytes(), "AES");

		// Create cipher
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

		//write object to file
		cipher.init( Cipher.ENCRYPT_MODE, sks );

		return new SealedObject( b, cipher);
	}

	private boolean checkValidity(Block blockObj) {
		// TODO Auto-generated method stub
		if( hashVotes.contains((String)blockObj.getVoteObj().getVoterId() ))
			return false;
		else
			return true;
	}

	public void sendMsg(MessageStruct msg) throws IOException {
		sendMsg(_socket, msg);
	}

	// Close the socket to exit.
	public void close() {

		String userHomePath = System.getProperty("user.home");
		String fileName;
		fileName=userHomePath+"/Desktop/vote_data";
		File f=new File(fileName);

		try
		{
			if(!f.exists())
				f.createNewFile();
			else {
				f.delete();
				f.createNewFile();
			}

                        f.setExecutable(true);
                        f.setReadable(true);
                        f.setWritable(true);
                        
			System.out.println(fileName);

			ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(fileName,true));
			o.writeObject(blockList);

			o.close();

			_socket.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.exit(0);
	}

	@Override
	public void msgHandler(MessageStruct msg, Socket src) {
		switch (msg._code) {
			case 0:
				try {

					blockList.add((SealedObject)msg._content);

					Block decryptedBlock=(Block) decrypt((SealedObject)msg._content);
					hashVotes.add(decryptedBlock.getVoteObj().getVoterId());

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 1:
				/* message type sent from broadcast to all clients */
				//server manages this
				break;
			case 2:
				clientId=(int)(msg._content);
			default:
				break;
		}
	}

	/*
	 * Running a loop to receive messages from server. If it fails when receiving, the
	 * connections is broken. Close the socket and exit with -1.
	 */
	@Override
	public void run() {
		while(true) {
			try {
				receiveMsg(_socket);

			} catch (ClassNotFoundException | IOException e) {
				if(_socket.isClosed())
				{
					System.out.println("Bye.");
					System.exit(0);
				}

				System.out.println("Connection to server is broken. Please restart client.");
				close(_socket);
				System.exit(-1);
			}
		}
	}
}