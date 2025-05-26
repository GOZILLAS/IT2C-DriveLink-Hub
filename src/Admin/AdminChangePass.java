package Admin;

import cardealersystem.Login;
import config.dbConnector;
import config.pasHasher;
import config.session;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class AdminChangePass extends javax.swing.JFrame {

    public AdminChangePass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        oldpw = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        newpw = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        conpw = new javax.swing.JTextField();
        conbot = new javax.swing.JButton();
        Udname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Udname2 = new javax.swing.JLabel();
        Dealer_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setForeground(new java.awt.Color(65, 67, 106));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PASSWORD CHANGE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 400, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(201, 209, 217));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 110, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("OLD PASSWORD:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 220, 50));

        oldpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpwActionPerformed(evt);
            }
        });
        jPanel1.add(oldpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 260, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("NEW PASWORD:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 210, 50));

        newpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpwActionPerformed(evt);
            }
        });
        jPanel1.add(newpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 260, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("CONFIRM NEW:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 210, 50));

        conpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpwActionPerformed(evt);
            }
        });
        jPanel1.add(conpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 260, 50));

        conbot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        conbot.setText("CONFIRM");
        conbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conbotMouseClicked(evt);
            }
        });
        conbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conbotActionPerformed(evt);
            }
        });
        jPanel1.add(conbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 100, 50));

        Udname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname.setForeground(new java.awt.Color(240, 240, 240));
        Udname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname.setText("DEALER");
        jPanel1.add(Udname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 120, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(191, 174, 112));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DriveLine Hub");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 320, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 130));

        Udname2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname2.setForeground(new java.awt.Color(240, 240, 240));
        Udname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname2.setText("ADMIN ID:");
        jPanel1.add(Udname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, 50));

        Dealer_id.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Dealer_id.setForeground(new java.awt.Color(240, 240, 240));
        Dealer_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Dealer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        AdminInfo af = new AdminInfo();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void oldpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpwActionPerformed

    private void newpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpwActionPerformed

    private void conpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpwActionPerformed

    private void conbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conbotMouseClicked
        try {
            dbConnector db = new dbConnector();
            session ses = session.getInstance();

            String query = "SELECT * FROM tbl_users WHERE u_id = '" + ses.getId() + "'";
            ResultSet rs = db.getData(query);

            if (rs.next()) {
                String olddbpass = rs.getString("u_password");
                String oldhash = pasHasher.hashPassword(oldpw.getText());

                if (olddbpass.equals(oldhash)) {
                    String npass = pasHasher.hashPassword(newpw.getText());

                    if (npass.equals(olddbpass)) {
                        JOptionPane.showMessageDialog(null, "New password must be different from the old password!");
                        return;
                    }

                    db.updateData("UPDATE tbl_users SET u_password = '" + npass + "' WHERE u_id = '" + ses.getId() + "'");
                    JOptionPane.showMessageDialog(null, "Successfully Updated!");

                    try {
                        String logMessage = "Changed password";
                        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

                        String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
                        PreparedStatement logStmt = db.getConnection().prepareStatement(logSql);
                        logStmt.setInt(1, ses.getId());
                        logStmt.setString(2, logMessage);
                        logStmt.setString(3, timestamp);
                        logStmt.executeUpdate();
                        logStmt.close();
                    } catch (SQLException logEx) {
                        logEx.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Password changed, but failed to log the action.");
                    }

                    Login lg = new Login();
                    lg.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
                }
            }
        } catch (SQLException | NoSuchAlgorithmException ex) {
            System.out.println("" + ex);
      }

    }//GEN-LAST:event_conbotMouseClicked

    private void conbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conbotActionPerformed

    }//GEN-LAST:event_conbotActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session ses = session.getInstance();
        
        if(ses.getId()== 0){
        JOptionPane.showMessageDialog(null, "Login First");
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
        }
        
       Udname.setText(""+ses.getUn());
       Dealer_id.setText(""+ses.getId());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(AdminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dealer_id;
    public javax.swing.JLabel Udname;
    private javax.swing.JLabel Udname2;
    private javax.swing.JButton conbot;
    public javax.swing.JTextField conpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField newpw;
    public javax.swing.JTextField oldpw;
    // End of variables declaration//GEN-END:variables
}
