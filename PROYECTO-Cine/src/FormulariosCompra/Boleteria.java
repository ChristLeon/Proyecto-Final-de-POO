/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosCompra;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author INSPIRON 15
 */
public class Boleteria extends javax.swing.JInternalFrame{

    /**
     * Creates new form Menu
     */
    public Boleteria() {
        initComponents();
        super.setTitle("Boleteria");
        super.setResizable(false);
        Desactivados();
    }

    void Encender() {
        if (jToggleButtonEncender.isSelected()) {
            jComboBoxPeliculas.setEnabled(true);
            jComboBoxHora.setEnabled(true);
            AgregarAComboboxPelicula();

            jToggleButtonEncender.setText("Apagar");
        } else {
            jComboBoxPeliculas.setEnabled(false);
            jComboBoxHora.setEnabled(false);
            limpiar();
            Desactivados();
            jToggleButtonEncender.setText("Encender");
        }
    }

    void Desactivados() {
        jComboBoxPeliculas.setEnabled(false);
        jComboBoxHora.setEnabled(false);
        jRadioButtonEfectivo.setEnabled(false);
        jRadioButtonTCredito.setEnabled(false);
        jTextFieldCantidadDeBoletosAdultos.setEnabled(false);
        jTextFieldCantidadDeBoletosNiños.setEnabled(false);
        jButtonContinuar.setEnabled(false);
    }

    void Activar() {
        jRadioButtonEfectivo.setEnabled(true);
        jRadioButtonTCredito.setEnabled(true);
        jTextFieldCantidadDeBoletosAdultos.setEnabled(true);
        jTextFieldCantidadDeBoletosNiños.setEnabled(true);
        jButtonContinuar.setEnabled(true);
    }

    void AgregarAComboboxPelicula() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        modelo.addElement("Thor Amor...");
        modelo.addElement("Minions");
        modelo.addElement("La Ciudad...");
        modelo.addElement("Spider-Man...");

