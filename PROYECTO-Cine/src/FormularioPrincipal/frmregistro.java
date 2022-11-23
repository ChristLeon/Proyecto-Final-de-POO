
package FormularioPrincipal;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Conexion.ConexionBD;
import java.sql.Statement;

public class frmregistro extends javax.swing.JFrame {

    ConexionBD ccre=new ConexionBD();
    Connection con=ccre.getConexion();
    
    public frmregistro() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombresregistro = new javax.swing.JTextField();
        txtapellidosregistro = new javax.swing.JTextField();
        txtcelularregistro = new javax.swing.JTextField();
        txtemailregistro = new javax.swing.JTextField();
        btnregistrarcliente1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtclaveregistro = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 229, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoregistro.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 260));

        txtnombresregistro.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel1.add(txtnombresregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 30));

        txtapellidosregistro.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtapellidosregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosregistroActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellidosregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 30));

        txtcelularregistro.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtcelularregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularregistroActionPerformed(evt);
            }
        });
        jPanel1.add(txtcelularregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 30));

        txtemailregistro.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtemailregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailregistroActionPerformed(evt);
            }
        });
        jPanel1.add(txtemailregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, 30));

        btnregistrarcliente1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnregistrarcliente1.setText("REGISTRAR");
        btnregistrarcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarcliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrarcliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 140, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText(" Clave (8 max)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 140, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setText("Celular");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setText("Correo Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, -1));

        txtclaveregistro.setText("jPasswordField1");
        jPanel1.add(txtclaveregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidosregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosregistroActionPerformed

    private void txtcelularregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularregistroActionPerformed

    private void txtemailregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailregistroActionPerformed

    private void btnregistrarcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarcliente1ActionPerformed
        // TODO add your handling code here:
        Registrar();
        
    }//GEN-LAST:event_btnregistrarcliente1ActionPerformed

    void limpiar(){
        txtnombresregistro.setText("");
        txtapellidosregistro.setText("");
        txtcelularregistro.setText("");
        txtemailregistro.setText("");
        txtclaveregistro.setText("");   
    }
        
    void Registrar(){
        String nombre=txtnombresregistro.getText();
        String apellido=txtapellidosregistro.getText();
        String celular=txtcelularregistro.getText();
        String email=txtemailregistro.getText();
        String pass=txtclaveregistro.getText();
        
        if(nombre.isEmpty()||apellido.isEmpty()||celular.isEmpty()||email.isEmpty()||pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS DATOS");
        }
        else{
            try{
                String consulta="INSERT INTO RegistroClientes(Nombres,Apellidos,Celular,Email,Clave) VALUES('"+nombre+"','"+apellido+"','"+celular+"','"+email+"','"+pass+"')";
                Statement stconsulta=con.createStatement();
                stconsulta.executeUpdate(consulta);
                limpiar();
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
                dispose();
                frmlogin log=new frmlogin();
                log.setVisible(true);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "NO SE LOGRÓ GUARDAR AL USUARIO"+e);
            }
        }
}
        
        
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
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrarcliente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtapellidosregistro;
    private javax.swing.JTextField txtcelularregistro;
    private javax.swing.JPasswordField txtclaveregistro;
    private javax.swing.JTextField txtemailregistro;
    private javax.swing.JTextField txtnombresregistro;
    // End of variables declaration//GEN-END:variables
}
