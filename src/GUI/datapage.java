/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ASUS
 */
public class datapage extends javax.swing.JFrame {

    /**
     * Creates new form datapage
     */
    public datapage() {
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

        btlogout = new javax.swing.JButton();
        btriwayat = new javax.swing.JButton();
        btstock = new javax.swing.JButton();
        btcatalog = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btabout = new javax.swing.JButton();
        btmenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btlogout.setContentAreaFilled(false);
        btlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 20, 60, 60));

        btriwayat.setContentAreaFilled(false);
        btriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btriwayatActionPerformed(evt);
            }
        });
        getContentPane().add(btriwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 340, 410));

        btstock.setContentAreaFilled(false);
        btstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstockActionPerformed(evt);
            }
        });
        getContentPane().add(btstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 140, 350, 410));

        btcatalog.setContentAreaFilled(false);
        btcatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcatalogActionPerformed(evt);
            }
        });
        getContentPane().add(btcatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 80));

        btadd.setContentAreaFilled(false);
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        getContentPane().add(btadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 70));

        btabout.setContentAreaFilled(false);
        btabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaboutActionPerformed(evt);
            }
        });
        getContentPane().add(btabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 100, 70));

        btmenu.setContentAreaFilled(false);
        btmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/datapage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogoutActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btlogoutActionPerformed

    private void btmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuActionPerformed
        new Menupage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btmenuActionPerformed

    private void btcatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcatalogActionPerformed
        new catalogpage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btcatalogActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        new addpage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btaddActionPerformed

    private void btaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaboutActionPerformed
        new aboutpage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btaboutActionPerformed

    private void btstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstockActionPerformed
        new stockpage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btstockActionPerformed

    private void btriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btriwayatActionPerformed
        new historypage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btriwayatActionPerformed

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
            java.util.logging.Logger.getLogger(datapage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datapage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datapage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datapage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datapage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btabout;
    private javax.swing.JButton btadd;
    private javax.swing.JButton btcatalog;
    private javax.swing.JButton btlogout;
    private javax.swing.JButton btmenu;
    private javax.swing.JButton btriwayat;
    private javax.swing.JButton btstock;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
