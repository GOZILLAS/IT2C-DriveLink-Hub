package Dealers;

import static Admin.CarDashboardEdit.getHeightFromWidth;
import config.PanelPrinter;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;
import config.dbConnector;
import config.session;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DealsPrint extends javax.swing.JFrame {

    public DealsPrint() {
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
        cfn = new javax.swing.JLabel();
        cln = new javax.swing.JLabel();
        cb = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        jDateChooser1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        cs = new javax.swing.JLabel();
        ocontact = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cp1 = new javax.swing.JLabel();
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
        printable.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 600, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 17, 23));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Purok 9, Lower Tabuan, San Isidro, San Fernando, Cebu");
        printable.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 611, 32));

        jSeparator1.setBackground(new java.awt.Color(13, 17, 23));
        printable.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 1020, 10));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Last Name");
        printable.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 95, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First Name");
        printable.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 95, 20));

        cfn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cfn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cfn.setText("First Name");
        printable.add(cfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 174, 49));

        cln.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cln.setText("Last Name");
        printable.add(cln, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 174, 49));

        cb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cb.setText("Car Brand");
        printable.add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, 40));

        jPanel4.setLayout(null);

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(image1);
        image1.setBounds(10, 10, 220, 170);

        printable.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 240, 190));

        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jDateChooser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDateChooser1.setText("Date");
        printable.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 160, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Date of Purchased");
        printable.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 130, 20));

        cp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp.setText("Car Price");
        printable.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 140, 40));

        cn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cn.setText("Car Name");
        printable.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, 40));

        cs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cs.setText("Car Serial");
        printable.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 140, 40));

        ocontact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ocontact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocontact.setText("Contact");
        printable.add(ocontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Contact");
        printable.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 130, 20));

        cp1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp1.setText("Price");
        printable.add(cp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 80, 30));

        jPanel1.add(printable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 850, 710));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(201, 209, 217));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 100, 50));

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
        jPanel1.add(printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DealsTable dst = new DealsTable();
        dst.setVisible(true);
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
            java.util.logging.Logger.getLogger(DealsPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealsPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealsPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealsPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealsPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cb;
    public javax.swing.JLabel cfn;
    public javax.swing.JLabel cln;
    public javax.swing.JLabel cn;
    public javax.swing.JLabel cp;
    public javax.swing.JLabel cp1;
    public javax.swing.JLabel cs;
    public javax.swing.JLabel image1;
    public javax.swing.JLabel jDateChooser1;
    private javax.swing.JLabel jLabel1;
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
    public javax.swing.JLabel ocontact;
    private javax.swing.JPanel printable;
    private javax.swing.JButton printer;
    // End of variables declaration//GEN-END:variables
}
