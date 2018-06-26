/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author Juan
 */
public class consulta {
   
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
}