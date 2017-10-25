/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Main;

/**
 *
 * @author Daryl Ospina
 */
public class FrmCrearJuego extends javax.swing.JFrame {

    public static FrmIniciarCrear ventanaJuego;
    /**
     * Creates new form FrmCrearJuego
     */
    public FrmCrearJuego() {
        initComponents();
        lblEtiqueta.setText("<html>Bienvenido por favor<br>seleccione el numero de<br>jugadores que<br>participaran en la partida</html>");
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
        btnIniciarSesion = new javax.swing.JButton();
        btnIniciarSesion1 = new javax.swing.JButton();
        pnlContenedorPanelC = new javax.swing.JPanel();
        pnlContenedorDialogo = new javax.swing.JPanel();
        lblEtiqueta = new javax.swing.JLabel();
        lblGif = new javax.swing.JLabel();
        lblNube = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 29));
        setResizable(false);

        pnlContenedorTotal.setBackground(new java.awt.Color(0, 0, 29));
        pnlContenedorTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciarSesion.setText("INICIAR JUEGO");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pnlContenedorTotal.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 199, 330, 50));

        btnIniciarSesion1.setBackground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion1.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciarSesion1.setText("CANCELAR");
        btnIniciarSesion1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion1ActionPerformed(evt);
            }
        });
        pnlContenedorTotal.add(btnIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 267, 330, 50));

        pnlContenedorPanelC.setBackground(new java.awt.Color(0, 0, 29));

        pnlContenedorDialogo.setBackground(new java.awt.Color(0, 0, 29));
        pnlContenedorDialogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEtiqueta.setForeground(new java.awt.Color(255, 255, 255));
        lblEtiqueta.setText("Texto");
        pnlContenedorDialogo.add(lblEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pinguino-iloveimg-resized.gif"))); // NOI18N
        pnlContenedorDialogo.add(lblGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 74, -1, -1));

        lblNube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-iloveimg-resized (1).png"))); // NOI18N
        pnlContenedorDialogo.add(lblNube, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 160));

        javax.swing.GroupLayout pnlContenedorPanelCLayout = new javax.swing.GroupLayout(pnlContenedorPanelC);
        pnlContenedorPanelC.setLayout(pnlContenedorPanelCLayout);
        pnlContenedorPanelCLayout.setHorizontalGroup(
            pnlContenedorPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContenedorDialogo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        pnlContenedorPanelCLayout.setVerticalGroup(
            pnlContenedorPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPanelCLayout.createSequentialGroup()
                .addComponent(pnlContenedorDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlContenedorTotal.add(pnlContenedorPanelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 12, 400, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Numero de jugadores");
        pnlContenedorTotal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 178, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        pnlContenedorTotal.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 47, 28));

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

    private void btnIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Main.mensaje(115, 30, "Cancelando...", 3, "/Recursos/spinner-of-dots.png");
        Main.abrirFrmPrincipal();
    }//GEN-LAST:event_btnIniciarSesion1ActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Main.mensaje(150, 30, "Iniciando Partida...", 3, "/Recursos/spinner-of-dots.png");
        ventanaJuego = new FrmIniciarCrear();
        ventanaJuego.setLocationRelativeTo(null);
        ventanaJuego.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnIniciarSesion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblGif;
    private javax.swing.JLabel lblNube;
    private javax.swing.JPanel pnlContenedorDialogo;
    private javax.swing.JPanel pnlContenedorPanelC;
    private javax.swing.JPanel pnlContenedorTotal;
    // End of variables declaration//GEN-END:variables
}
