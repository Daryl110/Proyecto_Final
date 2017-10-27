/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlJuego;
import Controlador.CtlPregunta;
import Controlador.Main;
import Modelo.Opcion;
import static Vista.FrmCrearJuego.ventanaJuego;
import Vista.Preguntas.pnlPregunta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daryl Ospina
 */
public class FrmJuego extends javax.swing.JFrame {

    private final ArrayList<pnlPregunta> preguntas;
    private final int[] idPreguntas;
    CtlPregunta controladorPreg;
    CtlJuego controladorJuego;
    private final String idJuego;
    private final int cedula;
    private int participantes;

    /**
     * Creates new form FrmJuego
     *
     * @param idJuego
     * @param cedula
     * @param participantes
     */
    public FrmJuego(String idJuego, int cedula, int participantes) {
        initComponents();
        this.idJuego = idJuego;
        this.cedula = cedula;
        this.participantes = participantes;
        idPreguntas = new int[10];
        preguntas = new ArrayList<>();
        controladorPreg = new CtlPregunta();
        controladorJuego = new CtlJuego();
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
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        pnlPreguntas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        pnlContenedorTotal.setBackground(new java.awt.Color(67, 119, 170));

        pnlOpciones.setBackground(new java.awt.Color(0, 0, 29));
        pnlOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn0.setBackground(new java.awt.Color(153, 178, 203));
        btn0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn0.setForeground(new java.awt.Color(51, 51, 51));
        btn0.setText("1");
        btn0.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(153, 178, 203));
        btn1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(51, 51, 51));
        btn1.setText("2");
        btn1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(153, 178, 203));
        btn2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(51, 51, 51));
        btn2.setText("3");
        btn2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(153, 178, 203));
        btn3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(51, 51, 51));
        btn3.setText("4");
        btn3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(153, 178, 203));
        btn4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(51, 51, 51));
        btn4.setText("5");
        btn4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(153, 178, 203));
        btn5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(51, 51, 51));
        btn5.setText("6");
        btn5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(153, 178, 203));
        btn6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(51, 51, 51));
        btn6.setText("7");
        btn6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(153, 178, 203));
        btn7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(51, 51, 51));
        btn7.setText("8");
        btn7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(153, 178, 203));
        btn8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(51, 51, 51));
        btn8.setText("9");
        btn8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(153, 178, 203));
        btn9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(51, 51, 51));
        btn9.setText("10");
        btn9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnTerminar.setBackground(new java.awt.Color(153, 178, 203));
        btnTerminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(51, 51, 51));
        btnTerminar.setText("TERMINAR");
        btnTerminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
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

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        cargarPanel(0);
        cambiarBordeButton(btn0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        cargarPanel(1);
        cambiarBordeButton(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        cargarPanel(2);
        cambiarBordeButton(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        cargarPanel(3);
        cambiarBordeButton(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        cargarPanel(4);
        cambiarBordeButton(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        cargarPanel(5);
        cambiarBordeButton(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        cargarPanel(6);
        cambiarBordeButton(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        cargarPanel(7);
        cambiarBordeButton(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        cargarPanel(8);
        cambiarBordeButton(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        cargarPanel(9);
        cambiarBordeButton(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
        participantes--;
        Object[] arreglo = guardarInformacion();
        if (participantes != 0) {
            cambiarBordeButton(btnTerminar);
            if (controladorJuego.registrarPreguntasJuego(idPreguntas, controladorPreg.calificar(
                    (ArrayList<int[]>) arreglo[0], (ArrayList<ArrayList<Opcion>>) arreglo[1]),
                    Integer.parseInt(idJuego), cedula)) {

                Main.mensaje(350, 30, "Preparando el nuevo juego para el siguiente jugador", 3, "/Recursos/spinner-of-dots.png");
                this.dispose();
                ventanaJuego = new FrmIniciarCrear(idJuego, participantes);
                ventanaJuego.setLocationRelativeTo(null);
                ventanaJuego.setVisible(true);

            } else {
                System.out.println("Hubo un erro");
            }
        } else {
            if (controladorJuego.registrarPreguntasJuego(idPreguntas, controladorPreg.calificar(
                    (ArrayList<int[]>) arreglo[0], (ArrayList<ArrayList<Opcion>>) arreglo[1]),
                    Integer.parseInt(idJuego), cedula)) {
                 Main.mensaje(350, 30, "Gracias por jugar!!!Cargando las puntaciones", 3, "/Recursos/Cuenta.png");
                FrmPuntuaciones punta = new FrmPuntuaciones(FrmCrearJuego.nombreJuego);
                punta.setLocationRelativeTo(null);
                punta.setVisible(true);
                this.dispose();
            } else {
                System.out.println("Hubo un error");
            }
        }


    }//GEN-LAST:event_btnTerminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JPanel pnlContenedorTotal;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlPreguntas;
    // End of variables declaration//GEN-END:variables

    private void cambiarBordeButton(JButton boton) {
        CompoundBorder b = new CompoundBorder(new LineBorder(new Color(153, 153, 153)), new EtchedBorder(1));

        if (btn0.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn0.setBorder(b);
        }
        if (btn1.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn1.setBorder(b);
        }
        if (btn2.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn2.setBorder(b);
        }
        if (btn3.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn3.setBorder(b);
        }
        if (btn4.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn4.setBorder(b);
        }
        if (btn5.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn5.setBorder(b);
        }
        if (btn6.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn6.setBorder(b);
        }
        if (btn7.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn7.setBorder(b);
        }
        if (btn8.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn8.setBorder(b);
        }
        if (btn9.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btn9.setBorder(b);
        }
        if (btnTerminar.getBorder().getClass().getSimpleName().equalsIgnoreCase("LineBorder")) {
            btnTerminar.setBorder(b);
        }
        LineBorder c = new LineBorder(Color.RED, 2);
        boton.setBorder(c);

    }

    private Object[] guardarInformacion() {
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
                preguntas.add(new pnlPregunta(controladorPreg.traerPregunta(numero), controladorPreg.getOpciones(numero)));
                idPreguntas[contador] = numero;
                cargarPreguntas(contador + 1);
            } else {
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
