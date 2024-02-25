
package javaproject_1;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego A. Vivolo
 */
public class GestionCiudad extends javax.swing.JFrame {
    

    private CiudadList cuidades;
    private RutaList rutas;
    

    /**
     * Creates new form GestionCiudad
     */
    public GestionCiudad() {
        initComponents();
        setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ciudadesBack = new javax.swing.JButton();
        saveCiudades = new javax.swing.JButton();
        addCiudad = new javax.swing.JButton();
        eraseCiudad = new javax.swing.JButton();
        addRuta = new javax.swing.JButton();
        eraseRuta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        CiudadtableModel = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Rutatablemodel = new javax.swing.JTable();
        jTextFieldaddC = new javax.swing.JTextField();
        jTextFielderaseC = new javax.swing.JTextField();
        textAddRuta = new javax.swing.JTextField();
        textRemoveRuta = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ciudadesBack.setText("Volver");
        ciudadesBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadesBackActionPerformed(evt);
            }
        });

        saveCiudades.setText("Guardar");
        saveCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCiudadesActionPerformed(evt);
            }
        });

        addCiudad.setText("Agregar Ciudad");
        addCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCiudadActionPerformed(evt);
            }
        });

        eraseCiudad.setText("Eliminar Ciudad");

        addRuta.setText("Agregar Ruta");
        addRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRutaActionPerformed(evt);
            }
        });

        eraseRuta.setText("Eliminar Ruta");
        eraseRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseRutaActionPerformed(evt);
            }
        });

        CiudadtableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre "
            }
        ));
        CiudadtableModel.setToolTipText("");
        jScrollPane5.setViewportView(CiudadtableModel);

        Rutatablemodel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comienza en:", "Termina en:", "Distancia "
            }
        ));
        jScrollPane6.setViewportView(Rutatablemodel);

        jTextFieldaddC.setText("Agregar ciudad...");
        jTextFieldaddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaddCActionPerformed(evt);
            }
        });

        jTextFielderaseC.setText("Eliminar ciudad...");
        jTextFielderaseC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielderaseCActionPerformed(evt);
            }
        });

        textAddRuta.setText("Agregar ruta");

        textRemoveRuta.setText("Eliminar ruta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(ciudadesBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(textRemoveRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addComponent(jTextFieldaddC))
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFielderaseC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eraseCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eraseRuta))
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(textAddRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(textRemoveRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eraseRuta))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldaddC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFielderaseC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(textAddRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addCiudad)
                                    .addComponent(eraseCiudad)
                                    .addComponent(addRuta))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciudadesBack)
                            .addComponent(saveCiudades)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCiudadActionPerformed
        
        String nombre = jTextFieldaddC.getText();
        Ciudad c = new Ciudad(nombre);
        ciudades.add(c);
        
        fillJtable();
        
    }//GEN-LAST:event_addCiudadActionPerformed

    private void saveCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveCiudadesActionPerformed

    private void eraseRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eraseRutaActionPerformed

    private void ciudadesBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadesBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_ciudadesBackActionPerformed

    private void addRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRutaActionPerformed
        int row = rutas.getSize();
        routesTableModel.setValueAt("", row, 0);               
        routesTableModel.setValueAt(0, row, 1);
        routesTableModel.fireTableRowsInserted(row, row);
        routesTable.editCellAt(row, 0);
    }                                   
        
    }//GEN-LAST:event_addRutaActionPerformed

    private void jTextFielderaseCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielderaseCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielderaseCActionPerformed

    private void jTextFieldaddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaddCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaddCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCiudad().setVisible(true);
            }
        });
    }
    
    ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
    
    public void fillJtable(){
        DefaultTableModel datos = (DefaultTableModel)  CiudadtableModel.getModel();
        
        datos.setNumRows(0);
        
        for (Ciudad ciudad : ciudades){
            Object[] file = {ciudad.getName()};
            datos.addRow(file);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CiudadtableModel;
    private javax.swing.JTable Rutatablemodel;
    private javax.swing.JButton addCiudad;
    private javax.swing.JButton addRuta;
    private javax.swing.JButton ciudadesBack;
    private javax.swing.JButton eraseCiudad;
    private javax.swing.JButton eraseRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextFieldaddC;
    private javax.swing.JTextField jTextFielderaseC;
    private javax.swing.JButton saveCiudades;
    private javax.swing.JTextField textAddRuta;
    private javax.swing.JTextField textRemoveRuta;
    // End of variables declaration//GEN-END:variables

