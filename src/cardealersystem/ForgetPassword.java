package cardealersystem;

import config.dbConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ForgetPassword extends javax.swing.JFrame {

    
    public ForgetPassword() {
        initComponents();
    }
    
    private boolean verifyQuestionsAndAnswers(int userId, 
        String q1, String a1, 
        String q2, String a2, 
        String q3, String a3) {
    dbConnector dbc = new dbConnector();
    String sql = "SELECT quest_one, ans_one, quest_two, ans_two, quest_three, ans_three FROM tbl_security WHERE u_id = ?";

    try {
        PreparedStatement pst = dbc.getConnection().prepareStatement(sql);
        pst.setInt(1, userId);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Fetch stored questions and answers
            String storedQ1 = rs.getString("quest_one").trim();
            String storedA1 = rs.getString("ans_one").trim();
            String storedQ2 = rs.getString("quest_two").trim();
            String storedA2 = rs.getString("ans_two").trim();
            String storedQ3 = rs.getString("quest_three").trim();
            String storedA3 = rs.getString("ans_three").trim();

            // Compare both question texts and answers (case insensitive for answers)
            boolean questionsMatch = storedQ1.equals(q1) && storedQ2.equals(q2) && storedQ3.equals(q3);
            boolean answersMatch = storedA1.equalsIgnoreCase(a1) && storedA2.equalsIgnoreCase(a2) && storedA3.equalsIgnoreCase(a3);

            return questionsMatch && answersMatch;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }
    return false;
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        answer1 = new javax.swing.JTextField();
        answer2 = new javax.swing.JTextField();
        answer3 = new javax.swing.JTextField();
        conbot = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Udname2 = new javax.swing.JLabel();
        question3 = new javax.swing.JComboBox<>();
        question1 = new javax.swing.JComboBox<>();
        question2 = new javax.swing.JComboBox<>();
        Udname4 = new javax.swing.JLabel();
        Udname5 = new javax.swing.JLabel();
        answer4 = new javax.swing.JTextField();
        Udname6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setForeground(new java.awt.Color(65, 67, 106));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(201, 209, 217));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 100, 40));

        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });
        jPanel1.add(answer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 430, 50));

        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });
        jPanel1.add(answer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 430, 50));

        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });
        jPanel1.add(answer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 430, 50));

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
        jPanel1.add(conbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 110, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(191, 174, 112));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DriveLine Hub");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 320, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 130));

        Udname2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Udname2.setForeground(new java.awt.Color(240, 240, 240));
        Udname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname2.setText(":");
        Udname2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Udname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 30, 50));

        question3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        question3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"What is your mother's maiden name?\"", "\"What was the name of your first pet?\"", "\"What was the name of your first school?\"", "\"What is your favorite food?\"", "\"What is your favorite color?\"", "\"What city were you born in?\"", "\"What is your favorite movie?\"", "\"What was your childhood nickname?\"", "\"What is your father's middle name?\"", "\"What was the model of your first car?\"", "\"What is your favorite book?\"", "\"Where did you go on your first vacation?\"", "\"What is your favorite hobby?\"", "\"What is your dream job?\"", "\"What is the name of your best friend from childhood?\"" }));
        question3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question3ActionPerformed(evt);
            }
        });
        jPanel1.add(question3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 350, 50));

        question1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        question1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"What is your mother's maiden name?\"", "\"What was the name of your first pet?\"", "\"What was the name of your first school?\"", "\"What is your favorite food?\"", "\"What is your favorite color?\"", "\"What city were you born in?\"", "\"What is your favorite movie?\"", "\"What was your childhood nickname?\"", "\"What is your father's middle name?\"", "\"What was the model of your first car?\"", "\"What is your favorite book?\"", "\"Where did you go on your first vacation?\"", "\"What is your favorite hobby?\"", "\"What is your dream job?\"", "\"What is the name of your best friend from childhood?\"" }));
        question1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question1ActionPerformed(evt);
            }
        });
        jPanel1.add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 350, 50));

        question2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        question2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"What is your mother's maiden name?\"", "\"What was the name of your first pet?\"", "\"What was the name of your first school?\"", "\"What is your favorite food?\"", "\"What is your favorite color?\"", "\"What city were you born in?\"", "\"What is your favorite movie?\"", "\"What was your childhood nickname?\"", "\"What is your father's middle name?\"", "\"What was the model of your first car?\"", "\"What is your favorite book?\"", "\"Where did you go on your first vacation?\"", "\"What is your favorite hobby?\"", "\"What is your dream job?\"", "\"What is the name of your best friend from childhood?\"" }));
        question2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question2ActionPerformed(evt);
            }
        });
        jPanel1.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 350, 50));

        Udname4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Udname4.setForeground(new java.awt.Color(240, 240, 240));
        Udname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname4.setText(":");
        Udname4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Udname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 30, 50));

        Udname5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Udname5.setForeground(new java.awt.Color(240, 240, 240));
        Udname5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname5.setText(":");
        Udname5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Udname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 30, 50));

        answer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4ActionPerformed(evt);
            }
        });
        jPanel1.add(answer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 430, 50));

        Udname6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Udname6.setForeground(new java.awt.Color(240, 240, 240));
        Udname6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname6.setText(":");
        Udname6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Udname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 30, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("USER ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1ActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3ActionPerformed

    private void conbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conbotMouseClicked
    String userIdStr = answer4.getText().trim(); 
        if(userIdStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your User ID");
            return;
           }

            try {
                int userId = Integer.parseInt(userIdStr);

                String q1 = question1.getSelectedItem().toString();
                String a1 = answer1.getText().trim();
                String q2 = question2.getSelectedItem().toString();
                String a2 = answer2.getText().trim();
                String q3 = question3.getSelectedItem().toString();
                String a3 = answer3.getText().trim();

                if (verifyQuestionsAndAnswers(userId, q1, a1, q2, a2, q3, a3)) { 
                    int verifiedUserId = Integer.parseInt(answer4.getText().trim());
                    
                    NewPass np = new NewPass(userId);
                    np.setVisible(true);
                    this.dispose();
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Security questions and answers do not match.");
                }
           }catch (NumberFormatException e) {
              JOptionPane.showMessageDialog(null, "User ID must be a number.");
        }

    }//GEN-LAST:event_conbotMouseClicked

    private void conbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conbotActionPerformed

    }//GEN-LAST:event_conbotActionPerformed

    private void question3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question3ActionPerformed

    private void question1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question1ActionPerformed

    private void question2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question2ActionPerformed

    private void answer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer4ActionPerformed

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Udname2;
    private javax.swing.JLabel Udname4;
    private javax.swing.JLabel Udname5;
    private javax.swing.JLabel Udname6;
    public javax.swing.JTextField answer1;
    public javax.swing.JTextField answer2;
    public javax.swing.JTextField answer3;
    public javax.swing.JTextField answer4;
    private javax.swing.JButton conbot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> question1;
    public javax.swing.JComboBox<String> question2;
    public javax.swing.JComboBox<String> question3;
    // End of variables declaration//GEN-END:variables
}
