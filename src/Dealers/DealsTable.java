package Dealers;

import Admin.AdminPrint;
import com.toedter.calendar.JDateChooser;
import cardealersystem.Login;
import config.dbConnector;
import config.session;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class DealsTable extends javax.swing.JFrame {

    public DealsTable() {
        initComponents();
        displayData();       
    }
    
    Color colorenter = new Color (13,16,23);
    Color colorexit = new Color (65,110,129);
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            try (ResultSet rs = dbc.getData("SELECT o_id AS 'Order ID', u_id AS 'Dealer ID',  c_id AS 'Car ID', o_fname AS 'Customer FN', o_lname AS 'Customer LN', o_status AS 'Status' FROM tbl_orders")) {
                dealstab.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        view = new javax.swing.JPanel();
        Edit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Uname = new javax.swing.JLabel();
        Udname3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        User_id = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dealstab = new javax.swing.JTable();

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(201, 209, 217));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 110, 50));

        view.setBackground(new java.awt.Color(65, 110, 129));
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });
        view.setLayout(null);

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Edit.setForeground(new java.awt.Color(201, 209, 217));
        Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit.setText("VIEW");
        view.add(Edit);
        Edit.setBounds(70, 20, 110, 20);

        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 100));

        Uname.setBackground(new java.awt.Color(201, 209, 217));
        Uname.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Uname.setForeground(new java.awt.Color(201, 209, 217));
        Uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Uname.setText("DEALER");
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, -1));

        Udname3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname3.setForeground(new java.awt.Color(201, 209, 217));
        Udname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname3.setText("DEALER ID:");
        jPanel1.add(Udname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 170, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DriveLine Hub");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 370, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEALER DASHBOARD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 270, 40));

        User_id.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        User_id.setForeground(new java.awt.Color(201, 209, 217));
        User_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(User_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 174, 112));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DEALS INFO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 310, 70));

        print.setBackground(new java.awt.Color(65, 110, 129));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(201, 209, 217));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(201, 209, 217));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRINT");
        print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 20));

        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 250, 60));

        delete.setBackground(new java.awt.Color(65, 110, 129));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(201, 209, 217));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(201, 209, 217));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DELETE");
        delete.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 20));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 250, 60));

        dealstab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(dealstab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 820, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Dealer_Dashboard dd = new Dealer_Dashboard();
        dd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        int rowIndex = dealstab.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Select an Item");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = dealstab.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_orders " + "INNER JOIN tbl_cars ON tbl_orders.c_id = tbl_cars.c_id " + "WHERE o_id = '" + tbl.getValueAt(rowIndex, 0) + "'");


                if(rs.next()){
                    DealView dv = new DealView();                    
                    dv.cid.setText(""+rs.getString("c_id"));
                    dv.cfn.setText(""+rs.getString("o_fname"));
                    dv.cln.setText(""+rs.getString("o_lname"));
                    dv.ocontact.setText(""+rs.getString("o_contact"));
                    dv.jDateChooser1.setDate(rs.getDate("o_date"));
                    
                    dv.cs.setText(""+rs.getString("c_serial"));
                    dv.cn.setText(""+rs.getString("c_name"));
                    dv.cp.setText(""+rs.getString("c_price"));
                    dv.image1.setIcon(dv.ResizeImage(rs.getString("c_image"),null, dv.image1));
                    dv.oldpath = rs.getString("c_image");
                    dv.path = rs.getString("c_image");
                    dv.destination = rs.getString("c_image");
                    dv.setVisible(true);                                
                    this.dispose();  
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        view.setBackground(colorenter);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        view.setBackground(colorexit);
    }//GEN-LAST:event_viewMouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        int rowIndex = dealstab.getSelectedRow();
       
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Select an Item");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = dealstab.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_orders " + "INNER JOIN tbl_cars ON tbl_orders.c_id = tbl_cars.c_id " + "WHERE o_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if(rs.next()){
                    
                String status = rs.getString("o_status"); 
                if ("Pending".equalsIgnoreCase(status)) {
                    JOptionPane.showMessageDialog(null, "Still Pending, cannot be printed.");
                return;
                    }

                    
                    DealsPrint dp = new DealsPrint();
                    dp.cfn.setText(""+rs.getString("o_fname"));
                    dp.cln.setText(""+rs.getString("o_lname"));
                    dp.ocontact.setText(""+rs.getString("o_contact"));
                    

           
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String dateText = sdf.format(rs.getDate("o_date"));
                    dp.jDateChooser1.setText(dateText);
                    
                    dp.cs.setText(""+rs.getString("c_serial"));
                    dp.cn.setText(""+rs.getString("c_name"));
                    dp.cp.setText(""+rs.getString("c_price"));
                    dp.image1.setIcon(dp.ResizeImage(rs.getString("c_image"),null, dp.image1));
                    dp.setVisible(true);                                
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(colorenter);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(colorexit);
    }//GEN-LAST:event_printMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = dealstab.getSelectedRow();
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Select an Item");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this dealer?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    TableModel tbl = dealstab.getModel();
                    String userId = tbl.getValueAt(rowIndex, 0).toString();
                    dbConnector dbc = new dbConnector();

                    int result = dbc.deleteData("DELETE FROM tbl_orders WHERE o_id = '" + userId + "'");

                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "User deleted successfully!");
                        displayData();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete user.");
                    }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(colorenter);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(colorexit);
    }//GEN-LAST:event_deleteMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       session ses = session.getInstance();
        
        if(ses.getId()== 0){
        JOptionPane.showMessageDialog(null, "Login First");
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
        }
        Uname.setText(""+ses.getUn());
        User_id.setText(""+ses.getId());
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
            java.util.logging.Logger.getLogger(DealsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealsTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel Udname3;
    private javax.swing.JLabel Uname;
    private javax.swing.JLabel User_id;
    private javax.swing.JTable dealstab;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel print;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
