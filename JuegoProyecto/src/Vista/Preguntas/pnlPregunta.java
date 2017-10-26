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
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        rbtnB = new javax.swing.JRadioButton();
        chB = new javax.swing.JCheckBox();
        lblC = new javax.swing.JLabel();
        chC = new javax.swing.JCheckBox();
        rbtnC = new javax.swing.JRadioButton();
        lblD = new javax.swing.JLabel();
        chD = new javax.swing.JCheckBox();
        rbtnD = new javax.swing.JRadioButton();

        pnlContenedor.setBackground(new java.awt.Color(0, 0, 29));

        pnlLblEnunciado.setBorder(null);

        lblEnunciado.setBackground(new java.awt.Color(0, 0, 29));
        lblEnunciado.setColumns(20);
        lblEnunciado.setForeground(new java.awt.Color(255, 255, 255));
        lblEnunciado.setRows(5);
        lblEnunciado.setBorder(null);
        pnlLblEnunciado.setViewportView(lblEnunciado);

        chA.setBackground(new java.awt.Color(0, 0, 29));

        rbtnA.setBackground(new java.awt.Color(0, 0, 29));

        lblA.setForeground(new java.awt.Color(255, 255, 255));
        lblA.setText("jLabel1");

        lblB.setForeground(new java.awt.Color(255, 255, 255));
        lblB.setText("jLabel1");

        rbtnB.setBackground(new java.awt.Color(0, 0, 29));

        chB.setBackground(new java.awt.Color(0, 0, 29));

        lblC.setForeground(new java.awt.Color(255, 255, 255));
        lblC.setText("jLabel1");

        chC.setBackground(new java.awt.Color(0, 0, 29));

        rbtnC.setBackground(new java.awt.Color(0, 0, 29));

        lblD.setForeground(new java.awt.Color(255, 255, 255));
        lblD.setText("jLabel1");

        chD.setBackground(new java.awt.Color(0, 0, 29));

        rbtnD.setBackground(new java.awt.Color(0, 0, 29));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLblEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlContenedorLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(chA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbtnA))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                                    .addComponent(chB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbtnB)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                                .addComponent(chC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnC))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                                .addComponent(chD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLblEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chA)
                    .addComponent(rbtnA)
                    .addComponent(lblA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chB)
                    .addComponent(rbtnB)
                    .addComponent(lblB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chC)
                    .addComponent(rbtnC)
                    .addComponent(lblC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chD)
                    .addComponent(rbtnD)
                    .addComponent(lblD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chA;
    private javax.swing.JCheckBox chB;
    private javax.swing.JCheckBox chC;
    private javax.swing.JCheckBox chD;
    private javax.swing.ButtonGroup grupoBtn;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblD;
    private javax.swing.JTextArea lblEnunciado;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JScrollPane pnlLblEnunciado;
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
