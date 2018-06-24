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
    Connection conect;
    Statement stSentenciasSQL;
    ResultSet rsDatosResultado;
    public Connection conexion(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conect=DriverManager.getConnection("jdbc:oracle:thin:PROYECTO/123456@localhost:1521:XE");
            stSentenciasSQL = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR DE CONEXION"+e);
        }
        
        return conect;
        
    }
    public void ejecutar(String sql) throws SQLException {
        stSentenciasSQL.execute(sql);
    }
    
}
    
    
