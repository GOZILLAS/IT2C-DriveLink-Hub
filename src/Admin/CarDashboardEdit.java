package Admin;

import config.dbConnector;
import config.session;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CarDashboardEdit extends javax.swing.JFrame {

    public CarDashboardEdit() {
        initComponents();
        
        
       cn.setEditable(false);
       bn.setEditable(false);
       cs.setEditable(false);      
    }
    
    public String destination ="";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/Carimages", fileName);
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
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        }else{
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
    public static String cbrand;
    
    public boolean DupCheck(){  
        dbConnector dc = new dbConnector();
        
          try {
           String query = "SELECT * FROM tbl_cars WHERE c_id = '" + cid.getText() + "'";
           ResultSet resultSet = dc.getData(query);
           
           if(resultSet.next()){              
               cbrand = resultSet.getString("c_serial");
               if(cbrand.equals(cid.getText())){
                   JOptionPane.showMessageDialog(null, "Serial Already Exist");
                   cid.setText("");
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
    
    public boolean updateCheck(){  
    dbConnector dc = new dbConnector();
    
    try {
        String query = "SELECT * FROM tbl_cars WHERE c_id = '" + cid.getText() + "' AND c_id != '" + cid.getText() + "'";
        ResultSet resultSet = dc.getData(query);
        
        if(resultSet.next()){
            JOptionPane.showMessageDialog(null, "ID Already Exists");
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false;
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cstat = new javax.swing.JComboBox<>();
        sele = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        bn = new javax.swing.JTextField();
        cs = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        LoginI2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();

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

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 130));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DriveLine Hub");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 340, -1));

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
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 120, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 270, 40));

        jPanel3.setBackground(new java.awt.Color(13, 17, 23));
        jPanel3.setForeground(new java.awt.Color(65, 67, 106));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(201, 209, 217));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("STATUS:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 110, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(201, 209, 217));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("BRAND NAME:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 50));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(201, 209, 217));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("CAR SERIAL:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 160, 50));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(201, 209, 217));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("CAR ID:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 130));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(191, 174, 112));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DriveLine Hub");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 340, -1));

        cancel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel1.setText("CANCEL");
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
        });
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        jPanel3.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 120, 50));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(191, 174, 112));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ADMIN DASHBOARD");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 270, 40));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(191, 174, 112));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CAR REGISTER");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 290, 60));

        cid.setBackground(new java.awt.Color(204, 204, 204));
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 260, 50));

        cstat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cstat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unavailable", "Available" }));
        cstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstatActionPerformed(evt);
            }
        });
        jPanel3.add(cstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 330, 50));

        sele.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sele.setText("SELECT");
        sele.setToolTipText("");
        sele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleActionPerformed(evt);
            }
        });
        jPanel3.add(sele, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 160, 50));

        remove.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 160, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 209, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("CAR PRICE:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 160, 50));

        jPanel2.setLayout(null);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(image);
        image.setBounds(10, 10, 310, 200);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 330, 220));

        bn.setBackground(new java.awt.Color(204, 204, 204));
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });
        jPanel3.add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 260, 50));

        cs.setBackground(new java.awt.Color(204, 204, 204));
        cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csActionPerformed(evt);
            }
        });
        jPanel3.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 260, 50));

        cp.setBackground(new java.awt.Color(204, 204, 204));
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        jPanel3.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 260, 50));

        LoginI2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoginI2.setText("UPDATE");
        LoginI2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginI2MouseClicked(evt);
            }
        });
        LoginI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginI2ActionPerformed(evt);
            }
        });
        jPanel3.add(LoginI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 120, 50));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(201, 209, 217));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("CAR NAME:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, 50));

        cn.setBackground(new java.awt.Color(204, 204, 204));
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel3.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 260, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed

    }//GEN-LAST:event_cpActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnActionPerformed

    private void csActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csActionPerformed

    private void cstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cstatActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void LoginI2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginI2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginI2MouseClicked

    private void LoginI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginI2ActionPerformed
        if (cid.getText().isEmpty() || cn.getText().isEmpty() || bn.getText().isEmpty() || cs.getText().isEmpty() || cp.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "All Fields are Required");
        }else if (!cp.getText().trim().matches("^\\d{1,8}(\\.\\d{1,2})?$")) {
             JOptionPane.showMessageDialog(null, "Invalid price format");
            cp.setText("");
        }else if (updateCheck()) {
             System.out.println("Duplicate Exist");
        }else{
            dbConnector dc = new dbConnector();
            dc.updateData("UPDATE tbl_cars SET c_id = '" + cid.getText() + "', c_name = '" + cn.getText() + "', c_brand = '" + bn.getText() + "', " +
                          "c_serial = '" + cs.getText() + "', c_price = '" + cp.getText() + "', c_status = '" + cstat.getSelectedItem() + "', c_image = '" + destination + "' " +
                          "WHERE c_id = '" + cid.getText() + "'");

            if (destination.isEmpty()) {
                File existingFile = new File(oldpath);
                if (existingFile.exists()) {
                    existingFile.delete();
                }
            } else {
                if (!oldpath.equals(path)) {
                    imageUpdater(oldpath, path);
                }
            }
      
            try{
                session ses = session.getInstance();
                String logMessage = "Updated Car Info: " + cn.getText();
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

                String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
                PreparedStatement logStmt = dc.getConnection().prepareStatement(logSql);
                logStmt.setInt(1, ses.getId()); 
                logStmt.setString(2, logMessage);
                logStmt.setString(3, timestamp);
                logStmt.executeUpdate();
                logStmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Logging failed.");
                
            }         
            JOptionPane.showMessageDialog(null, "Car updated successfully.");
            CarDashbroad cd = new CarDashbroad();
            cd.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_LoginI2ActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        CarDashbroad cdb = new CarDashbroad();
        cdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        CarDashbroad cdb = new CarDashbroad();
        cdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void seleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/Carimages/" + selectedFile.getName();
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

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1MouseClicked

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1ActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cid.setEnabled(false);
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
            java.util.logging.Logger.getLogger(CarDashboardEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDashboardEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDashboardEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDashboardEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDashboardEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton LoginI2;
    public javax.swing.JTextField bn;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel1;
    public javax.swing.JTextField cid;
    public javax.swing.JTextField cn;
    public javax.swing.JTextField cp;
    public javax.swing.JTextField cs;
    public javax.swing.JComboBox<String> cstat;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JButton remove;
    public javax.swing.JButton sele;
    // End of variables declaration//GEN-END:variables
}