        jComboBoxPeliculas.setModel(modelo);

    }

    void seleccionPelicula() {
        int combo;
        combo = jComboBoxPeliculas.getSelectedIndex();
        if (combo == 1 || combo == 2 || combo == 3 || combo == 4) {
            Activar();
        } else {
            jRadioButtonEfectivo.setEnabled(false);
            jRadioButtonTCredito.setEnabled(false);
            jTextFieldCantidadDeBoletosAdultos.setEnabled(false);
            jTextFieldCantidadDeBoletosNiños.setEnabled(false);
            jButtonContinuar.setEnabled(false);
        }
    }

    void caratulas() {
        int combo;
        combo = jComboBoxPeliculas.getSelectedIndex();
        switch (combo) {
            case 0: {
                ImageIcon i = new ImageIcon("");
                jLabelPelicula.setIcon(i);
                break;
            }
            case 1: {
                LimCantidad();
                Preview.jLabelSala.setText("4");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/Thor.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("2:00 pm");
                modelo.addElement("5:30 pm");
                modelo.addElement("7:15 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 2: {
                LimCantidad();
                Preview.jLabelSala.setText("2");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/Minions.png");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("1:20 pm");
                modelo.addElement("4:15 pm");
                modelo.addElement("6:45 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 3: {
                LimCantidad();
                Preview.jLabelSala.setText("3");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/LaCiudad.png");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("3:00 pm");
                modelo.addElement("4:30 pm");
                modelo.addElement("6:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 4: {
                LimCantidad();
                Preview.jLabelSala.setText("5");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/spider.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("12:00 pm");
                modelo.addElement("8:00 pm");
                modelo.addElement("10:30 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            default:
                break;
        }
    }

    void LimCantidad() {
        jTextFieldCantidadDeBoletosAdultos.setText("");
        jTextFieldCantidadDeBoletosNiños.setText("");
    }

    void limpiar() {
        ImageIcon i = new ImageIcon("");
        jLabelPelicula.setIcon(i);
        jTextFieldCantidadDeBoletosAdultos.setText("");
        buttonGroup1.clearSelection();
        jComboBoxPeliculas.removeAllItems();
        jComboBoxHora.removeAllItems();
    }

    void calculo() {

        double cantidadAdultos = 0.0, cantidadNiños = 0.0;
        double precioAdultos = 0.0, precioNiños = 0.0;
        double TotalN = 0, TotalA = 0, Total;

        if ("".equals(jTextFieldCantidadDeBoletosNiños.getText())) {
            String ninguno = "0.0";
            Preview.jLabelTotalNiños.setText(ninguno);
            Preview.jTextFieldCantidadDeBoletosNiños.setText("0");
        } else {
            cantidadNiños = Double.parseDouble(jTextFieldCantidadDeBoletosNiños.getText());
            precioNiños = Double.parseDouble(jLabelPrecio2DNiños.getText());
            TotalN = (cantidadNiños * precioNiños);
            Preview.jLabelTotalNiños.setText(TotalN + "");
        }

        if ("".equals(jTextFieldCantidadDeBoletosAdultos.getText())) {
            jTextFieldCantidadDeBoletosAdultos.setText("");
        } else {

            cantidadAdultos = Double.parseDouble(jTextFieldCantidadDeBoletosAdultos.getText());
            precioAdultos = Double.parseDouble(jLabelPrecio2DAdulto.getText());
            TotalA = (cantidadAdultos * precioAdultos);
            Preview.jLabelTotalAdultos.setText(TotalA + "");
        }
        Total = TotalA + TotalN;
        Preview.jLabelTotalPago.setText(Total + "");

    }

    void pasaDatos() {
        Preview.jTextFieldCantidadDeBoletosAdultos.setText(jTextFieldCantidadDeBoletosAdultos.getText());
        Preview.jTextFieldCantidadDeBoletosNiños.setText(jTextFieldCantidadDeBoletosNiños.getText());
    }
    
    void tarjeta(){
        if (jRadioButtonTCredito.isSelected()) {
            Preview.jTextFieldEfectivoRecibido.setText("Paga con tarjeta");
            Preview.jTextFieldEfectivoRecibido.setEditable(false);
            Preview.jLabel14.setVisible(false);
            Preview.jButton3.setVisible(false);
            Preview.jButton1.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonTCredito = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jComboBoxPeliculas = new javax.swing.JComboBox<>();
        jToggleButtonEncender = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelPrecio2DAdulto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelPrecio2DNiños = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCantidadDeBoletosAdultos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCantidadDeBoletosNiños = new javax.swing.JTextField();
        jButtonContinuar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButtonEfectivo = new javax.swing.JRadioButton();
        jLabelPelicula = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        buttonGroup1.add(jRadioButtonTCredito);
        jRadioButtonTCredito.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jRadioButtonTCredito.setText("Tarjeta de crédito");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Boletos");
        jPanel3.add(jLabel1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(197, 175, 175));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxPeliculas.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jComboBoxPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeliculasActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBoxPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 41, 182, -1));

        jToggleButtonEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/power.png"))); // NOI18N
        jToggleButtonEncender.setText("Encender");
        jToggleButtonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEncenderActionPerformed(evt);
            }
        });
        jPanel7.add(jToggleButtonEncender, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel2.setText("Peliculas");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 11, -1, -1));

        jPanel7.add(jComboBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 41, 89, 71));

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel3.setText("Hora");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 11, -1, -1));

        jPanel1.setBackground(new java.awt.Color(197, 175, 175));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelPrecio2DAdulto.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jLabelPrecio2DAdulto.setText("12");

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel4.setText("Precios Adultos");

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel8.setText("Precios Niños");

        jLabelPrecio2DNiños.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jLabelPrecio2DNiños.setText("8");

        jLabel11.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel11.setText("Adultos");

        jLabel12.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad:");

        jTextFieldCantidadDeBoletosAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadDeBoletosAdultosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel7.setText("Forma de pago");

        jPanel5.setBackground(new java.awt.Color(197, 175, 175));

        jLabel15.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel15.setText("Niños");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldCantidadDeBoletosNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCantidadDeBoletosNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButtonContinuar.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        jLabel17.setText("S/");

        jLabel18.setText("S/");

        jLabel14.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel14.setText("Boletos");

        buttonGroup1.add(jRadioButtonEfectivo);
        jRadioButtonEfectivo.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jRadioButtonEfectivo.setText("Efectivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelPrecio2DNiños)
                                    .addGap(61, 61, 61))
                                .addComponent(jButtonContinuar))
                            .addGap(38, 38, 38))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(181, 181, 181)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addComponent(jLabel14)))
                            .addGap(63, 63, 63)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPrecio2DAdulto))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jTextFieldCantidadDeBoletosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(37, 37, 37)))
                        .addGap(179, 179, 179)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabelPrecio2DAdulto)
                    .addComponent(jLabelPrecio2DNiños)
                    .addComponent(jLabel18)
                    .addComponent(jRadioButtonEfectivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCantidadDeBoletosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonContinuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 113, 567, -1));

        jLabelPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabelPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 113, 182, 253));

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(197, 175, 175));

        jMenu1.setText("Desarrollador");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEncenderActionPerformed
        Encender();
    }//GEN-LAST:event_jToggleButtonEncenderActionPerformed

    private void jComboBoxPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeliculasActionPerformed
        seleccionPelicula();
        caratulas();
    }//GEN-LAST:event_jComboBoxPeliculasActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        if (jComboBoxPeliculas.getSelectedIndex() == 0 || jComboBoxHora.getSelectedIndex() == 0 || jTextFieldCantidadDeBoletosAdultos.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Todavía hacen falta datos por completar", "Complete datos", JOptionPane.WARNING_MESSAGE);
        } else {
            Preview obj = new Preview();
            pasaDatos();
            Preview.jTextFieldPelicula.setText(jComboBoxPeliculas.getSelectedItem().toString());
            Preview.jTextFieldHora.setText(jComboBoxHora.getSelectedItem().toString());
            tarjeta();
            calculo();
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jTextFieldCantidadDeBoletosAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadDeBoletosAdultosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadDeBoletosAdultosActionPerformed

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
      
    }//GEN-LAST:event_jMenu1MouseEntered

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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonContinuar;
    public static javax.swing.JComboBox<String> jComboBoxHora;
    public static javax.swing.JComboBox<String> jComboBoxPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabelPelicula;
    private javax.swing.JLabel jLabelPrecio2DAdulto;
    private javax.swing.JLabel jLabelPrecio2DNiños;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JRadioButton jRadioButtonEfectivo;
    private javax.swing.JRadioButton jRadioButtonTCredito;
    public static javax.swing.JTextField jTextFieldCantidadDeBoletosAdultos;
    public static javax.swing.JTextField jTextFieldCantidadDeBoletosNiños;
    public static javax.swing.JToggleButton jToggleButtonEncender;
    // End of variables declaration//GEN-END:variables
}
