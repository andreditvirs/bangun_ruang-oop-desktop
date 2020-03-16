package bangunruang;

public class MenuBangunRuang extends javax.swing.JFrame {

    public MenuBangunRuang() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JudulProgram = new javax.swing.JLabel();
        tombolMenuBangunRuang1 = new javax.swing.JButton();
        tombolMenuBangunRuang2 = new javax.swing.JButton();
        labelMenuPilihBangunRuang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        JudulProgram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JudulProgram.setText("Program Java : Bangun Ruang");

        tombolMenuBangunRuang1.setText("BALOK");
        tombolMenuBangunRuang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuBangunRuang1ActionPerformed(evt);
            }
        });

        tombolMenuBangunRuang2.setText("BOLA");
        tombolMenuBangunRuang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolMenuBangunRuang2ActionPerformed(evt);
            }
        });

        labelMenuPilihBangunRuang.setText("Pilih Bangun Ruang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addComponent(JudulProgram)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tombolMenuBangunRuang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tombolMenuBangunRuang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelMenuPilihBangunRuang)
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JudulProgram)
                .addGap(11, 11, 11)
                .addComponent(labelMenuPilihBangunRuang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolMenuBangunRuang1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolMenuBangunRuang2)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolMenuBangunRuang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuBangunRuang1ActionPerformed
        ViewPilihan inputPilihan = new ViewPilihan("Menu");
        int pilihan=inputPilihan.pilihan;
        switch (pilihan){
            case 1 :{
                     this.dispose();
                     new InputBalokFrame().setVisible(true);
                     break;
                    }
            case 2 :{
                    this.dispose();
                    new MenuHitungBangunRuang().setVisible(true);
                    break;
            }
        }
    }//GEN-LAST:event_tombolMenuBangunRuang1ActionPerformed

    private void tombolMenuBangunRuang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolMenuBangunRuang2ActionPerformed
        ViewPilihan inputPilihan = new ViewPilihan("Menu");
        int pilihan=inputPilihan.pilihan;
        switch (pilihan){
            case 1 :{
                     this.dispose();
                     new InputBolaFrame().setVisible(true);
                     break;
                    }
            case 2 :{
                    this.dispose();
                    new MenuHitungBangunRuang().setVisible(true);
                    break;
            }
    }//GEN-LAST:event_tombolMenuBangunRuang2ActionPerformed
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBangunRuang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JudulProgram;
    private javax.swing.JLabel labelMenuPilihBangunRuang;
    private javax.swing.JButton tombolMenuBangunRuang1;
    private javax.swing.JButton tombolMenuBangunRuang2;
    // End of variables declaration//GEN-END:variables
}
