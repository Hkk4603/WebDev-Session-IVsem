import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","Admin@123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select CustomerName from customer where age>21;");
            // rs=stmt.executeQuery("select age from customer;");
            rs=stmt.executeQuery("select * from customer;");
            while(rs.next())
            {
                System.out.print(rs.getString(1)+" "+rs.getString(2));
               
                // System.out.print(rs.getString(3));
                // System.out.println(rs.getString(4));
                System.out.println();
                // System.out.println(rs.getString(6));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}