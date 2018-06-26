package Inicio;




import controlador.controladorLogin;
import modelo.UsuarioDAO;
import vista.Pantalla_inicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class InicioAplicaccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla_inicio vista = new Pantalla_inicio();
        UsuarioDAO modelo = new UsuarioDAO();
        controladorLogin controlador = new controladorLogin(modelo, vista);
        vista.setVisible(true);
    }
    
}
