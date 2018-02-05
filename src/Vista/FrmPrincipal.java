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
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Daryl Ospina
 */
public class FrmPrincipal extends javax.swing.JFrame {

    pnlIniciarSesion pnlIniciarSesion1;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        pnlIniciarSesion1 = new pnlIniciarSesion();
        pnlLogin.setLayout(new BorderLayout(5, 5));
        pnlLogin.add(pnlIniciarSesion1, BorderLayout.CENTER);
        pnlLogin.updateUI();
        lblImagen.setSize(775, 535);
        lblImagen.add(btnBoton);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedorTotal = new javax.swing.JPanel();
        pnlContenedor = new javax.swing.JPanel();
        pnlContenedorLogin = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        pnlContenedorImagen = new javax.swing.JPanel();
        btnBoton = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlContenedorLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(0, 0, 29));
        pnlLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        pnlContenedorLogin.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 590));

        pnlContenedorImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBoton.setBackground(new java.awt.Color(51, 51, 51));
        btnBoton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBoton.setForeground(new java.awt.Color(204, 204, 204));
        btnBoton.setText("JUGAR");
        btnBoton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotonActionPerformed(evt);
            }
        });
        pnlContenedorImagen.add(btnBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59dd4d1fa569b-iloveimg-resized.gif"))); // NOI18N
        lblImagen.setText("La cuenta a sido creada exitodamente.");
        lblImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlContenedorImagen.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 590));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addComponent(pnlContenedorImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContenedorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContenedorImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlContenedorTotalLayout = new javax.swing.GroupLayout(pnlContenedorTotal);
        pnlContenedorTotal.setLayout(pnlContenedorTotalLayout);
        pnlContenedorTotalLayout.setHorizontalGroup(
            pnlContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorTotalLayout.createSequentialGroup()
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlContenedorTotalLayout.setVerticalGroup(
            pnlContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorTotalLayout.createSequentialGroup()
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Main.mensaje(100, 30, "Cargando...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        FrmCrearJuego ventanaCrearJuego = new FrmCrearJuego();
        ventanaCrearJuego.setLocationRelativeTo(null);
        ventanaCrearJuego.setVisible(true);
    }//GEN-LAST:event_btnBotonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Main.mensaje(200, 30, "CERRANDO APLICACIÓN...!!!", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        Main.mensaje(170, 30, "HASTA PRONTO!!!", 3, "/Recursos/Imagenes/Cuenta.png");
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoton;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlContenedorImagen;
    private javax.swing.JPanel pnlContenedorLogin;
    private javax.swing.JPanel pnlContenedorTotal;
    private javax.swing.JPanel pnlLogin;
    // End of variables declaration//GEN-END:variables

    //Metodo Para Cambiar De Color Los Lbl
    public void cambiarColor(JLabel lbl, Color color) {
        lbl.setForeground(color);
    }

    //Metodo Para Actualizar Panel Login
    public void actualizarPanel() {
        pnlLogin.updateUI();
    }

    //Metodo Para Cambiar Cursor
    public void cambiarCursor(int cursor) {
        this.setCursor(cursor);
    }

    //Metodo Para Visualizar Paneles
    public void visualizar(String panel) {
        try {
            pnlLogin.setLayout(new BorderLayout(5, 5));
            int numeroComponentes = pnlLogin.getComponentCount();
            JPanel panelNuevo;
            if (numeroComponentes == 0 && panel.equalsIgnoreCase("inicio")) {
                panelNuevo = new pnlIniciarSesion();
                pnlLogin.add(panelNuevo, BorderLayout.CENTER);
            } else {
                pnlLogin.getComponent(0).setVisible(false);
                if (panel.equalsIgnoreCase("registro") && numeroComponentes > 0) {
                    panelNuevo = new pnlRegistro();
                    if (numeroComponentes == 2) {
                        pnlLogin.remove(1);
                    }
                    pnlLogin.add(panelNuevo, BorderLayout.CENTER);
                } else if (panel.equalsIgnoreCase("olvide")) {
                    panelNuevo = new pnlOlvideContraseña();
                    if (numeroComponentes == 2) {
                        pnlLogin.remove(1);
                    }
                    pnlLogin.add(panelNuevo, BorderLayout.CENTER);
                } else if (panel.equalsIgnoreCase("inicioTotal")) {
                    pnlContenedorTotal.remove(0);
                    pnlContenedorTotal.setLayout(new BorderLayout(5, 5));
                    pnlContenedorTotal.add(pnlContenedor, BorderLayout.CENTER);
                    pnlContenedorTotal.updateUI();
                    visualizar("inicio");
                } else if (panel.equalsIgnoreCase("inicio")) {
                    pnlLogin.getComponent(0).setVisible(true);
                    pnlLogin.getComponent(1).setVisible(false);
                } else if (panel.equalsIgnoreCase("login")) {
                    visualizar("inicio");
                }
            }
            pnlIniciarSesion1.cambiarANormal(pnlIniciarSesion1.getTxtNombreUsu(), pnlIniciarSesion1.getAstNombreUsu());
            pnlIniciarSesion1.recordar(pnlIniciarSesion1.getRecordar());
            pnlLogin.updateUI();
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    /**
     * Metodo Para Vaciar Campos
     *
     * @param texto - sirve para contener o borrar el spam(etiqueta dentro del
     * txt)
     * @param txt - sirve para saber a que txt se hace referencia
     * @param color - sirve para cambiar el color de letra
     */
    public void vaciarCampo(String texto, JTextField txt, Color color) {
        if (txt.getText().trim().equalsIgnoreCase(texto)) {
            txt.setText("");
            txt.setForeground(color);
            txt.setBorder(new EtchedBorder(1));
        } else if (txt.getText().trim().isEmpty()) {
            txt.setText(texto);
            txt.setForeground(color);
        }
    }

}
