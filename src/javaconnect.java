import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
    public static Connection connectdb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmangmentsystem", "root", "");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
    public static void main(String[] args) {
        Connection co=connectdb();
        System.out.println(co);
    }
}
