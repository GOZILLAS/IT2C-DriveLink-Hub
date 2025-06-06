package cardealersystem;


import Admin.Dashboard;
import Dealers.Dealer_Dashboard;
import static cardealersystem.Login.loginAcc;
import static cardealersystem.Login.status;
import config.dbConnector;
import config.pasHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }
    
    public static String uname, uemail;
    
    public boolean DupCheck(){  
        dbConnector dc = new dbConnector();
        
            try {
           String query = "SELECT * FROM tbl_users WHERE u_username = '" + un.getText() + "' OR u_email = '" + em.getText() + "'";
           ResultSet resultSet = dc.getData(query);
           
           if(resultSet.next()){
               uname = resultSet.getString("u_username");
               if(uname.equals(un.getText())){
                   JOptionPane.showMessageDialog(null, "Username Already Exist");
                   un.setText("");
               }
               uemail = resultSet.getString("u_email");
               if(uemail.equals(em.getText())){
                   JOptionPane.showMessageDialog(null, "Email Already Exist");
                   em.setText("");
               }               
               return true;
           }else{
               return false;
           }
       } catch (SQLException ex) {
              System.out.println(""+ex);
              return false;
      }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LoginI2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        em = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tacc = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        LoginI = new javax.swing.JButton();
        LoginI1 = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        user4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(13, 17, 23));
        jPanel3.setForeground(new java.awt.Color(65, 67, 106));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 320, 50));

        jLabel13.setBackground(new java.awt.Color(201, 209, 217));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(201, 209, 217));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("USERNAME:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 170, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PASSWORD:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 170, 50));

        LoginI2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoginI2.setText("LOGIN");
        LoginI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginI2ActionPerformed(evt);
            }
        });
        jPanel3.add(LoginI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 100, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(201, 209, 217));
        jLabel3.setText("Not yet registered?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 200, 30));
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 320, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(201, 209, 217));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DriveLine Hub");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 487, 150));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 170));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setForeground(new java.awt.Color(65, 67, 106));
        jPanel1.setLayout(null);

        em.setBackground(new java.awt.Color(204, 204, 204));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em);
        em.setBounds(250, 420, 260, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(201, 209, 217));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACCOUNT:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(550, 350, 170, 50);

        fn.setBackground(new java.awt.Color(204, 204, 204));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn);
        fn.setBounds(250, 210, 260, 50);

        ln.setBackground(new java.awt.Color(204, 204, 204));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln);
        ln.setBounds(250, 280, 260, 50);

        ct.setBackground(new java.awt.Color(204, 204, 204));
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        jPanel1.add(ct);
        ct.setBounds(720, 210, 260, 50);

        un.setBackground(new java.awt.Color(204, 204, 204));
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel1.add(un);
        un.setBounds(250, 350, 260, 50);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(201, 209, 217));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FIRST NAME:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 210, 170, 50);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 209, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LAST NAME:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 280, 170, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(201, 209, 217));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMAIL:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 420, 130, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 209, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONTACT:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(550, 210, 170, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(201, 209, 217));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PASSWORD:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(550, 280, 170, 50);

        tacc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Dealer" }));
        tacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taccActionPerformed(evt);
            }
        });
        jPanel1.add(tacc);
        tacc.setBounds(720, 350, 260, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(201, 209, 217));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("USERNAME:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 350, 170, 50);

        LoginI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoginI.setText("REGISTER");
        LoginI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginIActionPerformed(evt);
            }
        });
        jPanel1.add(LoginI);
        LoginI.setBounds(860, 420, 120, 50);

        LoginI1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoginI1.setText("CANCEL");
        LoginI1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginI1MouseClicked(evt);
            }
        });
        LoginI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginI1ActionPerformed(evt);
            }
        });
        jPanel1.add(LoginI1);
        LoginI1.setBounds(720, 420, 120, 50);

        pw.setBackground(new java.awt.Color(204, 204, 204));
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        jPanel1.add(pw);
        pw.setBounds(720, 280, 260, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(201, 209, 217));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DriveLine Hub");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 10, 680, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 13, 210, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void user4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user4ActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void LoginIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginIActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || ct.getText().isEmpty() || pw.getText().isEmpty() || un.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "All Fields are Required");
    }       
        else if (!em.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
          JOptionPane.showMessageDialog(null, "Email must be a valid Gmail address (e.g., example@gmail.com)");
    }  
        else if (!ct.getText().matches("\\d{11}")) 
            {
              JOptionPane.showMessageDialog(null, "Contact No. must be 11 digits");
            }
        else if(pw.getText().length() < 10) 
            {
              JOptionPane.showMessageDialog(null, "Password must be 10 Characters or Above");
              pw.setText("");
            } 
        else if(DupCheck()){
          System.out.println("Duplicate Exist");
            } 
        else {
  
        dbConnector dbc = new dbConnector();
        try {
        String pas = pasHasher.hashPassword(pw.getText());
        if (dbc.insertData("INSERT INTO tbl_users (u_fname, u_lname, u_email, u_contact, u_password, u_username, u_type, u_status) " 
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + ct.getText() + "','" + pas + "','" + un.getText() + "','" + tacc.getSelectedItem() + "', 'Inactive')") > 0) {           
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            Login lgf = new Login();
            lgf.setVisible(true);
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Registration Failed");
             }

           } catch(NoSuchAlgorithmException ex) {
                 System.out.println("" + ex);
             }
        }
    }//GEN-LAST:event_LoginIActionPerformed

    private void LoginI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginI1ActionPerformed

    }//GEN-LAST:event_LoginI1ActionPerformed

    private void LoginI1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginI1MouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginI1MouseClicked

    private void taccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taccActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void LoginI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginI2ActionPerformed

        if(password.getText().isEmpty()|| username.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Required");
            Login lf = new Login();
            lf.setVisible(true);
            this.dispose();
        }else if(loginAcc(username.getText(), password.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null,"Inactive Account Contact Admin");
            }else{
                JOptionPane.showMessageDialog(null,"Login Success!");
                if(tacc.equals("Admin")){
                    Dashboard ads = new Dashboard();
                    ads.setVisible(true);
                    this.dispose();
                }else if(tacc.equals("Dealer")){
                    JOptionPane.showMessageDialog(null,"Login Success!");
                    Dealer_Dashboard ddb = new Dealer_Dashboard();
                    ddb.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"No Account Type Found, Contact Admin");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Login Failed");
        }
    }//GEN-LAST:event_LoginI2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        RegisterForm rtf = new RegisterForm();
        rtf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginI;
    private javax.swing.JButton LoginI1;
    private javax.swing.JButton LoginI2;
    private javax.swing.JTextField ct;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField pw;
    private javax.swing.JComboBox<String> tacc;
    private javax.swing.JTextField un;
    private javax.swing.JTextField user4;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
