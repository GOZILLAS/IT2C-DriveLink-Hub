package Admin;

import cardealersystem.Login;
import config.dbConnector;
import config.session;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class User_Dashboard extends javax.swing.JFrame {

    public User_Dashboard() {
        initComponents();
        displayData();     
    }
     
    Color colorenter = new Color (13,16,23);
    Color colorexit = new Color (65,110,129);
    
    public void displayData() {
    try {
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT u_id AS 'Dealer ID', u_fname AS 'First Name', u_lname AS 'Last Name', u_email AS 'Email', u_username AS 'Username', u_type 'Account', u_status 'Status' FROM tbl_users");
        usertab.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertab = new javax.swing.JTable();
        add = new javax.swing.JPanel();
        Uaname1 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
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
        print1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 110, 50));

        usertab.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usertab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                // Example data rows (optional)
                // {1, "admin", "admin@example.com"},
            },
            new String [] {
                "ID", "First Name", "Last Name", "Username", "Email", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        usertab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usertab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 850, 510));

        add.setBackground(new java.awt.Color(65, 110, 129));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(null);

        Uaname1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Uaname1.setForeground(new java.awt.Color(201, 209, 217));
        Uaname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Uaname1.setText("ADD");
        add.add(Uaname1);
        Uaname1.setBounds(100, 20, 51, 20);

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 60));

        edit.setBackground(new java.awt.Color(65, 110, 129));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(null);

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Edit.setForeground(new java.awt.Color(201, 209, 217));
        Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit.setText("EDIT");
        edit.add(Edit);
        Edit.setBounds(70, 20, 110, 20);

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 100));

        Uname.setBackground(new java.awt.Color(201, 209, 217));
        Uname.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Uname.setForeground(new java.awt.Color(201, 209, 217));
        Uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Uname.setText("ADMIN");
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, -1));

        Udname3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname3.setForeground(new java.awt.Color(201, 209, 217));
        Udname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname3.setText("ADMIN ID:");
        jPanel1.add(Udname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 170, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DriveLine Hub");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 370, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 270, 40));

        User_id.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        User_id.setForeground(new java.awt.Color(201, 209, 217));
        User_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(User_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 174, 112));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ACCOUNTS INFO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 310, 70));

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

        print1.setBackground(new java.awt.Color(65, 110, 129));
        print1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                print1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                print1MouseExited(evt);
            }
        });
        print1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(201, 209, 217));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 209, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PRINT");
        print1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 20));

        print.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 250, 60));

        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 250, 60));

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

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 250, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       Dashboard db = new Dashboard();
       db.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        AdminRegisterAdd ard = new AdminRegisterAdd();
        ard.setVisible(true);
        ard.sele.setEnabled(true);
        ard.remove.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(colorenter);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(colorexit);
    }//GEN-LAST:event_addMouseExited

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(colorexit);
    }//GEN-LAST:event_editMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(colorenter);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = usertab.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Select an Item");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = usertab.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_users WHERE u_id = '"+tbl.getValueAt(rowIndex,0)+"' ");

                if(rs.next()){
                    AdminRegister ar = new AdminRegister();
                    ar.id.setText(""+rs.getString("u_id"));
                    ar.fn.setText(""+rs.getString("u_fname"));
                    ar.ln.setText(""+rs.getString("u_lname"));
                    ar.em.setText(""+rs.getString("u_email"));
                    ar.ct.setText(""+rs.getString("u_contact"));
                    ar.un.setText(""+rs.getString("u_username"));
                    ar.pw.setText(""+rs.getString("u_password"));
                    ar.tacc.setSelectedItem(""+rs.getString("u_type"));
                    ar.stat.setSelectedItem(""+rs.getString("u_status"));
                    String imgPath = rs.getString("u_image");
                if (imgPath != null && !imgPath.isEmpty()) {
                    ar.image.setIcon(ar.ResizeImage(imgPath, null, ar.image));
                }else{
                    ar.image.setIcon(null); // or use a default image if you prefer
                      }
                
                    ar.oldpath = imgPath;
                    ar.path = imgPath;
                    ar.destination = imgPath;
                    ar.setVisible(true);                    
                if(rs.getString("u_image").isEmpty()){
                    ar.sele.setEnabled(true);
                    ar.remove.setEnabled(true);                         
                }else{
                    ar.sele.setEnabled(true);
                    ar.remove.setEnabled(true);
                     }
                    this.dispose();
                    
                    
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = usertab.getSelectedRow();
            if (rowIndex < 0) {
                JOptionPane.showMessageDialog(null, "Select an Item");
            } else {
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this dealer?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    try {
                        TableModel tbl = usertab.getModel();
                        String userId = tbl.getValueAt(rowIndex, 0).toString();
                        String userName = tbl.getValueAt(rowIndex, 1).toString() + " " + tbl.getValueAt(rowIndex, 2).toString();

                        dbConnector dbc = new dbConnector();
                        int result = dbc.deleteData("DELETE FROM tbl_users WHERE u_id = '" + userId + "'");

                        if (result > 0) {
                            JOptionPane.showMessageDialog(null, "User deleted successfully!");
                            displayData();

                            session ses = session.getInstance();
                            String logMessage = "Deleted user: " + userName + " (ID: " + userId + ")";
                            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

                            String logSql = "INSERT INTO tbl_logs (u_id, actions, date) VALUES (?, ?, ?)";
                            PreparedStatement logStmt = dbc.getConnection().prepareStatement(logSql);
                            logStmt.setInt(1, ses.getId());
                            logStmt.setString(2, logMessage);
                            logStmt.setString(3, timestamp);
                            logStmt.executeUpdate();
                            logStmt.close();

                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete user.");
                        }
                    } catch (Exception ex) {
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

    private void usertabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertabMouseClicked
        
    }//GEN-LAST:event_usertabMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
       int rowIndex = usertab.getSelectedRow();
       
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Select an Item");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = usertab.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_users WHERE u_id = '"+tbl.getValueAt(rowIndex,0)+"' ");

                if(rs.next()){
                    AdminPrint anp = new AdminPrint();
                    anp.uid.setText(""+rs.getString("u_id"));
                    anp.fn.setText(""+rs.getString("u_fname"));
                    anp.ln.setText(""+rs.getString("u_lname"));
                    anp.em.setText(""+rs.getString("u_email"));
                    anp.tacc.setText(""+rs.getString("u_type"));
                    anp.stat.setText(""+rs.getString("u_status"));
                    anp.image.setIcon(anp.ResizeImage(rs.getString("u_image"),null, anp.image));  
                    anp.setVisible(true);
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

    private void print1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_print1MouseClicked

    private void print1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_print1MouseEntered

    private void print1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_print1MouseExited

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
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel Uaname1;
    private javax.swing.JLabel Udname3;
    private javax.swing.JLabel Uname;
    private javax.swing.JLabel User_id;
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel print;
    private javax.swing.JPanel print1;
    public javax.swing.JTable usertab;
    // End of variables declaration//GEN-END:variables
}
