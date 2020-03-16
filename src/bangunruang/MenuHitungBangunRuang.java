package bangunruang;

import java.util.ArrayList;

public class MenuHitungBangunRuang extends javax.swing.JFrame {
    ArrayList<BangunRuang> list = new ArrayList<>();
    public MenuHitungBangunRuang() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JudulProgram = new javax.swing.JLabel();
        labelMenuHitungBangunRuang = new javax.swing.JLabel();
        textBoxIndeks = new javax.swing.JTextField();
        labelVolume = new javax.swing.JLabel();
        textBoxVolume = new javax.swing.JTextField();
        tombolOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        JudulProgram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JudulProgram.setText("Program Java : Bangun Ruang");

        labelMenuHitungBangunRuang.setText("Masukkan Indeks");

        labelVolume.setText("Volume");

        tombolOK.setText("OK");
        tombolOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JudulProgram)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelVolume)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelMenuHitungBangunRuang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textBoxIndeks)
                            .addComponent(textBoxVolume)
                            .addComponent(tombolOK, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JudulProgram)
                .addGap(11, 11, 11)
                .addComponent(labelMenuHitungBangunRuang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textBoxIndeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(tombolOK)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVolume)
                    .addComponent(textBoxVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolOKActionPerformed
                ViewPilihanOutput pilihanOutput = new ViewPilihanOutput("Masukkan Indeks");
                BangunRuang bangunruang = null;
                try{
                    bangunruang = list.get(pilihanOutput.pilihan);
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Indeks salah");
                }
                if (bangunruang instanceof Balok){
                    BangunRuang balok = list.get(pilihanOutput.pilihan);
                    ViewDasarOutput viewOutput = new ViewDasarOutput("Hasil Perhitungan Volume", balok);
                    textBoxVolume.setText(viewOutPut.toString(balok.getVolume()));
                }
                else if (bangunruang instanceof Bola){
                    BangunRuang bola = list.get(pilihanOutput.pilihan);
                    ViewDasarOutput viewOutput = new ViewDasarOutput("Hasil Perhitungan Volume", bola);
                    
                }
    }//GEN-LAST:event_tombolOKActionPerformed
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuHitungBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuHitungBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuHitungBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuHitungBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuHitungBangunRuang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JudulProgram;
    private javax.swing.JLabel labelMenuHitungBangunRuang;
    private javax.swing.JLabel labelVolume;
    private javax.swing.JTextField textBoxIndeks;
    private javax.swing.JTextField textBoxVolume;
    private javax.swing.JButton tombolOK;
    // End of variables declaration//GEN-END:variables
}
