/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class BD {
    private Connection con;
    
    public BD(){   
    }
    public Connection conexion(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:PROYECTO/123456@localhost:1521:XE");   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR DE CONEXION"+e);
        }
        
        return con;
        
    }
    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Excepción de SQL", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    
}
    
    
