
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakib
 */
public class frameLogInPage extends javax.swing.JFrame {

    /**
     * Creates new form frameLogInPage
     */
    public frameLogInPage() {
        initComponents();
        setSize(1000,800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPassword_loginpage = new javax.swing.JPasswordField();
        tfUsernmae_loginpage = new javax.swing.JTextField();
        btnLogIn_loginpage = new javax.swing.JButton();
        btnForgetPassword_loginpage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 110, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 110, 54));

        tfPassword_loginpage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfPassword_loginpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 250, 50));

        tfUsernmae_loginpage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfUsernmae_loginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernmae_loginpageActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsernmae_loginpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 250, 50));

        btnLogIn_loginpage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogIn_loginpage.setText("LOG IN");
        btnLogIn_loginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogIn_loginpageActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogIn_loginpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 150, 50));

        btnForgetPassword_loginpage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnForgetPassword_loginpage.setText("Forget Pass");
        btnForgetPassword_loginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgetPassword_loginpageActionPerformed(evt);
            }
        });
        getContentPane().add(btnForgetPassword_loginpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 682, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cropedbg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogIn_loginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogIn_loginpageActionPerformed
        // TODO add your handling code here:
        String username = tfUsernmae_loginpage.getText().trim();
        String password = tfPassword_loginpage.getText().trim();
        
        
        /// checking for student 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            // find if the username and password exist in database and also get the student id
            String sqlQuery ="select studentId from StudentTable where studentUsername =? and studentPassword =?";

            PreparedStatement statement  = connection.prepareStatement(sqlQuery);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            


            if (resultSet.next()) {
                int id = resultSet.getInt("studentId");
                //System.out.println(id);
                frameStudentHomePage studentHomePage = new frameStudentHomePage();
                studentHomePage.SetComponentsStudentHomePage(id);
                studentHomePage.setVisible(true);
                setVisible(false);
            }else{
                
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
       // checking for teacher
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

             String sqlQuery = "select teacherId from TeacherTable where teacherUsername =? and teacherPassword =?";

            PreparedStatement statement  = connection.prepareStatement(sqlQuery);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                
                int id = resultSet.getInt("teacherId");
                frameTeacherHomepage teacherHomepage = new frameTeacherHomepage();
                teacherHomepage.setComponentsTeacherHomePage(id);
                teacherHomepage.setVisible(true);
                setVisible(false);
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       
       /// checking for staff
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

             String sqlQuery = "select staffId from StaffTable where staffUsername =? and staffPassword =?";

            PreparedStatement statement  = connection.prepareStatement(sqlQuery);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("staffId");
                frameStaffHomePage staffHomePage = new frameStaffHomePage();
                staffHomePage.setComponentsStaffHomePage(id);
                staffHomePage.setVisible(true);
                setVisible(false);
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
        if(tfUsernmae_loginpage.getText().trim().equals("") || tfPassword_loginpage.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(frameLogInPage.this, "please enter username and password");
        }
        else if(tfUsernmae_loginpage.getText().trim().equals("rafee") && tfPassword_loginpage.getText().trim().equals("1212")){
            //JOptionPane.showMessageDialog(frameLogInPage.this, "welcome");
            frameADMINHomePage aDMINHomePage = new frameADMINHomePage(); 
            aDMINHomePage.setVisible(true);
            setVisible(false);
        }
        
        
        
        
    }//GEN-LAST:event_btnLogIn_loginpageActionPerformed

    private void tfUsernmae_loginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernmae_loginpageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernmae_loginpageActionPerformed

    private void btnForgetPassword_loginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgetPassword_loginpageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgetPassword_loginpageActionPerformed

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
            java.util.logging.Logger.getLogger(frameLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameLogInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgetPassword_loginpage;
    private javax.swing.JButton btnLogIn_loginpage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField tfPassword_loginpage;
    private javax.swing.JTextField tfUsernmae_loginpage;
    // End of variables declaration//GEN-END:variables
}
