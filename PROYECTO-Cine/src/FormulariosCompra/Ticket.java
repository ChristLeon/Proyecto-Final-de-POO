/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosCompra;

import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author INSPIRON 15
 */
public final class Ticket extends javax.swing.JFrame {

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        super.setUndecorated(true);
        initComponents();
        super.setLocationRelativeTo(this);
        fecha();
    }

    void fecha() {
        Date dia = new Date();
        jLabelFecha.setText("Fecha: " + (dia.getDay() + 6) + "/" + (dia.getMonth() + 1) + "/" + (dia.getYear() + 1900));
        jLabelHora.setText("Hora: " + (dia.getHours()) + ":" + (dia.getMinutes()) + ":" + (dia.getSeconds()));
    }
    
    void limpiar() {
        ImageIcon i = new ImageIcon("");
        Menu.jLabelPelicula.setIcon(i);
        Menu.jTextFieldCantidadDeBoletosAdultos.setText("");
        Menu.buttonGroup1.clearSelection();
        Menu.jComboBoxHora.setSelectedIndex(0);
        Menu.jComboBoxPeliculas.setSelectedIndex(0);
        Menu.jTextFieldCantidadDeBoletosNiños.setVisible(true);
        Menu.jTextFieldCantidadDeBoletosNiños.setText("");

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
        jLabel4 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelTanda = new javax.swing.JLabel();
        jLabelSala = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabeNiños = new javax.swing.JLabel();
        jLabeNiñosTotal = new javax.swing.JLabel();
        jLabeAdultos = new javax.swing.JLabel();
        jLabeAdultosTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabeTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabeEfectivoRecibido = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabeCambio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Boleta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 26, -1, -1));

        jLabelHora.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jPanel1.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 56, 111, 21));

        jLabelFecha.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 56, 111, 21));

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel7.setText("Pelicula................");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 84, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel8.setText("Sala.......................");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 114, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel9.setText("Hora/Función..............");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 139, -1, -1));

        jLabelTanda.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabelTanda.setText("...");
        jPanel1.add(jLabelTanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 139, -1, -1));

        jLabelSala.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabelSala.setText("...");
        jPanel1.add(jLabelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 114, -1, -1));

        jLabelPelicula.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabelPelicula.setText("...");
        jPanel1.add(jLabelPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 84, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel10.setText("Niños...........................");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 199, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel11.setText("Adultos........................");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 169, -1, -1));

        jLabeNiños.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeNiños.setText("...");
        jPanel1.add(jLabeNiños, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 199, -1, -1));

        jLabeNiñosTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeNiñosTotal.setText("...");
        jPanel1.add(jLabeNiñosTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 199, -1, -1));

        jLabeAdultos.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeAdultos.setText("...");
        jPanel1.add(jLabeAdultos, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 169, -1, -1));

        jLabeAdultosTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeAdultosTotal.setText("...");
        jPanel1.add(jLabeAdultosTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 169, -1, -1));

        jLabel12.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL..........................");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 236, -1, -1));

        jLabeTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeTotal.setText("...");
        jPanel1.add(jLabeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 236, -1, -1));

        jLabel13.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel13.setText("Efectivo recibido.............");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 273, -1, -1));

        jLabeEfectivoRecibido.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeEfectivoRecibido.setText("...");
        jPanel1.add(jLabeEfectivoRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 273, -1, -1));

        jLabel14.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel14.setText("Cambio...........................");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabeCambio.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabeCambio.setText("...");
        jPanel1.add(jLabeCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel15.setText("¡Gracias por su compra!");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 355, -1, -1));

        jButton1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jButton1.setText("Finalizar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 392, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
        JOptionPane.showMessageDialog(this, "¡Finalizado!", "Boleta", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabeAdultos;
    public static javax.swing.JLabel jLabeAdultosTotal;
    public static javax.swing.JLabel jLabeCambio;
    public static javax.swing.JLabel jLabeEfectivoRecibido;
    public static javax.swing.JLabel jLabeNiños;
    public static javax.swing.JLabel jLabeNiñosTotal;
    public static javax.swing.JLabel jLabeTotal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    public static javax.swing.JLabel jLabelPelicula;
    public static javax.swing.JLabel jLabelSala;
    public static javax.swing.JLabel jLabelTanda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
