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

/**
 *
 * @author User
 */
public class consultaDAO {
    private Connection con;
    
    private BD conn;
    
    public consultaDAO(){
        conn = new BD();
    }
    
    public ArrayList<String> consulta(String marca, String modelo, String precio_de_venta_nuevo, String pais, String unidades, String año_de_fabricacion, String CV, String bloque, String cilindros, String tipo){
        ArrayList<String> resultado = new ArrayList<>();
        Connection con = conn.conexion();
        ResultSet rs = null;
        
        try{
            PreparedStatement ps = con.prepareStatement("SELECT MARCA,MODELO,PRECIO_DE_VENTA_NUEVO,PAIS,UNIDADES,AÑO_DE_FABRICACION,CV,BLOQUE,CILINDROS,TIPO\n" +
         "FROM COCHES C, FABRICADOS F, MOTOR M\n" +
         "WHERE (C.ID_COCHE = F.ID_COCHE) and (C.ID_COCHE = M.ID_COCHE) and (MARCA=?) and (MODELO=?);");
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setString(3, precio_de_venta_nuevo);
            ps.setString(4, pais);
            ps.setString(5, unidades);
            ps.setString(6, año_de_fabricacion);
            ps.setString(7, CV);
            ps.setString(8, bloque);
            ps.setString(9, cilindros);
            ps.setString(10,tipo);
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
