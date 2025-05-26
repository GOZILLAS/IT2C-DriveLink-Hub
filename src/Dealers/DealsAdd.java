package Dealers;

import static Admin.AdminRegisterAdd.getHeightFromWidth;
import cardealersystem.Login;
import config.dbConnector;
import config.session;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DealsAdd extends javax.swing.JFrame {

    public DealsAdd() {
        initComponents();
        
       cn.setEditable(false);
       cid.setEditable(false);
       cs.setEditable(false);
       cp.setEditable(false);
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
    public String destination ="";
    File selectedFile;
    public String oldpath;
    public String path;
    
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
           String query = "SELECT * FROM tbl_cars WHERE c_id = '" + cs.getText() + "'";
           ResultSet resultSet = dc.getData(query);
           
           if(resultSet.next()){              
               cbrand = resultSet.getString("c_id");
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
        add = new javax.swing.JButton();
        cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Uaname = new javax.swing.JLabel();
        Udname3 = new javax.swing.JLabel();
        Uid = new javax.swing.JLabel();
        ocontact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
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
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 260, 50));

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
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 50));

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

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 120, 50));

        cn.setBackground(new java.awt.Color(204, 204, 204));
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel3.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 260, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 209, 217));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("CAR NAME:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 120));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 174, 112));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DriveLine Hub");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 320, 60));

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
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 120, 50));

        jPanel1.setLayout(null);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(image);
        image.setBounds(10, 10, 310, 210);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 330, 230));

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
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 100, 50));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 190, 50));

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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         if (cfn.getText().isEmpty() || cln.getText().isEmpty() || ocontact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields are Required");
        }else if (!cp.getText().trim().matches("^\\d{1,8}(\\.\\d{1,2})?$")) {
            JOptionPane.showMessageDialog(null, "Invalid price format");
            cp.setText("");
        }else if (DupCheck()) {
            System.out.println("Duplicate Exist");
        }else {
            Date selectedDate = jDateChooser1.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(null, "Please select a date");
                return;
            }

            String formattedDate = sdf.format(selectedDate);
            dbConnector dbc = new dbConnector();

    if (dbc.insertData(
        "INSERT INTO tbl_orders (u_id, c_id, o_fname, o_lname, o_contact, o_status, o_date) " +
        "VALUES('" + Uid.getText() + "','" + cid.getText() + "','" + cfn.getText() + "','" + cln.getText() + "','" + ocontact.getText() + "','" + ostat.getSelectedItem() + "','" + formattedDate + "')"
            ) > 0) {
                JOptionPane.showMessageDialog(null, "Registration Successful");

        try {
            session ses = session.getInstance();
            String logMessage = "New Car Order for: " + cfn.getText() + " " + cln.getText() + " (Car ID: " + cid.getText() + ")";
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

            String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
            PreparedStatement logStmt = dbc.getConnection().prepareStatement(logSql);
            logStmt.setInt(1, ses.getId()); 
            logStmt.setString(2, logMessage);
            logStmt.setString(3, timestamp);
            logStmt.executeUpdate();
            logStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to log the action.");
        }

        DealsTable dst = new DealsTable();
        dst.setVisible(true);
        this.dispose();
    }
}

    }//GEN-LAST:event_addActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        DealsBoard deb = new DealsBoard();
        deb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        DealsBoard deb = new DealsBoard();
        deb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void ocontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocontactActionPerformed

    private void ostatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ostatActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session ses = session.getInstance();
        
        if(ses.getId()== 0){
        JOptionPane.showMessageDialog(null, "Login First");
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
        }
        Uaname.setText(""+ses.getUn());
        Uid.setText(""+ses.getId());
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
            java.util.logging.Logger.getLogger(DealsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealsAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Uaname;
    private javax.swing.JLabel Udname3;
    private javax.swing.JLabel Uid;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField cfn;
    public javax.swing.JTextField cid;
    public javax.swing.JTextField cln;
    public javax.swing.JTextField cn;
    public javax.swing.JTextField cp;
    public javax.swing.JTextField cs;
    public javax.swing.JLabel image;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ocontact;
    public javax.swing.JComboBox<String> ostat;
    // End of variables declaration//GEN-END:variables
}
