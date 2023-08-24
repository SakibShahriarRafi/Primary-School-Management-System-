/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakib
 */
import java.sql.*;

public class connectionToDatabase {
    
        
    

    
    public void connectDBStudent(int student_ID, String student_FirstName,String student_LastName, int student_Age){
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=RainbowPrimarySchool;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
           
            
            PreparedStatement ps = connection.prepareStatement("insert into StudentTable values(?,?,?,?)");
            ps.setInt(1, student_ID);
            ps.setString(2,student_FirstName );
            ps.setString(3, student_LastName);
            ps.setInt(4, student_Age);
            
            ps.executeUpdate();
            
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM StudentTable");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("studentFirstName")+" "+ resultSet.getString("studentLastName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }
    
    
}
