
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
public class frameTeacherProfilePage extends javax.swing.JFrame {
    public int teacherID;
    /**
     * Creates new form frameTeacherPRofilePage2
     */
    public frameTeacherProfilePage() {
        initComponents();
    }
    public void setComponentsTeacherProfilePage(int id){
    teacherID=id;
    
    
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            // find if the username and password exist in database and also get the student id
            String sqlQuery = "select teacherFirstName, teacherLastName, teacherDOB,teacherBG,teacherPhone,teacherEmail,teacherNID,teacherAccountNo,teacherAddress from TeacherTable where teacherId = ?;";

            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setInt(1, id);

            String FirstName = null;
            String Lastname = null;
            
            String dateofBitrh = null;
            String nid = null;
            String phone = null;
            String email = null;
            String bloodGroup = null;
            
            String accNo = null;
            String address = null;
            

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // Retrieve data for each row
                FirstName = resultSet.getString("teacherFirstName");
                Lastname = resultSet.getString("teacherLastName");
                
                dateofBitrh = resultSet.getString("teacherDOB");
                bloodGroup = resultSet.getString("teacherBG");
                phone = resultSet.getString("teacherPhone");
                email = resultSet.getString("teacherEmail");
                nid= resultSet.getString("teacherNID");
                accNo = resultSet.getString("teacherAccountNo");
                address = resultSet.getString("teacherAddress");
            }
            lblHead.setText(FirstName+" Profile");
            lblFirstname.setText(FirstName);
            lblLastname.setText(Lastname);
            lblDOB.setText(dateofBitrh);
            lblBlood.setText(bloodGroup);
            tfPhone.setText(phone);
            tfEmail.setText(email);
            lblAccountNO.setText(accNo);
            tfAddress.setText(address);
            

            //System.out.println(StudentClassId);
        } catch (Exception e) {
            e.printStackTrace();
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

        tfPhone = new javax.swing.JTextField();
        btnSaveChanges = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        lblBlood = new javax.swing.JLabel();
        lblNid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        lblLastname = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        lblAccountNO = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPhone.setText("jTextField2");
        getContentPane().add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 333, 250, 40));

        btnSaveChanges.setBackground(new java.awt.Color(0, 204, 0));
        btnSaveChanges.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 690, 242, 54));

        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEmail.setText("jTextField3");
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 333, 250, 40));

        lblBlood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBlood.setForeground(new java.awt.Color(255, 255, 255));
        lblBlood.setText("jLabel18");
        getContentPane().add(lblBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 405, 250, 40));

        lblNid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNid.setForeground(new java.awt.Color(255, 255, 255));
        lblNid.setText("jLabel16");
        getContentPane().add(lblNid, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 242, 250, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Group:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 404, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 148, 150, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 498, 150, 40));

        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 38, 101, 51));

        lblLastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLastname.setForeground(new java.awt.Color(255, 255, 255));
        lblLastname.setText("jLabel15");
        getContentPane().add(lblLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 149, 250, 40));

        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("jLabel12");
        getContentPane().add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 242, 250, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account No:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 411, 150, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 241, 150, 40));

        lblHead.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        lblHead.setForeground(new java.awt.Color(255, 255, 255));
        lblHead.setText("Teacher profile");
        getContentPane().add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 25, 492, 79));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 241, 150, 40));

        tfAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });
        getContentPane().add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 498, 323, 159));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 332, 150, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 148, 150, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 332, 150, 40));

        lblFirstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFirstname.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstname.setText("fdgsdfgsd");
        getContentPane().add(lblFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 148, 250, 40));

        lblAccountNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lblAccountNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 411, 250, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ComnmonBG.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        frameTeacherHomepage teacherHomepage = new frameTeacherHomepage();
        teacherHomepage.setComponentsTeacherHomePage(teacherID);
        teacherHomepage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        String address = tfAddress.getText();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            // find if the username and password exist in database and also get the student id
            String sqlQuery = "UPDATE TeacherTable SET teacherPhone = ?, teacherEmail = ?,teacherAddress=?  WHERE teacherId = ?";
            
            PreparedStatement statement  = connection.prepareStatement(sqlQuery);

            statement.setString(1, phone);
            statement.setString(2, email);
            statement.setString(3, address);
            statement.setInt(4, teacherID);
            int updated = statement.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(frameTeacherProfilePage.this, "Update Successful");
            } else {
                JOptionPane.showMessageDialog(frameTeacherProfilePage.this, "Update not Successful");
            }
            
           
           //System.out.println(StudentClassId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed

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
            java.util.logging.Logger.getLogger(frameTeacherProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameTeacherProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameTeacherProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameTeacherProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTeacherProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAccountNO;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBlood;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblNid;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
