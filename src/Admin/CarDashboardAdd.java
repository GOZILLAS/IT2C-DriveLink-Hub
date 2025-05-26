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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CarDashboardAdd extends javax.swing.JFrame {

    /**
     * Creates new form CarDashboardAdd
     */
    public CarDashboardAdd() {
        initComponents();
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
    
    
    public static String cbrand;
    
    public boolean DupCheck(){  
        dbConnector dc = new dbConnector();
        
          try {
           String query = "SELECT * FROM tbl_cars WHERE c_serial = '" + cs.getText() + "'";
           ResultSet resultSet = dc.getData(query);
           
           if(resultSet.next()){              
               cbrand = resultSet.getString("c_serial");
               if(cbrand.equals(cs.getText())){
                   JOptionPane.showMessageDialog(null, "Serial Already Exist");
                   cs.setText("");
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
        cp = new javax.swing.JTextField();
        bn = new javax.swing.JTextField();
        cs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cimage = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        sele = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cstat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 17, 23));
        jPanel3.setForeground(new java.awt.Color(65, 67, 106));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cp.setBackground(new java.awt.Color(204, 204, 204));
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        jPanel3.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 260, 50));

        bn.setBackground(new java.awt.Color(204, 204, 204));
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });
        jPanel3.add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 260, 50));

        cs.setBackground(new java.awt.Color(204, 204, 204));
        cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csActionPerformed(evt);
            }
        });
        jPanel3.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 260, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 209, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("BRAND NAME:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(201, 209, 217));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText(" CAR PRICE:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 150, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 209, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("CAR SERIAL:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 160, 50));

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 120, 50));

        cn.setBackground(new java.awt.Color(204, 204, 204));
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel3.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 260, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("CAR NAME:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 170));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DriveLine Hub");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 340, 60));

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
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 120, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMIN DASHBOARD");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 270, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 174, 112));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CAR REGISTER");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 290, 60));

        jPanel1.setLayout(null);

        cimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(cimage);
        cimage.setBounds(10, 10, 310, 210);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 330, 230));

        remove.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 160, 50));

        sele.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sele.setText("SELECT");
        sele.setToolTipText("");
        sele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleActionPerformed(evt);
            }
        });
        jPanel3.add(sele, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 160, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(201, 209, 217));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("STATUS:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 110, 50));

        cstat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cstat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unavailable", "Available" }));
        cstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstatActionPerformed(evt);
            }
        });
        jPanel3.add(cstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 260, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnActionPerformed

    private void csActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       if (cn.getText().isEmpty() || bn.getText().isEmpty() || cs.getText().isEmpty() || cp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields are Required");
            
       }else if (!cp.getText().trim().matches("^\\d{1,8}(\\.\\d{1,2})?$")) {
            JOptionPane.showMessageDialog(null, "Invalid price format");
            cp.setText("");
            
       }else if (DupCheck()) {
            System.out.println("Duplicate Exist");

       }else {
            dbConnector dbc = new dbConnector();
            try {
                String sql = "INSERT INTO tbl_cars (c_name, c_brand, c_serial, c_price, c_status, c_image) " +
                             "VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = dbc.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setString(1, cn.getText());
                pst.setString(2, bn.getText());
                pst.setString(3, cs.getText());
                pst.setString(4, cp.getText());
                pst.setString(5, cstat.getSelectedItem().toString());
                pst.setString(6, destination);

                int result = pst.executeUpdate();

                if (result > 0) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    int carId = -1;
                    if (generatedKeys.next()) {
                        carId = generatedKeys.getInt(1);
                    }

                    try {
                        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        System.out.println("Insert Image Error: " + ex);
                    }

                    session ses = session.getInstance();
                    String logMessage = "New Car: " + cn.getText();
                    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

                    String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
                    PreparedStatement logStmt = dbc.getConnection().prepareStatement(logSql);
                    logStmt.setInt(1, ses.getId()); 
                    logStmt.setString(2, logMessage);
                    logStmt.setString(3, timestamp);
                    logStmt.executeUpdate();
                    logStmt.close();

                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                    CarDashbroad cdb = new CarDashbroad();
                    cdb.setVisible(true);
                    this.dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "Registration Failed");
                     }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while registering the car.");
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

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

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(true);
        sele.setEnabled(true);
        cimage.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

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
                    cimage.setIcon(ResizeImage(path, null, cimage));
                    sele.setVisible(true);
                    remove.setVisible(true);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }

    }//GEN-LAST:event_seleActionPerformed

    private void cstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cstatActionPerformed

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
            java.util.logging.Logger.getLogger(CarDashboardAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDashboardAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDashboardAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDashboardAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDashboardAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JTextField bn;
    private javax.swing.JButton cancel;
    public javax.swing.JLabel cimage;
    public javax.swing.JTextField cn;
    public javax.swing.JTextField cp;
    public javax.swing.JTextField cs;
    public javax.swing.JComboBox<String> cstat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JButton remove;
    public javax.swing.JButton sele;
    // End of variables declaration//GEN-END:variables
}
