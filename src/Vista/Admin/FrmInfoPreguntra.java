/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Admin;

import Controlador.CtlPregunta;

/**
 *
 * @author Nicolas Davila
 */
public final class FrmInfoPreguntra extends javax.swing.JFrame {

    String idPreguntas = "";
    CtlPregunta contrPregunta = new CtlPregunta();

    /**
     * Creates new form FrmInfoPreguntra
     *
     * @param idPregunta
     */
    public FrmInfoPreguntra(String idPregunta) {
        initComponents();
        idPreguntas = idPregunta;
        traerDatos();
        traerOpciones();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblMostrarEnunciado8 = new javax.swing.JLabel();
        checkOpcion1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        checkOpcion4 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        checkOpcion2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        checkOpcion3 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion de la pregunta");

        jPanel11.setBackground(new java.awt.Color(0, 135, 150));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMostrarEnunciado8.setText("jLabel2");
        jPanel3.add(lblMostrarEnunciado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        checkOpcion1.setBackground(new java.awt.Color(204, 204, 204));
        checkOpcion1.setEnabled(false);
        jPanel3.add(checkOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 71, -1, 14));

        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 71, -1, -1));

        checkOpcion4.setBackground(new java.awt.Color(204, 204, 204));
        checkOpcion4.setEnabled(false);
        jPanel3.add(checkOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 218, -1, 14));

        jLabel10.setText("jLabel9");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 218, -1, -1));

        checkOpcion2.setBackground(new java.awt.Color(204, 204, 204));
        checkOpcion2.setEnabled(false);
        jPanel3.add(checkOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 14));

        jLabel11.setText("jLabel9");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 120, -1, -1));

        checkOpcion3.setBackground(new java.awt.Color(204, 204, 204));
        checkOpcion3.setEnabled(false);
        jPanel3.add(checkOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 169, -1, 14));

        jLabel12.setText("jLabel9");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 169, -1, -1));

        btnInformacion.setBackground(new java.awt.Color(75, 117, 137));
        btnInformacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(0, 0, 29));
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/information-button.png"))); // NOI18N
        btnInformacion.setText("VOLVER");
        btnInformacion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID pregunta:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Porcentaje de acierto:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("jLabel8");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de la pregunta:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("jLabel2");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tema de la pregunta:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnInformacionActionPerformed

    public String validarTipoPregunta() {
        if (contrPregunta.traerPregunta(Integer.parseInt(idPreguntas)).getIdTipoPregunta() == 2) {
            return "Multiple Respuesta";
        }
        return "Unica Respuesta";
    }

    public void traerDatos() {
        lblMostrarEnunciado8.setText(contrPregunta.traerPregunta(Integer.parseInt(idPreguntas)).getEnunciado());
        jLabel6.setText(idPreguntas);
        jLabel2.setText(validarTipoPregunta());
        jLabel4.setText(contrPregunta.traerDato("tema", "nombre", "idTema", contrPregunta.traerPregunta(Integer.parseInt(idPreguntas)).getIdTema() + ""));
        jLabel8.setText(contrPregunta.Acierto(idPreguntas));
    }
    
    public void traerOpciones(){
        int[] opciones;
        opciones=contrPregunta.traerOpciones(Integer.parseInt(idPreguntas));
        jLabel9.setText(contrPregunta.traerDato("opcion", "enunciado", "idOpcion", opciones[0]+""));
        jLabel11.setText(contrPregunta.traerDato("opcion", "enunciado", "idOpcion", opciones[1]+""));
        jLabel12.setText(contrPregunta.traerDato("opcion", "enunciado", "idOpcion", opciones[2]+""));
        jLabel10.setText(contrPregunta.traerDato("opcion", "enunciado", "idOpcion", opciones[3]+""));
        
        if (contrPregunta.traerDato("opcion", "correcta", "idOpcion", opciones[0]+"").equalsIgnoreCase("1")) {
            checkOpcion1.setSelected(true);
        }
        if (contrPregunta.traerDato("opcion", "correcta", "idOpcion", opciones[1]+"").equalsIgnoreCase("1")) {
            checkOpcion2.setSelected(true);
        }
        if (contrPregunta.traerDato("opcion", "correcta", "idOpcion", opciones[2]+"").equalsIgnoreCase("1")) {
            checkOpcion3.setSelected(true);
        }
        if (contrPregunta.traerDato("opcion", "correcta", "idOpcion", opciones[3]+"").equalsIgnoreCase("1")) {
            checkOpcion4.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacion;
    private javax.swing.JCheckBox checkOpcion1;
    private javax.swing.JCheckBox checkOpcion2;
    private javax.swing.JCheckBox checkOpcion3;
    private javax.swing.JCheckBox checkOpcion4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMostrarEnunciado8;
    // End of variables declaration//GEN-END:variables
}
