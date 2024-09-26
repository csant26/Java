//DML vaneko insert, select, delete, update data
//DDL vaneko create, truncate tables, database

import java.sql.*;
public class InsertData {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?useSSL=false", "root", "root");
        PreparedStatement ps = con.prepareStatement("insert into tblstudent(Id,Name,Address,Gender) values(?,?,?,?)");
        ps.setInt(1, 4);
        ps.setString(2, "Shishant");
        ps.setString(3,"Hetauda");
        ps.setString(4, "Male");
        ps.executeUpdate();
        System.out.println("Data Inserted.");
        con.close();
    }
}
