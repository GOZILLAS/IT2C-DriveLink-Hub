package Admin;

import cardealersystem.Login;
import com.mysql.jdbc.Statement;
import config.dbConnector;
import config.pasHasher;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AdminRegisterAdd extends javax.swing.JFrame {

    
    public AdminRegisterAdd() {
        initComponents();
    }
    
    public String destination ="";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/Userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {         
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
        ImageIcon MyImage = null;
         if(ImagePath !=null){
             MyImage = new ImageIcon(ImagePath);
         }else{
            MyImage = new ImageIcon(pic);
         }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
      return image;
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
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        em = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stat = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        tacc = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        sele = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 17, 23));
        jPanel3.setForeground(new java.awt.Color(65, 67, 106));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        em.setBackground(new java.awt.Color(204, 204, 204));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 260, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(201, 209, 217));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("STATUS:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 110, 50));

        ln.setBackground(new java.awt.Color(204, 204, 204));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 260, 50));

        ct.setBackground(new java.awt.Color(204, 204, 204));
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        jPanel3.add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 260, 50));

        pw.setBackground(new java.awt.Color(204, 204, 204));
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        jPanel3.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 260, 50));

        un.setBackground(new java.awt.Color(204, 204, 204));
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 260, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 209, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("LAST NAME:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(201, 209, 217));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("EMAIL:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 209, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("CONTACT:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(201, 209, 217));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("PASSWORD:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, 50));

        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inactive", "Active" }));
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        jPanel3.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 260, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(201, 209, 217));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("USERNAME:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 150, 50));

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 120, 50));

        tacc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Dealer" }));
        tacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taccActionPerformed(evt);
            }
        });
        jPanel3.add(tacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 260, 50));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(201, 209, 217));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("ACCOUNT:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 140, 50));

        fn.setBackground(new java.awt.Color(204, 204, 204));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 260, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("FIRST NAME:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 120));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DriveLine Hub");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 340, 60));

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 120, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMIN DASHBOARD");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 270, 40));

        jPanel1.setLayout(null);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(image);
        image.setBounds(10, 10, 310, 200);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 330, 220));

        sele.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sele.setText("SELECT");
        sele.setToolTipText("");
        sele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleActionPerformed(evt);
            }
        });
        jPanel3.add(sele, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 160, 50));

        remove.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 160, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      if (fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || ct.getText().isEmpty() || pw.getText().isEmpty() || un.getText().isEmpty()) {

          JOptionPane.showMessageDialog(null, "All Fields are Required");

            }else if(!em.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {

                JOptionPane.showMessageDialog(null, "Email must be a valid Gmail address (e.g., example@gmail.com)");

            }else if(!ct.getText().matches("\\d{11}")) {

                JOptionPane.showMessageDialog(null, "Contact No. must be 11 digits");

            }else if(pw.getText().length() < 10) {

                JOptionPane.showMessageDialog(null, "Password must be 8 Characters or Above");
                pw.setText("");

            }else if(DupCheck()) {

                System.out.println("Duplicate Exist");

            }else{
        
          try{
             dbConnector dbc = new dbConnector();
             String pas = pasHasher.hashPassword(pw.getText());
             String sql = "INSERT INTO tbl_users (u_fname, u_lname, u_email, u_contact, u_password, u_username, u_type, u_status, u_image) " +
                          "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

             PreparedStatement pst = dbc.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             pst.setString(1, fn.getText());
             pst.setString(2, ln.getText());
             pst.setString(3, em.getText());
             pst.setString(4, ct.getText());
             pst.setString(5, pas); 
             pst.setString(6, un.getText());
             pst.setString(7, tacc.getSelectedItem().toString());
             pst.setString(8, stat.getSelectedItem().toString());
             pst.setString(9, destination);

             int result = pst.executeUpdate();

             if (result > 0) {
                 ResultSet generatedKeys = pst.getGeneratedKeys();
                 int insertedUserId = -1;
                 if (generatedKeys.next()) {
                     insertedUserId = generatedKeys.getInt(1); 
                 }

                 try {
                     Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);

                     String fullName = fn.getText() + " " + ln.getText();
                     String logMessage = "New User: " + fullName;
                     String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

                     String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
                     PreparedStatement logStmt = dbc.getConnection().prepareStatement(logSql);
                     logStmt.setInt(1, insertedUserId);
                     logStmt.setString(2, logMessage);
                     logStmt.setString(3, timestamp);
                     logStmt.executeUpdate();
                     logStmt.close();

                     JOptionPane.showMessageDialog(null, "Registered Successfully");
                     Login lgf = new Login();
                     lgf.setVisible(true);
                     this.dispose();
                 } catch (IOException ex) {
                     System.out.println("Insert Image Error: " + ex);
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Registration Failed");
             }

         } catch (NoSuchAlgorithmException | SQLException ex) {
             ex.printStackTrace();
             JOptionPane.showMessageDialog(null, "An error occurred during registration.");
         }
     }

    }//GEN-LAST:event_addActionPerformed

    private void taccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taccActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        User_Dashboard ud = new User_Dashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        User_Dashboard ud = new User_Dashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void seleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/Userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            sele.setVisible(true);
                            remove.setVisible(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }


    }//GEN-LAST:event_seleActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(true);
        sele.setEnabled(true);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRegisterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegisterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegisterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegisterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegisterAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField ct;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pw;
    public javax.swing.JButton remove;
    public javax.swing.JButton sele;
    public javax.swing.JComboBox<String> stat;
    public javax.swing.JComboBox<String> tacc;
    public javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
