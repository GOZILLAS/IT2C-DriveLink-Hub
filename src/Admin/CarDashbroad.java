package Admin;

import cardealersystem.Login;
import config.dbConnector;
import config.session;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class CarDashbroad extends javax.swing.JFrame {

    public CarDashbroad() {
        initComponents();
        displayData();
    }
    Color colorenter = new Color (13,16,23);
    Color colorexit = new Color (65,110,129);
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT c_id AS 'ID', c_name AS 'Car Model', c_brand AS 'Brand', c_serial AS 'Serial', c_price AS 'Pruce', c_status AS 'Status' FROM tbl_cars");
            usertab.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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
        User_id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 100, 40));

        usertab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usertab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 850, 550));

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

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 120));

        Uname.setBackground(new java.awt.Color(201, 209, 217));
        Uname.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Uname.setForeground(new java.awt.Color(201, 209, 217));
        Uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Uname.setText("ADMIN");
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 230, 50));

        Udname3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Udname3.setForeground(new java.awt.Color(201, 209, 217));
        Udname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Udname3.setText("ADMIN ID:");
        jPanel1.add(Udname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 50));

        User_id.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        User_id.setForeground(new java.awt.Color(201, 209, 217));
        User_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(User_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 160, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 174, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DriveLine Hub");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 330, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 174, 112));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 270, 40));

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

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 250, 60));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 174, 112));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CAR INFO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 400, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       CarDashboardAdd cdb = new CarDashboardAdd();
        cdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(colorenter);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(colorexit);
    }//GEN-LAST:event_addMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = usertab.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Select an Item");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = usertab.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_cars WHERE c_id = '"+tbl.getValueAt(rowIndex,0)+"' ");

                if(rs.next()){
                    CarDashboardEdit cde = new CarDashboardEdit();                    
                    cde.cid.setText(""+rs.getString("c_id"));
                    cde.cn.setText(""+rs.getString("c_name"));
                    cde.bn.setText(""+rs.getString("c_brand"));
                    cde.cs.setText(""+rs.getString("c_serial"));
                    cde.cp.setText(""+rs.getString("c_price"));
                    cde.image.setIcon(cde.ResizeImage(rs.getString("c_image"),null, cde.image));
                    cde.oldpath = rs.getString("c_image");
                    cde.path = rs.getString("c_image");
                    cde.destination = rs.getString("c_image");
                    cde.setVisible(true);
                    this.dispose();                   
                if(rs.getString("c_image").isEmpty()){
                    cde.sele.setEnabled(true);
                    cde.remove.setEnabled(false);                         
                }else{
                    cde.sele.setEnabled(false);
                    cde.remove.setEnabled(true);
                     }
                    this.dispose();  
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(colorenter);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(colorexit);
    }//GEN-LAST:event_editMouseExited

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
                    dbConnector dbc = new dbConnector();

                    int result = dbc.deleteData("DELETE FROM tbl_cars WHERE c_id = '" + userId + "'");

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
            java.util.logging.Logger.getLogger(CarDashbroad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDashbroad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDashbroad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDashbroad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDashbroad().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable usertab;
    // End of variables declaration//GEN-END:variables
}
