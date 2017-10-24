/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import Controlador.Main;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daryl Ospina
 */
public class pnlOlvideContraseña extends javax.swing.JPanel {

    /**
     * Creates new form pnlOlvideContraseña
     */
    public pnlOlvideContraseña() {
        initComponents();
        cbPreguntaS.setModel(Main.controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
        notaVisible(false);
        lblAstCedula.setVisible(false);
        lblAstContra.setVisible(false);
        lblAstPreg.setVisible(false);
        lblAstRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCedula = new javax.swing.JTextField();
        lblIcono = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        cbPreguntaS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        btnCrearUsu = new javax.swing.JButton();
        lblAstCedula = new javax.swing.JLabel();
        lblAstPreg = new javax.swing.JLabel();
        lblAstRes = new javax.swing.JLabel();
        lblAstContra = new javax.swing.JLabel();
        lblCampos = new javax.swing.JLabel();
        lblObligatorios = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 29));

        txtCedula.setBackground(new java.awt.Color(51, 51, 51));
        txtCedula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(204, 204, 204));
        txtCedula.setText("Cedula");
        txtCedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cropped-cropped-logoeam.png"))); // NOI18N

        lblIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(51, 153, 255));
        lblIniciarSesion.setText("Iniciar Sesión");
        lblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseExited(evt);
            }
        });

        cbPreguntaS.setBackground(new java.awt.Color(51, 51, 51));
        cbPreguntaS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbPreguntaS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una pregunta de seguridad" }));
        cbPreguntaS.setToolTipText("Seleccione una pregunta de seguridad");
        cbPreguntaS.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51))));
        cbPreguntaS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPreguntaS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbPreguntaSFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pregunta de seguridad:");

        txtRespuesta.setBackground(new java.awt.Color(51, 51, 51));
        txtRespuesta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(204, 204, 204));
        txtRespuesta.setText("Respuesta");
        txtRespuesta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRespuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespuestaFocusLost(evt);
            }
        });

        txtContrasena.setBackground(new java.awt.Color(51, 51, 51));
        txtContrasena.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasena.setText("Contraseña Nueva");
        txtContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });

        btnCrearUsu.setBackground(new java.awt.Color(51, 51, 51));
        btnCrearUsu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCrearUsu.setForeground(new java.awt.Color(204, 204, 204));
        btnCrearUsu.setText("Cambiar Contraseña");
        btnCrearUsu.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnCrearUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuActionPerformed(evt);
            }
        });

        lblAstCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblAstPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblAstRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblAstContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblCampos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCampos.setForeground(new java.awt.Color(255, 255, 255));
        lblCampos.setText("Los Campos con asteriscos");

        lblObligatorios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblObligatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblObligatorios.setText("son Obligatorios.");

        lblNota.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 0, 0));
        lblNota.setText("Nota:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblIniciarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPreguntaS, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAstPreg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAstCedula))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAstRes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAstContra)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblObligatorios))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCampos)))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrearUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblAstCedula)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPreguntaS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblAstPreg)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblAstRes)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblAstContra)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota)
                    .addComponent(lblCampos))
                .addGap(5, 5, 5)
                .addComponent(lblObligatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCrearUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblIniciarSesion)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseClicked
        // TODO add your handling code here:
        Main.ventanaPrincipal.visualizar("login");
    }//GEN-LAST:event_lblIniciarSesionMouseClicked

    private void txtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusGained
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.WHITE);
        lblAstCedula.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_txtCedulaFocusGained

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.lightGray);
    }//GEN-LAST:event_txtCedulaFocusLost

    private void lblIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseEntered
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, Color.yellow);
        Main.ventanaPrincipal.cambiarCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_lblIniciarSesionMouseEntered

    private void lblIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseExited
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, new Color(51, 153, 255));
        Main.ventanaPrincipal.cambiarCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_lblIniciarSesionMouseExited

    private void txtRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRespuestaFocusGained
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Respuesta", txtRespuesta, Color.WHITE);
        lblAstRes.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_txtRespuestaFocusGained

    private void txtRespuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRespuestaFocusLost
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Respuesta", txtRespuesta, Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtRespuestaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Contraseña Nueva", txtContrasena, Color.WHITE);
        lblAstContra.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Contraseña Nueva", txtContrasena, Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void btnCrearUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            //Metodo Para Cambiar Contraseña
            if (Main.controUsuario.validarCampo(txtCedula.getText(), "cedula", "usuario")) {
                
            }else{
                JOptionPane.showMessageDialog(null, "");
            }
        }
    }//GEN-LAST:event_btnCrearUsuActionPerformed

    private void cbPreguntaSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbPreguntaSFocusGained
        // TODO add your handling code here:
        cbPreguntaS.setBorder(new CompoundBorder(new LineBorder(new Color(51, 51, 51)), new EtchedBorder(1)));
        lblAstPreg.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_cbPreguntaSFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsu;
    private javax.swing.JComboBox<String> cbPreguntaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAstCedula;
    private javax.swing.JLabel lblAstContra;
    private javax.swing.JLabel lblAstPreg;
    private javax.swing.JLabel lblAstRes;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblObligatorios;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables

    //Metodo Para Validar Campos
    private boolean validar() {
        LineBorder b = new LineBorder(Color.red, 1);
        boolean bool = false;
        if (txtCedula.getText().isEmpty() || txtCedula.getText().equalsIgnoreCase("Cedula")) {
            txtCedula.setBorder(b);
            lblAstCedula.setVisible(true);
            bool = true;
        }
        if (txtContrasena.getText().isEmpty() || txtContrasena.getText().equalsIgnoreCase("Contraseña Nueva")) {
            txtContrasena.setBorder(b);
            lblAstContra.setVisible(true);
            bool = true;
        }
        if (txtRespuesta.getText().isEmpty() || txtRespuesta.getText().equalsIgnoreCase("Respuesta")) {
            txtRespuesta.setBorder(b);
            lblAstRes.setVisible(true);
            bool = true;
        }
        if (cbPreguntaS.getSelectedIndex() == 0) {
            cbPreguntaS.setBorder(new CompoundBorder(b, new EtchedBorder(1)));
            lblAstPreg.setVisible(true);
            bool = true;
        }
        return !notaVisible(bool);
    }

    //Metodo Para Visualizar Nota
    private boolean notaVisible(boolean bool) {
        lblNota.setVisible(bool);
        lblCampos.setVisible(bool);
        lblObligatorios.setVisible(bool);
        return bool;
    }
}
