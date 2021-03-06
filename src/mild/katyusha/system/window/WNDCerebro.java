/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mild.katyusha.system.window;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author Dmitry
 */
public class WNDCerebro extends JDialog {

    /**
     * Creates new form WNDCerebro
     */
    public WNDBundle caller;

    public WNDCerebro(WNDBundle calling) {
        initComponents();
        this.caller = calling;
        this.setIconImage(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/icone_cerebro.png")).getImage());
        this.setTitle("Editor de interpretações");
        this.setLocationRelativeTo(null);
        reiniciarCores();
    }

    private WNDCerebro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reiniciarCores() {
        jLbSistema.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_sistema_off.png")));
        jLbTwigs.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_audio_off.png")));
        jLbAlias.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_execute_off.png")));
        jLbBackup.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_pesquise_off.png")));
        jLbActions.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_fale_off.png")));
        jTmodulo.setText("Nenhum selecionado");
        jLbClasse.setText("Nenhum Selecionado");
        jLbObjetivo.setText("Nenhum Selecionado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLbSistema = new javax.swing.JLabel();
        jLbTwigs = new javax.swing.JLabel();
        jLbAlias = new javax.swing.JLabel();
        jLbActions = new javax.swing.JLabel();
        jLbBackup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTmodulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLbObjetivo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLbClasse = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_sistema.png"))); // NOI18N
        jLbSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbSistemaMouseExited(evt);
            }
        });
        jPanel2.add(jLbSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 206, -1, -1));

        jLbTwigs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_audio.png"))); // NOI18N
        jLbTwigs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbTwigs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbTwigsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbTwigsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbTwigsMouseExited(evt);
            }
        });
        jPanel2.add(jLbTwigs, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 219, -1, -1));

        jLbAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_execute.png"))); // NOI18N
        jLbAlias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbAlias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbAliasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbAliasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbAliasMouseExited(evt);
            }
        });
        jPanel2.add(jLbAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 109, -1, -1));

        jLbActions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_fale.png"))); // NOI18N
        jLbActions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbActions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbActionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbActionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbActionsMouseExited(evt);
            }
        });
        jPanel2.add(jLbActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 143, -1, -1));

        jLbBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_pesquise.png"))); // NOI18N
        jLbBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbBackupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbBackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbBackupMouseExited(evt);
            }
        });
        jPanel2.add(jLbBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 308, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/cerebro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Módulo : ");

        jTmodulo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTmodulo.setForeground(new java.awt.Color(255, 255, 255));
        jTmodulo.setText("Nenhum selecionado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Objetivo : ");

        jLbObjetivo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLbObjetivo.setForeground(new java.awt.Color(255, 255, 0));
        jLbObjetivo.setText("Nenhum selecionado");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Classe : ");

        jLbClasse.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLbClasse.setForeground(new java.awt.Color(255, 255, 255));
        jLbClasse.setText("Nenhum selecionado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTmodulo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLbClasse, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(jLbObjetivo, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTmodulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLbClasse))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbObjetivo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 400, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mild/katyusha/system/gfx/cerebro/katyusha.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbActionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActionsMouseEntered
        reiniciarCores();
        jLbActions.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_fale.png")));
        jTmodulo.setText("Módulo de Interpretações");
        jLbClasse.setText("Keter");
        jLbObjetivo.setText("Editar interpretações da Katyusha");
    }//GEN-LAST:event_jLbActionsMouseEntered

    private void jLbAliasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAliasMouseEntered
        reiniciarCores();
        jLbAlias.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_execute.png")));
        jTmodulo.setText("Módulo de Aliases");
        jLbClasse.setText("Keter");
        jLbObjetivo.setText("Editar Aliases & Binds da Katyusha");
    }//GEN-LAST:event_jLbAliasMouseEntered

    private void jLbTwigsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbTwigsMouseEntered
        reiniciarCores();
        jLbTwigs.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_audio.png")));
        jTmodulo.setText("Módulo de Twigs");
        jLbClasse.setText("Keter");
        jLbObjetivo.setText("Editar Twigs da Katyusha");
    }//GEN-LAST:event_jLbTwigsMouseEntered

    private void jLbBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBackupMouseEntered
        reiniciarCores();
        jLbBackup.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_pesquise.png")));
        jTmodulo.setText("Módulo de Backup e Restauração");
        jLbClasse.setText("Euclid");
        jLbObjetivo.setText("Selecionar novos arquivos de configuração para a Katyusha");
    }//GEN-LAST:event_jLbBackupMouseEntered

    private void jLbSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSistemaMouseEntered
        reiniciarCores();
        jLbSistema.setIcon(new ImageIcon(this.getClass().getResource("/mild/katyusha/system/gfx/cerebro/parte_sistema.png")));
        jTmodulo.setText("Módulo de Interpretação de Sistema");
        jLbClasse.setText("Unknown");
        jLbObjetivo.setText("Desabilitado");
    }//GEN-LAST:event_jLbSistemaMouseEntered

    private void jLbAliasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAliasMouseExited
        reiniciarCores();
    }//GEN-LAST:event_jLbAliasMouseExited

    private void jLbActionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActionsMouseExited
        reiniciarCores();
    }//GEN-LAST:event_jLbActionsMouseExited

    private void jLbTwigsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbTwigsMouseExited
        reiniciarCores();
    }//GEN-LAST:event_jLbTwigsMouseExited

    private void jLbBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBackupMouseExited
        reiniciarCores();
    }//GEN-LAST:event_jLbBackupMouseExited

    private void jLbSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSistemaMouseExited
        reiniciarCores();
    }//GEN-LAST:event_jLbSistemaMouseExited

    private void jLbActionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActionsMouseClicked
        this.dispose();
        new WNDEditor(caller, new File("actions.k")).setVisible(true);
    }//GEN-LAST:event_jLbActionsMouseClicked

    private void jLbAliasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAliasMouseClicked
        this.dispose();
        new WNDEditor(caller, new File("determinations.k")).setVisible(true);
    }//GEN-LAST:event_jLbAliasMouseClicked

    private void jLbTwigsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbTwigsMouseClicked
        this.dispose();
        new WNDEditor(caller, new File("twigs.k")).setVisible(true);
    }//GEN-LAST:event_jLbTwigsMouseClicked

    private void jLbBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBackupMouseClicked
        this.dispose();
        new WNDBackups(caller).setVisible(true);
    }//GEN-LAST:event_jLbBackupMouseClicked

    private void jLbSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSistemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLbSistemaMouseClicked

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
            java.util.logging.Logger.getLogger(WNDCerebro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WNDCerebro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WNDCerebro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WNDCerebro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WNDCerebro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbActions;
    private javax.swing.JLabel jLbAlias;
    private javax.swing.JLabel jLbBackup;
    private javax.swing.JLabel jLbClasse;
    private javax.swing.JLabel jLbObjetivo;
    private javax.swing.JLabel jLbSistema;
    private javax.swing.JLabel jLbTwigs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jTmodulo;
    // End of variables declaration//GEN-END:variables
}
