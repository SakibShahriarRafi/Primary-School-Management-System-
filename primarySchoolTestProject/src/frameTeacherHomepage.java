
import java.awt.Component;
import java.awt.Font;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sakib
 */
public class frameTeacherHomepage extends javax.swing.JFrame {

    public int teacherID;

    String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool";
    String username = "sa";
    String password = "123456";

    /**
     * Creates new form frameTeacherHomepage
     */
    public frameTeacherHomepage() {
        initComponents();

    }

    public void setComponentsTeacherHomePage(int id) {

        setSize(1000, 800);
        teacherID = id;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            // find if the username and password exist in database and also get the student id
            String sqlQuery = "select teacherFirstName, teacherLastName, teacherCourse from TeacherTable where teacherId = ?;";

            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setInt(1, id);

            String FirstName = null;
            String Lastname = null;
            String courses = null;

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // Retrieve data for each row
                FirstName = resultSet.getString("teacherFirstName");
                Lastname = resultSet.getString("teacherLastName");
                courses = resultSet.getString("teacherCourse");

            }

            lblName.setText("Name: " + FirstName + " " + Lastname);
            tfCourses.setText(courses);
            tfCourses.setEditable(false);

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

        btnGo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblClassTeacher = new javax.swing.JLabel();
        comboTeacherHomeOptions = new javax.swing.JComboBox<>();
        tfCourses = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 644, 98, 69));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 126, 88, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ProfileButton.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 19, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 56, -1, 44));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rainbow Primary School");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 40, 466, 75));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teacher Home page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 127, 403, 92));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your current Progress");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 232, 305, 60));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name: sakib shahriar");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 369, 394, 72));

        lblClassTeacher.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblClassTeacher.setForeground(new java.awt.Color(255, 255, 255));
        lblClassTeacher.setText("Courses: ");
        getContentPane().add(lblClassTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 486, -1, 48));

        comboTeacherHomeOptions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboTeacherHomeOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<...More Options...>", "Student Grading ", "Student Result", "Courses", "Payment" }));
        getContentPane().add(comboTeacherHomeOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 644, 302, 69));

        tfCourses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfCourses.setText("jTextField1");
        getContentPane().add(tfCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 454, 320, 114));

        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ComnmonBG.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        int dialogResult = JOptionPane.showConfirmDialog(frame,
                "Do you want to log out from your account?", "Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            frameLogInPage logInPage = new frameLogInPage();
            logInPage.setVisible(true);
            setVisible(false);
        } else {
            // User clicked "No," handle it as needed
            // JOptionPane.showMessageDialog(frame, "You clicked NO. Staying on the current page.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frameTeacherProfilePage teacherProfilePage = new frameTeacherProfilePage();
        teacherProfilePage.setComponentsTeacherProfilePage(teacherID);
        teacherProfilePage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        int selectedIndex = comboTeacherHomeOptions.getSelectedIndex();
        if (selectedIndex == 0) {
            JOptionPane.showMessageDialog(frameTeacherHomepage.this, "Enter an option");
        } else if (selectedIndex == 1) {/// student grading ***********************************************************************
            frameTeacherGradeStudent teacherGradeStudent = new frameTeacherGradeStudent();
            teacherGradeStudent.setComponentsTeacherGradeStudents(teacherID);
            teacherGradeStudent.setVisible(true);
            setVisible(false);
        } else if (selectedIndex == 2) {/// student result******************************************************************************
            frameSeeResultbyADMINandTeacher seeResultbyADMINandTeacher = new frameSeeResultbyADMINandTeacher();
            seeResultbyADMINandTeacher.setComponentsSeeResultbyAdmin("teacher", teacherID);
            seeResultbyADMINandTeacher.setVisible(true);
            setVisible(false);
        } else if (selectedIndex == 3) { // courses ********************************************************************************

            
            String sqlQuery = null;
            try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
                // Prepare the SQL SELECT query with JOIN operation

                sqlQuery = "SELECT DISTINCT  e.courseId, c.courseName, e.teacherId, " +
                    "t.teacherFirstName + ' ' + t.teacherLastName AS teacherName " +
                    "FROM EnrollmentTable e " +
                    "JOIN CourseTable c ON e.courseId = c.courseId " +
                    "JOIN TeacherTable t ON e.teacherId = t.teacherId " +
                    "WHERE e.teacherId = "+teacherID;

                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                    // Set the parameters for the prepared statement

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        // Create a DefaultTableModel to hold the data
                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("Course ID");
                        model.addColumn("Course Name");
                        model.addColumn("Teacher ID");
                        model.addColumn("Teacher Name");
                        

                        // Populate the table model with data from the result set
                        while (resultSet.next()) {
                            Object[] rowData = new Object[8];
                            rowData[0] = resultSet.getString("courseId");
                            rowData[1] = resultSet.getString("courseName");
                            rowData[2] = resultSet.getInt("teacherId");
                            rowData[3] = resultSet.getString("teacherName");
                            

                            model.addRow(rowData);
                        }

                        // Create the new JTable and set its model
                        JTable newTable = new JTable(model);

                        // Show the JTable in a new JFrame
                        JFrame frame = new JFrame("Transaction Information");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.getContentPane().add(new JScrollPane(newTable));
                        frame.setSize(1000, 800);
                        frame.setLocationRelativeTo(null);

                        frame.setVisible(true);

                        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
                            @Override
                            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                                c.setFont(new Font("Arial", Font.PLAIN, 18)); // Replace 18 with your desired font size
                                return c;
                            }
                        };

                        // Apply the custom TableCellRenderer to all columns in the table
                        for (int i = 0; i < newTable.getColumnCount(); i++) {
                            newTable.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            
        } else if (selectedIndex == 4) {//payment ******************************************************************
            String sqlQuery = null;
            try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
                // Prepare the SQL SELECT query with JOIN operation

                sqlQuery = "SELECT tt.transactionid, tt.teacherId, CONCAT(st.teacherFirstName, ' ', st.teacherLastName) AS teacherName, tt.account_no, tt.paidAmount, tt.payable_money, tt.transactionMonth, tt.transactiondate "
                        + "FROM TransactionTable tt "
                        + "INNER JOIN TeacherTable st ON tt.teacherId = st.teacherId "
                        + "WHERE tt.teacherId = " + teacherID;

                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                    // Set the parameters for the prepared statement

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        // Create a DefaultTableModel to hold the data
                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("TransactionId");
                        model.addColumn("teacherId");
                        model.addColumn("Teacher Name");
                        model.addColumn("Account no");
                        model.addColumn("Paid Amount");
                        model.addColumn("Payable Money");
                        model.addColumn("Month");
                        model.addColumn("Date");

                        // Populate the table model with data from the result set
                        while (resultSet.next()) {
                            Object[] rowData = new Object[8];
                            rowData[0] = resultSet.getInt("transactionid");
                            rowData[1] = resultSet.getInt("teacherId");
                            rowData[2] = resultSet.getString("teacherName");
                            rowData[3] = resultSet.getString("account_no");
                            rowData[4] = resultSet.getDouble("paidAmount");
                            rowData[5] = resultSet.getDouble("payable_money");
                            rowData[6] = resultSet.getString("transactionMonth");
                            rowData[7] = resultSet.getString("transactiondate");

                            model.addRow(rowData);
                        }

                        // Create the new JTable and set its model
                        JTable newTable = new JTable(model);

                        // Show the JTable in a new JFrame
                        JFrame frame = new JFrame("Transaction Information");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.getContentPane().add(new JScrollPane(newTable));
                        frame.setSize(1000, 800);
                        frame.setLocationRelativeTo(null);

                        frame.setVisible(true);

                        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
                            @Override
                            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                                c.setFont(new Font("Arial", Font.PLAIN, 18)); // Replace 18 with your desired font size
                                return c;
                            }
                        };

                        // Apply the custom TableCellRenderer to all columns in the table
                        for (int i = 0; i < newTable.getColumnCount(); i++) {
                            newTable.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

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
            java.util.logging.Logger.getLogger(frameTeacherHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameTeacherHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameTeacherHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameTeacherHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTeacherHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JComboBox<String> comboTeacherHomeOptions;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClassTeacher;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField tfCourses;
    // End of variables declaration//GEN-END:variables
}