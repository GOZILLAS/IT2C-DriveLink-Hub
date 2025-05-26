package Dealers;

import static Admin.CarDashboardEdit.cbrand;
import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DealView extends javax.swing.JFrame {

    public DealView() {
        initComponents();
        
       cn.setEditable(false);
       cid.setEditable(false);
       cs.setEditable(false);
        
    }
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        cs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        cfn = new javax.swing.JTextField();
        cln = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ostat = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        image = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Uaname = new javax.swing.JLabel();
        Udname3 = new javax.swing.JLabel();
        Uid = new javax.swing.JLabel();
        ocontact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 17, 23));
        jPanel3.setForeground(new java.awt.Color(65, 67, 106));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cs.setBackground(new java.awt.Color(204, 204, 204));
        cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csActionPerformed(evt);
            }
        });
        jPanel3.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 260, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(201, 209, 217));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("STATUS:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 110, 50));

        cid.setBackground(new java.awt.Color(204, 204, 204));
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 260, 50));

        cp.setBackground(new java.awt.Color(204, 204, 204));
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        jPanel3.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 260, 50));

        cfn.setBackground(new java.awt.Color(204, 204, 204));
        cfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfnActionPerformed(evt);
            }
        });
        jPanel3.add(cfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 220, 50));

        cln.setBackground(new java.awt.Color(204, 204, 204));
        cln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clnActionPerformed(evt);
            }
        });
        jPanel3.add(cln, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 220, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 209, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("CAR ID:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 100, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(201, 209, 217));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("SERIAL:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 209, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("PRICE:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(201, 209, 217));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("FIRST NAME:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 170, 50));

        ostat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ostat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved" }));
        ostat.setEnabled(false);
        ostat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostatActionPerformed(evt);
            }
        });
        jPanel3.add(ostat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 240, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(201, 209, 217));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("LAST NAME:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 150, 50));

        cn.setBackground(new java.awt.Color(204, 204, 204));
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel3.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 260, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("CAR NAME:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 120));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DriveLine Hub");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 320, 60));

        image.setLayout(null);

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.add(image1);
        image1.setBounds(10, 10, 310, 210);

        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 330, 230));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 174, 112));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DEALER DASHBOARD");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 40));

        Uaname.setBackground(new java.awt.Color(201, 209, 217));
        Uaname.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Uaname.setForeground(new java.awt.Color(201, 209, 217));
        Uaname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Uaname.setText("DEALER");
        jPanel3.add(Uaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 50));

        Udname3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname3.setForeground(new java.awt.Color(201, 209, 217));
        Udname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname3.setText("DEALER ID:");
        jPanel3.add(Udname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, 50));

        Uid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Uid.setForeground(new java.awt.Color(201, 209, 217));
        Uid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 50));

        ocontact.setBackground(new java.awt.Color(204, 204, 204));
        ocontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocontactActionPerformed(evt);
            }
        });
        jPanel3.add(ocontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 240, 50));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(201, 209, 217));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("CONTACT:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 140, 50));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(201, 209, 217));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("DATE:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 100, 50));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 230, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(201, 209, 217));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 100, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void csActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpActionPerformed

    private void cfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfnActionPerformed

    private void clnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clnActionPerformed

    private void ostatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ostatActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void ocontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocontactActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DealsTable dst = new DealsTable();
        dst.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(DealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Uaname;
    private javax.swing.JLabel Udname3;
    private javax.swing.JLabel Uid;
    public javax.swing.JTextField cfn;
    public javax.swing.JTextField cid;
    public javax.swing.JTextField cln;
    public javax.swing.JTextField cn;
    public javax.swing.JTextField cp;
    public javax.swing.JTextField cs;
    public javax.swing.JPanel image;
    public javax.swing.JLabel image1;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ocontact;
    public javax.swing.JComboBox<String> ostat;
    // End of variables declaration//GEN-END:variables
}
