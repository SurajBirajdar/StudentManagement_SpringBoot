package StudentManagementSystem.StudentMangement.entity;

import org.springframework.stereotype.Repository;

import java.sql.*;

//@Repository
public class Dao {

    public void getDataBaseData() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentManagement","root","Software1!");
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery("select * from students");
        while(result.next()) {
            System.out.println(result.getInt("studentId"));
        }
    }


}
