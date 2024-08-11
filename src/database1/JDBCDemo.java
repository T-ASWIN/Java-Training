package database1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo {
    public static void main(String[] args) {
        Connection con=null;
        try{
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/aswin","root","");
            if(con!=null){
                System.out.println("database connected");
            }
        }
        catch(Exception e){
            System.out.println("Not connected");
        }
    }
}
