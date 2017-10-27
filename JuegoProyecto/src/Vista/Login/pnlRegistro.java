/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Login;

import Controlador.Main;
import static Controlador.Main.controUsuario;
import Vista.FrmCrearJuego;
import java.awt.Color;
import javax.swing.border.*;

/**
 *
 * @author Daryl Ospina
 */
public class pnlRegistro extends javax.swing.JPanel {

    /**
     * Creates new form pnlRegistro
     */
    public pnlRegistro(boolean modificar) {
        initComponents();
        ocultarAsteriscos();
        cbPreguntaS.setModel(Main.controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
        if (FrmCrearJuego.ventanaJuego != null) {
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
        if (modificar) {
            lblIniciarSesion.setVisible(false);
            btnCrearUsu.setText("Modificar Cuenta");
        }
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
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 541, -1, -1));

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
        add(btnCrearUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 481, 256, 42));

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
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 26, 256, 25));

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
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 71, 256, 25));

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
        add(txtNombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 116, 256, 25));

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
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 206, 256, 25));

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
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 251, 256, 25));

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
        add(cbPreguntaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 330, 256, 25));

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
        add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 375, 256, 25));

        spnSemestre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        spnSemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        spnSemestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        add(spnSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 296, 56, -1));

        lblSemestre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSemestre.setForeground(new java.awt.Color(255, 255, 255));
        lblSemestre.setText("Semestre:");
        add(lblSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 296, -1, -1));

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
        add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 161, 256, 25));

        lblCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 17, 25));

        lblNombreUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 116, 17, 25));

        lblContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 161, 17, 25));

        lblPreguntaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblPreguntaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 330, 17, 25));

        lblRespuestaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblRespuestaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 375, 17, 25));

        lblNota.setForeground(new java.awt.Color(255, 0, 0));
        lblNota.setText("Nota:");
        add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 418, -1, -1));

        lblCampos.setForeground(new java.awt.Color(255, 255, 255));
        lblCampos.setText("Los Campos con asteriscos");
        add(lblCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 418, -1, -1));

        lblObligatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblObligatorios.setText("son Obligatorios.");
        add(lblObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 438, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarAIniciarSesion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarAIniciarSesion
        // TODO add your handling code here:
        abrirIniciarSesion();
    }//GEN-LAST:event_cambiarAIniciarSesion

    private void cambiarColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColor
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, Color.yellow);
        if (Main.ventanaPrincipal.isActive()) {
            Main.ventanaPrincipal.cambiarCursor(12);
        } else {
            FrmCrearJuego.ventanaJuego.cambiarCursor(12);
        }
    }//GEN-LAST:event_cambiarColor

    private void cambiarColor1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColor1
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, new Color(51, 153, 255));
        if (Main.ventanaPrincipal.isActive()) {
            Main.ventanaPrincipal.cambiarCursor(0);
        } else {
            FrmCrearJuego.ventanaJuego.cambiarCursor(0);
        }
    }//GEN-LAST:event_cambiarColor1

    private void borrarCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCedula
        // TODO add your handling code here:
        if (txtCedula.getText().isEmpty() || txtCedula.getText().equalsIgnoreCase("cedula")) {
            Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.WHITE);
        } else {
            EtchedBorder borde = new EtchedBorder(1);
            txtCedula.setBorder(borde);
        }
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
        } else {
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
            Main.mensaje(300, 30, "CREANDO CUENTA....", 3, "/Recursos/spinner-of-dots.png");
            if (!controUsuario.validarCampoUsuario(txtCedula.getText(), "cedula", "usuario")) {
                if (!controUsuario.validarCampoUsuario(txtNombreUsu.getText(), "nombreUsu", "usuario")) {
                    if (controUsuario.solicitudRegistro(Integer.parseInt(txtCedula.getText()),
                            cbPreguntaS.getSelectedIndex(), Integer.parseInt(spnSemestre.getValue() + ""),
                            validarEspaciosNoRequeridos(txtNombre.getText()), txtNombreUsu.getText(),
                            txtContrasena.getText(), validarEspaciosNoRequeridos(txtCorreo.getText()),
                            validarEspaciosNoRequeridos(txtTelefono.getText()), txtRespuesta.getText())) {
                        Main.mensaje(300, 30, "!SE HA CREADO LA CUENTA EXITOSAMENTE!", 2, "/Recursos/Cuenta.png");
                        abrirIniciarSesion();
                    }
                } else {
                    Main.mensaje(300, 30, "EL NOMBRE DE USUARIO YA ESTA OCUPADO", 2, "/Recursos/cancel.png");
                    LineBorder b = new LineBorder(Color.red, 1);
                    txtNombreUsu.setBorder(b);
                    lblNombreUsuario.setVisible(true);
                }
            } else {
                Main.mensaje(300, 30, "ESTA CEDULA YA EXISTE", 2, "/Recursos/cancel.png");
                LineBorder b = new LineBorder(Color.red, 1);
                txtCedula.setBorder(b);
                lblCedula.setVisible(true);
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

    //Abrir Iniciar Sesion
    private void abrirIniciarSesion(){
        if (Main.ventanaPrincipal.isVisible()) {
            Main.ventanaPrincipal.visualizar("inicio");
        }else{
            FrmCrearJuego.ventanaJuego.visualizar("inicio");
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
    }
    
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
