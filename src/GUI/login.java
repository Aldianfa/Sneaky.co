/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import koneksi.konek;

/**
 *
 * @author ASUS
 */
public class login extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form login
     */
    public login() {
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

        btlogin = new javax.swing.JButton();
        tuser = new javax.swing.JTextField();
        tpass = new javax.swing.JPasswordField();
        btregis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btlogin.setContentAreaFilled(false);
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        getContentPane().add(btlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 530, 180, 50));

        tuser.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        tuser.setBorder(null);
        getContentPane().add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 316, 300, 60));

        tpass.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        tpass.setBorder(null);
        getContentPane().add(tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 430, 300, 60));

        btregis.setContentAreaFilled(false);
        btregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregisActionPerformed(evt);
            }
        });
        getContentPane().add(btregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LoginPage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM dblogin Where username=? and password=?";
        try{
            conn = konek.configDB();
            pst = (PreparedStatement)conn.prepareStatement(sql);
            pst.setString(1, tuser.getText());
            pst.setString(2, tpass.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                Menupage menu = new Menupage();
                menu.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Login Berhasil!");
        }    
    }//GEN-LAST:event_btloginActionPerformed

    private void btregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregisActionPerformed
        // TODO add your handling code here:
        new regispage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregisActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlogin;
    private javax.swing.JButton btregis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
