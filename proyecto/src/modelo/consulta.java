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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Juan
 */
public class consulta {
    Connection cn;
    public String Marca,modelo,precio_de_venta_nuevo,pais,unidades,año_de_fabricacion,cv,bloque,cilindro,tipo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio_de_venta_nuevo() {
        return precio_de_venta_nuevo;
    }

    public void setPrecio_de_venta_nuevo(String precio_de_venta_nuevo) {
        this.precio_de_venta_nuevo = precio_de_venta_nuevo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getAño_de_fabricacion() {
        return año_de_fabricacion;
    }

    public void setAño_de_fabricacion(String año_de_fabricacion) {
        this.año_de_fabricacion = año_de_fabricacion;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getCilindro() {
        return cilindro;
    }

    public void setCilindro(String cilindro) {
        this.cilindro = cilindro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public consulta(){
        BD con = new BD();
        cn= con.conexion();
    }
    
    public void consulta() throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        try{
            String coche;
            
         PreparedStatement cmd = cn.prepareStatement("SELECT MARCA,MODELO,PRECIO_DE_VENTA_NUEVO,PAIS,UNIDADES,AÑO_DE_FABRICACION,CV,BLOQUE,CILINDROS,TIPO\n" +
         "FROM COCHES C, FABRICADOS F, MOTOR M\n" +
         "WHERE (C.ID_COCHE = F.ID_COCHE) and (C.ID_COCHE = M.ID_COCHE) and (MARCA=?) and (MODELO=?);");
         cmd.setString(1,getMarca());
         ResultSet rs = cmd.executeQuery() ;
         
         
         if(rs.next()){
             coche = rs.getString(1);
             this.setPrecio_de_venta_nuevo(rs.getString(2));
             this.setPais(rs.getString(3));
             this.setUnidades(rs.getString(4));
             this.setAño_de_fabricacion(rs.getString(5));
             this.setCv(rs.getString(6));
             this.setBloque(rs.getString(7));
             this.setCilindro(rs.getString(8));
             this.setTipo(rs.getString(9));
         }  
         } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
       
    }

