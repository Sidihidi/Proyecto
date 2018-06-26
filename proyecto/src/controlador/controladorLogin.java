/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.UsuarioDAO;
import vista.Pantalla_inicio;
import modelo.Usuario;
import vista.MenuAdministrador;
import vista.consultas;
import Inicio.InicioAplicaccion;
/**
 *
 * @author User
 */
public class controladorLogin implements ActionListener, WindowListener {
    private UsuarioDAO modelo;
    private Pantalla_inicio vista;
    
    public controladorLogin(UsuarioDAO modelo, Pantalla_inicio vista){
        this.modelo=modelo;
        this.vista=vista;       
    }
    
    String Usuario= null;
    String password = null;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            /**
             * Entra aquí si se ha pulsado un JButton.
             */
            JButton BTN_ACEPTAR = (JButton) e.getSource();

            switch (BTN_ACEPTAR.getActionCommand()) {
                case "SIGNIN":
                    /**
                     * Entra aquí se ha hecho clic en el botón de Iniciar sesión.
                     */
                    boolean Inicio = this.modelo. Inicio(this.vista.TXT_USUARIO.getText(), new String(this.vista.TXT_CONTRASEÑA.getPassword()));
                    if(Inicio){
          
                    if(Usuario.equals("admin")){
                        MenuAdministrador open = new MenuAdministrador();
                        open.show();
                        this.vista.dispose();
                        System.out.println("Administrador");
                    }
                    if(Usuario.equals("Usuario")){
                        consultas op = new consultas();
                        op.show();
                        this.vista.dispose();
                        System.out.println("Usuario");
                    }
                   
                    }else {
                      JOptionPane.showMessageDialog(null, "Error al realizar el login");  
                    }           
        }                   
    }
         
    }
    @Override
    public void windowOpened(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }
}