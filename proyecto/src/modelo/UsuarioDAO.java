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
    
    public boolean Inicio(String nom_usu, String password) {
       
        boolean valido = false;
        int existe=0;

        if (password == null) {
            Connection con = conn.conexion();
            ResultSet rs = null;
            try {
                PreparedStatement ps = con.prepareStatement("select Nom_usu,Password,cargo from usuario where Nom_usu=?");
                ps.setString(1, nom_usu);
                rs = ps.executeQuery();
                while(rs.next()) {
                    existe++;
                }
                if (existe == 1) {
                    valido = true;
                }
            } catch (SQLException e) {

            }
        } else {
            Connection con = conn.conexion();
            ResultSet rs=null;
            try {
                PreparedStatement ps = con.prepareStatement("SELECT password FROM usuario WHERE nom_usu = ?");
                ps.setString(1, nom_usu);
                rs = ps.executeQuery();
                if (rs.next()) {
                    if (rs.getString(1).equals(password)) {
                        valido = true;
                    } else {
                        valido = false;
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "UsuarioDAO: SQLException", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass(), "UsuarioDAO", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    rs.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "UsuarioDAO: SQLException", JOptionPane.ERROR_MESSAGE);
                }
                conn.closeConnection(con);
            }
        }


        return valido;
    }
}

