/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Preguntas;

import Modelo.Opcion;
import Modelo.Pregunta;
import java.util.ArrayList;

/**
 *
 * @author Daryl Ospina
 */
public class pnlPregunta extends javax.swing.JPanel {

    private final int tipoPreg;
    private ArrayList<Opcion> opciones;

    /**
     * Creates new form pnlPregunta
     * @param preg
     * @param opciones
     */
    public pnlPregunta(Pregunta preg, ArrayList<Opcion> opciones) {
        initComponents();
        lblEnunciado.setLineWrap(true);
        lblEnunciado.setText(preg.getEnunciado());
        this.tipoPreg = preg.getIdTipoPregunta();
        cambiarTipoPreg(tipoPreg);
        ponerOpciones(opciones);
        lblEnunciado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtn = new javax.swing.ButtonGroup();
        pnlContenedor = new javax.swing.JPanel();
        pnlLblEnunciado = new javax.swing.JScrollPane();
        lblEnunciado = new javax.swing.JTextArea();
        chA = new javax.swing.JCheckBox();
        rbtnA = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        pnlLblEnunciado2 = new javax.swing.JScrollPane();
        lblA = new javax.swing.JTextArea();
        pnl = new javax.swing.JScrollPane();
        lblB = new javax.swing.JTextArea();
        rbtnB = new javax.swing.JRadioButton();
        chB = new javax.swing.JCheckBox();
        chC = new javax.swing.JCheckBox();
        pnlLblEnunciado4 = new javax.swing.JScrollPane();
        lblC = new javax.swing.JTextArea();
        rbtnC = new javax.swing.JRadioButton();
        chD = new javax.swing.JCheckBox();
        rbtnD = new javax.swing.JRadioButton();
        pnl1 = new javax.swing.JScrollPane();
        lblD = new javax.swing.JTextArea();

        pnlContenedor.setBackground(new java.awt.Color(0, 0, 29));

        pnlLblEnunciado.setBorder(null);

        lblEnunciado.setEditable(false);
        lblEnunciado.setBackground(new java.awt.Color(0, 0, 29));
        lblEnunciado.setColumns(20);
        lblEnunciado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblEnunciado.setForeground(new java.awt.Color(255, 255, 255));
        lblEnunciado.setRows(4);
        lblEnunciado.setBorder(null);
        pnlLblEnunciado.setViewportView(lblEnunciado);

        chA.setBackground(new java.awt.Color(0, 0, 29));

        rbtnA.setBackground(new java.awt.Color(0, 0, 29));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pensar.gif"))); // NOI18N

        pnlLblEnunciado2.setBorder(null);

        lblA.setEditable(false);
        lblA.setBackground(new java.awt.Color(0, 0, 29));
        lblA.setColumns(15);
        lblA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblA.setForeground(new java.awt.Color(255, 255, 255));
        lblA.setRows(4);
        lblA.setBorder(null);
        lblA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAMouseClicked(evt);
            }
        });
        pnlLblEnunciado2.setViewportView(lblA);

        pnl.setBorder(null);

        lblB.setEditable(false);
        lblB.setBackground(new java.awt.Color(0, 0, 29));
        lblB.setColumns(15);
        lblB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblB.setForeground(new java.awt.Color(255, 255, 255));
        lblB.setRows(4);
        lblB.setBorder(null);
        lblB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBMouseClicked(evt);
            }
        });
        pnl.setViewportView(lblB);

        rbtnB.setBackground(new java.awt.Color(0, 0, 29));

        chB.setBackground(new java.awt.Color(0, 0, 29));

        chC.setBackground(new java.awt.Color(0, 0, 29));

        pnlLblEnunciado4.setBorder(null);

        lblC.setEditable(false);
        lblC.setBackground(new java.awt.Color(0, 0, 29));
        lblC.setColumns(15);
        lblC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblC.setForeground(new java.awt.Color(255, 255, 255));
        lblC.setRows(4);
        lblC.setBorder(null);
        lblC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCMouseClicked(evt);
            }
        });
        pnlLblEnunciado4.setViewportView(lblC);

        rbtnC.setBackground(new java.awt.Color(0, 0, 29));

        chD.setBackground(new java.awt.Color(0, 0, 29));

        rbtnD.setBackground(new java.awt.Color(0, 0, 29));

        pnl1.setBorder(null);

        lblD.setEditable(false);
        lblD.setBackground(new java.awt.Color(0, 0, 29));
        lblD.setColumns(15);
        lblD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblD.setForeground(new java.awt.Color(255, 255, 255));
        lblD.setRows(4);
        lblD.setBorder(null);
        lblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDMouseClicked(evt);
            }
        });
        pnl1.setViewportView(lblD);

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(chA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlLblEnunciado2))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(chB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(chC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlLblEnunciado4))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(chD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl1))
                    .addComponent(pnlLblEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlLblEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnA))
                    .addComponent(pnlLblEnunciado2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnB))
                    .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnC))
                    .addComponent(pnlLblEnunciado4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnD))
                    .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAMouseClicked
        // TODO add your handling code here:
        if (tipoPreg == 2) {
            chA.setSelected(!chA.isSelected());
        } else {
            rbtnA.setSelected(!rbtnA.isSelected());
        }
    }//GEN-LAST:event_lblAMouseClicked

    private void lblBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseClicked
        // TODO add your handling code here:
        if (tipoPreg == 2) {
            chB.setSelected(!chB.isSelected());
        } else {
            rbtnB.setSelected(!rbtnB.isSelected());
        }
    }//GEN-LAST:event_lblBMouseClicked

    private void lblCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCMouseClicked
        // TODO add your handling code here:
        if (tipoPreg == 2) {
            chC.setSelected(!chC.isSelected());
        } else {
            rbtnC.setSelected(!rbtnC.isSelected());
        }
    }//GEN-LAST:event_lblCMouseClicked

    private void lblDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseClicked
        // TODO add your handling code here:
        if (tipoPreg == 2) {
            chD.setSelected(!chD.isSelected());
        } else {
            rbtnD.setSelected(!rbtnD.isSelected());
        }
    }//GEN-LAST:event_lblDMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chA;
    private javax.swing.JCheckBox chB;
    private javax.swing.JCheckBox chC;
    private javax.swing.JCheckBox chD;
    private javax.swing.ButtonGroup grupoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea lblA;
    private javax.swing.JTextArea lblB;
    private javax.swing.JTextArea lblC;
    private javax.swing.JTextArea lblD;
    private javax.swing.JTextArea lblEnunciado;
    private javax.swing.JScrollPane pnl;
    private javax.swing.JScrollPane pnl1;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JScrollPane pnlLblEnunciado;
    private javax.swing.JScrollPane pnlLblEnunciado2;
    private javax.swing.JScrollPane pnlLblEnunciado4;
    private javax.swing.JRadioButton rbtnA;
    private javax.swing.JRadioButton rbtnB;
    private javax.swing.JRadioButton rbtnC;
    private javax.swing.JRadioButton rbtnD;
    // End of variables declaration//GEN-END:variables

    private void ponerOpciones(ArrayList<Opcion> opciones) {
        ArrayList<Opcion> opc = new ArrayList<>();

        int numero = (int) (Math.random() * opciones.size() - 1) + 0;
        lblA.setText(opciones.get(numero).getEnunciado());
        opc.add(opciones.get(numero));
        opciones.remove(numero);

        numero = (int) (Math.random() * opciones.size() - 1) + 0;
        lblB.setText(opciones.get(numero).getEnunciado());
        opc.add(opciones.get(numero));
        opciones.remove(numero);

        numero = (int) (Math.random() * opciones.size() - 1) + 0;
        lblC.setText(opciones.get(numero).getEnunciado());
        opc.add(opciones.get(numero));
        opciones.remove(numero);

        numero = (int) (Math.random() * opciones.size() - 1) + 0;
        lblD.setText(opciones.get(numero).getEnunciado());
        opc.add(opciones.get(numero));

        this.opciones = opc;
    }

    private void cambiarTipoPreg(int tipoPreg) {
        if (tipoPreg == 2) {
            rbtnA.setVisible(false);
            rbtnB.setVisible(false);
            rbtnC.setVisible(false);
            rbtnD.setVisible(false);
        } else {
            chA.setVisible(false);
            chB.setVisible(false);
            chC.setVisible(false);
            chD.setVisible(false);
            añadirGrupoBotones();
        }
    }

    private void añadirGrupoBotones() {
        grupoBtn.add(rbtnA);
        grupoBtn.add(rbtnB);
        grupoBtn.add(rbtnC);
        grupoBtn.add(rbtnD);
    }

    public ArrayList<Opcion> getOpciones() {
        return this.opciones;
    }

    public int[] getSelecciones() {
        int[] arreglo = new int[4];
        if (tipoPreg == 1) {
            if (rbtnA.isSelected()) {
                arreglo[0] = 1;
            } else {
                arreglo[0] = 0;
            }
            if (rbtnB.isSelected()) {
                arreglo[1] = 1;
            } else {
                arreglo[1] = 0;
            }
            if (rbtnC.isSelected()) {
                arreglo[2] = 1;
            } else {
                arreglo[2] = 0;
            }
            if (rbtnD.isSelected()) {
                arreglo[3] = 1;
            } else {
                arreglo[3] = 0;
            }
        } else {
            if (chA.isSelected()) {
                arreglo[0] = 1;
            } else {
                arreglo[0] = 0;
            }
            if (chB.isSelected()) {
                arreglo[1] = 1;
            } else {
                arreglo[1] = 0;
            }
            if (chC.isSelected()) {
                arreglo[2] = 1;
            } else {
                arreglo[2] = 0;
            }
            if (chD.isSelected()) {
                arreglo[3] = 1;
            } else {
                arreglo[3] = 0;
            }
        }
        return arreglo;
    }
}
