/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlJuego;
import Controlador.Main;
import javax.swing.JFrame;

/**
 *
 * @author Daryl Ospina
 */
public class FrmPuntuaciones extends javax.swing.JFrame {

    private final String nombreJuego;
    CtlJuego juego = new CtlJuego();
    private JFrame padre;

    /**
     * Creates new form FrmPuntuaciones
     *
     * @param nombreJuego
     */
    public FrmPuntuaciones(String nombreJuego) {
        initComponents();
        this.nombreJuego = nombreJuego;
        tblPuntuaciones.setModel(juego.listarPuntuacion(nombreJuego));

    }

    public FrmPuntuaciones(String nombreJuego, JFrame padre) {
        initComponents();
        this.nombreJuego = nombreJuego;
        tblPuntuaciones.setModel(juego.listarPuntuacion(nombreJuego));
        this.padre = padre;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuntuaciones = new javax.swing.JTable();
        btnVolverJugar = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 29));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Puntuaciones");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 29));

        tblPuntuaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPuntuaciones);

        btnVolverJugar.setBackground(new java.awt.Color(51, 51, 51));
        btnVolverJugar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVolverJugar.setForeground(new java.awt.Color(204, 204, 204));
        btnVolverJugar.setText("VOLVER A JUGAR");
        btnVolverJugar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnVolverJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverJugarActionPerformed(evt);
            }
        });

        btnVolverInicio.setBackground(new java.awt.Color(51, 51, 51));
        btnVolverInicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVolverInicio.setForeground(new java.awt.Color(204, 204, 204));
        btnVolverInicio.setText("VOLVER");
        btnVolverInicio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnVolverInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolverJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolverInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverJugarActionPerformed
        this.setVisible(false);
        Main.mensaje(100, 30, "Cargando...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        FrmCrearJuego ventanaCrearJuego = new FrmCrearJuego();
        ventanaCrearJuego.setLocationRelativeTo(null);
        ventanaCrearJuego.setVisible(true);
    }//GEN-LAST:event_btnVolverJugarActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        this.dispose();
        Main.mensaje(115, 30, "Cargando...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        if (padre != null) {
            padre.setVisible(true);
        } else {
            FrmCrearJuego.ventanaJuego = null;
            Main.abrirFrmPrincipal();
        }
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Main.mensaje(200, 30, "DIRECCIONANDO A INICIO...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        Main.mensaje(170, 30, "GRACIAS POR JUGAR...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        Main.abrirFrmPrincipal();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JButton btnVolverJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPuntuaciones;
    // End of variables declaration//GEN-END:variables
}
