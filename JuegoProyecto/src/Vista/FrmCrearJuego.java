/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlJuego;
import Controlador.Main;
import static Controlador.Main.controUsuario;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daryl Ospina
 */
public class FrmCrearJuego extends javax.swing.JFrame {

    public static FrmIniciarCrear ventanaJuego;
    CtlJuego controJuego = new CtlJuego();

    public static String nombreJuego = "";

    private JFrame padre;

    /**
     * Creates new form FrmCrearJuego
     */
    public FrmCrearJuego() {
        initComponents();
        lblEtiqueta.setText("<html>Bienvenido por favor<br>seleccione el numero de<br>jugadores que<br>participaran en la partida</html>");
        lblNombreJuego.setVisible(false);
    }

    public FrmCrearJuego(JFrame padre) {
        initComponents();
        lblEtiqueta.setText("<html>Bienvenido por favor<br>seleccione el numero de<br>jugadores que<br>participaran en la partida</html>");
        lblNombreJuego.setVisible(false);
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

        pnlContenedorTotal = new javax.swing.JPanel();
        txtNombreJuego = new javax.swing.JTextField();
        btnIIniciarJuego = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        lblNombreJuego = new javax.swing.JLabel();
        pnlContenedorDialogo = new javax.swing.JPanel();
        lblEtiqueta = new javax.swing.JLabel();
        lblGif = new javax.swing.JLabel();
        lblNube = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 29));
        setResizable(false);

        pnlContenedorTotal.setBackground(new java.awt.Color(0, 0, 29));
        pnlContenedorTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreJuego.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreJuego.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombreJuego.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreJuego.setText("Nombre del juego");
        txtNombreJuego.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreJuego.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreJuegoborrarCedula(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreJuegoponerCedula(evt);
            }
        });
        txtNombreJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreJuegoKeyReleased(evt);
            }
        });
        pnlContenedorTotal.add(txtNombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 256, 25));

        btnIIniciarJuego.setBackground(new java.awt.Color(51, 51, 51));
        btnIIniciarJuego.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIIniciarJuego.setForeground(new java.awt.Color(204, 204, 204));
        btnIIniciarJuego.setText("INICIAR JUEGO");
        btnIIniciarJuego.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIIniciarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIIniciarJuegoActionPerformed(evt);
            }
        });
        pnlContenedorTotal.add(btnIIniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 199, 330, 50));

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlContenedorTotal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 267, 330, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Numero de jugadores");
        pnlContenedorTotal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 178, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        pnlContenedorTotal.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 47, 28));

        lblNombreJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloggif_59e7c9eb160c7.png"))); // NOI18N
        pnlContenedorTotal.add(lblNombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        pnlContenedorDialogo.setBackground(new java.awt.Color(0, 0, 29));
        pnlContenedorDialogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEtiqueta.setForeground(new java.awt.Color(255, 255, 255));
        lblEtiqueta.setText("Texto");
        pnlContenedorDialogo.add(lblEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pinguino-iloveimg-resized.gif"))); // NOI18N
        pnlContenedorDialogo.add(lblGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 74, -1, -1));

        lblNube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-iloveimg-resized (1).png"))); // NOI18N
        pnlContenedorDialogo.add(lblNube, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 160));

        pnlContenedorTotal.add(pnlContenedorDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 388, 337));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Main.mensaje(115, 30, "Cancelando...", 3, "/Recursos/spinner-of-dots.png");
        if (padre != null) {
            padre.setVisible(true);
        } else {
            Main.abrirFrmPrincipal();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIIniciarJuegoActionPerformed
<<<<<<< HEAD

=======
        // TODO add your handling code here:
>>>>>>> 8185b53d4e362abe29f82455b4f846e67af49332
        if (!txtNombreJuego.getText().trim().isEmpty() && !txtNombreJuego.getText().trim().equalsIgnoreCase("Nombre del juego")) {
            Main.mensaje(150, 30, "Iniciando Partida...", 3, "/Recursos/spinner-of-dots.png");
            SimpleDateFormat d = new SimpleDateFormat("YYYY/MM/d");
            Date date = new Date();
<<<<<<< HEAD
            if (controJuego.solicitudRegistro(Integer.parseInt(jSpinner1.getValue() + ""), txtNombreJuego.getText().trim(),d.format(date))) {
                nombreJuego=txtNombreJuego.getText().trim();

                if (padre != null) {
                    ventanaJuego = new FrmIniciarCrear(controJuego.traerIdJuego(txtNombreJuego.getText().trim()),Integer.parseInt(jSpinner1.getValue()+""),padre);
                }else{
                    ventanaJuego = new FrmIniciarCrear(controJuego.traerIdJuego(txtNombreJuego.getText().trim()),Integer.parseInt(jSpinner1.getValue()+""));
                }
                ventanaJuego.setLocationRelativeTo(null);
                ventanaJuego.setVisible(true);
                this.dispose();
                return;
            } else {
                Main.mensaje(300, 30, "EL NOMBRE DEL JUEGO NO ESTA DISPONIBLE", 2, "/Recursos/cancel.png");
                LineBorder b = new LineBorder(Color.red, 1);
                txtNombreJuego.setBorder(b);
=======
            if (controJuego.solicitudRegistro(Integer.parseInt(jSpinner1.getValue() + ""), txtNombreJuego.getText().trim(), d.format(date))) {
                nombreJuego = txtNombreJuego.getText().trim();
                if (!txtNombreJuego.getText().isEmpty() && !txtNombreJuego.getText().equalsIgnoreCase("Nombre del juego")) {
                    Main.mensaje(150, 30, "Iniciando Partida...", 3, "/Recursos/spinner-of-dots.png");
                    if (controJuego.solicitudRegistro(Integer.parseInt(jSpinner1.getValue() + ""), txtNombreJuego.getText(), d.format(date))) {
                        this.dispose();
                        nombreJuego = txtNombreJuego.getText();
                        if (padre != null) {
                            ventanaJuego = new FrmIniciarCrear(controJuego.traerIdJuego(txtNombreJuego.getText().trim()), Integer.parseInt(jSpinner1.getValue() + ""), padre);
                        } else {
                            ventanaJuego = new FrmIniciarCrear(controJuego.traerIdJuego(txtNombreJuego.getText().trim()), Integer.parseInt(jSpinner1.getValue() + ""));
                        }
                        ventanaJuego.setLocationRelativeTo(null);
                        ventanaJuego.setVisible(true);
                        return;
                    } else {
                        Main.mensaje(300, 30, "EL NOMBRE DEL JUEGO NO ESTA DISPONIBLE", 2, "/Recursos/cancel.png");
                        LineBorder b = new LineBorder(Color.red, 1);
                        txtNombreJuego.setBorder(b);
                        lblNombreJuego.setVisible(true);
                    }

                }
                txtNombreJuego.setBorder(new LineBorder(Color.red));
                lblEtiqueta.setText("<html>Debe llenar todos<br>los campos</html>");
>>>>>>> 8185b53d4e362abe29f82455b4f846e67af49332
                lblNombreJuego.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIIniciarJuegoActionPerformed

    private void txtNombreJuegoponerCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreJuegoponerCedula
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre del juego", txtNombreJuego, Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtNombreJuegoponerCedula

    private void txtNombreJuegoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreJuegoKeyReleased
        // TODO add your handling code here:
        if (controUsuario.validarCampoUsuario(txtNombreJuego.getText().trim(), "nombreJuego", "juego")) {
            lblNombreJuego.setVisible(true);
            txtNombreJuego.setBorder(new LineBorder(Color.red));
            lblEtiqueta.setText("<html>El Nombre que has<br>elegido ya no esta<br>disponible</html>");
        } else if (txtNombreJuego.getText().isEmpty()) {
            lblNombreJuego.setVisible(false);
            txtNombreJuego.setBorder(new EtchedBorder(1));
            lblEtiqueta.setText("<html>Por favor Asignale<br>un nombre a tu partida</html>");
        } else {
            lblNombreJuego.setVisible(false);
            txtNombreJuego.setBorder(new EtchedBorder(1));
            lblEtiqueta.setText("<html>Ahora inicia la partida<br>suerte..</html>");
        }
    }//GEN-LAST:event_txtNombreJuegoKeyReleased

    private void txtNombreJuegoborrarCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreJuegoborrarCedula
        // TODO add your handling code here:
        if (txtNombreJuego.getText().trim().isEmpty() || txtNombreJuego.getText().trim().equalsIgnoreCase("Nombre del juego")) {
            Main.ventanaPrincipal.vaciarCampo("Nombre del juego", txtNombreJuego, Color.WHITE);
            lblEtiqueta.setText("<html>por favor<br>seleccione el numero de<br>jugadores que<br>participaran en la partida</html>");
        } else {
            EtchedBorder borde = new EtchedBorder(1);
            txtNombreJuego.setBorder(borde);
        }
        lblNombreJuego.setVisible(false);
    }//GEN-LAST:event_txtNombreJuegoborrarCedula


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIIniciarJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblGif;
    private javax.swing.JLabel lblNombreJuego;
    private javax.swing.JLabel lblNube;
    private javax.swing.JPanel pnlContenedorDialogo;
    private javax.swing.JPanel pnlContenedorTotal;
    private javax.swing.JTextField txtNombreJuego;
    // End of variables declaration//GEN-END:variables
}
