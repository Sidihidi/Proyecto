package vista;
import modelo.Usuario;
public class Pantalla_inicio extends javax.swing.JFrame {
  
    public Pantalla_inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        USUARIO = new javax.swing.JLabel();
        CONTRASEÑA = new javax.swing.JLabel();
        TXT_USUARIO = new javax.swing.JTextField();
        TXT_CONTRASEÑA = new javax.swing.JPasswordField();
        BTN_ACEPTAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        USUARIO.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        USUARIO.setForeground(new java.awt.Color(255, 255, 255));
        USUARIO.setText("Usuario:");
        getContentPane().add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 70, 30));

        CONTRASEÑA.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        CONTRASEÑA.setForeground(new java.awt.Color(255, 255, 255));
        CONTRASEÑA.setText("Contraseña:");
        getContentPane().add(CONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 30));

        TXT_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_USUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 30));

        TXT_CONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_CONTRASEÑAActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_CONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, 30));

        BTN_ACEPTAR.setBackground(new java.awt.Color(255, 255, 255));
        BTN_ACEPTAR.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        BTN_ACEPTAR.setForeground(new java.awt.Color(0, 0, 0));
        BTN_ACEPTAR.setText("Iniciar Sesion");
        BTN_ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ACEPTARActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_ACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/milky-way-2948284_640.jpg"))); // NOI18N
        jLabel1.setText("Fondo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TXT_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_USUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_USUARIOActionPerformed

    private void TXT_CONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_CONTRASEÑAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_CONTRASEÑAActionPerformed

    private void BTN_ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ACEPTARActionPerformed

    }//GEN-LAST:event_BTN_ACEPTARActionPerformed

    
    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_ACEPTAR;
    private javax.swing.JLabel CONTRASEÑA;
    public javax.swing.JPasswordField TXT_CONTRASEÑA;
    public javax.swing.JTextField TXT_USUARIO;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
