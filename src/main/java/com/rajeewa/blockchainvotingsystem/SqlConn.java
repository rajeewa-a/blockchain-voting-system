/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rajeewa Asmadala
 */
public class SqlConn {
    public static Connection connect() throws Exception
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/slelection2022?useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            return conn;
        }
    
    catch (Exception e)
    {
        throw e;
    }
    }
}
