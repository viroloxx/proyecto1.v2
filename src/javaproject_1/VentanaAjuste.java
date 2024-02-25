/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class VentanaAjuste extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAjuste
     */
    public VentanaAjuste() {
        initComponents();
        setSize(615,460);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setVisible(true);
    }

        initComponents();
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
        ciclos = new javax.swing.JTextField();
        bHormigas = new javax.swing.JTextField();
        bFeromonas = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        aplicar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 214, -1, -1));

        ciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciclosActionPerformed(evt);
            }
        });
        getContentPane().add(ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 84, 70, -1));

        bHormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHormigasActionPerformed(evt);
            }
        });
        getContentPane().add(bHormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 130, 70, -1));
        getContentPane().add(bFeromonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 176, 70, -1));

        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 220, -1, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 280, -1, -1));

        aplicar.setText("Aplicar");
        aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarActionPerformed(evt);
            }
        });
        getContentPane().add(aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 280, 73, -1));

        jLabel1.setText("Numero de ciclos requeridos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 84, 235, 28));

        jLabel2.setText("Numero de hormigas que desea:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 136, 235, -1));

        jLabel3.setText("Grado de importancia de las feromonas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 182, 235, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciclosActionPerformed

    private void aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarActionPerformed
        
        VentanaOpcion vOpcion = new VentanaOpcion(this);
    }//GEN-LAST:event_aplicarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        VentanaOpcion vOpcion = new VentanaOpcion(this);
    }//GEN-LAST:event_volverActionPerformed

    private void bHormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHormigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bHormigasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAjuste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicar;
    private javax.swing.JTextField bFeromonas;
    private javax.swing.JTextField bHormigas;
    private javax.swing.JTextField ciclos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
