/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import modelo.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO { 
/**
 *
 * @author Juan
 */

    private Connection con;
    
    private BD conn;

    public UsuarioDAO() {
        conn = new BD();
    }
    
    public ArrayList<String> Inicio(String nom_usu, String password) {
        ArrayList<String> resultado = new ArrayList<>();
        Connection con = conn.conexion();
        ResultSet rs = null;

        try {
            PreparedStatement ps = con.prepareStatement("select Nom_usu,Password,cargo from usuario where Nom_usu=? and password=?");
            ps.setString(1, nom_usu);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                resultado.add(rs.getString(1));
                resultado.add(rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}

