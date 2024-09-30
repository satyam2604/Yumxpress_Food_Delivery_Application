/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
        private static Connection conn;
        static{
                try{
                    conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-J2NTJFF:1521/xe","yumxpress","satyam");
                    JOptionPane.showMessageDialog(null, "Connection Opened");
                }catch(SQLException ex){
                     JOptionPane.showMessageDialog(null, "Cannot Close the Connection!!");
                     ex.printStackTrace();
                     //System.exit(0);
                }
        }
        public static Connection getConnection(){
            return conn;
        }
        public static void closeConnection(){
            try{
                conn.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Cannot Close the Connection!!");
                     ex.printStackTrace();
            }
}
}
