/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import Controlador.CtlUsuario;
import Controlador.Main;
import Vista.FrmPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.*;

/**
 *
 * @author Daryl Ospina
 */
public class pnlRegistro extends javax.swing.JPanel {

    /**
     * Creates new form pnlRegistro
     */
    CtlUsuario controUsuario = new CtlUsuario();

    public pnlRegistro() {
        initComponents();
        ocultarAsteriscos();
        cbPreguntaS.setModel(controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIniciarSesion = new javax.swing.JLabel();
        btnCrearUsu = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNombreUsu = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbPreguntaS = new javax.swing.JComboBox<>();
        txtRespuesta = new javax.swing.JTextField();
        spnSemestre = new javax.swing.JSpinner();
        lblSemestre = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        lblCedula = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblPreguntaS = new javax.swing.JLabel();
        lblRespuestaS = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblCampos = new javax.swing.JLabel();
        lblObligatorios = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 29));
        setPreferredSize(new java.awt.Dimension(260, 592));

        lblIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(51, 153, 255));
        lblIniciarSesion.setText("Iniciar Sesión");
        lblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarAIniciarSesion(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cambiarColor1(evt);
            }
        });

        btnCrearUsu.setBackground(new java.awt.Color(51, 51, 51));
        btnCrearUsu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCrearUsu.setForeground(new java.awt.Color(204, 204, 204));
        btnCrearUsu.setText("Crear Cuenta");
        btnCrearUsu.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnCrearUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuActionPerformed(evt);
            }
        });

        txtCedula.setBackground(new java.awt.Color(51, 51, 51));
        txtCedula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(204, 204, 204));
        txtCedula.setText("Cedula");
        txtCedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarCedula(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerCedula(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Nombre");
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarNombre(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerNombre(evt);
            }
        });

        txtNombreUsu.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreUsu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombreUsu.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreUsu.setText("Nombre de usuario");
        txtNombreUsu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarNombreUsu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerNombreUsu(evt);
            }
        });

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("E-Mail");
        txtCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarCorreo(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerCorreo(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setText("Telefono");
        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarTelefono(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerTelefono(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
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
                cambiarBorde(evt);
            }
        });
        cbPreguntaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPreguntaSActionPerformed(evt);
            }
        });

        txtRespuesta.setBackground(new java.awt.Color(51, 51, 51));
        txtRespuesta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(204, 204, 204));
        txtRespuesta.setText("Respuesta de seguridad");
        txtRespuesta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarRespuesta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerRespuesta(evt);
            }
        });

        spnSemestre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        spnSemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        spnSemestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        lblSemestre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSemestre.setForeground(new java.awt.Color(255, 255, 255));
        lblSemestre.setText("Semestre:");

        txtContrasena.setBackground(new java.awt.Color(51, 51, 51));
        txtContrasena.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasena.setText("Contraseña");
        txtContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarCon(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerCon(evt);
            }
        });

        lblCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblNombreUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblPreguntaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblRespuestaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N

        lblNota.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 0, 0));
        lblNota.setText("Nota:");

        lblCampos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCampos.setForeground(new java.awt.Color(255, 255, 255));
        lblCampos.setText("Los Campos con asteriscos");

        lblObligatorios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblObligatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblObligatorios.setText("son Obligatorios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblObligatorios)
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCampos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSemestre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPreguntaS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPreguntaS)
                                    .addComponent(lblRespuestaS)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreUsu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCedula)
                                    .addComponent(lblContrasena)
                                    .addComponent(lblNombreUsuario)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblIniciarSesion)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCedula)))
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreUsuario)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblContrasena)))
                .addGap(18, 18, 18)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemestre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPreguntaS))
                    .addComponent(cbPreguntaS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRespuestaS))
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota)
                    .addComponent(lblCampos))
                .addGap(5, 5, 5)
                .addComponent(lblObligatorios)
                .addGap(18, 18, 18)
                .addComponent(btnCrearUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIniciarSesion)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarAIniciarSesion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarAIniciarSesion
        // TODO add your handling code here:
        Main.ventanaPrincipal.visualizar("inicio");
    }//GEN-LAST:event_cambiarAIniciarSesion

    private void cambiarColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColor
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, Color.yellow);
        Main.ventanaPrincipal.cambiarCursor(12);
    }//GEN-LAST:event_cambiarColor

    private void cambiarColor1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColor1
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, new Color(51, 153, 255));
        Main.ventanaPrincipal.cambiarCursor(0);
    }//GEN-LAST:event_cambiarColor1

    private void borrarCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCedula
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.WHITE);
        lblCedula.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarCedula

    private void ponerCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerCedula
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerCedula

    private void borrarNombre(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarNombre
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre", txtNombre, Color.WHITE);
    }//GEN-LAST:event_borrarNombre

    private void ponerNombre(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerNombre
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre", txtNombre, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerNombre

    private void borrarNombreUsu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarNombreUsu
        // TODO add your handling code here:
        if (txtNombreUsu.getText().isEmpty() || txtNombreUsu.getText().equalsIgnoreCase("nombre de usuario")) {
            Main.ventanaPrincipal.vaciarCampo("Nombre de usuario", txtNombreUsu, Color.WHITE);
        }else{
            EtchedBorder borde = new EtchedBorder(1);
            txtNombreUsu.setBorder(borde);
        }
        lblNombreUsuario.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarNombreUsu

    private void ponerNombreUsu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerNombreUsu
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre de usuario", txtNombreUsu, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerNombreUsu

    private void borrarCon(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCon
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Contraseña", txtContrasena, Color.WHITE);
        lblContrasena.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarCon

    private void ponerCon(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerCon
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Contraseña", txtContrasena, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerCon

    private void borrarCorreo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCorreo
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("E-Mail", txtCorreo, Color.WHITE);
    }//GEN-LAST:event_borrarCorreo

    private void ponerCorreo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerCorreo
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("E-Mail", txtCorreo, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerCorreo

    private void borrarTelefono(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarTelefono
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Telefono", txtTelefono, Color.WHITE);
    }//GEN-LAST:event_borrarTelefono

    private void ponerTelefono(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerTelefono
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Telefono", txtTelefono, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerTelefono

    private void borrarRespuesta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarRespuesta
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Respuesta de seguridad", txtRespuesta, Color.WHITE);
        lblRespuestaS.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarRespuesta

    private void ponerRespuesta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerRespuesta
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Respuesta de seguridad", txtRespuesta, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerRespuesta

    private void btnCrearUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuActionPerformed
        // TODO add your handling code here:
        if (validar()) {

            //Accion De Crear Usuario
            if (controUsuario.solicitudRegistro(Integer.parseInt(txtCedula.getText()),
                    cbPreguntaS.getSelectedIndex(), Integer.parseInt(spnSemestre.getValue() + ""),
                    validarEspaciosNoRequeridos(txtNombre.getText()), txtNombreUsu.getText(),
                    txtContrasena.getText(), validarEspaciosNoRequeridos(txtCorreo.getText()),
                    validarEspaciosNoRequeridos(txtTelefono.getText()), txtRespuesta.getText())) {
                Main.mensaje(300, 30, "CREANDO CUENTA....", 3, "/Recursos/spinner-of-dots.png");
                Main.mensaje(300, 30, "!SE HA CREADO LA CUENTA EXITOSAMENTE!", 2, "/Recursos/Cuenta.png");
                Main.ventanaPrincipal.visualizar("inicio");

            } else {
                Main.mensaje(300, 30, "EL NOMBRE DE USUARIO YA ESTA OCUPADO", 1, "/Recursos/Cuenta.png");
                LineBorder b = new LineBorder(Color.red, 1);
                txtNombreUsu.setBorder(b);
                lblNombreUsuario.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnCrearUsuActionPerformed

    private void cbPreguntaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPreguntaSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPreguntaSActionPerformed

    private void cambiarBorde(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cambiarBorde
        // TODO add your handling code here:
        cbPreguntaS.setBorder(new CompoundBorder(new LineBorder(new Color(51, 51, 51)), new EtchedBorder(1)));
        lblPreguntaS.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_cambiarBorde

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        validarTeclado(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        validarTeclado(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsu;
    private javax.swing.JComboBox<String> cbPreguntaS;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblObligatorios;
    private javax.swing.JLabel lblPreguntaS;
    private javax.swing.JLabel lblRespuestaS;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JSpinner spnSemestre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsu;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    //Metodo Para Validar Key de tipos numericos
    private void validarTeclado(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }

    //Metodo Para Validar Campos
    private boolean validar() {
        LineBorder b = new LineBorder(Color.red, 1);
        boolean bool = false;
        if (txtCedula.getText().isEmpty() || txtCedula.getText().equalsIgnoreCase("Cedula")) {
            txtCedula.setBorder(b);
            lblCedula.setVisible(true);
            bool = true;
        }
        if (txtNombreUsu.getText().isEmpty() || txtNombreUsu.getText().equalsIgnoreCase("Nombre de usuario")) {
            txtNombreUsu.setBorder(b);
            lblNombreUsuario.setVisible(true);
            bool = true;
        }
        if (txtContrasena.getText().isEmpty() || txtContrasena.getText().equalsIgnoreCase("Contraseña")) {
            txtContrasena.setBorder(b);
            lblContrasena.setVisible(true);
            bool = true;
        }
        if (txtRespuesta.getText().isEmpty() || txtRespuesta.getText().equalsIgnoreCase("Respuesta de seguridad")) {
            txtRespuesta.setBorder(b);
            lblRespuestaS.setVisible(true);
            bool = true;
        }
        if (cbPreguntaS.getSelectedIndex() == 0) {
            cbPreguntaS.setBorder(new CompoundBorder(b, new EtchedBorder(1)));
            lblPreguntaS.setVisible(true);
            bool = true;
        }
        return !notaVisible(bool);
    }

    //Metodo Para Mostar/Ocultar Etiqueta Espacios Obligatorios
    private boolean notaVisible(boolean bool) {
        lblNota.setVisible(bool);
        lblCampos.setVisible(bool);
        lblObligatorios.setVisible(bool);

        return bool;
    }

    //Metodo Para Ocultar Asteriscos
    private void ocultarAsteriscos() {
        lblCedula.setVisible(false);
        lblContrasena.setVisible(false);
        lblNombreUsuario.setVisible(false);
        lblPreguntaS.setVisible(false);
        lblRespuestaS.setVisible(false);
        lblNota.setVisible(false);
        lblCampos.setVisible(false);
        lblObligatorios.setVisible(false);
    }

    private String validarEspaciosNoRequeridos(String campo) {
        if (campo.equalsIgnoreCase("nombre") || campo.equalsIgnoreCase("e-mail") || campo.equalsIgnoreCase("telefono")) {
            return "";
        }
        return campo;
    }

}
