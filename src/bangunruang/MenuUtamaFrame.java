package bangunruang;

public class MenuUtamaFrame extends javax.swing.JFrame {

    public MenuUtamaFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JudulProgram = new javax.swing.JLabel();
        tombolMenuUtama1 = new javax.swing.JButton();
        tombolMenuUtama2 = new javax.swing.JButton();
        tombolMenuUtama3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        JudulProgram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JudulProgram.setText("Program Java : Bangun Ruang");

        tombolMenuUtama1.setText("INPUT BANGUN RUANG");
        tombolMenuUtama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuUtama1ActionPerformed(evt);
            }
        });

        tombolMenuUtama2.setText("HITUNG VOLUME");
        tombolMenuUtama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuUtama2ActionPerformed(evt);
            }
        });

        tombolMenuUtama3.setText("SELESAI");
        tombolMenuUtama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuUtama3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JudulProgram)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tombolMenuUtama1)
                        .addGap(122, 122, 122))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tombolMenuUtama2)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tombolMenuUtama3)
                        .addGap(157, 157, 157))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JudulProgram)
                .addGap(36, 36, 36)
                .addComponent(tombolMenuUtama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolMenuUtama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolMenuUtama3)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolMenuUtama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuUtama3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tombolMenuUtama3ActionPerformed

    private void tombolMenuUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuUtama1ActionPerformed
        ViewPilihan inputPilihan = new ViewPilihan("Menu");
        inputPilihan.pilihan=1;
        this.dispose();
        new MenuBangunRuang().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_tombolMenuUtama1ActionPerformed

    private void tombolMenuUtama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuUtama2ActionPerformed
        ViewPilihan inputPilihan = new ViewPilihan("Menu");
        inputPilihan.pilihan=2;
        this.dispose();
        new MenuBangunRuang().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_tombolMenuUtama2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtamaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JudulProgram;
    private javax.swing.JButton tombolMenuUtama1;
    private javax.swing.JButton tombolMenuUtama2;
    private javax.swing.JButton tombolMenuUtama3;
    // End of variables declaration//GEN-END:variables
}
