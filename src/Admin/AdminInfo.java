package Admin;

import cardealersystem.Login;
import config.session;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AdminInfo extends javax.swing.JFrame {

   
    public AdminInfo() {
        initComponents();
    }

    Color colorenter = new Color (13,17,23);
    Color colorexit = new Color (65,110,129);
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ct = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        acc_edit = new javax.swing.JPanel();
        Edit = new javax.swing.JLabel();
        Udname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passSec = new javax.swing.JPanel();
        Edit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setForeground(new java.awt.Color(201, 209, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACCOUNT INFO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 310, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(201, 209, 217));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 120, 50));

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 260, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(201, 209, 217));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("USER ID:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 110, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("FIRST NAME:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 160, 50));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 260, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 209, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("LAST NAME:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 150, 50));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 260, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(201, 209, 217));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("EMAIL:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 100, 50));

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 260, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 209, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("CONTACT:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 130, 50));

        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        jPanel1.add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 260, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(201, 209, 217));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("USERNAME:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 160, 50));

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 260, 50));

        acc_edit.setBackground(new java.awt.Color(65, 110, 129));
        acc_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acc_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acc_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acc_editMouseExited(evt);
            }
        });
        acc_edit.setLayout(null);

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Edit.setForeground(new java.awt.Color(201, 209, 217));
        Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit.setText("PASSWORD");
        acc_edit.add(Edit);
        Edit.setBounds(30, 20, 140, 20);

        jPanel1.add(acc_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 60));

        Udname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname.setForeground(new java.awt.Color(201, 209, 217));
        Udname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname.setText("DEALER");
        jPanel1.add(Udname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 130));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 270, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(191, 174, 112));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DriveLine Hub");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 340, -1));

        passSec.setBackground(new java.awt.Color(65, 110, 129));
        passSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passSecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passSecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passSecMouseExited(evt);
            }
        });
        passSec.setLayout(null);

        Edit1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Edit1.setForeground(new java.awt.Color(201, 209, 217));
        Edit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit1.setText("SECURITY");
        passSec.add(Edit1);
        Edit1.setBounds(30, 20, 140, 20);

        jPanel1.add(passSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void acc_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc_editMouseClicked

        AdminChangePass acp = new AdminChangePass();
        acp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_acc_editMouseClicked

    private void acc_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc_editMouseEntered
        acc_edit.setBackground(colorenter);
    }//GEN-LAST:event_acc_editMouseEntered

    private void acc_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc_editMouseExited
        acc_edit.setBackground(colorexit);
    }//GEN-LAST:event_acc_editMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session ses = session.getInstance();
        
        if(ses.getId()== 0){
        JOptionPane.showMessageDialog(null, "Login First");
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
        }
       Udname.setText(""+ses.getUn());
       id.setText(""+ses.getId());
       fn.setText(""+ses.getFn());
       ln.setText(""+ses.getLn());
       em.setText(""+ses.getEm());
       ct.setText(""+ses.getCt());
       un.setText(""+ses.getUn());
    }//GEN-LAST:event_formWindowActivated

    private void passSecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passSecMouseClicked
        PasSecurity pss = new PasSecurity();
        pss.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_passSecMouseClicked

    private void passSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passSecMouseEntered
       passSec.setBackground(colorenter);
    }//GEN-LAST:event_passSecMouseEntered

    private void passSecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passSecMouseExited
       passSec.setBackground(colorexit);
    }//GEN-LAST:event_passSecMouseExited

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
            java.util.logging.Logger.getLogger(AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel Edit1;
    private javax.swing.JLabel Udname;
    private javax.swing.JPanel acc_edit;
    public javax.swing.JTextField ct;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    private javax.swing.JPanel passSec;
    public javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
