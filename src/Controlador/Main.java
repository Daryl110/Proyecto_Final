/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mensaje.MesajeDeTiempo;
import Modelo.Conexion;
import Vista.FrmPrincipal;

/**
 *
 * @author Daryl Ospina
 */
public class Main {

    public static FrmPrincipal ventanaPrincipal = new FrmPrincipal();
    public static Conexion conec = new Conexion("juego", "mariadb", "//localhost:3306/");
    public static CtlUsuario controUsuario = new CtlUsuario();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ventanaPrincipal = new FrmPrincipal();

            ventanaPrincipal.setLocationRelativeTo(null);
            ventanaPrincipal.setVisible(true);
        });
//            musica(ventanaPrincipal);
    }

    //Metodo Para Llamar a Mensaje De Tiempo
    public static void mensaje(int ancho, int alto, String texto, int tiempo, String icon) {
        MesajeDeTiempo msm = new MesajeDeTiempo(null, true, ancho, alto, texto, tiempo, icon);
        msm.setLocationRelativeTo(null);
        msm.setVisible(true);
    }

    //Metodo Para Abrir Ventana Principal
    public static void abrirFrmPrincipal() {
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }

}
