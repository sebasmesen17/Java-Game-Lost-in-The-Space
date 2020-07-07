
package vista;

import controlador.Controlador_FRM_MenuPrincipal;


public class FRM_MenuPrincipal extends javax.swing.JFrame {

    Controlador_FRM_MenuPrincipal controlador;
    public FRM_MenuPrincipal() {
        initComponents();
        controlador = new Controlador_FRM_MenuPrincipal(this);     
        btn_hard.addActionListener(controlador);
        btn_easy.addActionListener(controlador);
        btn_salir.addActionListener(controlador);
        btn_stats.addActionListener(controlador);
        btn_i.addActionListener(controlador);
        btn_alien.addActionListener(controlador);
        btn_astro.addActionListener(controlador);
        btn_thor.addActionListener(controlador);
        btn_add.addActionListener(controlador);
        setLocationRelativeTo(null);
    }
    
    
 
   
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Play = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_stats = new javax.swing.JButton();
        btn_i = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_hard = new javax.swing.JButton();
        btn_astro = new javax.swing.JButton();
        btn_alien = new javax.swing.JButton();
        lbl_personajes = new javax.swing.JLabel();
        btn_thor = new javax.swing.JButton();
        btn_easy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Play.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(654, 689));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        btn_salir.setActionCommand("salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        btn_stats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stats.png"))); // NOI18N
        btn_stats.setActionCommand("Estadisticas");
        btn_stats.setBorder(null);
        btn_stats.setBorderPainted(false);
        btn_stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 120, 140));

        btn_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ABOUT.png"))); // NOI18N
        btn_i.setActionCommand("i");
        btn_i.setBorderPainted(false);
        btn_i.setFocusPainted(false);
        getContentPane().add(btn_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 70, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo 3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 350, 260));

        btn_hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        btn_hard.setActionCommand("hard");
        getContentPane().add(btn_hard, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 120, 70));

        btn_astro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casconegro.png"))); // NOI18N
        btn_astro.setActionCommand("astro");
        btn_astro.setBorderPainted(false);
        getContentPane().add(btn_astro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, 40, 40));

        btn_alien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNEGRO.png"))); // NOI18N
        btn_alien.setActionCommand("alien");
        btn_alien.setBorderPainted(false);
        btn_alien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alienActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 70, 60));

        lbl_personajes.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbl_personajes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_personajes.setText("Character");
        lbl_personajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(lbl_personajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        btn_thor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/thorIcon.png"))); // NOI18N
        btn_thor.setActionCommand("thor");
        btn_thor.setBorderPainted(false);
        getContentPane().add(btn_thor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 80, 70));

        btn_easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconitoxd.png"))); // NOI18N
        btn_easy.setActionCommand("easy");
        getContentPane().add(btn_easy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 120, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Easy");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hard");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ADD1.png"))); // NOI18N
        btn_add.setActionCommand("new");
        btn_add.setBorderPainted(false);
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 40, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/black.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(650, 690));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_statsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_statsActionPerformed

    private void btn_alienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alienActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FRM_MenuPrincipal().setVisible(true);
//            }
//        });
//    }
     public static void main(String args[]) {

                new FRM_MenuPrincipal().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Play;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_alien;
    private javax.swing.JButton btn_astro;
    private javax.swing.JButton btn_easy;
    private javax.swing.JButton btn_hard;
    private javax.swing.JButton btn_i;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_stats;
    private javax.swing.JButton btn_thor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_personajes;
    // End of variables declaration//GEN-END:variables
}
