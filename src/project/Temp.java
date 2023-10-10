package project;
import java.sql.*;
public class Temp {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ccc";
            String id = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url , id , password);
            Statement stmt = con.createStatement();
            String sql =  "select *from login";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
        }
    }
    
}
