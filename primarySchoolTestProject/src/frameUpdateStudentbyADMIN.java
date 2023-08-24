/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakib
 */
import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.JOptionPane;

public class frameUpdateStudentbyADMIN extends javax.swing.JFrame {

    public int studentId;

    /**
     * Creates new form frameUpdateStudentbyADMIN
     */
    public frameUpdateStudentbyADMIN() {
        initComponents();
        setSize(1000, 800);
    }

    public void setComponentsUpdateStudentsByAdmin(int id) {
        studentId = id;
        System.out.println(id);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            // find if the username and password exist in database and also get the student id
            String sqlQuery = "select * from StudentTable where studentId = ?;";

            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setInt(1, id);
            int idFromDatabase = 0;
            String FirstName = null;
            String Lastname = null;
            String fathersname = null;
            String mothersname = null;

            //Date birthday = null;
            String bloodGroup = null;
            String phone = null;
            String email = null;
            String address = null;
            String accNo = null;
            int currentclass = 0;
            String currentSection = null;
            int currentRoll = 0;

            //Date admissionDate = null;
            // Date graduationDate = null;
            String username = null;
            String password = null;
            double payable = 0;
            int iscurrentStudent = 0;

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // Retrieve data for each row

                //FirstName = resultSet.getString("studentFirstName");
                idFromDatabase = resultSet.getInt("studentId");
                FirstName = resultSet.getString("studentFirstName");
                Lastname = resultSet.getString("studentLastName");

                fathersname = resultSet.getString("studentFatherName");
                mothersname = resultSet.getString("studentMotherName");

                //java.sql.Date sqlDate = resultSet.getDate("studentDOB");
                //birthday = new Date(sqlDate.getTime());
                //dateofBitrh = resultSet.getString("studentDOB");
                bloodGroup = resultSet.getString("studentBG");

                phone = resultSet.getString("studentParentPhone");
                email = resultSet.getString("studentEmail");

                address = resultSet.getString("studentAddress");
                accNo = resultSet.getString("studentAccountNo");

                currentclass = resultSet.getInt("studentCurentClass");
                currentSection = resultSet.getString("studentSection");
                currentRoll = resultSet.getInt("StudentCurrentRoll");

                //java.sql.Date sqlDate2 = resultSet.getDate("studentAdmissionDate");
                //admissionDate = new Date(sqlDate2.getTime());
                //java.sql.Date sqlDate3 = resultSet.getDate("studentGraduationDate");
                //graduationDate = new Date(sqlDate3.getTime());
                //admissionDate = resultSet.getString("studentAdmissionDate");
                //graduationDate = resultSet.getString("studentGraduationDate");
                username = resultSet.getString("studentUsername");
                password = resultSet.getString("studentPassword");

                payable = resultSet.getDouble("studentPayableMoney");
                iscurrentStudent = resultSet.getInt("isCurrentStudent");

            }
            tfStudentId.setText(String.valueOf(idFromDatabase));
            tfFirstName.setText(FirstName);
            tfLastname.setText(Lastname);
            tffathersname.setText(fathersname);
            tfmothersname.setText(mothersname);

