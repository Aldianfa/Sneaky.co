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
public class aboutpage extends javax.swing.JFrame {

    /**
     * Creates new form aboutpage
     */
    public aboutpage() {
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

        btlog = new javax.swing.JButton();
        btdata = new javax.swing.JButton();
        btmenu = new javax.swing.JButton();
        btcatalog = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btlog.setContentAreaFilled(false);
        btlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogActionPerformed(evt);
            }
        });
        getContentPane().add(btlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 19, 50, 60));

        btdata.setContentAreaFilled(false);
        btdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdataActionPerformed(evt);
            }
        });
        getContentPane().add(btdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 60, 60));

        btmenu.setContentAreaFilled(false);
        btmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 119, 80, 70));

        btcatalog.setContentAreaFilled(false);
        btcatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcatalogActionPerformed(evt);
            }
        });
        getContentPane().add(btcatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, 70));

        btadd.setContentAreaFilled(false);
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        getContentPane().add(btadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aboutus.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btlogActionPerformed

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

    private void btdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdataActionPerformed
        new datapage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btdataActionPerformed

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
            java.util.logging.Logger.getLogger(aboutpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aboutpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aboutpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aboutpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aboutpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btcatalog;
    private javax.swing.JButton btdata;
    private javax.swing.JButton btlog;
    private javax.swing.JButton btmenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
