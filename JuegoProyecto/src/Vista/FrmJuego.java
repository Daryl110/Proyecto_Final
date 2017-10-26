/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlPregunta;
import Modelo.Opcion;
import Modelo.Pregunta;
import Vista.Preguntas.pnlPregunta;
import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Daryl Ospina
 */
public class FrmJuego extends javax.swing.JFrame {

    private ArrayList<pnlPregunta> preguntas;
    private int[] idPreguntas;
    CtlPregunta controladorPreg;

    /**
     * Creates new form FrmJuego
     */
    public FrmJuego() {
        initComponents();
        idPreguntas = new int[10];
        preguntas = new ArrayList<>();
        controladorPreg = new CtlPregunta();
        cargarPreguntas(0);
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
        pnlOpciones = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        btnIniciarSesion1 = new javax.swing.JButton();
        btnIniciarSesion2 = new javax.swing.JButton();
        btnIniciarSesion3 = new javax.swing.JButton();
        btnIniciarSesion4 = new javax.swing.JButton();
        btnIniciarSesion5 = new javax.swing.JButton();
        btnIniciarSesion6 = new javax.swing.JButton();
        btnIniciarSesion7 = new javax.swing.JButton();
        btnIniciarSesion8 = new javax.swing.JButton();
        btnIniciarSesion9 = new javax.swing.JButton();
        btnIniciarSesion10 = new javax.swing.JButton();
        pnlPreguntas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        pnlContenedorTotal.setBackground(new java.awt.Color(67, 119, 170));

        pnlOpciones.setBackground(new java.awt.Color(0, 0, 29));
        pnlOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnIniciarSesion.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setText("1");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnIniciarSesion1.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion1.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion1.setText("2");
        btnIniciarSesion1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion1ActionPerformed(evt);
            }
        });

        btnIniciarSesion2.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion2.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion2.setText("3");
        btnIniciarSesion2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion2ActionPerformed(evt);
            }
        });

        btnIniciarSesion3.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion3.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion3.setText("4");
        btnIniciarSesion3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion3ActionPerformed(evt);
            }
        });

        btnIniciarSesion4.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion4.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion4.setText("5");
        btnIniciarSesion4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion4ActionPerformed(evt);
            }
        });

        btnIniciarSesion5.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion5.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion5.setText("6");
        btnIniciarSesion5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion5ActionPerformed(evt);
            }
        });

        btnIniciarSesion6.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion6.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion6.setText("7");
        btnIniciarSesion6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion6ActionPerformed(evt);
            }
        });

        btnIniciarSesion7.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion7.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion7.setText("8");
        btnIniciarSesion7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion7ActionPerformed(evt);
            }
        });

        btnIniciarSesion8.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion8.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion8.setText("9");
        btnIniciarSesion8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion8ActionPerformed(evt);
            }
        });

        btnIniciarSesion9.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion9.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion9.setText("10");
        btnIniciarSesion9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion9ActionPerformed(evt);
            }
        });

        btnIniciarSesion10.setBackground(new java.awt.Color(153, 178, 203));
        btnIniciarSesion10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion10.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion10.setText("TERMINAR");
        btnIniciarSesion10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnIniciarSesion10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesion10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIniciarSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlPreguntas.setBackground(new java.awt.Color(0, 0, 29));
        pnlPreguntas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlPreguntasLayout = new javax.swing.GroupLayout(pnlPreguntas);
        pnlPreguntas.setLayout(pnlPreguntasLayout);
        pnlPreguntasLayout.setHorizontalGroup(
            pnlPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPreguntasLayout.setVerticalGroup(
            pnlPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlContenedorTotalLayout = new javax.swing.GroupLayout(pnlContenedorTotal);
        pnlContenedorTotal.setLayout(pnlContenedorTotalLayout);
        pnlContenedorTotalLayout.setHorizontalGroup(
            pnlContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlContenedorTotalLayout.setVerticalGroup(
            pnlContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        cargarPanel(0);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion1ActionPerformed
        // TODO add your handling code here:
        cargarPanel(1);
    }//GEN-LAST:event_btnIniciarSesion1ActionPerformed

    private void btnIniciarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion2ActionPerformed
        // TODO add your handling code here:
        cargarPanel(2);
    }//GEN-LAST:event_btnIniciarSesion2ActionPerformed

    private void btnIniciarSesion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion3ActionPerformed
        // TODO add your handling code here:
        cargarPanel(3);
    }//GEN-LAST:event_btnIniciarSesion3ActionPerformed

    private void btnIniciarSesion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion4ActionPerformed
        // TODO add your handling code here:
        cargarPanel(4);
    }//GEN-LAST:event_btnIniciarSesion4ActionPerformed

    private void btnIniciarSesion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion5ActionPerformed
        // TODO add your handling code here:
        cargarPanel(5);
    }//GEN-LAST:event_btnIniciarSesion5ActionPerformed

    private void btnIniciarSesion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion6ActionPerformed
        // TODO add your handling code here:
        cargarPanel(6);
    }//GEN-LAST:event_btnIniciarSesion6ActionPerformed

    private void btnIniciarSesion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion7ActionPerformed
        // TODO add your handling code here:
        cargarPanel(7);
    }//GEN-LAST:event_btnIniciarSesion7ActionPerformed

    private void btnIniciarSesion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion8ActionPerformed
        // TODO add your handling code here:
        cargarPanel(8);
    }//GEN-LAST:event_btnIniciarSesion8ActionPerformed

    private void btnIniciarSesion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion9ActionPerformed
        // TODO add your handling code here:
        cargarPanel(9);
    }//GEN-LAST:event_btnIniciarSesion9ActionPerformed

    private void btnIniciarSesion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesion10ActionPerformed
        // TODO add your handling code here:
        Object[] arreglo = guardarInformacion();
        controladorPreg.calificar((ArrayList<int[]>)arreglo[0], (ArrayList<ArrayList<Opcion>>)arreglo[1]);
    }//GEN-LAST:event_btnIniciarSesion10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnIniciarSesion1;
    private javax.swing.JButton btnIniciarSesion10;
    private javax.swing.JButton btnIniciarSesion2;
    private javax.swing.JButton btnIniciarSesion3;
    private javax.swing.JButton btnIniciarSesion4;
    private javax.swing.JButton btnIniciarSesion5;
    private javax.swing.JButton btnIniciarSesion6;
    private javax.swing.JButton btnIniciarSesion7;
    private javax.swing.JButton btnIniciarSesion8;
    private javax.swing.JButton btnIniciarSesion9;
    private javax.swing.JPanel pnlContenedorTotal;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlPreguntas;
    // End of variables declaration//GEN-END:variables

    private Object[] guardarInformacion(){
        Object[] arreglo = new Object[2];
        ArrayList<int[]> selecciones = new ArrayList<>();
        ArrayList<ArrayList<Opcion>> opciones = new ArrayList<>();
        
        for (int i = 0; i < preguntas.size(); i++) {
            selecciones.add(preguntas.get(i).getSelecciones());
        }
        arreglo[0] = selecciones;
        for (int i = 0; i < preguntas.size(); i++) {
            opciones.add(preguntas.get(i).getOpciones());
        }
        arreglo[1] = opciones;
        return arreglo;
    }
    
    private void cargarPreguntas(int contador) {
        if (contador < 10) {
            int numero = (int) (Math.random() * controladorPreg.getNumeroRegistros()) + 1;
            if (validarIgualdad(numero)) {
                preguntas.add(new pnlPregunta(controladorPreg.traerPregunta(numero),controladorPreg.getOpciones(numero)));
                idPreguntas[contador] = numero;
                cargarPreguntas(contador + 1);
            }else{
                cargarPreguntas(contador);
            }
        }
    }

    private boolean validarIgualdad(int numero) {
        for (int i = 0; i < idPreguntas.length; i++) {
            if (idPreguntas[i] == numero) {
                return false;
            }
        }
        return true;
    }

    private void cargarPanel(int preg) {
        pnlPreguntas.removeAll();
        pnlPreguntas.setLayout(new BorderLayout(5, 5));
        pnlPreguntas.add(preguntas.get(preg), BorderLayout.CENTER);
        pnlPreguntas.updateUI();
    }
}