            //datebirthday.setDate(birthday);
            datebirthday.setDate(null);
            tfbloodgroup.setText(bloodGroup);
            tfPhone.setText(phone);
            tfemail.setText(email);
            tfaddress.setText(address);
            tfAccountNo.setText(accNo);
            tfCurrentClass.setText(String.valueOf(currentclass));
            tfCurrentSection.setText(currentSection);
            tfRoll.setText(String.valueOf(currentRoll));
            dateAdmission.setDate(null);
            dateGraduation.setDate(null);
            //dateAdmission.setDate(admissionDate);
            //dateGraduation.setDate(graduationDate);
            tfUsername.setText(username);
            tfPassword.setText(password);
            tfPayableMoney.setText(String.valueOf(payable));
            comboIsCurrentStudent.setSelectedIndex(iscurrentStudent);

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

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfLastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tffathersname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfmothersname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfbloodgroup = new javax.swing.JTextField();
        tfCurrentClass = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfAccountNo = new javax.swing.JTextField();
        tfCurrentSection = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        comboIsCurrentStudent = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        datebirthday = new com.toedter.calendar.JDateChooser();
        dateAdmission = new com.toedter.calendar.JDateChooser();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfaddress = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfStudentId = new javax.swing.JTextField();
        dateGraduation = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tfPayableMoney = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfRoll = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date of Admission: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 445, -1, 35));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 509, 150, 35));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 509, 160, 35));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IS CURRENT STUDENT:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 692, 300, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 127, 150, 35));

        tfFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 127, 200, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 127, 160, 35));

        tfLastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastnameActionPerformed(evt);
            }
        });
        getContentPane().add(tfLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 127, 200, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Father's Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 180, 150, 35));

        tffathersname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tffathersname, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 180, 200, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mother's Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 180, 160, 35));

        tfmothersname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfmothersname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 200, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Birthday:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 233, 150, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Update By ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 23, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Blood Group:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 233, 160, 35));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone Number:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 286, 150, 35));

        tfbloodgroup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfbloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 233, 200, 35));

        tfCurrentClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfCurrentClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 392, 200, 35));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Account NO:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 339, 160, 35));

        tfAccountNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfAccountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 339, 200, 35));

        tfCurrentSection.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfCurrentSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 392, 200, 35));

        tfUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 509, 200, 35));

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 509, 200, 35));

        comboIsCurrentStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboIsCurrentStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        getContentPane().add(comboIsCurrentStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 695, 120, -1));

        btnSubmit.setBackground(new java.awt.Color(51, 204, 0));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 675, 160, 50));
        getContentPane().add(datebirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 233, 200, 35));
        getContentPane().add(dateAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 445, 200, 35));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 679, 108, 42));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Current Class:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 392, 150, 35));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Current Section:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 392, 160, 35));

        tfPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 286, 200, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 286, 160, 35));

        tfemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 286, 200, 35));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Address:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 339, 150, 35));

        tfaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaddressActionPerformed(evt);
            }
        });
        getContentPane().add(tfaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 339, 200, 35));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Student ID:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 73, 150, 35));

        tfStudentId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 73, 438, 35));
        getContentPane().add(dateGraduation, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 445, 200, 35));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date of Graduation: ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 445, -1, 35));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Payable Money:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 580, 150, 35));

        tfPayableMoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfPayableMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPayableMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(tfPayableMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 580, 200, 35));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Current Roll");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 580, 150, 35));

        tfRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 580, 200, 35));

        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ComnmonBG.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastnameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            // find if the username and password exist in database and also get the student id
            String sqlQuery = "UPDATE StudentTable SET studentFirstName = ?, studentLastName = ?,studentFatherName=?,studentMotherName=?,studentDOB=?,studentBG=?,studentParentPhone=?,studentEmail=?,studentAddress=?,studentAccountNo=?,studentCurentClass=?,studentSection=?,StudentCurrentRoll=?,studentAdmissionDate=?,studentGraduationDate=?,studentUsername=?,studentPassword=?,studentPayableMoney=?,isCurrentStudent=?  WHERE studentId = ?";

            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setString(1, tfFirstName.getText());
            statement.setString(2, tfLastname.getText());
            statement.setString(3, tffathersname.getText());
            statement.setString(4, tfmothersname.getText());

            SimpleDateFormat dtformat = new SimpleDateFormat("yyyy-MM-dd");
            String birthday = dtformat.format(datebirthday.getDate());
            statement.setString(5, birthday); // birthday 
            statement.setString(6, tfbloodgroup.getText());
            statement.setString(7, tfPhone.getText());
            statement.setString(8, tfemail.getText());
            statement.setString(9, tfaddress.getText());
            statement.setString(10, tfAccountNo.getText());
            statement.setInt(11, Integer.parseInt(tfCurrentClass.getText()));
            statement.setString(12, tfCurrentSection.getText());
            statement.setInt(13, Integer.parseInt(tfRoll.getText()));
            String admissiondate = dtformat.format(dateAdmission.getDate());
            statement.setString(14, admissiondate);
            String graduationdate = dtformat.format(dateGraduation.getDate());
            statement.setString(15, graduationdate);
            statement.setString(16, tfUsername.getText());
            statement.setString(17, tfPassword.getText());
            statement.setDouble(18, Double.valueOf(tfPayableMoney.getText()));
            statement.setInt(19, comboIsCurrentStudent.getSelectedIndex());
            statement.setInt(20, studentId);

            int updated = statement.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(frameUpdateStudentbyADMIN.this, "Update Successful");
            } else {
                JOptionPane.showMessageDialog(frameUpdateStudentbyADMIN.this, "Update not Successful");
            }

            //System.out.println(StudentClassId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //JOptionPane.showMessageDialog(frameSignUpAsStudentbyADMIN.this,tfStudentId_signStdbyADM.getText()+ " added successfully");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frameManageStudentbyADMIN manageStudentbyADMIN = new frameManageStudentbyADMIN();
        manageStudentbyADMIN.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void tfaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaddressActionPerformed

    private void tfStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentIdActionPerformed

    private void tfPayableMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPayableMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPayableMoneyActionPerformed

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
            java.util.logging.Logger.getLogger(frameUpdateStudentbyADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameUpdateStudentbyADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameUpdateStudentbyADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameUpdateStudentbyADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUpdateStudentbyADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboIsCurrentStudent;
    private com.toedter.calendar.JDateChooser dateAdmission;
    private com.toedter.calendar.JDateChooser dateGraduation;
    private com.toedter.calendar.JDateChooser datebirthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextField tfAccountNo;
    private javax.swing.JTextField tfCurrentClass;
    private javax.swing.JTextField tfCurrentSection;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPayableMoney;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfRoll;
    private javax.swing.JTextField tfStudentId;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfbloodgroup;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tffathersname;
    private javax.swing.JTextField tfmothersname;
    // End of variables declaration//GEN-END:variables
}
