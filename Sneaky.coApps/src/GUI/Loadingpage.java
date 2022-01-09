
package GUI;

public class Loadingpage extends javax.swing.JFrame {

    /**
     * Creates new form Loadingpage
     */
    public Loadingpage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barload = new javax.swing.JProgressBar();
        loadingimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barload.setBackground(new java.awt.Color(204, 204, 204));
        barload.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(barload, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 230, -1));

        loadingimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Loading Page.jpg"))); // NOI18N
        loadingimg.setText("jLabel1");
        getContentPane().add(loadingimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
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
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Loadingpage lp = new Loadingpage();
        lp.setVisible(true);
            for (int i=0;i<=100;i++){
                Thread.sleep(40);
                lp.setVisible(true);
                lp.barload.setValue(i);
                
                if(i==100){
                    login login = new login();
                    login.setVisible(true);
                    lp.dispose();
                }
            }                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barload;
    private javax.swing.JLabel loadingimg;
    // End of variables declaration//GEN-END:variables
}
