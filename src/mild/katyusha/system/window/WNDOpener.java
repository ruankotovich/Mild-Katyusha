/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mild.katyusha.system.window;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JWindow;
import mild.katyusha.system.build.TRDBundle;

/**
 *
 * @author Dmitry
 */
public class WNDOpener extends JWindow {

    /**
     * Creates new form WNDOpener
     */
    private final WNDBundle caller;

    public WNDOpener(WNDBundle calling, boolean triste) {
        initComponents();
        if (triste) {
            jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/seta_triste.png")));
        }
        this.caller = calling;
        caller.caller = this;
        this.setSize(jLabel1.getSize());
        this.setBackground(new Color(0, 0, 0, 0));
        this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        this.setLocation(this.getX(), 0);
        //this.setOpacity(0.7f);
        this.repaint();
    }

    private WNDOpener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setAlwaysOnTop(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/seta.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (caller.isSad) {
            this.jLabel1.setIcon(null);
            this.setVisible(false);
            this.dispose();
            caller.thread = new Thread(new TRDBundle(caller));
            caller.thread.start();

            try {
                this.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(WNDOpener.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.gc();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        if (!caller.isSad) {
            this.jLabel1.setIcon(null);
            this.setVisible(false);
            this.dispose();
            caller.thread = new Thread(new TRDBundle(caller));
            caller.thread.start();

            try {
                this.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(WNDOpener.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.gc();
        }
    }//GEN-LAST:event_jLabel1MouseEntered

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WNDOpener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WNDOpener().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}