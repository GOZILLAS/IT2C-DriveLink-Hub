package Admin;

import static Admin.CarDashboardEdit.getHeightFromWidth;
import config.PanelPrinter;
import config.dbConnector;
import config.session;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminPrint extends javax.swing.JFrame {

    public AdminPrint() {
        initComponents();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        printable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        tacc = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        printer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 17, 23));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, -1, -1));

        printable.setBackground(new java.awt.Color(255, 255, 255));
        printable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 17, 23));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DRIVELINE HUB - CEBU, INC");
        printable.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 13, 600, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 17, 23));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Purok 9, Lower Tabuan, San Isidro, San Fernando, Cebu");
        printable.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 46, 611, 32));

        jSeparator1.setBackground(new java.awt.Color(13, 17, 23));
        printable.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 1020, 10));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Last Name");
        printable.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 362, 95, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First Name");
        printable.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 362, 95, -1));

        fn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn.setText("First Name");
        printable.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 332, 174, 49));

        ln.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln.setText("Last Name");
        printable.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 332, 174, 49));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        printable.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 312, 50, -1));

        uid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        uid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uid.setText("ID");
        printable.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 282, 133, 40));

        stat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat.setText("Status");
        printable.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 389, 120, 50));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Status");
        printable.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 429, 60, -1));

        em.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        em.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        em.setText("Email");
        printable.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 453, 300, 50));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Email");
        printable.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 483, 100, 20));

        jPanel4.setLayout(null);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(image);
        image.setBounds(10, 10, 220, 170);

        printable.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 102, 240, 190));

        tacc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tacc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tacc.setText("Type");
        printable.add(tacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 389, 100, 50));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Account Type");
        printable.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 429, 100, -1));

        jPanel1.add(printable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1050, 530));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(201, 209, 217));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 100, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DriveLine Hub");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 320, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEALER DASHBOARD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 100));

        printer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        printer.setText("PRINT");
        printer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printerMouseClicked(evt);
            }
        });
        printer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerActionPerformed(evt);
            }
        });
        jPanel1.add(printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        User_Dashboard ud = new User_Dashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void printerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseClicked
        
    }//GEN-LAST:event_printerMouseClicked

    private void printerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerActionPerformed
        JPanel myPanel = new JPanel();
        PanelPrinter pp = new PanelPrinter(printable);
        pp.printPanel();
        
        try {
        dbConnector db = new dbConnector();
        session ses = session.getInstance();
        String logMessage = "Printed Deal";  
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

        String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
        PreparedStatement logStmt = db.getConnection().prepareStatement(logSql);
        logStmt.setInt(1, ses.getId());          
        logStmt.setString(2, logMessage);
        logStmt.setString(3, timestamp);
        logStmt.executeUpdate();
        logStmt.close();

         } catch (SQLException ex) {
            ex.printStackTrace();
       }
    }//GEN-LAST:event_printerActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel em;
    public javax.swing.JLabel fn;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel ln;
    private javax.swing.JPanel printable;
    private javax.swing.JButton printer;
    public javax.swing.JLabel stat;
    public javax.swing.JLabel tacc;
    public javax.swing.JLabel uid;
    // End of variables declaration//GEN-END:variables
}
