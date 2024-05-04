/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.CAttendanceAdd;
import Control.CAttendanceCheck;
import Control.CGetEmpID;
import Control.CUpdateAttendance;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gimz
 */
public class EmployeeDashboard extends javax.swing.JFrame {
    int empid;
    /**
     * Creates new form EmployeeDashboard
     */
    public EmployeeDashboard() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }
    
    public void getusername(String username){
        try{
            lbl_username.setText(username);
            CGetEmpID x=new CGetEmpID();
            ResultSet rst=x.searchEmployee(username);
            rst.next();
            empid=Integer.parseInt(rst.getString(1));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_othours = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_npdays = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_totalnpdays = new javax.swing.JLabel();
        lbl_totaloth = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 44, 47));

        txt_othours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_othoursKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attendance");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Over Time Hours");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Pay Days");

        btn_update.setBackground(new java.awt.Color(61, 77, 82));
        btn_update.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Over Time Hours:");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total No Pay Days:");

        lbl_totalnpdays.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lbl_totalnpdays.setForeground(new java.awt.Color(255, 255, 255));
        lbl_totalnpdays.setText(".");

        lbl_totaloth.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lbl_totaloth.setForeground(new java.awt.Color(255, 255, 255));
        lbl_totaloth.setText(".");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logged As:");

        lbl_username.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("emp");

        btn_logout.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/Images/power_8914397_1_3.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_othours, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_npdays, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_totalnpdays, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbl_username))
                                        .addComponent(btn_logout))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_totaloth, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_update)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_othours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_npdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lbl_totaloth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_totalnpdays))))
                .addGap(32, 32, 32)
                .addComponent(btn_update)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
     ResultSet rst;
        try {
    CAttendanceCheck CAC = new CAttendanceCheck();
    rst = CAC.attendaceCheck(empid);
    
    // Validate txt_othours and txt_npdays before parsing as integers
    String othoursText = txt_othours.getText();
    String npdaysText = txt_npdays.getText();
    
    if (!othoursText.matches("\\d+") || !npdaysText.matches("\\d+")) {
        // Input doesn't consist of digits only, show an error message if needed
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    }
    
    int othours = Integer.parseInt(othoursText);
    int npdays = Integer.parseInt(npdaysText);

    if (rst.next()) {
        int temppoth = Integer.parseInt(rst.getString(3));
        int tempnpdays = Integer.parseInt(rst.getString(4));

        othours = othours + temppoth;
        npdays = npdays + tempnpdays;

        lbl_totaloth.setText(String.valueOf(othours));
        lbl_totalnpdays.setText(String.valueOf(npdays));

        CUpdateAttendance CUA = new CUpdateAttendance();
        CUA.updateAttendance(empid, othours, npdays);
    } else {
        CAttendanceAdd CAA = new CAttendanceAdd();
        CAA.attendanceAdd(empid, othours, npdays);
    }
} catch (Exception e) {
    e.printStackTrace(); // Handle exceptions appropriately
}
     
     
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login x=new Login();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_othoursKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_othoursKeyReleased
    
    }//GEN-LAST:event_txt_othoursKeyReleased

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
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_totalnpdays;
    private javax.swing.JLabel lbl_totaloth;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txt_npdays;
    private javax.swing.JTextField txt_othours;
    // End of variables declaration//GEN-END:variables
}
