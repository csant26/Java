import java.sql.*;

public class BasicDML {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?useSSL=false", "root", "root");
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from tblstudent");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        con.close();
    }
}
