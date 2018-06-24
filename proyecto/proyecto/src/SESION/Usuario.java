/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESION;

import modelo.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Usuario {
    Connection cn;
    public String nom_usu,password,cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Usuario(){
        BD con = new BD();
        cn= con.conexion();
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void ingreso(){
        try{
            String id;
            
         PreparedStatement cmd = cn.prepareStatement("select Nom_usu,Password,cargo from usuario where Nom_usu=?");
         cmd.setString(1,getNom_usu());
         ResultSet rs = cmd.executeQuery() ;
         
         if(rs.next()){
             id = rs.getString(1);
             this.setPassword(rs.getString(2));
             this.setCargo(rs.getString(3));
         }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
}
