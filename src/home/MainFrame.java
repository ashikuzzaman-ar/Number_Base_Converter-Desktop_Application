package home;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lInputNumber = new javax.swing.JLabel();
        lOutputNumber = new javax.swing.JLabel();
        tfInputNumber = new javax.swing.JTextField();
        tfOutputNumber = new javax.swing.JTextField();
        tfInputBase = new javax.swing.JTextField();
        tfOutputBase = new javax.swing.JTextField();
        bRefresh = new javax.swing.JButton();
        bConvertBase = new javax.swing.JButton();
        tfBaseToConvert = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Any Base Converter");
        setResizable(false);

        lInputNumber.setText("Input Number: ");

        lOutputNumber.setText("Output Number: ");

        tfInputNumber.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N

        tfOutputNumber.setEditable(false);
        tfOutputNumber.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        tfOutputNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOutputNumberActionPerformed(evt);
            }
        });

        tfInputBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputBaseActionPerformed(evt);
            }
        });

        tfOutputBase.setEditable(false);

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        bConvertBase.setText("Convert Base");
        bConvertBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConvertBaseActionPerformed(evt);
            }
        });

        jLabel1.setText("Output Base:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lInputNumber)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfInputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfInputBase, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfBaseToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lOutputNumber)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfOutputNumber)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bConvertBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRefresh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfOutputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfInputNumber, tfOutputNumber});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bConvertBase, bRefresh});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfInputBase, tfOutputBase});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(tfInputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lInputNumber)
                        .addComponent(tfInputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBaseToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConvertBase)
                    .addComponent(bRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lOutputNumber)
                        .addComponent(tfOutputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tfOutputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfInputNumber, tfOutputNumber});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfInputBase, tfOutputBase});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfInputBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInputBaseActionPerformed

    private void tfOutputNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOutputNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOutputNumberActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed

        try {

            this.tfInputNumber.setText("");
            this.tfInputBase.setText("");
            this.tfOutputNumber.setText("");
            this.tfOutputBase.setText("");
            this.tfBaseToConvert.setText("");

            this.tfInputNumber.setBackground(Color.WHITE);
            this.tfInputBase.setBackground(Color.WHITE);
            this.tfOutputNumber.setBackground(Color.WHITE);
            this.tfOutputBase.setBackground(Color.WHITE);
            this.tfBaseToConvert.setBackground(Color.WHITE);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bConvertBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConvertBaseActionPerformed

        try {

            String outputBase = this.tfBaseToConvert.getText();
            String inputBase = this.tfInputBase.getText();

            boolean t1 = !(inputBase.trim().equals(""));
            boolean t2 = !(outputBase.trim().equals(""));
            boolean t3 = (Integer.parseInt(inputBase) > 1 && Integer.parseInt(inputBase) < 63);
            boolean t4 = (Integer.parseInt(outputBase) > 1 && Integer.parseInt(outputBase) < 63);

            if (t1 && t2 && t3 && t4) {

                this.tfInputNumber.setBackground(Color.WHITE);
                this.tfInputBase.setBackground(Color.WHITE);
                this.tfOutputNumber.setBackground(Color.WHITE);
                this.tfOutputBase.setBackground(Color.WHITE);
                this.tfBaseToConvert.setBackground(Color.WHITE);

                this.tfOutputNumber.setText(new BaseConversion(tfInputNumber.getText(),
                        inputBase, outputBase).getNumber());
                this.tfOutputBase.setText(outputBase);
            } else {

                if (!t1) {

                    JOptionPane.showMessageDialog(null, "Input Base can not be null!");
                    this.tfInputBase.setBackground(Color.RED);
                }
                if (!t2) {

                    JOptionPane.showMessageDialog(null, "Output Base can not be null!");
                    this.tfBaseToConvert.setBackground(Color.RED);
                }
                if (!t3) {

                    JOptionPane.showMessageDialog(null, "Input Base should be 2 to 62");
                    this.tfInputBase.setBackground(Color.RED);
                }
                if (!t4) {

                    JOptionPane.showMessageDialog(null, "Output Base should be 2 to 62");
                    this.tfBaseToConvert.setBackground(Color.RED);
                }
            }
        } catch (NumberFormatException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_bConvertBaseActionPerformed

    public static void launcher() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConvertBase;
    private javax.swing.JButton bRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lInputNumber;
    private javax.swing.JLabel lOutputNumber;
    private javax.swing.JTextField tfBaseToConvert;
    private javax.swing.JTextField tfInputBase;
    private javax.swing.JTextField tfInputNumber;
    private javax.swing.JTextField tfOutputBase;
    private javax.swing.JTextField tfOutputNumber;
    // End of variables declaration//GEN-END:variables
}
