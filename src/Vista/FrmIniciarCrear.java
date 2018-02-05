/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Main;
import Vista.Login.pnlIniciarSesion;
import Vista.Login.pnlOlvideContraseña;
import Vista.Login.pnlRegistro;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Daryl Ospina
 */
public class FrmIniciarCrear extends javax.swing.JFrame {

    private final String idJuego;
    private final int participantes;
    private JFrame padre;

    /**
     * Creates new form FrmJuego
     *
     * @param idJuego
     * @param participantes
     */
    public FrmIniciarCrear(String idJuego, int participantes) {
        initComponents();
        this.idJuego = idJuego;
        this.participantes = participantes;
    }

    public FrmIniciarCrear(String idJuego, int participantes, JFrame padre) {
        initComponents();
        this.idJuego = idJuego;
        this.participantes = participantes;
        this.padre = padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlContenedor.setBackground(new java.awt.Color(0, 0, 29));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        visualizar("inicio");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables

    //Metodo Para Visualizar Paneles
    public void visualizar(String panel) {
        try {
            pnlContenedor.setLayout(new BorderLayout(5, 5));
            int numeroComponentes = pnlContenedor.getComponentCount();
            JPanel panelNuevo;
            if (numeroComponentes == 0 && panel.equalsIgnoreCase("inicio")) {
                if (padre != null) {
                    panelNuevo = new pnlIniciarSesion(idJuego, participantes, padre);
                } else {
                    panelNuevo = new pnlIniciarSesion(idJuego, participantes);
                }
                pnlContenedor.add(panelNuevo, BorderLayout.CENTER);
            } else {
                pnlContenedor.getComponent(0).setVisible(false);
                if (panel.equalsIgnoreCase("registro") && numeroComponentes > 0) {
                    panelNuevo = new pnlRegistro();
                    if (numeroComponentes == 2) {
                        pnlContenedor.remove(1);
                    }
                    pnlContenedor.add(panelNuevo, BorderLayout.CENTER);
                } else if (panel.equalsIgnoreCase("olvide")) {
                    panelNuevo = new pnlOlvideContraseña();
                    if (numeroComponentes == 2) {
                        pnlContenedor.remove(1);
                    }
                    pnlContenedor.add(panelNuevo, BorderLayout.CENTER);
                } else if (panel.equalsIgnoreCase("inicio")) {
                    if (padre != null) {
                        panelNuevo = new pnlIniciarSesion(idJuego, participantes, padre);
                        pnlContenedor.add(panelNuevo, BorderLayout.CENTER);
                    } else {
                        pnlContenedor.getComponent(0).setVisible(true);
                        pnlContenedor.getComponent(1).setVisible(false);
                    }
                } else if (panel.equalsIgnoreCase("inicio")) {
                    visualizar("inicio");
                }
            }
            pnlContenedor.updateUI();
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    //Metodo Para Cambiar Cursor
    public void cambiarCursor(int cursor) {
        this.setCursor(cursor);
    }

    private void cerrar() {
        this.dispose();
        Main.mensaje(115, 30, "Cancelando...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        if (padre != null) {
            padre.setVisible(true);
        } else {
            Main.abrirFrmPrincipal();
        }
    }
}